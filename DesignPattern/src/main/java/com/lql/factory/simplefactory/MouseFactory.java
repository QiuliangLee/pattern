package com.lql.factory.simplefactory;

import com.lql.factory.entity.HpMouse;
import com.lql.factory.entity.LenovoMouse;
import com.lql.factory.entity.Mouse;

public class MouseFactory {
    public static Mouse createMouse(Integer type) {
        switch (type) {
            case 1:
                return new LenovoMouse();
            case 2:
                return new HpMouse();
            default:
                return new LenovoMouse();
        }
    }
}
