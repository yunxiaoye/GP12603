package com.gp.yxye.factory.simpleFactory;


public class ElectronicsFactory {

    public Electronics production(String type){
        if("computer".equals(type)){
            return new Computer();
        }else if("mobile".equals(type)){
            return new MobilePhone();
        }else{
            return null;
        }
    }
}
