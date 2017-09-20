package Iterator;

/**
 * Created by Sunmeng on 2017/9/20.
 * E-Mail:Sunmeng1995@outlook.com
 * 具体迭代
 */
public class ConcreteIterator implements Iterator {

    private ConcreteAggregate agg;

    // 索引位置
    private int index = 0;
    // 集合大小
    private int size = 0;

    ConcreteIterator(ConcreteAggregate agg) {
        this.agg = agg;
        this.size = agg.size();
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < size) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        return (index >= size);
    }

    @Override
    public Object currentItem() {
        return agg.getElement(index);
    }
}
