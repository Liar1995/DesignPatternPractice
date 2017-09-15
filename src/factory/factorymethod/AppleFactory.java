package factory.factorymethod;

import factory.bean.Apple;
import factory.simplefactory.Fruit;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class AppleFactory extends BaseFruitFactory {
    @Override
    public Fruit newInstance() {
        return new Apple();
    }

}
