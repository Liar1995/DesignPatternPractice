package factory.bean;

import factory.simplefactory.Fruit;

/**
 * Created by Sunmeng on 2017/9/14.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class Apple extends Fruit {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void grow() {

    }

    @Override
    public void harvest() {

    }

    @Override
    public void plant() {

    }

}
