package com.chenjin.taotao.service;

import com.chenjin.taotao.dto.EasyUICommonDTO;

/**
 * 跟商品有关的Service
 * @author cj
 * @date 2019/1/2 - 20:24
 */
public interface ItemService {

    /**
     * 根据当前的页码和每页的行数进行查询
     * @param page
     * @param rows
     * @return
     */
    public EasyUICommonDTO getItemList(Integer page, Integer rows);
}
