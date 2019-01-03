package com.chenjin.taotao.service;

import com.chenjin.taotao.dto.EasyUITreeNodeDTO;

import java.util.List;

/**
 * @author cj
 * @date 2019/1/3 - 15:39
 */
public interface ItemCatService {
    public List<EasyUITreeNodeDTO> getCatList(Long parentId);
}
