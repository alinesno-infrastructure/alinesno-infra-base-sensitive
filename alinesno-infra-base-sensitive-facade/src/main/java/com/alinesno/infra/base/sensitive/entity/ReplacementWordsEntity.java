package com.alinesno.infra.base.sensitive.entity;

import java.util.Date;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;


/**
 * <p>
 *
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Data
@TableName("replacement_words")
public class ReplacementWordsEntity extends InfraBaseEntity {
	/**
	 * 原始敏感词
	 */
	@ColumnType(length = 255)
	@ColumnComment("原始敏感词")
	@TableField("original_word")
	private String originalWord;

	/**
	 * 替代词
	 */
	@ColumnType(length = 255)
	@ColumnComment("替代词")
	@TableField("replacement_word")
	private String replacementWord;

	/**
	 * 创建时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("创建时间")
	@TableField("created_at")
	private Date createdAt;


}
