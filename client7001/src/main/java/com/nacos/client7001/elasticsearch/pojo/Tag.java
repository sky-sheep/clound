package com.nacos.client7001.elasticsearch.pojo;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "tag",type = "base")
public class Tag {
    @Id
    private String tagName;

    private String tagCode;

    /** 设备模型id */
    private String deviceModelId;

    /**设备实例化ID*/
    private String deviceInstanceId;

    /**设备实例化名称*/
    private String deviceInstanceName;

    /**系统名称*/
    private String deviceInstanceSystem;

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
}
