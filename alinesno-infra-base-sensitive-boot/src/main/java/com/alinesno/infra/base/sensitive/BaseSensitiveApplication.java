package com.alinesno.infra.base.sensitive;

import com.alinesno.infra.common.web.log.aspect.LogAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 集成一个Java开发示例工具
 * @author luoxiaodong
 * @version 1.0.0
 */
@SpringBootApplication
public class BaseSensitiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseSensitiveApplication.class, args);
	}

}