package adapter;

/**
 * Created by Sunmeng on 2017/9/19.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class AdapterModel {

    /**
     * 适配器模式 (对象适配器和类适配器)
     * 将一个类的接口变成客户端所期待的另一中接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作
     * 目标(Target) 提供给客户端的接口。由于"源"中的接口不能满足需求，因此就扩展出来了目标，
     * 它包括了客户所需的接口。在适配器模式中，目标角色对应的类一般是抽象类或接口，而不是实例类
     * 源(Adaptee) 现有的接口
     * 适配器(Adapter) 把源接口转换成目标接口
     */
    public static void main(String[] args) {
        Target target = new Adapter();
        target.getPower220V();
    }

}

interface Target {
    void getPower110V();

    void getPower220V();
}

class Adaptee {
    public void getPower110V() {
        System.out.println("get power: 110V");
    }
}

class Adapter extends Adaptee implements Target {
    public void getPower220V() {
        System.out.println("get power: 220V");
    }
}


