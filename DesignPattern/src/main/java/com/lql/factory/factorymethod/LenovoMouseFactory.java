package com.lql.factory.factorymethod;


import com.lql.factory.entity.LenovoMouse;
import com.lql.factory.entity.Mouse;

public class LenovoMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }
}
