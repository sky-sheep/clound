package com.nacos.client7001.elasticsearch.service;

import com.nacos.client7001.elasticsearch.pojo.Tag;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends ElasticsearchRepository<Tag,String> {
}
