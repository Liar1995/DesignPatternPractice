package facade;

/**
 * Created by Sunmeng on 2017/9/25.
 * E-Mail:Sunmeng1995@outlook.com
 * 门面模式
 */
public class FacadeModel {

    /**
     * 门面模式 就是将一些复杂的小系统整合起来，为用户的使用提供一个简单的接口，统一一个高层接口给用户使用
     * 门面(Facade)：客户端可以调用这个角色的方法。此角色知晓相关的（一个或者多个）子系统的功能和责任
     * 子系统(SubSystem)：可以同时有一个或者多个子系统。每个子系统都不是一个单独的类，而是一个类的集合。
     * 每个子系统都可以被客户端直接调用，或者被门面角色调用。子系统并不知道门面的存在，对于子系统而言，门面仅仅是另外一个客户端而已。
     * Android中：Context是最重要的一个类型。它封装了很多重要的操作，比如startActivity()、sendBroadcast()等，几乎是开发者对应用操作的统一入口。
     * Context是一个抽象类，它只是定义了抽象接口，真正的实现在ContextImpl类中。它就类似于门面类。
     */
    public static void main(String[] args) {
        SecurityFacade security = new SecurityFacade();
        security.activate();
    }

}
