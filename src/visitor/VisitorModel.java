package visitor;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * 访问者模式 行为模式
 */
public class VisitorModel {

    /**
     * 访问者模式（行为模式）将数据操作与数据结构分离的设计模式
     * 使用场景：对象结构比较稳定，但经常需要在此对象结构上定义新的操作，通过定义一个外在的Visitor来访问ObjectStructor对象结构中的Element
     * 这样可以变化访问者来访问对象结构中的元素，但又不会影响元素内部结构
     * Visitor：接口或者抽象类，它定义了对每一个元素（Element）访问的行为，它的参数就是可以访问的元素，
     * 它的方法个数理论上来讲与元素个数是一样的，因此访问者模式要求元素的类族要稳定，如果经常添加、移除元素类，
     * 必然会导致频繁地修改 Visitor 接口，如果出现这种情况，则说明不适合使用访问者模式；
     * ConcreteVisitor：具体的访问者，定义具体的对每一个元素的具体访问行为
     * Element：接口或者抽象类，它定义了一个接受访问者（accept）的方法，其意义是指每一个元素都要可以被访问者访问
     * ElementA，ElementB：具体的元素类，它提供接受访问方法的具体实现，而这个具体的实现，通常情况下是使用访问者提供的访问该元素类的方法
     * ObjectStructure：定义当中所提到的对象结构，对象结构是一个抽象表述，它内部管理了元素集合，并且可以迭代这些元素供访问者访问
     * 分派的概念：变量被声明时的类型叫做变量的静态类型(Static Type)，有些人又把静态类型叫做明显类型(Apparent Type)
     * 而变量所引用的对象的真实类型又叫做变量的实际类型(Actual Type)，根据对象的类型而对方法进行的选择，就是分派(Dispatch)，
     * 分派(Dispatch)又分为两种，即静态分派和动态分派。静态分派(Static Dispatch)发生在编译时期，分派根据静态类型信息发生。
     * 静态分派对于我们来说并不陌生，方法重载就是静态分派；动态分派(Dynamic Dispatch)发生在运行时期，动态分派动态地置换掉某个方法
     * 静态分派：Java中，所有以静态类型来定位方法执行版本的分派动作，都称为静态分派。
     * 动态分派：重写方法的调用是根据实际类型来调用的，而不是根据静态类型，运行期根据实际类型来确定方法执行版本的分派动作，称为动态分派
     * Android中运用访问者模式，其实主要是在编译期注解中，编译期注解核心原理依赖APT(Annotation Processing Tools)
     * 著名的开源库比如ButterKnife、Dagger、Retrofit都是基于APT
     */
    public static void main(String[] args) {
        Report report = new Report();
        report.showReport(new CTO());
        System.out.println("---------");
        report.showReport(new CEO());
    }

}
