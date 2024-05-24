package com.alinesno.infra.base.sensitive.service.impl;

import com.alinesno.infra.base.sensitive.entity.SensitiveConfigEntity;
import com.alinesno.infra.base.sensitive.mapper.SensitiveConfigMapper;
import com.alinesno.infra.base.sensitive.service.ISensitiveConfigService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 敏感词服务实现类
 * 该类实现了敏感词服务接口，提供了对敏感词的添加、删除和获取全部敏感词的功能
 * 作者：luoxiaodong
 * 版本：1.0.0
 */
@Slf4j
@Service
public class SensitiveConfigServiceImpl extends IBaseServiceImpl<SensitiveConfigEntity, SensitiveConfigMapper> implements ISensitiveConfigService {

}
