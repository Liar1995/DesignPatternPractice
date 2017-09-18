package command;

/**
 * Created by Sunmeng on 2017/9/18.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class WeChatCommand implements Command {

    Receiver receiver;

    public WeChatCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.weChatLogin();
    }

}
