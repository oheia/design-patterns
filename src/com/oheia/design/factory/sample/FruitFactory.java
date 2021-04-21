package com.oheia.design.factory.sample;

/**
 * 水果工厂
 */
public class FruitFactory {

    public Fruit create(String type) {
        switch (type) {
            case "苹果":
                return new Apple();
            case "桔子":
                return new Orange();
            default:
                throw new IllegalArgumentException("暂时没有这种水果");
        }
    }
}
