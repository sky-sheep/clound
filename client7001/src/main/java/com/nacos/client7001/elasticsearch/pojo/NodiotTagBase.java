package com.nacos.client7001.elasticsearch.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;


/**
 * 测点基本信息表(NodiotTagBase)表实体类
 *
 * @author yanglx
 * @since 2020-09-02 10:54:15
 */
@Data
@TableName("nodiot_tag_base")
public class NodiotTagBase {

    private static final long serialVersionUID = 5695143051190353387L;

    /**主键ID*/
    @TableId(value = "tag_id",type = IdType.ASSIGN_UUID)
    private String tagId;

    private String unitId;

    /**机组名称*/
    private String unitName;

    /** 设备模型id */
    private String deviceModelId;

    /**设备实例化ID*/
    private String deviceInstanceId;

    /**设备实例化名称*/
    private String deviceInstanceName;

    /**系统名称*/
    private String deviceInstanceSystem;

    /**指标类型*/
    private String indexType;

    /**指标名称*/
    private String indexName;

    /**指标编码*/
    private String indexCode;

    /**测点编码*/
    private String tagCode;

    /**测点名称*/
    private String tagName;

    /** 计量单位*/
    private String tagUnit;

    /*** 精确度*/
    private String tagAccurary;

    /*** 测点类型（0：不分，1：开关量，2：模拟量，3：OPC,4:其它）*/
    private String tagType;

    /*** 测点重要性分类*/
    private String tagImportance;

    /** 源数据唯一标识*/
    private String sourceId;

    /*** 源数据来源系统（数据是：DCS系统,厂PI系统,集团PI系统,SIS系统）*/
    private String sourceSys;

    /*** 原始点名*/
    private String originTag;

    /** 厂PI编码*/
    private String fpiCode;

    /** 厂PI点名*/
    private String fpiName;

    /**集团PI编码*/
    private String gpiCode;

    /** 集团PI点名*/
    private String gpiName;

    /** DCS编码*/
    private String dcsCode;

    /** DCS点名*/
    private String dcsName;

    /*** SIS编码*/
    private String sisCode;

    /** SIS点名*/
    private String sisName;

    /**是否初始化*/
    private String isLoading;

    /**是否预处理*/
    private String isPretreatment;

    /**初始数据*/
    private String initData;

    /**是否启用 是否启用（0：禁用，1：启用）*/
    private  String isused;

}