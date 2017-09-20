package chain;

/**
 * Created by Sunmeng on 2017/9/20.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class ChainModel {

    /**
     * 责任链模式 有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定
     * 将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
     * 抽象处理者(Handler) 定义处理请求的接口
     * 具体处理者(ConcreteHandler) 具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家
     * 一条责任链,事件分发,谁消费请求,就停止请求,应用于一个请求,多个接受者的情况
     * Android 事件分发机制,是责任链的一种变型
     */
    public static void main(String[] args) {
        Handler concreteHandler1 = new ConcreteHandler("Handler 1");
        Handler concreteHandler2 = new ConcreteHandler("Handler 2");
        Handler concreteHandler3 = new ConcreteHandler("Handler 3");
        concreteHandler1.setSuccessor(concreteHandler2);
        concreteHandler2.setSuccessor(concreteHandler3);
        concreteHandler1.handleFeeRequest();
    }

}
