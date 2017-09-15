package proxy;

import proxy.statics.ChatSubject;
import proxy.statics.QQShortcutkey;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 * 静态代理模式
 */
public class StaticProxyModel {

    /**
     * StaticProxyModel
     * 包含了三个角色: 抽象主体(Subject)，代理主题(ProxySubject)，真实主题(RealSubject)
     * ProxySubject和RealSubject都共同实现了Subject，ProxySubject其实起到了请求传递的作用，
     * 最后还是使用真实的RealSubject实例去调用的方法
     */
    public static void main(String[] args) {
        ChatSubject chatSubject = new QQShortcutkey();
        chatSubject.chat();
    }

}
