package com.alinesno.infra.base.sensitive.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 存储应用实体类
 * </p>
 * <p>
 * 该类继承自InfraBaseEntity，表示存储应用的基本信息。
 * </p>
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@TableName("document_application")
@Data
public class ApplicationEntity extends InfraBaseEntity {

    /**
     * 应用名称
     */
    @TableField("application_name")
	@ColumnType(length=255)
	@ColumnComment("应用名称")
    private String applicationName;

    /**
     * 应用代码
     */
    @TableField("application_code")
	@ColumnType(length=50)
	@ColumnComment("应用代码")
    private String applicationCode;

    /**
     * 应用值
     */
	@ColumnType(length=255)
	@ColumnComment("应用值")
	@TableField("token")
    private String token;

    /**
     * 最大文件长度
     */
    @TableField("max_file_size")
	@ColumnType(length=4)
	@ColumnComment("最大文件长度")
    private Integer maxFileSize;

    /**
     * 文件类型
     */
    @TableField("file_type")
	@ColumnType(length=20)
	@ColumnComment("文件类型")
    private String fileType;

    /**
     * 接口密钥
     */
    @TableField("api_key")
	@ColumnType(length=32)
	@ColumnComment("接口密钥")
    private String apiKey;

    /**
     * 最大上传次数
     */
    @TableField("max_upload_count")
	@ColumnType(length=255)
	@ColumnComment("最大上传次数")
    private Integer maxUploadCount;

    /**
     * 最大下载次数
     */
    @TableField("max_download_count")
	@ColumnType(length=10)
	@ColumnComment("最大下载次数")
    private Integer maxDownloadCount;

    /**
     * 应用logo标识
     */
	@ColumnType(length=255)
	@ColumnComment("应用logo标识")
	@TableField("banner")
    private String banner;

    /**
     * 公司名称
     */
    @TableField("company_name")
	@ColumnType(length=50)
	@ColumnComment("公司名称")
    private String companyName;

    /**
     * 所开通渠道
     */
    @TableField("channel_ids")
	@ColumnType(length=255)
	@ColumnComment("所开通渠道")
    private String channelIds;

    /**
     * 应用码
     */
    @TableField("app_code")
	@ColumnType(length=50)
	@ColumnComment("应用码")
    private String appCode;
}
