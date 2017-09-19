package decorator;

/**
 * Created by Sunmeng on 2017/9/19.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class IPhoneChange extends MobilePhone {

    private MobilePhone mobilePhone;

    public IPhoneChange(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public void call() {
        mobilePhone.call();
    }

}
