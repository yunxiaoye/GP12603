package com.gp.yxye.factory.simpleFactory;

/**
 * 手机工厂
 */
public class MobilePhone implements Electronics {
    public void poweSwitch(String status) {
        System.out.println("打开手机");
    }
}
