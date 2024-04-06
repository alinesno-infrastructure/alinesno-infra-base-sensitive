package com.alinesno.infra.base.sensitive.word;

import com.github.houbb.sensitive.word.api.IWordAllow;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
@Component
public class MyDdWordAllow implements IWordAllow {

    @Override
    public List<String> allow() {
        // 数据库查询
        return List.of("学习");
    }

}