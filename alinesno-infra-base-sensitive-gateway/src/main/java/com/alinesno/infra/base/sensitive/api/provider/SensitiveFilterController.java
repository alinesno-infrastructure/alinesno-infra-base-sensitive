package com.alinesno.infra.base.sensitive.api.provider;

import com.alinesno.infra.base.sensitive.service.ISensitiveWordFilterService;
import com.alinesno.infra.common.facade.response.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 敏感词控制器
 * 该类负责处理敏感词相关的请求，并调用相应的服务进行处理
 * 包括添加、删除、修改敏感词，导入、导出敏感词，过滤文本，检测敏感词等操作
 * 通过RESTful接口提供敏感词的管理和处理功能
 * 作者：luoxiaodong
 * 版本：1.0.0
 */
@RestController
@RequestMapping("/api/sensitiveFilter")
public class SensitiveFilterController {

    private final ISensitiveWordFilterService sensitiveWordFilterService;

    @Autowired
    public SensitiveFilterController(ISensitiveWordFilterService sensitiveWordFilterService) {
        this.sensitiveWordFilterService = sensitiveWordFilterService;
    }

    /**
     * 添加敏感词
     *
     * @param word 敏感词内容
     * @return 返回添加结果的AjaxResult对象
     */
    @PostMapping("/add")
    public AjaxResult addSensitiveWord(@RequestBody String word) {
        return sensitiveWordFilterService.addSensitiveWord(word) ?
                AjaxResult.success("添加成功") : AjaxResult.error("添加失败");
    }

    /**
     * 删除敏感词
     *
     * @param word 敏感词内容
     * @return 返回删除结果的AjaxResult对象
     */
    @PostMapping("/delete")
    public AjaxResult deleteSensitiveWord(@RequestBody String word) {
        return sensitiveWordFilterService.deleteSensitiveWord(word) ?
                AjaxResult.success("删除成功") : AjaxResult.error("删除失败");
    }

    /**
     * 修改敏感词
     *
     * @param oldWord 原敏感词内容
     * @param newWord 新敏感词内容
     * @return 返回修改结果的AjaxResult对象
     */
    @PostMapping("/modify")
    public AjaxResult modifySensitiveWord(@RequestParam String oldWord, @RequestParam String newWord) {
        return sensitiveWordFilterService.modifySensitiveWord(oldWord, newWord) ?
                AjaxResult.success("修改成功") : AjaxResult.error("修改失败");
    }

    /**
     * 导入敏感词
     *
     * @param filePath 导入文件路径
     * @return 返回导入结果的AjaxResult对象
     */
    @PostMapping("/import")
    public AjaxResult importSensitiveWords(@RequestBody String filePath) {
        return sensitiveWordFilterService.importSensitiveWords(filePath) ?
                AjaxResult.success("导入成功") : AjaxResult.error("导入失败");
    }

    /**
     * 导出敏感词
     *
     * @param filePath 导出文件路径
     * @return 返回导出结果的AjaxResult对象
     */
    @PostMapping("/export")
    public AjaxResult exportSensitiveWords(@RequestBody String filePath) {
        return sensitiveWordFilterService.exportSensitiveWords(filePath) ?
                AjaxResult.success("导出成功") : AjaxResult.error("导出失败");
    }

    /**
     * 过滤文本中的敏感词
     *
     * @param text 待过滤的文本
     * @return 返回过滤后的文本的AjaxResult对象
     */
    @PostMapping("/filter")
    public AjaxResult filterText(@RequestBody String text) {
        String filteredText = sensitiveWordFilterService.filterText(text);
        return AjaxResult.success("过滤成功", filteredText);
    }

    /**
     * 批量过滤文本中的敏感词
     *
     * @param textList 待过滤的文本列表
     * @return 返回批量过滤后的文本列表的AjaxResult对象
     */
    @PostMapping("/filter-batch")
    public AjaxResult filterTextBatch(@RequestBody List<String> textList) {
        List<String> filteredTextList = sensitiveWordFilterService.filterTextBatch(textList);
        return AjaxResult.success("批量过滤成功", filteredTextList);
    }

    /**
     * 检测文本中的敏感词
     *
     * @param text 待检测的文本
     * @return 返回检测到的敏感词列表的AjaxResult对象
     */
    @PostMapping("/detect")
    public AjaxResult detectSensitiveWords(@RequestBody String text) {
        List<String> detectedWords = sensitiveWordFilterService.detectSensitiveWords(text);
        return AjaxResult.success("检测成功", detectedWords);
    }

    /**
     * 批量检测文本中的敏感词
     *
     * @param textList 待检测的文本列表
     * @return 返回批量检测到的敏感词列表的AjaxResult对象
     */
    @PostMapping("/detect-batch")
    public AjaxResult detectSensitiveWordsBatch(@RequestBody List<String> textList) {
        List<List<String>> detectedWordsList = sensitiveWordFilterService.detectSensitiveWordsBatch(textList);
        return AjaxResult.success("批量检测成功", detectedWordsList);
    }

    /**
     * 设置敏感词替换策略
     *
     * @param strategy 替换策略
     * @return 返回设置结果的AjaxResult对象
     */
    @PostMapping("/set-strategy")
    public AjaxResult setReplaceStrategy(@RequestBody Map<String, String> strategy) {
        return sensitiveWordFilterService.setReplaceStrategy(strategy) ?
                AjaxResult.success("设置成功") : AjaxResult.error("设置失败");
    }

    /**
     * 获取敏感词替换策略
     *
     * @return 返回获取到的替换策略的AjaxResult对象
     */
    @GetMapping("/get-strategy")
    public AjaxResult getReplaceStrategy() {
        Map<String, String> strategy = sensitiveWordFilterService.getReplaceStrategy();
        return AjaxResult.success("获取成功", strategy);
    }

    /**
     * 获取敏感词日志
     *
     * @return 返回获取到的敏感词日志列表的AjaxResult对象
     */
    @GetMapping("/get-log")
    public AjaxResult getSensitiveWordsLog() {
        List<Map<String, Object>> log = sensitiveWordFilterService.getSensitiveWordsLog();
        return AjaxResult.success("获取成功", log);
    }

    /**
     * 优化敏感词过滤性能
     *
     * @return 返回优化结果的AjaxResult对象
     */
    @PostMapping("/optimize")
    public AjaxResult optimizeFilterPerformance() {
        return sensitiveWordFilterService.optimizeFilterPerformance() ?
                AjaxResult.success("优化成功") : AjaxResult.error("优化失败");
    }
}