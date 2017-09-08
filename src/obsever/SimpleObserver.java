package obsever;

/**
 * Created by Sunmeng on 2017/9/8.
 * E-Mail:Sunmeng1995@outlook.com
 */

import java.util.Observable;
import java.util.Observer;

public class SimpleObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Data has changed to - " + ((SimpleObservable) o).getData());
    }
}
