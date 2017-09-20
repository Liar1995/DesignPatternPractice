package chain;

/**
 * Created by Sunmeng on 2017/9/20.
 * E-Mail:Sunmeng1995@outlook.com
 */
public abstract class Handler {

    protected Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleFeeRequest();

}
