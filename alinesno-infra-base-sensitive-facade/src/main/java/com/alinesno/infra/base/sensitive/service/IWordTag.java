package com.alinesno.infra.base.sensitive.service;

import java.util.Set;

/**
 * 敏感词标签
 */
public interface IWordTag {

    /**
     * 查询标签列表
     * @param word 脏词
     * @return 结果
     */
    Set<String> getTag(String word);

}