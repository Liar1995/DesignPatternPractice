package factory.abstractfactory;

import factory.bean.AppleComputer;
import factory.bean.ApplePhone;
import factory.bean.Computer;
import factory.bean.Phone;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class AppleFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Computer createCompiler() {
        return new AppleComputer();
    }
}
