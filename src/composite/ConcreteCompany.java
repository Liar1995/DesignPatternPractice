package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sunmeng on 2017/9/25.
 * E-Mail:Sunmeng1995@outlook.com
 * 树枝
 */
public class ConcreteCompany extends Company {

    private List<Company> cList;

    public ConcreteCompany(String name) {
        super(name);
        cList=new ArrayList<>();
    }

    public ConcreteCompany() {
        cList=new ArrayList<>();
    }

    @Override
    protected void add(Company company) {
        cList.add(company);
    }

    @Override
    protected void romove(Company company) {
        cList.remove(company);
    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName());
        for (Company c : cList) {
            c.display(depth + 2);
        }
    }

}
