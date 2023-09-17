package com.alinesno.infra.base.sensitive.service;

import java.util.List;
import java.util.Map;

/**
 * 敏感词过滤系统的接口定义
 */
public interface ISensitiveWordFilterService {
    /**
     * 添加敏感词到敏感词列表中
     *
     * @param word 敏感词
     * @return 添加是否成功的结果
     */
    boolean addSensitiveWord(String word);

    /**
     * 从敏感词列表中删除敏感词
     *
     * @param word 敏感词
     * @return 删除是否成功的结果
     */
    boolean deleteSensitiveWord(String word);

    /**
     * 修改敏感词列表中的敏感词
     *
     * @param oldWord 原敏感词
     * @param newWord 新敏感词
     * @return 修改是否成功的结果
     */
    boolean modifySensitiveWord(String oldWord, String newWord);

    /**
     * 从文件中导入敏感词列表
     *
     * @param filePath 文件路径
     * @return 导入是否成功的结果
     */
    boolean importSensitiveWords(String filePath);

    /**
     * 导出敏感词列表到文件
     *
     * @param filePath 文件路径
     * @return 导出是否成功的结果
     */
    boolean exportSensitiveWords(String filePath);

    /**
     * 对输入的文本进行敏感词过滤
     *
     * @param text 输入文本
     * @return 过滤后的文本
     */
    String filterText(String text);

    /**
     * 批量对文本列表进行敏感词过滤
     *
     * @param textList 文本列表
     * @return 过滤后的文本列表
     */
    List<String> filterTextBatch(List<String> textList);

    /**
     * 检测文本中是否包含敏感词
     *
     * @param text 输入文本
     * @return 检测到的敏感词列表
     */
    List<String> detectSensitiveWords(String text);

    /**
     * 批量检测文本列表中是否包含敏感词
     *
     * @param textList 文本列表
     * @return 每个文本对应的敏感词列表
     */
    List<List<String>> detectSensitiveWordsBatch(List<String> textList);

    /**
     * 设置敏感词替换策略
     *
     * @param strategy 替换策略
     * @return 设置是否成功的结果
     */
    boolean setReplaceStrategy(Map<String, String> strategy);

    /**
     * 获取当前的敏感词替换策略
     *
     * @return 当前的敏感词替换策略
     */
    Map<String, String> getReplaceStrategy();

    /**
     * 获取敏感词列表的操作日志
     *
     * @return 敏感词列表的操作日志
     */
    List<Map<String, Object>> getSensitiveWordsLog();

    /**
     * 对敏感词过滤算法进行性能优化
     *
     * @return 优化是否成功的结果
     */
    boolean optimizeFilterPerformance();
}
