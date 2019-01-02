package com.chenjin.taotao.service.impl;

import com.chenjin.taotao.dto.EasyUICommonDTO;
import com.chenjin.taotao.mapper.ItemMapper;
import com.chenjin.taotao.pojo.Item;
import com.chenjin.taotao.pojo.ItemExample;
import com.chenjin.taotao.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cj
 * @date 2019/1/2 - 20:26
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;

    @Override
    public EasyUICommonDTO getItemList(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);

        ItemExample itemExample = new ItemExample();
        List<Item> list = itemMapper.selectByExample(itemExample);
        PageInfo<Item> pageInfo = new PageInfo<>(list);
        EasyUICommonDTO dto = new EasyUICommonDTO();
        dto.setTotal((int) pageInfo.getTotal());
        dto.setRows(pageInfo.getList());

        return dto;
    }
}
