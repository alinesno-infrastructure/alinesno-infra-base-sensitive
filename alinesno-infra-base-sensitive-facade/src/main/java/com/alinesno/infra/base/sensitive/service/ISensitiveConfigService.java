package com.alinesno.infra.base.sensitive.service;

import com.alinesno.infra.base.sensitive.entity.SensitiveConfigEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

import java.util.List;

/**
 * 敏感词服务接口
 * 该接口定义了对敏感词的操作方法，包括添加、删除和获取全部敏感词
 * 继承自通用的基础服务接口
 */
public interface ISensitiveConfigService extends IBaseService<SensitiveConfigEntity> {


}
