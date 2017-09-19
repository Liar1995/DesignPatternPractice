package decorator;

/**
 * Created by Sunmeng on 2017/9/19.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class RedIPhone extends IPhoneChange {

    public RedIPhone(MobilePhone mobilePhone) {
        super(mobilePhone);
    }

    @Override
    public void call() {
        System.out.print("red phone call");
    }
}
