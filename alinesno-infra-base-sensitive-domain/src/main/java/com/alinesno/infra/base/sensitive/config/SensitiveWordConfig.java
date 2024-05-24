package com.alinesno.infra.base.sensitive.config;

import com.alinesno.infra.base.sensitive.word.DdWordAllow;
import com.alinesno.infra.base.sensitive.word.DdWordDeny;
import com.github.houbb.sensitive.word.bs.SensitiveWordBs;
import com.github.houbb.sensitive.word.support.allow.WordAllows;
import com.google.errorprone.annotations.concurrent.LazyInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
@Configuration
public class SensitiveWordConfig {

    @Autowired
    private DdWordAllow myDdWordAllow;

    @Autowired
    private DdWordDeny myDdWordDeny;

    /**
     * 初始化引导类
     * @return 初始化引导类
     * @since 1.0.0
     */
    @Bean
    public SensitiveWordBs sensitiveWordBs() {

//        return SensitiveWordBs.newInstance().init() ;

        return SensitiveWordBs.newInstance()
                .wordAllow(WordAllows.chains(WordAllows.defaults(), myDdWordAllow))
                .wordDeny(myDdWordDeny)
                .init();

    }

}