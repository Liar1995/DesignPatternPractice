package composite;

/**
 * Created by Sunmeng on 2017/9/25.
 * E-Mail:Sunmeng1995@outlook.com
 * 透明组合模式
 */
public abstract class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void add(Company company);

    protected abstract void romove(Company company);

    protected abstract void display(int depth);
}
