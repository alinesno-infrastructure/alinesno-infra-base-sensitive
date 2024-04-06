package com.alinesno.infra.base.sensitive.api.controller;

import com.alinesno.infra.base.sensitive.entity.SensitiveConfigEntity;
import com.alinesno.infra.base.sensitive.entity.SensitiveWordsEntity;
import com.alinesno.infra.base.sensitive.service.ISensitiveWordsService;
import com.alinesno.infra.common.core.constants.SpringInstanceScope;
import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import io.swagger.annotations.Api;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 处理与SensitiveWordsEntity相关的请求的Controller。
 * 继承自BaseController类并实现ISensitiveWordsService接口。
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Api(tags = "SensitiveWords")
@RestController
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("/api/infra/base/sensitive/sensitive_words")
public class SensitiveWordsController extends BaseController<SensitiveWordsEntity, ISensitiveWordsService> {

    // 日志记录
    private static final Logger log = LoggerFactory.getLogger(SensitiveWordsController.class);

    @Autowired
    private ISensitiveWordsService service;

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
        List<SensitiveConfigEntity> words = getFeign().getAllSensitiveWords();
        return AjaxResult.success("获取成功", words);
    }

    /**
     * 刷新敏感詞
     * 可以优化为异步，甚至批量。
     */
    @GetMapping("/refreshSensitiveWord")
    private void refreshSensitiveWord() {
        service.refreshSensitiveWord();
    }

    /**
     * 获取SensitiveWordsEntity的DataTables数据。
     *
     * @param request HttpServletRequest对象。
     * @param model   Model对象。
     * @param page    DatatablesPageBean对象。
     * @return 包含DataTables数据的TableDataInfo对象。
     */
    @ResponseBody
    @PostMapping("/datatables")
    public TableDataInfo datatables(HttpServletRequest request, Model model, DatatablesPageBean page) {
        log.debug("page = {}", ToStringBuilder.reflectionToString(page));
        return this.toPage(model, this.getFeign(), page);
    }

    @Override
    public ISensitiveWordsService getFeign() {
        return this.service;
    }
}
