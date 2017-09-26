package templatemethod;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * 强制子类实现的剩余逻辑
 */
public class ConcreteTemplateA extends AbstractTemplate{
    @Override
    protected void abstractMethod() {
        System.out.print("ConcreteTemplateA abstractMethod\n");
    }
}
