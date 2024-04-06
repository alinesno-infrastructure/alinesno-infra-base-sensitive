package com.alinesno.infra.base.sensitive.service;

import com.alinesno.infra.base.sensitive.entity.SensitiveConfigEntity;
import com.alinesno.infra.base.sensitive.entity.SensitiveWordsEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
public interface ISensitiveWordsService extends IBaseService<SensitiveWordsEntity> {

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
    List<SensitiveConfigEntity> getAllSensitiveWords();

}
