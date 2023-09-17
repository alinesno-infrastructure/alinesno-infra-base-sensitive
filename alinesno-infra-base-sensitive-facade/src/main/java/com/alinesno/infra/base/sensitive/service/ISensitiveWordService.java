package com.alinesno.infra.base.sensitive.service;

import com.alinesno.infra.base.sensitive.entity.SensitiveWordEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

import java.util.List;

/**
 * 敏感词服务接口
 * 该接口定义了对敏感词的操作方法，包括添加、删除和获取全部敏感词
 * 继承自通用的基础服务接口
 */
public interface ISensitiveWordService extends IBaseService<SensitiveWordEntity> {

    /**
     * 添加敏感词
     *
     * @param word 敏感词内容
     * @return 添加是否成功的布尔值，成功返回true，失败返回false
     */
    boolean addSensitiveWord(String word);

    /**
     * 删除敏感词
     *
     * @param word 敏感词内容
     * @return 删除是否成功的布尔值，成功返回true，失败返回false
     */
    boolean deleteSensitiveWord(String word);

    /**
     * 获取全部敏感词
     *
     * @return 全部敏感词的列表
     */
    List<SensitiveWordEntity> getAllSensitiveWords();
}
