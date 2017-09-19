package decorator;

/**
 * Created by Sunmeng on 2017/9/19.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class DecoratorModel {

    /**
     * 装饰模式 动态地给一个对象添加一些额外的职责(能力)
     * 抽象构件(Component)，具体构件(ConcreteComponent) ，装饰(Decorator) 和 具体装饰(ConcreteDecorator)
     * 抽象构件(Component) 给出一个抽象接口，以规范准备接收附加责任的对象
     * 具体构件(ConcreteComponent) 定义一个将要接收附加责任的类
     * 装饰(Decorator) 持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口
     * 具体装饰(ConcreteDecorator) 负责给构件对象“贴上”附加的责任
     * Android 源码中
     * Context相当于抽象构件(Component)，ContextImpl相当于具体构件(ConcreteComponent)
     * ContextWrapper相当于装饰(Decorator)，Activity/Service/Application都是具体装饰(ConcreteDecorator)
     * */
    public static void main(String[] args) {
        MobilePhone mobilePhone=new IPhone();
        mobilePhone.call();
        MobilePhone redPhone=new RedIPhone(mobilePhone);
        redPhone.call();
    }

}