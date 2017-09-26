package visitor;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * ConcreteVisitor：具体的访问者，定义具体的对每一个元素的具体访问行为
 */
public class CEO implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("我CEO考察工程师"+engineer.name+"的KPI是"+engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("我CEO考察经理"+manager.name+"的KPI是"+manager.kpi);
    }
}
