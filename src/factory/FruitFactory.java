package factory;

/**
 * Created by Sunmeng on 2017/9/14.
 * E-Mail:Sunmeng1995@outlook.com
 */
class FruitFactory {

    static Fruit getInstance(String name) throws BadFruitException {
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
