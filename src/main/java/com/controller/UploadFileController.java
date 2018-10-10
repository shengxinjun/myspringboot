package com.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.model.Result;

@Controller
@RequestMapping("/*")
public class UploadFileController {

	@Value("${filePath}")
	private String filePath;
	
	@RequestMapping("/upload")
	@ResponseBody
	Result upload(HttpServletRequest request, HttpServletResponse response) {
		Result result = new Result();
		String url = "";
		if (request instanceof MultipartHttpServletRequest) {
			MultipartHttpServletRequest mreq = (MultipartHttpServletRequest) request;

			// 获取他文件上传的对象
			String fileName = mreq.getFileNames().next();
			MultipartFile multipartFile = mreq.getFile(fileName);

			if (multipartFile.getSize() > 1024 * 1024 * 500)
				return Result.error("文件过大");

			// 获取文件真实名称
			String originName = multipartFile.getOriginalFilename();

			// 重新设置文件名称
			/*String suffix = originName.substring(originName.lastIndexOf(".") + 1);*/
			String finalName = "/"+UUID.randomUUID() +"/" + originName;

			// 判断文件夹和文件是否存在
			String folder = filePath + "/" + UUID.randomUUID() +"/" ;
			//文件传输到目标位置
			File file = new File(folder);
			if (!file.exists())
				file.mkdirs();

			url = folder + originName;

			file = new File(url);
			if (file.exists())
				file.delete();

			try {
				multipartFile.transferTo(file);
				result.setData(finalName);
				result.setCode(1);
			} catch (Exception e) {
				result.setCode(2);
			}

		}
		return result;

	}
	
	@RequestMapping("/upload2")
	@ResponseBody
	String upload2(HttpServletRequest request, HttpServletResponse response) {
		String url = "";
		String finalName="";
		if (request instanceof MultipartHttpServletRequest) {
			MultipartHttpServletRequest mreq = (MultipartHttpServletRequest) request;

			// 获取他文件上传的对象
			String fileName = mreq.getFileNames().next();
			MultipartFile multipartFile = mreq.getFile(fileName);

			if (multipartFile.getSize() > 1024 * 1024 * 500)
				return "文件过大";

			// 获取文件真实名称
			String originName = multipartFile.getOriginalFilename();

			// 重新设置文件名称
			/*String suffix = originName.substring(originName.lastIndexOf(".") + 1);*/
			finalName = "/"+UUID.randomUUID() +"/" + originName;

			// 判断文件夹和文件是否存在
			String folder = filePath + "/" + UUID.randomUUID() +"/" ;
			//文件传输到目标位置
			File file = new File(folder);
			if (!file.exists())
				file.mkdirs();

			url = folder + originName;

			file = new File(url);
			if (file.exists())
				file.delete();

			try {
				multipartFile.transferTo(file);
			} catch (Exception e) {
				
			}

		}
		return finalName;

	}
	
	@ResponseBody
	@RequestMapping("/download")
	Result download(HttpServletRequest request, HttpServletResponse response,String file) throws IOException{
		Result result = new Result();
		String  fileUrl = filePath + file;
		String fileName = "1.png";
		/*URL url = null;
		try {
			url = new URL(fileUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String path = url.getPath();
        if (Objects.isNull(fileName))
            fileName = path.substring(path.lastIndexOf("/") + 1);*/
        String userAgent = request.getHeader("User-Agent");
        if (userAgent.toUpperCase().contains("MSIE") || userAgent.toUpperCase().contains("RV:11"))
            fileName = URLEncoder.encode(fileName, StandardCharsets.UTF_8.displayName());
        else
            fileName = new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
        response.setHeader("content-disposition", "attachment;filename=" + fileName);
        InputStream inputStream = new FileInputStream(fileUrl);
        ServletOutputStream outputStream = response.getOutputStream();
        FileCopyUtils.copy(inputStream, outputStream);
		return result;
	}
}
