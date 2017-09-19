package command;

/**
 * Created by Sunmeng on 2017/9/18.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class CommandModel {

    /**
     * 命令模式 请求调用者和请求接收者解耦，使得调用者和接收者不直接交互
     * Command（命令）：声明了一个给所有具体命令类的抽象接口。
     * ConcreteCommand（具体命令，Command的实现，会持有Receicer的实例，并调用接收者相关的命令）
     * Invoker（请求者）带参（Command）构造，执行请求者的命令，可以在Invoker内统一控制所有的命令（撤销(Undo)操作和恢复(Redo)操作）
     * Receicer（接收者）执行命令后做的实际事
     * Android源码中 new Thread(() -> {}).start(); 就是命令模式
     */
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command=new TencentCommand(receiver);
        Invoker invoker=new Invoker(command);
        invoker.action();
    }

}
