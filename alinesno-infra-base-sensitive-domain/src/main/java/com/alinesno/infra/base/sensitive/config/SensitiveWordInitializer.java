//package com.alinesno.infra.base.sensitive.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SensitiveWordInitializer implements ApplicationListener<ContextRefreshedEvent> {
//
//    @Autowired
//    private SensitiveWordConfig sensitiveWordConfig;
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        // 确保只在根应用上下文刷新时初始化敏感词库
//        if (event.getApplicationContext().getParent() == null) {
//            sensitiveWordConfig.sensitiveWordBs();
//        }
//    }
//}