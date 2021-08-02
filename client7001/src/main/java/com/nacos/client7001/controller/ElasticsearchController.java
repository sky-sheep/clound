package com.nacos.client7001.controller;

import com.nacos.client7001.elasticsearch.mapper.NodiotTagBaseMapper;
import com.nacos.client7001.elasticsearch.pojo.NodiotTagBase;
import com.nacos.client7001.elasticsearch.pojo.Tag;
import com.nacos.client7001.elasticsearch.service.UserRepository;
import com.nacos.client7001.elasticsearch.service.UserService;
import org.elasticsearch.index.query.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ylx
 */
@RestController
public class ElasticsearchController {
    @Autowired
    private NodiotTagBaseMapper nodiotTagBaseMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;


    @GetMapping("/select")
    private void save(String s){
        NativeSearchQuery build = new NativeSearchQueryBuilder().
//                withQuery(QueryBuilders.simpleQueryStringQuery(s))
                withQuery(QueryBuilders.multiMatchQuery(s,"tagName","dcsName","sisName","fpiName","gpiName"))
                .build();
        SearchHits<Tag> search = elasticsearchRestTemplate.search(build, Tag.class);
        search.forEach(e-> System.out.println(e));
    }

    @GetMapping("/selectTagBase")
    private void selectTagBase(){
        List<NodiotTagBase> nodiotTagBases = nodiotTagBaseMapper.selectList(null);
        nodiotTagBases.forEach(e->{
            Tag tag = new Tag();
            BeanUtils.copyProperties(e,tag);
            elasticsearchRestTemplate.save(tag);
            System.out.println("保存成功测点"+tag.getTagName());
        });
    }
}
