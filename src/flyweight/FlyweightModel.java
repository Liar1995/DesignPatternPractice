package flyweight;

/**
 * Created by Sunmeng on 2017/9/25.
 * E-Mail:Sunmeng1995@outlook.com
 * 享元模式
 */
public class FlyweightModel {

    /**
     * 享元模式 主要用于减少创建对象的数量，以减少内存占用和提高性能
     * 抽象享元(Flyweight)：该角色是所有的具体享元类的超类，它给出了具体享元类需要实现的公共接口
     * 具体享元(ConcreteFlyweight)：实现抽象享元角色所规定出的接口
     * 享元工厂(FlyweightFactory)：负责创建和管理享元角色，必须保证享元对象可以被系统适当地共享。
     * 当一个客户端对象调用一个享元对象的时候，享元工厂角色会检查系统中是否已经有一个符合要求的享元对象。
     * 如果已经有了，享元工厂角色就应当提供这个已有的享元对象；如果系统中没有一个适当的享元对象的话，享元工厂角色就应当创建一个合适的享元对象
     * 内蕴状态：内蕴状态是存储在享元对象内部，不会随环境改变而有所不同的，可以共享
     * 外蕴状态：会随环境改变而改变，不可以共享的状态
     * 单纯享元模式：所有的享元对象都是可以共享的，客户端不能直接将具体享元类实例化，而必须通过调用工厂对象的factory()来获取享元对象
     * 复合享元模式（享元对象使用符合模式）：复合享元是由"单纯享元"对象通过复合而成,提供了add()这样的聚集管理方法
     * Android中：Java中的String对象+常量池(constant pool)
     */
    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();
        //单纯
//        Flyweight fly = factory.factory(new Character('a'));
//        fly.operation("First Call");
//        fly = factory.factory(new Character('b'));
//        fly.operation("Second Call");
//        fly = factory.factory(new Character('a'));
//        fly.operation("Third Call");

        //复合
        String str = "abcda";
        Flyweight com1 = factory.factory(str);
        Flyweight com2 = factory.factory(str);
        com1.operation("Composite Call");
        com2.operation("Composite Call");
        System.out.println("com1==com2:" + (com1 == com2));

        Character c = '1';
        Flyweight pure1 = factory.factory(c);
        Flyweight pure2 = factory.factory(c);
        pure1.operation("pure Call");
        pure2.operation("pure Call");
        System.out.println("pure1==pure2:" + (pure1 == pure2));

    }

}
