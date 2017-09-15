package factory.abstractfactory;

import factory.bean.Computer;
import factory.bean.Phone;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 */
public interface Factory {
    Phone createPhone();

    Computer createCompiler();
}
