package com.alinesno.infra.base.sensitive.config;

import com.alinesno.infra.base.sensitive.word.MyDdWordAllow;
import com.alinesno.infra.base.sensitive.word.MyDdWordDeny;
import com.github.houbb.sensitive.word.bs.SensitiveWordBs;
import com.github.houbb.sensitive.word.support.allow.WordAllows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
@Configuration
public class SpringSensitiveWordConfig {

    @Autowired
    private MyDdWordAllow myDdWordAllow;

    @Autowired
    private MyDdWordDeny myDdWordDeny;

    /**
     * 初始化引导类
     * @return 初始化引导类
     * @since 1.0.0
     */
    @Bean
    public SensitiveWordBs sensitiveWordBs() {

        return SensitiveWordBs.newInstance()
                .wordAllow(WordAllows.chains(WordAllows.defaults(), myDdWordAllow))
                .wordDeny(myDdWordDeny)
                .init();
    }

}