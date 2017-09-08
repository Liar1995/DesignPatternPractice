package dp;

/**
 * Created by Sunmeng on 2017/9/8.
 * E-Mail:Sunmeng1995@outlook.com
 * Description:
 */


public class SingletonModel {

    /**
     * 单例模式
     * 1，私有构造
     * 2，私有本类实例
     * 3，公共静态方法获取实例
     * 4，懒汉式：其特点是应用中尚未需要用到此单一实例的时候即先实例化（不推荐使用，在线程安全问题上和性能上都没有优势）
     * 5，饿汉式：其特点是延迟加载，即当需要用到此单一实例的时候，才去初始化此单一实例
     * 6，Android中常见的单例模式使用：Image-Loader，EventBus，InputMethodManager,AccessibilityManager
     * 7，优点：对于那些比较耗内存的类，只实例化一次可以大大提高性能，尤其是在移动开发中，还有就是保持程序运行的时候该中始终只有一个实例存在内存中
     */
    private SingletonModel() {
    }

    private static volatile SingletonModel singletonModel = null;

    public static SingletonModel getSingletonModel() {
        if (singletonModel == null) {
            synchronized (SingletonModel.class) {
                //synchronized (Singleton.class)里面又进行了是否为null的判断 是因为一个线程进入了该代码，
                // 如果另一个线程在等待，这时候前一个线程创建了一个实例出来完毕后，另一个线程获得锁进入该同步代码，
                // 实例已经存在，没必要再次创建，因此这个判断是否是null还是必须的
                if (singletonModel == null) {
                    singletonModel = new SingletonModel();
                }
            }
        }
        return singletonModel;
    }

}
