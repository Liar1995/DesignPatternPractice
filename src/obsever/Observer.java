package obsever;

import obsever.ObservableModel;

/**
 * Created by Sunmeng on 2017/9/8.
 * E-Mail:Sunmeng1995@outlook.com
 * Description:
 */


public interface Observer <T>{
    void onUpdate(ObservableModel<T> observable, T data);
}
