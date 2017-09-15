package factory.abstractfactory;

import factory.bean.Computer;
import factory.bean.Phone;
import factory.bean.SumComputer;
import factory.bean.SumPhone;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class SumFactory implements Factory {

    @Override
    public Phone createPhone() {
        return new SumPhone();
    }

    @Override
    public Computer createCompiler() {
        return new SumComputer();
    }

}
