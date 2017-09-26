package visitor;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * Visitor 定义了对每一个元素的访问行为,参数就是可访问的元素对象
 */
public interface Visitor {
    void visit(Engineer engineer);

    void visit(Manager manager);
}
