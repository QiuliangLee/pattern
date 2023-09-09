package com.lql.factory.no;

import com.lql.factory.entity.HpMouse;
import com.lql.factory.entity.LenovoMouse;
import com.lql.factory.enums.MouseEnum;

/**
 * @author liqiuliang
 * @create 2023-09-10 6:13
 */
public class MouseDemo {
    public void getMouse(Integer type) {
        if (MouseEnum.LENOVO_MOUSE.getCode().equals(type)) {
            LenovoMouse lenovoMouse = new LenovoMouse();
            lenovoMouse.build();
        } else if (MouseEnum.HP_MOUSE.getCode().equals(type)) {
            HpMouse hpMouse = new HpMouse();
            hpMouse.build();
        } else {
            throw new IllegalArgumentException("无效的鼠标：" + type);
        }
    }
}
