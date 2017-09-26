package visitor;

import java.util.Random;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * Element：定义了一个接待访问者的方法，让每个元素都可以被访问者访问
 */
public abstract class Staff {

    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    //定义一个抽象的受访问方法
    public abstract void accept(Visitor visitor);

}
