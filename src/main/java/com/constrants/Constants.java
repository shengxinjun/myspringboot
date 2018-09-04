package com.constrants;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface Constants {
	/**
	 * 
	 * 分页大小
	 *
	 */
	interface pageSize{
		
		int SMALL_SIZE = 5;
		
		int MIDDLE_SIZE = 10;
		
		int LARGE_SIZE = 20;
	}
	
	interface result{
		int ok = 1;
		
		int err = 0;
	}
	
	interface EXCEL_HEAD{
		List<String> order =  Stream.of("名称","总价","客户编号","日期").collect(Collectors.toList());
	}
}
