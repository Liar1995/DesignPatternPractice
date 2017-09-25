package flyweight;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sunmeng on 2017/9/25.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class ConcreteCompositeFlyweight extends Flyweight {

    private HashMap<Character, Flyweight> flies = new HashMap<>();

    // 增加一个新的单纯享元对象到复合享元中
    public void add(Character key , Flyweight fly) {
        flies.put(key,fly);
    }


    @Override
    public void operation(String state) {
        for (Map.Entry<Character, Flyweight> characterFlyweightEntry : flies.entrySet()) {
            Flyweight fly = (Flyweight) ((Map.Entry) characterFlyweightEntry).getValue();
            fly.operation(state);
        }
    }

}

