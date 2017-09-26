package state;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class OffState implements TvState {
    @Override
    public void tvOn(Controller controller) {
        System.out.println("开机");
        controller.setState(new OnState());
    }

    @Override
    public void tvOff(Controller controller) {

    }

    @Override
    public void nextChinal(Controller controller) {

    }

    @Override
    public void lastChinal(Controller controller) {

    }
}
