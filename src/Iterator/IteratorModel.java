package Iterator;

/**
 * Created by Sunmeng on 2017/9/20.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class IteratorModel {

    /**
     * 迭代器模式 可以顺序地访问一个聚集中的元素而不必暴露聚集的内部表象，在Java的集合(Collection)框架广泛使用
     * 抽象迭代器(Iterator)，具体迭代器(ConcreteIterator)，聚集(Aggregate)，具体聚集(ConcreteAggregate)，客户端(Client)
     * */
    public static void main(String[] args) {
        IteratorModel client = new IteratorModel();
        client.operation();
    }

    private Iterator it;
    private Aggregate agg = new ConcreteAggregate();
    private void operation() {
        it = agg.createIterator();
        while(!it.isDone()) {
            System.out.println(it.currentItem());
            it.next();
        }
    }

}
