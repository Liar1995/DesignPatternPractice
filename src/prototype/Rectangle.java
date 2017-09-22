package prototype;

/**
 * Created by Sunmeng on 2017/9/22.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle");
    }

}
