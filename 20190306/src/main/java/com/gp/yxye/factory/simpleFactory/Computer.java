package com.gp.yxye.factory.simpleFactory;

/**
 * 电脑工厂
 */
public class Computer implements Electronics {
    public void poweSwitch(String status) {
        System.out.println("打开电脑");
    }
}
