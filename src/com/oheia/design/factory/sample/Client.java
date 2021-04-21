package com.oheia.design.factory.sample;

import org.junit.Test;

/**
 * 简单工厂模式测试类
 *
 * 常规的创建对象方式为直接new一个对象，相当于多知道一个类，不利于松耦合
 * 工厂模式用于封装对象的构建过程
 */
public class Client {

    @Test
    public void test() {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit apple = fruitFactory.create("苹果");
        Fruit orange = fruitFactory.create("桔子");
        apple.eat();
        orange.eat();
    }
}
