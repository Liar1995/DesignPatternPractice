package state;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * Context
 */
public class Controller {
    private TvState state;

    public Controller(TvState state) {
        this.state = state;
    }

    public void setState(TvState state){
        this.state=state;
    }

    public void turnOn(){
        state.tvOn(this);
    }
    public void turnOff(){
        state.tvOff(this);
    }
    public void nextChinal(){
        state.nextChinal(this);
    }
    public void lastChinal(){
        state.lastChinal(this);
    }
}
