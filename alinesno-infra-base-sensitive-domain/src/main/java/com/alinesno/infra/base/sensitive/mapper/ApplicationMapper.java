package com.alinesno.infra.base.sensitive.mapper;

import com.alinesno.infra.base.sensitive.entity.ApplicationEntity;
import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApplicationMapper extends IBaseMapper<ApplicationEntity> {
}
