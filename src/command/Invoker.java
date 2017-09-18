package command;

/**
 * Created by Sunmeng on 2017/9/18.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
