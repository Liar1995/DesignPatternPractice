package proxy;

import proxy.dynamic.ChatSubjectInterface;
import proxy.dynamic.DynamicQQShortcutkey;
import proxy.dynamic.DynamicTencentQQ;
import proxy.statics.ChatSubject;
import proxy.statics.TencentQQ;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 * 动态代理
 */
public class DynamicProxyModel {

    /**
     * DynamicProxyModel
     * 动态代理类只能代理接口（不支持抽象类），代理类都需要实现InvocationHandler类，实现invoke方法。
     * invoke方法就是调用被代理接口的所有方法时需要调用的，返回的值是被代理接口的一个实现类
     * 被代理者和代理者的实现的功能是一样的，所以抽象出一个接口(动态代理只支持接口)
     * 被代理者不会直接干活，需要代理者去干活，所以代理者持有被代理者的引用对象，去执行函数。
     * 动态代理是一种AOP思想的实现
     */
    public static void main(String[] args) {
        ChatSubjectInterface chatSubjectInterface = (ChatSubjectInterface) new DynamicQQShortcutkey().newProxyInstance(new DynamicTencentQQ());
        chatSubjectInterface.chat();
    }

}
