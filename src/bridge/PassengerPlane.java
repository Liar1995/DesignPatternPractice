package bridge;

/**
 * Created by Sunmeng on 2017/9/22.
 * E-Mail:Sunmeng1995@outlook.com
 * 修正抽象化
 */
public class PassengerPlane extends Airplane {

    public PassengerPlane(AirplaneMaker maker) {
        super(maker);
    }

    public void fly() {
        super.fly();
        System.out.println("PassengerPlane fly.");
    }
}
