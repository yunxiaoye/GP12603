package com.gp.yxye.factory.FactoryMethod;

/**
 * 电子工厂
 */
public interface ElectronicsFactory {

    /**
     * 生产商品
     * @param model
     */
    public Electronics production(String model);

}
