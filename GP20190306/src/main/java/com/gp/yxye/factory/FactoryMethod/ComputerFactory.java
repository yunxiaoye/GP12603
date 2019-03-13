package com.gp.yxye.factory.FactoryMethod;


/**
 * 电脑工厂
 */
public class ComputerFactory implements ElectronicsFactory {

    public Electronics production(String model) {
        return new Computer();
    }
}
