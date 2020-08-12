package com.course.server.service;


import com.course.server.domain.Test;
import com.course.server.domain.TestExample;
import com.course.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        // 查询全部
        TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo("1"); //查询id=1的，相当于where
        testExample.setOrderByClause("id desc"); //按id排序
        return testMapper.selectByExample(testExample);
    }
}
