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
@TableName("filter_logs")
public class FilterLogsEntity extends InfraBaseEntity {
	/**
	 * 触发过滤的用户ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("触发过滤的用户ID")
	@TableField("user_id")
	private Long userId;

	/**
	 * 被过滤的文本内容
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("被过滤的文本内容")
	@TableField("filtered_text")
	private String filteredText;

	/**
	 * 过滤级别('宽松', '中等', '严格')
	 */
	@ColumnType(length = 6)
	@ColumnComment("过滤级别('宽松', '中等', '严格')")
	@TableField("filter_level")
	private String filterLevel;

	/**
	 * 过滤时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("过滤时间")
	@TableField("created_at")
	private Date createdAt;


}
