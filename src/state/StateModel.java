package state;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * 状态模式 行为模式
 */
public class StateModel {

    /**
     * 状态模式 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类
     * 使用场景：一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为
     * Context：环境类，定义客户感兴趣的接口，维护一个 State 子类，这个实例定义了对象的当前状态
     * State：抽象状态类或者状态接口，定义一个或者一组接口，表示该状态下的行为
     * ConcreteStateA、ConcreteStateB：具体状态类，每一个具体的状态类实现抽象的 State 中定义的接口，从而达到不同状态下的不同行为
     * 策略模式的行为是彼此独立的，可相互替换的，但是状态模式的行为却是平行的，不可替换的
     * Android中，MediaPlayer 的各个状态（有限状态机）
     */
    public static void main(String[] args) {
        Controller controller = new Controller(new OffState());
        System.out.println(1 + "点击上一个频道");
        controller.lastChinal();
        System.out.println(2 + "点击关机");
        controller.turnOff();
        System.out.println(3 + "点击开机");
        controller.turnOn();
        System.out.println(4 + "点击下一个频道");
        controller.nextChinal();
        System.out.println(5 + "点击开机");
        controller.turnOn();
        System.out.println(6 + "点击关机");
        controller.turnOff();
        System.out.println(7 + "点击下一个频道");
        controller.nextChinal();
    }

}
