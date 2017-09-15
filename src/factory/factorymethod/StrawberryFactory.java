package factory.factorymethod;

import factory.simplefactory.Fruit;
import factory.bean.Strawberry;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class StrawberryFactory extends BaseFruitFactory {
    @Override
    public Fruit newInstance() {
        return new Strawberry();
    }
}
