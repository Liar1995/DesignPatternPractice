package templatemethod;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 */
public abstract class AbstractTemplate {
    /**
     * 模板方法
     */
    public void templateMethod(){
        //调用基本方法
        abstractMethod();
        hookMethod();
        concreteMethod();
    }
    /**
     * 基本方法的声明（由子类实现）
     */
    protected abstract void abstractMethod();
    /**
     * 基本方法(空方法)
     */
    protected void hookMethod(){
        System.out.print("AbstractTemplate hookMethod\n");
    }
    /**
     * 基本方法（已经实现）
     */
    private final void concreteMethod(){
        System.out.print("AbstractTemplate concreteMethod\n");
    }

}
