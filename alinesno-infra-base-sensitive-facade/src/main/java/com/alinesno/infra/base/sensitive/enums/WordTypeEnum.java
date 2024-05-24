package com.alinesno.infra.base.sensitive.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WordTypeEnum {

    ALLOW("ALLOW") ,
    DENY("DENY") ;

    private final String code ;

}
