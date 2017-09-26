package mediator;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * 调停者模式/中介者模式/传递器模式
 */
public class MediatorModel {

    /**
     * 调停者模式/中介者模式/传递器模式
     * 中介者模式包装了一系列对象相互作用的方式，使得这些对象不必相互明显作用，从而使耦合松散，而且可以独立地改变它们之间的交互
     * 使用场景：当对象之间的交互操作很多且每个对象的行为操作都依赖彼此时，为防止在修改一个对象的行为时，同时涉及修改很多其他对象的行为，可采用中介者模式，来解决紧耦合的问题
     * Mediator：抽象中介者角色，定义了同事对象到中介者对象的接口，抽象类/接口
     * ConcreteMediator：具体中介者角色，继承或者实现了抽象中介者，实现了父类定义的方法，它从具体的同事对象接受消息，向具体同事对象发出命令
     * Colleague：抽象同事类角色，定义了同事对象的接口，它只知道中介者而不知道其他的同事对象；
     * ConcreteColleague：具体同事类角色，继承抽象同事类，每个具体同事类都知道本身在小范围内的行为，而不知道它在大范围内的目的。
     * Android中：Binder中Binder Driver连接了Binder client ， Binder server 和 ServiceManager
     */
    public static void main(String[] args) {
        //创建调停者——主板
        MainBoard mediator = new MainBoard();
        //创建同事类
        CDDriver cd = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideoCard vc = new VideoCard(mediator);
        SoundCard sc = new SoundCard(mediator);
        //让调停者知道所有同事
        mediator.setCdDriver(cd);
        mediator.setCpu(cpu);
        mediator.setVideoCard(vc);
        mediator.setSoundCard(sc);
        //开始看电影，把光盘放入光驱，光驱开始读盘
        cd.readCD();
    }

}
