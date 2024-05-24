package com.alinesno.infra.base.sensitive.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.base.sensitive.entity.ReplacementWordsEntity;
import com.alinesno.infra.base.sensitive.mapper.ReplacementWordsMapper;
import com.alinesno.infra.base.sensitive.service.IReplacementWordsService;
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
public class ReplacementWordsServiceImpl extends IBaseServiceImpl<ReplacementWordsEntity, ReplacementWordsMapper> implements IReplacementWordsService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(ReplacementWordsServiceImpl.class);

}
