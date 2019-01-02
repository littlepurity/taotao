package com.chenjin.taotao.service.impl;

import com.chenjin.taotao.mapper.TestMapper;
import com.chenjin.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cj
 * @date 2019/1/2 - 14:19
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public String queryNow() {
        return testMapper.queryNow();
    }
}
