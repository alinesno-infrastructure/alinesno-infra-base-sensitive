package com.alinesno.infra.base.sensitive.service;

import com.alinesno.infra.base.sensitive.entity.WordTagsEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

import java.util.Set;

/**
 * 敏感词标签
 */
public interface IWordTagService extends IBaseService<WordTagsEntity> {

    /**
     * 查询标签列表
     * @param word 脏词
     * @return 结果
     */
    Set<String> getTag(String word);

}