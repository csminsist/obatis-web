package com.obatis.startup;

import com.obatis.config.response.ResponseResultHandleFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.Resource;

@Configuration
@Order(1)
public class StartupApplicationRunner extends SpringApplication implements ApplicationRunner  {

	@Resource
	private RequestMappingHandlerAdapter requestMappingHandlerAdapter;

	/**
	 * 该方法在项目启动时运行
	 */
	@Override
	public void run(ApplicationArguments args) {
		// 加载返回封装
		ResponseResultHandleFactory.handleResponseResultInfo(requestMappingHandlerAdapter);
	}

}
