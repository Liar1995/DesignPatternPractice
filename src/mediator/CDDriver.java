package mediator;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * 同事类——光驱
 */
public class CDDriver extends Colleague {

    //光驱读取出来的数据
    private String data = "";

    /**
     * 构造函数
     *
     * @param mediator
     */
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    /**
     * 获取光盘读取出来的数据
     */
    public String getData() {
        return data;
    }

    /**
     * 读取光盘
     */
    public void readCD(){
        //逗号前是视频显示的数据，逗号后是声音
        this.data = "One Piece,海贼王我当定了";
        //通知主板，自己的状态发生了改变
        getMediator().changed(this);
    }

}
