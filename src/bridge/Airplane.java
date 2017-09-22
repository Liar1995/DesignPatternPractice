package bridge;

/**
 * Created by Sunmeng on 2017/9/22.
 * E-Mail:Sunmeng1995@outlook.com
 * 抽象化类
 */
public abstract class Airplane {

    protected AirplaneMaker maker;

    public Airplane(AirplaneMaker maker) {
        this.maker = maker;
    }

    public void fly() {
        // 调用AirplaneMaker的produce()方法
        maker.produce();
    }
}
