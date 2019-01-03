package com.chenjin.taotao.dto;

import java.io.Serializable;

/**
 * @author cj
 * @date 2019/1/3 - 15:37
 */
public class EasyUITreeNodeDTO implements Serializable {
    private Long id;
    private String text;
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
