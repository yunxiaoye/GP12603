package com.gp.yxye.factory.abstractFactory;

/**
 * 电子工厂
 */
public interface Electronics {

    /**
     * 生产灯
     * @param color
     * @return
     */
    public Lamp  createLamp(String color);

    /**
     * 生产电脑
     * @param size 屏幕尺寸
     * @return
     */
    public Computer createComputer(String size);
}
