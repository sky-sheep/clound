package com.nacos.client7001.elasticsearch.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @author ylx
 */
@Document(indexName = "bank",type = "account",indexStoreType = "fs")
@Data
public class User implements Serializable {

    @Id
    private String account_number;

    private String firstname;

    private String city;

    private String address;

    private String gender;

    private String lastname;

}
