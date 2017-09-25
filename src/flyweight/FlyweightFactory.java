package flyweight;

import java.util.HashMap;

/**
 * Created by Sunmeng on 2017/9/25.
 * E-Mail:Sunmeng1995@outlook.com
 * 享元工厂
 */
public class FlyweightFactory {

    private HashMap flies = new HashMap();

    // 创建"复合享元"的工厂方法
    public Flyweight factory(String compositeState){
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
        int length = compositeState.length();
        Character state;
        for (int i=0; i<length; i++) {
            state = new Character(compositeState.charAt(i));
            System.out.println("factory("+state+")");
            // 通过 this.factory(state)创建"单纯享元"，
            // 然后 将"单纯享元"添加到"复合享元"中。
            compositeFly.add(state, this.factory(state));
        }
        return compositeFly;
    }

    public Flyweight factory(Character state) {
        if (flies.containsKey(state)) {
            System.out.println(state+" exists.");
            return (Flyweight)flies.get(state);
        } else {
            System.out.println(state+" not exists!");
            Flyweight fly = new ConcreteFlyweight(state);
            flies.put(state, fly);
            return fly;
        }
    }
}
