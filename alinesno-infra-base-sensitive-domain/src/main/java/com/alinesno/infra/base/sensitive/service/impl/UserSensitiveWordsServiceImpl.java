package com.alinesno.infra.base.sensitive.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.base.sensitive.entity.UserSensitiveWordsEntity;
import com.alinesno.infra.base.sensitive.mapper.UserSensitiveWordsMapper;
import com.alinesno.infra.base.sensitive.service.IUserSensitiveWordsService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Slf4j
@Service
public class UserSensitiveWordsServiceImpl extends IBaseServiceImpl<UserSensitiveWordsEntity, UserSensitiveWordsMapper> implements IUserSensitiveWordsService {

}
