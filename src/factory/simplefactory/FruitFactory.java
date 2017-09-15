package factory.simplefactory;

import factory.bean.Apple;
import factory.bean.Grape;
import factory.bean.Strawberry;

/**
 * Created by Sunmeng on 2017/9/14.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class FruitFactory {

    public static Fruit getInstance(String name) throws BadFruitException {
        if (name.equalsIgnoreCase("apple")) {
            return new Apple();
        } else if (name.equalsIgnoreCase("grape")) {
            return new Grape();
        } else if (name.equalsIgnoreCase("strawberry")) {
            return new Strawberry();
        } else {
            throw new BadFruitException("null BadFruitException");
        }
    }

}
