package com.alinesno.infra.base.sensitive.service.impl;

import com.alinesno.infra.base.sensitive.entity.ApplicationEntity;
import com.alinesno.infra.base.sensitive.mapper.ApplicationMapper;
import com.alinesno.infra.base.sensitive.service.IApplicationService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ApplicationServiceImpl extends IBaseServiceImpl<ApplicationEntity, ApplicationMapper> implements IApplicationService {

}
