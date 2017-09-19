package decorator;

/**
 * Created by Sunmeng on 2017/9/19.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class IPhone extends MobilePhone {
    @Override
    public void call() {
        System.out.print("IPhone call");
    }
}
