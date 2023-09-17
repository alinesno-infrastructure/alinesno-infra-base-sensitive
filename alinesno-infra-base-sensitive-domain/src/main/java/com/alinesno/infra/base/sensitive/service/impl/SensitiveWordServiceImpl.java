package com.alinesno.infra.base.sensitive.service.impl;

import com.alinesno.infra.base.sensitive.entity.SensitiveWordEntity;
import com.alinesno.infra.base.sensitive.mapper.SensitiveWordMapper;
import com.alinesno.infra.base.sensitive.service.ISensitiveWordService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 敏感词服务实现类
 * 该类实现了敏感词服务接口，提供了对敏感词的添加、删除和获取全部敏感词的功能
 * 作者：luoxiaodong
 * 版本：1.0.0
 */
@Service
public class SensitiveWordServiceImpl extends IBaseServiceImpl<SensitiveWordEntity, SensitiveWordMapper> implements ISensitiveWordService {

    @Autowired
    private SensitiveWordMapper sensitiveWordMapper;

    /**
     * 添加敏感词
     *
     * @param word 敏感词内容
     * @return 添加是否成功的布尔值，成功返回true，失败返回false
     */
    @Override
    public boolean addSensitiveWord(String word) {
        SensitiveWordEntity sensitiveWord = new SensitiveWordEntity();
        sensitiveWord.setWord(word);
        return sensitiveWordMapper.insert(sensitiveWord) > 0;
    }

    /**
     * 删除敏感词
     *
     * @param word 敏感词内容
     * @return 删除是否成功的布尔值，成功返回true，失败返回false
     */
    @Override
    public boolean deleteSensitiveWord(String word) {
        QueryWrapper<SensitiveWordEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("word", word);
        return sensitiveWordMapper.delete(queryWrapper) > 0;
    }

    /**
     * 获取全部敏感词
     *
     * @return 全部敏感词的列表
     */
    @Override
    public List<SensitiveWordEntity> getAllSensitiveWords() {
        return sensitiveWordMapper.selectList(null);
    }
}
