package com.alinesno.infra.base.sensitive.word;

import com.alinesno.infra.base.sensitive.entity.SensitiveWordsEntity;
import com.alinesno.infra.base.sensitive.enums.WordStatusEnum;
import com.alinesno.infra.base.sensitive.enums.WordTypeEnum;
import com.alinesno.infra.base.sensitive.service.ISensitiveWordsService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.houbb.heaven.support.handler.IHandler;
import com.github.houbb.heaven.util.util.CollectionUtil;
import com.github.houbb.sensitive.word.api.IWordAllow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
@Component
public class DdWordAllow implements IWordAllow {

    @Autowired
    private ISensitiveWordsService sensitiveWordsService ;

    @Override
    public List<String> allow() {
        LambdaQueryWrapper<SensitiveWordsEntity> wordWrapper = new LambdaQueryWrapper<>();

        wordWrapper.eq(SensitiveWordsEntity::getType , WordTypeEnum.ALLOW.getCode() )
                .eq(SensitiveWordsEntity::getStatus , WordStatusEnum.S.getCode()) ;

        List<SensitiveWordsEntity> wordList = sensitiveWordsService.list(wordWrapper);

        return CollectionUtil.toList(wordList, new IHandler<SensitiveWordsEntity, String>() {
            @Override
            public String handle(SensitiveWordsEntity word) {
                return word.getWord();
            }
        });
    }

}