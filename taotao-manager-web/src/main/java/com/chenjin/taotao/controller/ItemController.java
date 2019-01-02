package com.chenjin.taotao.controller;

import com.chenjin.taotao.dto.EasyUICommonDTO;
import com.chenjin.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cj
 * @date 2019/1/2 - 17:36
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public EasyUICommonDTO getItemList(Integer page, Integer rows) {
        return itemService.getItemList(page, rows);
    }
}
