package state;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class OnState implements TvState {
    @Override
    public void tvOn(Controller controller) {

    }

    @Override
    public void tvOff(Controller controller) {
        System.out.println("关机");
        controller.setState(new OffState());
    }

    @Override
    public void nextChinal(Controller controller) {
        System.out.println("下个频道");
    }

    @Override
    public void lastChinal(Controller controller) {
        System.out.println("上个频道");
    }
}
