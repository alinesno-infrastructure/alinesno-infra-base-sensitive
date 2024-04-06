package com.alinesno.infra.base.sensitive.api.controller;

import com.alinesno.infra.base.sensitive.entity.SensitiveConfigEntity;
import com.alinesno.infra.base.sensitive.service.ISensitiveConfigService;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
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
public class SensitiveConfigController extends BaseController<SensitiveConfigEntity, ISensitiveConfigService> {

    @Autowired
    private ISensitiveConfigService sensitiveConfigService ;

   

    public ISensitiveConfigService getFeign() {
        return sensitiveConfigService;
    }
}
