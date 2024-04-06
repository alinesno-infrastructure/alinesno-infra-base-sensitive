package com.alinesno.infra.base.sensitive.word;

import com.github.houbb.sensitive.word.api.IWordDeny;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
@Component
public class MyDdWordDeny implements IWordDeny {

    @Override
    public List<String> deny() {
        // 数据库返回的各种信息
        return List.of("广告");
    }

}