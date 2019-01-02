package com.chenjin.taotao.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author cj
 * @date 2019/1/2 - 20:21
 */
public class EasyUICommonDTO implements Serializable {
    private Integer total;
    private List<?> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
