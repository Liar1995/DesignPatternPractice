package reflection;

/**
 * Created by Sunmeng on 2017/9/8.
 * E-Mail:Sunmeng1995@outlook.com
 * 反射
 */
public class ReflectionTest {

    /**
     * Java反射：根据“类的部分已经的信息”来还原“类的全部的信息”
     * 1，反射的主要过程：1，根据“类名”来获取对应类的Class对象，2，通过Class对象的函数接口，来读取“类的构造函数，成员变量”等信息。
     * 2,获取class对象的方式：
     * 方法1：Class.forName("类名字符串") （注意：类名字符串必须是全称，包名+类名）
     * 方法2：类名.class
     * 方法3：实例对象.getClass()
     * 方法4："类名字符串".getClass()
     * 3，Class类的API结构：构造函数，成员方法，成员变量，类的其它信息(如注解、包名、类名、继承关系等等)
     */

    public void reflection() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1，根据“类名”来获取对应类的Class对象
        Class<?> cls = Class.forName("empty.Person");
        //2，通过Class获取对象
        Object obj = cls.newInstance();//这样访问必要要有无参构造
        System.out.println("cls="+obj);
    }

}
