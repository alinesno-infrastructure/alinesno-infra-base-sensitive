package com.alinesno.infra.base.sensitive.entity;

import java.util.Date;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * <p>
 *
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sensitive_words")
public class SensitiveWordsEntity extends InfraBaseEntity {
	/**
	 * 敏感词
	 */
	@ColumnType(length = 255)
	@ColumnComment("敏感词")
	@TableField("word")
	private String word;

	/**
	 * 敏感词所属语言
	 */
	@ColumnType(length = 50)
	@ColumnComment("敏感词所属语言")
	@TableField("language")
	private String language;

	/**
	 * 类型
	 */
	@ColumnType(length = 8)
	@ColumnComment("类型")
	@TableField("type")
	private String type;

	/**
	 * 状态
	 */
	@ColumnType(length = 1)
	@ColumnComment("状态")
	@TableField("status")
	private String status = "S";

}
