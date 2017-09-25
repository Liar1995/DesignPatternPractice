package flyweight;

/**
 * Created by Sunmeng on 2017/9/25.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class ConcreteFlyweight extends Flyweight {

    private Character intrinsicState = null;

    public ConcreteFlyweight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {
        System.out.println("\tIntrisic State="
                + intrinsicState
                + ", Extriinsic State=" + state);
    }

}
