package com.lql.factory.simplefactory;


import com.lql.factory.entity.Mouse;
import com.lql.factory.enums.MouseEnum;

/**
 * @author liqiuliang
 * @create 2023-09-10 4:55
 */
public class MouseFactoryDemo {
    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse(MouseEnum.LENOVO_MOUSE.getCode());
        mouse.build();
    }
}
