package com.lql.factory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MouseEnum {
    LENOVO_MOUSE(1, "联想鼠标"),
    HP_MOUSE(2, "惠普鼠标");

    private final Integer code;
    private final String desc;
}
