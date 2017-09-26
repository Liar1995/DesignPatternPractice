package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * ObjectStructure 定义对象结构，里面维护了一个元素的集合，并且迭代这些元素供访问者访问
 */
public class Report {
    List<Staff> list = new ArrayList<>();

    public Report() {
        list.add(new Engineer("小王"));
        list.add(new Engineer("大王"));
        list.add(new Engineer("老王"));
        list.add(new Manager("小张"));
        list.add(new Manager("大张"));
        list.add(new Manager("老张"));
    }

    public void showReport(Visitor visitor){
        for (Staff staff:list) {
            staff.accept(visitor);
        }
    }
}
