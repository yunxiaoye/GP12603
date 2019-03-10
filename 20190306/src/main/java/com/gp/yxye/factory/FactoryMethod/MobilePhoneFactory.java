package com.gp.yxye.factory.FactoryMethod;

import com.gp.yxye.factory.simpleFactory.Electronics;

/**
 * 手机工厂
 */
public class MobilePhoneFactory implements ElectronicsFactory {

    public com.gp.yxye.factory.FactoryMethod.Electronics production(String model) {
        return new MobilePhone();
    }
}
