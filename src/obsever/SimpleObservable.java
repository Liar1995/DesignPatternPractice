package obsever;

import java.util.Observable;

/**
 * Created by Sunmeng on 2017/9/8.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class SimpleObservable extends Observable {

    private int data = 0;

    public void setData(int i) {
        if (data != i) {
            data = i;
            setChanged();//标识数据已经改变
            notifyObservers(); //只有在setChange()被调用后，notifyObservers()才会去调用update()
        }
    }

    int getData() {
        return data;
    }
}
