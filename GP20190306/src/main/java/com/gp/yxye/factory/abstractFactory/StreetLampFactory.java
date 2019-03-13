package com.gp.yxye.factory.abstractFactory;

/**
 * 路灯工厂
 */
public class StreetLampFactory implements Lamp{
    public void create(String color) {
        System.out.println("生产了"+color+"颜色的路灯");
    }
}
