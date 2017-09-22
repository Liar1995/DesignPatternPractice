package prototype;

/**
 * Created by Sunmeng on 2017/9/22.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class Square extends Shape {
    public Square() {
        type="Square";
    }

    @Override
    void draw() {
        System.out.println("Square");
    }
}
