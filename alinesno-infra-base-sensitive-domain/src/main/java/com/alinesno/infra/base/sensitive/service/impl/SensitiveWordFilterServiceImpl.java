package com.alinesno.infra.base.sensitive.service.impl;

import com.alinesno.infra.base.sensitive.service.ISensitiveWordFilterService;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.github.houbb.sensitive.word.bs.SensitiveWordBs;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SensitiveWordFilterServiceImpl implements ISensitiveWordFilterService {

    private final List<String> sensitiveWords = new ArrayList<>();
    private final SensitiveWordBs sensitiveWordBs = SensitiveWordBs.newInstance().init();

    @Override
    public boolean addSensitiveWord(String word) {
        return sensitiveWords.add(word);
    }

    @Override
    public boolean deleteSensitiveWord(String word) {
        return sensitiveWords.remove(word);
    }

    @Override
    public boolean modifySensitiveWord(String oldWord, String newWord) {
        if (sensitiveWords.contains(oldWord)) {
            sensitiveWords.remove(oldWord);
            sensitiveWords.add(newWord);
            return true;
        }
        return false;
    }

    @Override
    public boolean importSensitiveWords(String filePath) {
        // TODO: Implement this method to read sensitive words from a file
        return false;
    }

    @Override
    public boolean exportSensitiveWords(String filePath) {
        // TODO: Implement this method to write sensitive words to a file
        return false;
    }

    @Override
    public String filterText(String text) {
        return sensitiveWordBs.replace(text);
    }

    @Override
    public List<String> filterTextBatch(List<String> textList) {
        List<String> filteredTextList = new ArrayList<>();
        for (String text : textList) {
            filteredTextList.add(sensitiveWordBs.replace(text));
        }
        return filteredTextList;
    }

    @Override
    public List<String> detectSensitiveWords(String text) {
        return sensitiveWordBs.findAll(text);
    }

    @Override
    public List<List<String>> detectSensitiveWordsBatch(List<String> textList) {
        List<List<String>> detectedWordsList = new ArrayList<>();
        for (String text : textList) {
            detectedWordsList.add(sensitiveWordBs.findAll(text));
        }
        return detectedWordsList;
    }

    @Override
    public boolean setReplaceStrategy(Map<String, String> strategy) {
        // TODO: Implement this method to set a replacement strategy
        return false;
    }

    @Override
    public Map<String, String> getReplaceStrategy() {
        // TODO: Implement this method to get the current replacement strategy
        return null;
    }

    @Override
    public List<Map<String, Object>> getSensitiveWordsLog() {
        // TODO: Implement this method to get the operation log of the sensitive word list
        return null;
    }

    @Override
    public boolean optimizeFilterPerformance() {
        // TODO: Implement this method to optimize the performance of the sensitive word filter
        return false;
    }
}
