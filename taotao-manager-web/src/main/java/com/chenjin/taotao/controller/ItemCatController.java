package com.chenjin.taotao.controller;

import com.chenjin.taotao.dto.EasyUICommonDTO;
import com.chenjin.taotao.dto.EasyUITreeNodeDTO;
import com.chenjin.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author cj
 * @date 2019/1/3 - 15:51
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<EasyUITreeNodeDTO> getItemCatList(@RequestParam(value = "id", defaultValue = "0")Long parentId) {
        List<EasyUITreeNodeDTO> list = itemCatService.getCatList(parentId);
        return list;
    }
}
