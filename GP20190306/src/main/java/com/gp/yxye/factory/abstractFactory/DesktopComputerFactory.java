package com.gp.yxye.factory.abstractFactory;

/**
 * 台式电脑工厂
 */
public class DesktopComputerFactory implements Computer{

    public void create(String size) {
        System.out.println("生产的"+size+"寸的台式电脑!");
    }
}
