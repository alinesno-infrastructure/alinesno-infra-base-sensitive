package com.alinesno.infra.base.sensitive.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 敏感词配置表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sensitive_config")
public class SensitiveConfigEntity extends InfraBaseEntity {

    // 敏感词
    @TableField
    private String word;

    // 忽略大小写，默认为true
    @TableField
    private boolean ignoreCase = true;

    // 忽略半角圆角，默认为true
    @TableField
    private boolean ignoreWidth = true;

    // 忽略数字的写法，默认为true
    @TableField
    private boolean ignoreNumStyle = true;

    // 忽略中文的书写格式，默认为true
    @TableField
    private boolean ignoreChineseStyle = true;

    // 忽略英文的书写格式，默认为true
    @TableField
    private boolean ignoreEnglishStyle = true;

    // 忽略重复词，默认为false
    @TableField
    private boolean ignoreRepeat = false;

    // 是否启用数字检测，默认为true
    @TableField
    private boolean enableNumCheck = true;

    // 是否启用邮箱检测，默认为true
    @TableField
    private boolean enableEmailCheck = true;

    // 是否启用链接检测，默认为true
    @TableField
    private boolean enableUrlCheck = true;

    // 是否启用敏感单词检测，默认为true
    @TableField
    private boolean enableWordCheck = true;

    // 数字检测，自定义指定长度，默认为8
    @TableField
    private int numCheckLen = 8;

    // 词对应的标签，默认为"none"
    @TableField
    private String wordTag = "none";

    // 忽略的字符，默认为"none"
    @TableField
    private String charIgnore = "none";

    // 针对匹配的敏感词额外加工，默认为真
    @TableField
    private boolean wordResultCondition = true;

    // getters and setters
}
