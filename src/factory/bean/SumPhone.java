package factory.bean;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class SumPhone extends Phone {
    @Override
    public void activate() {
        System.out.print("create sumphone");
    }
}
