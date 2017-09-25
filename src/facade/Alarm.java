package facade;

/**
 * Created by Sunmeng on 2017/9/25.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class Alarm {
    // 启动警报器
    public void activate() {
        System.out.println("Activating on the alarm.");
    }
    // 关闭警报器
    public void deactivate() {
        System.out.println("Deactivating the alarm.");
    }
    // 拉响警报器
    public void ring() {
        System.out.println("Ringing the alarm");
    }
    // 停掉警报器
    public void stopRing() {
        System.out.println("Stop the alarm");
    }
}

class Sensor {
    // 启动感应器
    public void activate() {
        System.out.println("Activating on the sensor.");
    }
    // 关闭感应器
    public void deactivate() {
        System.out.println("Deactivating the sensor.");
    }
    // 触发感应器
    public void trigger() {
        System.out.println("The sensor has been triggered.");
    }
}

class Light {
    // 打开灯
    public void turnOn() {
        System.out.println("Turning on the light.");
    }
    // 关闭灯
    public void turnOff() {
        System.out.println("Turning off the light.");
    }
    // 换灯泡
    public void changeBulb() {
        System.out.println("Cotating the light-bulb.");
    }
}

class Camera {
    // 打开录像机
    public void turnOn() {
        System.out.println("Turning on the camera.");
    }
    // 关闭录像机
    public void turnOff() {
        System.out.println("Turning off the camera.");
    }
    // 转动录像机
    public void rotate(int degrees) {
        System.out.println("Rotating the camera by "+degrees+" degrees.");
    }
}