package com.alinesno.infra.base.sensitive;

import com.alinesno.infra.common.facade.enable.EnableActable;
import com.alinesno.infra.common.web.adapter.sso.enable.EnableInfraSsoApi;
import com.alinesno.infra.common.web.log.aspect.LogAspect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 集成一个Java开发示例工具
 * @author LuoAnDong
 * @since 2023年8月3日 上午6:23:43
 */
@EnableActable
@EnableInfraSsoApi
@MapperScan("com.alinesno.infra.base.sensitive.mapper")
@SpringBootApplication
public class BaseSensitiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseSensitiveApplication.class, args);
	}

	@Bean
	public LogAspect getLogAspect(){
		return new LogAspect() ;
	}

}