package com.nacos.client7001.elasticsearch.service;

import com.nacos.client7001.elasticsearch.pojo.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends ElasticsearchRepository<User,String> {

}
