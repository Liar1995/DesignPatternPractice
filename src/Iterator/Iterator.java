package Iterator;

/**
 * Created by Sunmeng on 2017/9/20.
 * E-Mail:Sunmeng1995@outlook.com
 * 抽象迭代
 */
public interface Iterator {
    // 迭代方法：移动到第一个元素
    void first();

    // 迭代方法：移动到下一个元素
    void next();

    // 迭代方法：是否为最后一个元素
    boolean isDone();

    // 迭代方法：返还当前元素
    Object currentItem();
}
