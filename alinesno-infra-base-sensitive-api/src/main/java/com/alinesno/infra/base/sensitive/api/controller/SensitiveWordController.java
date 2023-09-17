package com.alinesno.infra.base.sensitive.api.controller;

import com.alinesno.infra.base.sensitive.entity.SensitiveWordEntity;
import com.alinesno.infra.base.sensitive.service.ISensitiveWordService;
import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.common.facade.response.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 敏感词控制器
 * 处理敏感词相关的HTTP请求
 * 继承自通用的基础控制器
 */
@RestController
@RequestMapping("/api/sensitiveWord")
public class SensitiveWordController extends BaseController<SensitiveWordEntity, ISensitiveWordService> {

    @Autowired
    private ISensitiveWordService sensitiveWordService ;

    /**
     * 添加敏感词
     *
     * @param word 敏感词内容
     * @return 添加结果的Ajax响应
     */
    @PostMapping("/add")
    public AjaxResult addSensitiveWord(@RequestBody String word) {
        return getFeign().addSensitiveWord(word) ?
                AjaxResult.success("添加成功") : AjaxResult.error("添加失败");
    }

    /**
     * 删除敏感词
     *
     * @param word 敏感词内容
     * @return 删除结果的Ajax响应
     */
    @PostMapping("/delete")
    public AjaxResult deleteSensitiveWord(@RequestBody String word) {
        return getFeign().deleteSensitiveWord(word) ?
                AjaxResult.success("删除成功") : AjaxResult.error("删除失败");
    }

    /**
     * 获取全部敏感词
     *
     * @return 全部敏感词的Ajax响应
     */
    @GetMapping("/all")
    public AjaxResult getAllSensitiveWords() {
        List<SensitiveWordEntity> words = getFeign().getAllSensitiveWords();
        return AjaxResult.success("获取成功", words);
    }

    public ISensitiveWordService getFeign() {
        return sensitiveWordService;
    }
}
