package prototype;

/**
 * Created by Sunmeng on 2017/9/22.
 * E-Mail:Sunmeng1995@outlook.com
 * 简单原型模式
 */
public class SimplePrototypeModel {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype();
        Prototype prototypeCopy = prototype.clone();
    }

}

interface Prototype extends Cloneable {
    Prototype clone();
}

class ConcretePrototype implements Prototype {
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
