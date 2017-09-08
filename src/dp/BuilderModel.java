package dp;


import empty.Person;

/**
 * Created by Sunmeng on 2017/9/8.
 * E-Mail:Sunmeng1995@outlook.com
 * Description:
 */


public class BuilderModel {

    /**
     * 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
     * 1，普通的POJO，带有Builder的构造函数
     * 2，静态内部类Builder类 负责构建 内部的成员变量和外部类一样
     * 3，静态内部类Builder类的最终build方法，通过POJO的带有Builder的构造函数，构建对象
     * 4，优点：链式调用，使代码可读性增强
     * 5，Android常见使用：AlertDialog，OkHttp，
     */

    public void test() {
        Person.Builder builder = new Person.Builder();
        Person person = builder.setName("a").setAge(1).setWeight(1).setHeight(1).build();
    }
}
