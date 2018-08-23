package com.service.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * 定时任务
 * @author sheng
 *
 */

@Component
public class QuartzService {
	/**
	 * 启动之后，每10s执行一次
	 */
	@Scheduled(fixedRate = 10000)
	void fixedRate() {
		System.out.println("fixedRate @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	
	/**
	 * 结束之后，每10s执行一次
	 */
	@Scheduled(fixedDelay = 10000)
	void fixedDelay() {
		System.out.println("fixedDelay @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	
	/**
	 * 第一次延迟10s执行，之后每10s执行一次
	 */
	@Scheduled(initialDelay = 10000,fixedRate = 10000)
	void initialDelay() {
		System.out.println("initialDelay @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	
	/**
	 * 下午两点到三点之间，每分钟开始的时候执行一次
	 */
	@Scheduled(cron="0 * 14 * * ?")
	void cron() {
		System.out.println("cron #########################################");
	}
	
}
