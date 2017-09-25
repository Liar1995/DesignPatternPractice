package composite;

/**
 * Created by Sunmeng on 2017/9/22.
 * E-Mail:Sunmeng1995@outlook.com
 * 合成(Composite)模式(结构模式)
 */
public class CompositeModel {

    /**
     * 组合模式 用来描述整体与部分的关系
     * 抽象构件(Component) 这是一个抽象角色，它给参加组合的对象规定一个接口。这个角色给出共有的接口及其默认行为
     * 树叶构件(Leaf) 代表参加组合的树叶对象。树叶对象没有下级子对象，它定义出参加组合的原始对象的行为
     * 树枝构件(Composite) 代表参加组合的有下级子对象的对象，并给出树枝构件对象的行为
     * 安全合成模式：此方式只允许"树枝构件"有对象的管理方法
     * 透明合成模式：此方式允许"树枝构件'和"树叶构件"都有对象的管理方法，但"树叶构件"中的管理方法无实际意义
     * Android中：View和ViewGroup就是一种很标准的组合模式
     */
    public static void main(String[] args) {
        Company root = new ConcreteCompany();
        root.setName("北京总公司");
        root.add(new FinanceDepartment("总公司财务部"));

        Company shandongCom = new ConcreteCompany("山东分公司");
        shandongCom.add(new FinanceDepartment("山东分公司账务部"));

        Company zaozhuangCom = new ConcreteCompany("枣庄办事处");
        zaozhuangCom.add(new FinanceDepartment("枣庄办事处财务部"));

        Company jinanCom = new ConcreteCompany("济南办事处");
        jinanCom.add(new FinanceDepartment("济南办事处财务部"));

        shandongCom.add(jinanCom);
        shandongCom.add(zaozhuangCom);

        Company huadongCom = new ConcreteCompany("上海华东分公司");
        huadongCom.add(new FinanceDepartment("上海华东分公司账务部"));

        Company hangzhouCom = new ConcreteCompany("杭州办事处");
        hangzhouCom.add(new FinanceDepartment("杭州办事处财务部"));

        Company nanjingCom = new ConcreteCompany("南京办事处");
        nanjingCom.add(new FinanceDepartment("南京办事处财务部"));

        huadongCom.add(hangzhouCom);
        huadongCom.add(nanjingCom);
        root.add(shandongCom);
        root.add(huadongCom);
        root.display(0);
    }

}
