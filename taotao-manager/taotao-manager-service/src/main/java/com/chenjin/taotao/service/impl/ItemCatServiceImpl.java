package com.chenjin.taotao.service.impl;

import com.chenjin.taotao.dto.EasyUITreeNodeDTO;
import com.chenjin.taotao.mapper.ItemCatMapper;
import com.chenjin.taotao.pojo.ItemCat;
import com.chenjin.taotao.pojo.ItemCatExample;
import com.chenjin.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cj
 * @date 2019/1/3 - 15:40
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public List<EasyUITreeNodeDTO> getCatList(Long parentId) {
        ItemCatExample example = new ItemCatExample();
        ItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<ItemCat> list = itemCatMapper.selectByExample(example);

        List<EasyUITreeNodeDTO> resultList = new ArrayList<EasyUITreeNodeDTO>();
        for (ItemCat itemCat : list) {
            EasyUITreeNodeDTO dto = new EasyUITreeNodeDTO();
            dto.setId(itemCat.getId());
            dto.setText(itemCat.getName());
            dto.setState(itemCat.getIsParent() == 1 ? "closed" : "open");
            resultList.add(dto);
        }
        return resultList;
    }
}
