package state;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * State
 */
public interface TvState {
    void tvOn(Controller controller);
    void tvOff(Controller controller);
    void nextChinal(Controller controller);
    void lastChinal(Controller controller);
}
