package com.gp.yxye.factory.abstractFactory;

/**
 * 笔记本工厂
 */
public class NotebookComputerFactory implements Computer{


    public void create(String size) {
        System.out.println("生成了"+size+"寸的笔记电脑");
    }
}
