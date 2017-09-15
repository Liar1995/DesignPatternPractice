package factory;

import factory.simplefactory.BadFruitException;
import factory.simplefactory.Fruit;
import factory.simplefactory.FruitFactory;

/**
 * Created by Sunmeng on 2017/9/14.
 * E-Mail:Sunmeng1995@outlook.com
 * 简单工厂模式
 */
public class SimpleFactoryModel {

    /**
     * 简单工厂模式基础构成：工厂(Factory)，抽象产品(Product)，具体产品(ConcreteProduct)
     * 工厂:提供接口，获取对象
     * 抽象产品：抽象出不同产品的共同点，Product可以是接口或者抽象类
     * 具体产品：继承或实现抽象产品后的实际产品
     */

    public static void main(String[] args) {
        try {

            Fruit apple = FruitFactory.getInstance("Apple");
            apple.plant();
            apple.grow();
            apple.harvest();

            Fruit grape = FruitFactory.getInstance("Grape");
            grape.plant();
            grape.grow();
            grape.harvest();

            Fruit strawberry = FruitFactory.getInstance("strawberry");
            strawberry.plant();
            strawberry.grow();
            strawberry.harvest();

            Fruit error = FruitFactory.getInstance("error");
            error.plant();
            error.grow();
            error.harvest();

        } catch (BadFruitException e) {
            e.printStackTrace();
        }
    }

}
