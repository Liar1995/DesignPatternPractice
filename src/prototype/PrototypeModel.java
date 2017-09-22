package prototype;

/**
 * Created by Sunmeng on 2017/9/22.
 * E-Mail:Sunmeng1995@outlook.com
 * 原型模式（创建模式）
 */
public class PrototypeModel {

    /**
     * 原型模式 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象
     * 通过实现Cloneable接口。原型模式有两种表现形式
     * 简单形式：创建的原型对象数目少而且比较固定
     * 登记形式：创建的原型对象数目不确定
     * ****************************简单形式****************************
     * 抽象原型(Prototype)：抽象原型给出所有的具体原型所需要实现的函数接口
     * 具体原型(ConcretePrototype)：被复制的对象，实现了Prototype中的函数接口
     * ****************************登记形式****************************
     * 抽象原型(Prototype),具体原型(ConcretePrototype)
     * PrototypeManager(原型管理器):创建具体原型类的对象，并记录每一个被创建的对象
     * 登记形式主要体现在PrototypeManager中，在创建原始对象的时候，标记并存储（MAP）
     * 在使用原型模式创建的时候，从PrototypeManager获取对应的原型创建copy
     * Android中：Bundle，Intent，OkHttpClient
     */
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}