package command;

/**
 * Created by Sunmeng on 2017/9/18.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class TencentCommand implements Command {

    Receiver receiver;

    public TencentCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.tencentLogin();
    }

}
