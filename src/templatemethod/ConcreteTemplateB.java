package templatemethod;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * 可选择实现的逻辑
 */
public class ConcreteTemplateB extends AbstractTemplate {
    @Override
    protected void abstractMethod() {
        System.out.print("ConcreteTemplateB abstractMethod\n");
    }

    @Override
    protected void hookMethod() {
        System.out.print("ConcreteTemplateB hookMethod\n");
    }
}
