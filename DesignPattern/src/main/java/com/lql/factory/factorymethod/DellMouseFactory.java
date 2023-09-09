package com.lql.factory.factorymethod;

import com.lql.factory.entity.DellMouse;
import com.lql.factory.entity.Mouse;

public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
