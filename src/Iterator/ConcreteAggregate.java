package Iterator;

/**
 * Created by Sunmeng on 2017/9/20.
 * E-Mail:Sunmeng1995@outlook.com
 * 具体聚集类
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] objs = {"Monk Tang",
            "Monkey", "Pigsy",
            "Sandy", "Horse"};

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    // 取值方法：向外界提供聚集元素
    Object getElement(int index){
        if(index < objs.length){
            return objs[index];
        }else{
            return null;
        }
    }

    // 取值方法：向外界提供聚集的大小
    int size(){
        return objs.length;
    }

    /**
     * 将"外禀迭代器"中的"具体迭代器"改写成"具体聚集类"的一个私有类，即迭代器是在聚集结构之内实现
     * 这样的迭代器，就被称为内禀迭代器
     * */
    class ConcreteIterator implements Iterator {

        // 索引位置
        private int index = 0;

        @Override
        public void first() {
            index=0;
        }

        @Override
        public void next() {
            if(index < objs.length) {
                index ++;
            }
        }

        @Override
        public boolean isDone() {
            return (index == objs.length);
        }

        @Override
        public Object currentItem() {
            return objs[index];
        }
    }

}
