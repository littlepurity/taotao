package com.chenjin.taotao.test;

import com.chenjin.taotao.mapper.ItemMapper;
import com.chenjin.taotao.mapper.TestMapper;
import com.chenjin.taotao.pojo.Item;
import com.chenjin.taotao.pojo.ItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author cj
 * @date 2019/1/2 - 19:51
 */
public class TestPageHelper {
    @Test
    public void test01() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
        ItemMapper itemMapper = ioc.getBean(ItemMapper.class);

        PageHelper.startPage(1, 3);

        ItemExample example = new ItemExample();
        List<Item> list1 = itemMapper.selectByExample(example);
        List<Item> list2 = itemMapper.selectByExample(example);

        PageInfo<Item> pageInfo = new PageInfo<>(list1);

        System.out.println("第一个集合的长度 ：" + list1.size());
        System.out.println("第一个集合的长度 ：" + list2.size());

        for (Item item : list1) {
            System.out.println(item.getCid() + "   " + item.getTitle());
        }
    }
}
