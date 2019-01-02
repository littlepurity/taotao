package com.chenjin.taotao.controller;

import com.chenjin.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试用的Controller，查询当前时间
 * @author cj
 * @date 2019/1/2 - 14:26
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test/query/now")
    @ResponseBody
    public String queryNow() {
        return testService.queryNow();
    }

    @RequestMapping("/test/index")
    public String showIndex() {
        return "index";
    }
}
