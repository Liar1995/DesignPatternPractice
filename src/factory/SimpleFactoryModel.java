package factory;

/**
 * Created by Sunmeng on 2017/9/14.
 * E-Mail:Sunmeng1995@outlook.com
 * 简单工厂模式
 */
public class SimpleFactoryModel {

    /**
     *
     * */

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
