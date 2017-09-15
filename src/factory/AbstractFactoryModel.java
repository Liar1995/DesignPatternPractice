package factory;

import factory.abstractfactory.AppleFactory;
import factory.abstractfactory.Factory;
import factory.abstractfactory.SumFactory;
import factory.bean.Computer;
import factory.bean.Phone;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 * 抽象工厂模式
 */
public class AbstractFactoryModel {

    /**
     * 抽象工厂模式
     * 抽象工厂模式与工厂方法模式的区别: 在工厂方法模式中，"抽象产品"只有一个，而在抽象工厂模式中，
     * "抽象产品"有很多个！在工厂方法模式中，是由"具体工厂"决定返回哪一类产品；然后，抽象工厂中，是由"客户端"决定返回哪一类产品。
     * 两个或者多个工厂和产品，四个角色（抽象工厂，具体工厂，抽象产品，具体产品）
     */
    public static void main(String[] args) {

        Factory baseSumFactory = new SumFactory();
        Phone sumPhone = baseSumFactory.createPhone();
        sumPhone.activate();
        Computer SumComputer = baseSumFactory.createCompiler();
        System.out.print(SumComputer.getOSName());

        Factory baseAppleFactory = new AppleFactory();
        Phone applePhone = baseAppleFactory.createPhone();
        applePhone.activate();
        Computer appleComputer = baseAppleFactory.createCompiler();
        System.out.print(appleComputer.getOSName());

    }

}
