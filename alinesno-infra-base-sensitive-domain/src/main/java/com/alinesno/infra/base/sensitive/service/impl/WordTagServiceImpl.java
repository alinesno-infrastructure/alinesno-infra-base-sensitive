package com.alinesno.infra.base.sensitive.service.impl;

import com.alinesno.infra.base.sensitive.entity.WordTagsEntity;
import com.alinesno.infra.base.sensitive.mapper.WordTagsMapper;
import com.alinesno.infra.base.sensitive.service.IWordTagService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.github.houbb.sensitive.word.core.SensitiveWordHelper;
import com.github.houbb.sensitive.word.support.result.WordResultHandlers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * 敏感词标签
 */
@Slf4j
@Service
public class WordTagServiceImpl extends IBaseServiceImpl<WordTagsEntity, WordTagsMapper> implements IWordTagService {

    @Override
    public Set<String> getTag(String word) {

        final String text = "五星红旗迎风飘扬，毛主席的画像屹立在天安门前。";

        List<String> wordList = SensitiveWordHelper.findAll(text, WordResultHandlers.word());
        log.debug("wordList1 = {}" , wordList);

        return null ;
    }
}
