package bridge;


import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Sunmeng on 2017/9/22.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class CargoPlane extends Airplane {

    public CargoPlane(AirplaneMaker maker) {
        super(maker);
    }

    public void fly() {
        super.fly();
        System.out.println("CargoPlane fly.");
    }
}
