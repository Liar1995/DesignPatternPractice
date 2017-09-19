package decorator;

/**
 * Created by Sunmeng on 2017/9/19.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class YellowIPhone extends IPhoneChange {

    public YellowIPhone(MobilePhone mobilePhone) {
        super(mobilePhone);
    }

    @Override
    public void call() {
        System.out.print("yellow phone call");
    }
}
