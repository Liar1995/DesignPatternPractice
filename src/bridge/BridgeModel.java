package bridge;

import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by Sunmeng on 2017/9/22.
 * E-Mail:Sunmeng1995@outlook.com
 * 桥接模式 结构模式
 */
public class BridgeModel {

    /**
     * 桥接模式 桥接（Bridge）是用于把抽象化与实现化解耦
     * 抽象化(Abstraction):抽象化给出的定义，并保存一个对实现化对象的引用
     * 修正抽象化(RefinedAbstraction):扩展抽象化角色，改变和修正父类对抽象化的定义
     * 实现化(Implementor):给出实现化角色的接口，但不给出具体的实现,可以和抽象化角色的接口定义不同
     * 具体实现化(ConcreteImplementor)：这个角色给出实现化角色接口的具体实现
     * 对象是对行为的封装，而行为是由方法实现的
     * Android中：AbListView和ListAdapter
     */
    public static void main(String[] args) {
        AirplaneMaker airplaneMaker=new Airbus();
        Airplane airplane=new PassengerPlane(airplaneMaker);
        airplane.fly();
    }
}
