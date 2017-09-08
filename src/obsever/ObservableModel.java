package obsever;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sunmeng on 2017/9/8.
 * E-Mail:Sunmeng1995@outlook.com
 * Description:
 */


public class ObservableModel<T> {

    /**
     * 观察者模式：定义对象间的一种一对多的依赖关系，当一个对象的状态发送改变时，所有依赖于它的对象都能得到通知并被自动更新
     * 观察者：Observer，有时候我们也称它为订阅者，即Subscriber
     * 被观察者：Observable，即可以被观察的东西，有时候还会称之为主题，即Subject
     * 1，三要素 注册，取消注册，发送事件
     * 2，实现方式：自定义，java中提供的Observable类和Observer接口
     * 3，优点：解耦，表示层和数据逻辑层的分离，可读性加强
     * 4，Android常见使用：setOnClickListener（一对一关系），addOnScrollListener（以add方式添加的），Broadcast，EventBus，RxJava
     * 5，使用系统提供的Observable类和Observer接口，需要注意setChanged()方法，标识数据已经改变，否则notifyObservers无效
     */

    private List<Observer<T>> mObservers = new ArrayList<>();//用来存放Observer

    public void register(Observer<T> observerModel) {
        if (observerModel == null) throw new NullPointerException("Observer is null");
        synchronized (this) {
            if (!mObservers.contains(observerModel)) mObservers.add(observerModel);
        }
    }

    public void unRegister(Observer<T> observerModel) {
        mObservers.remove(observerModel);
    }

    public void notifyObservers(T data) {
        for (Observer<T> observerModel : mObservers)
            observerModel.onUpdate(this, data);
    }

}
