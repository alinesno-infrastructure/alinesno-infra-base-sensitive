package com.alinesno.infra.base.sensitive.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.base.sensitive.entity.FilterLogsEntity;
import com.alinesno.infra.base.sensitive.mapper.FilterLogsMapper;
import com.alinesno.infra.base.sensitive.service.IFilterLogsService;
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
public class FilterLogsServiceImpl extends IBaseServiceImpl<FilterLogsEntity, FilterLogsMapper> implements IFilterLogsService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(FilterLogsServiceImpl.class);

}
