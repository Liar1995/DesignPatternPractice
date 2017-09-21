package factory;

import factory.bean.Apple;
import factory.factorymethod.AppleFactory;
import factory.factorymethod.BaseFruitFactory;
import factory.factorymethod.GrapeFactory;
import factory.simplefactory.Fruit;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 * 工厂方法模式,产品有多个工厂
 */
public class FactoryMethodModel {

    /**
     * 工厂方法模式（虚构造子模式/多态性工厂模式）
     * 工厂方法模型中，“工厂”创建的是还没有分化好的对象，其中没有逻辑判断相比于简单工厂模式，基类工厂去定义接口，
     * 子工厂去实现判断实现并能生产出相应功能的对象，把简单的内部逻辑判断移到了具体实现的工厂，
     * 工厂方法克服了简单工厂违背开放-封闭原则的缺点，又保持了封装对象创建过程的优点，以及多态性的体现
     */

    public static void main(String[] args) {
        BaseFruitFactory appleFac = new AppleFactory();
        Fruit apple = appleFac.newInstance();
        apple.grow();
        new GrapeFactory().newInstance().grow();
    }
}
