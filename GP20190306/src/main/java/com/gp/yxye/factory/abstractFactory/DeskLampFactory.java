package com.gp.yxye.factory.abstractFactory;

/**
 * 台灯工厂
 */
public class DeskLampFactory implements Lamp{


    public void create(String color) {
        System.out.println("生产了"+color+"颜色的台灯！");
    }
}
