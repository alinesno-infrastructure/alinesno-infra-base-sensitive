package com.alinesno.infra.base.sensitive.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.base.sensitive.entity.SensitiveWordsEntity;
import com.alinesno.infra.base.sensitive.mapper.SensitiveWordsMapper;
import com.alinesno.infra.base.sensitive.service.ISensitiveWordsService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Service
public class SensitiveWordsServiceImpl extends IBaseServiceImpl<SensitiveWordsEntity, SensitiveWordsMapper> implements ISensitiveWordsService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(SensitiveWordsServiceImpl.class);

}
