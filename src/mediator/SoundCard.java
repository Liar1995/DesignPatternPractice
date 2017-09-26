package mediator;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * 同事类——声卡
 */
public class SoundCard extends Colleague {

    /**
     * 构造函数
     *
     * @param mediator
     */
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 按照声频数据发出声音
     */
    public void soundData(String data){
        System.out.println("画外音：" + data);
    }

}
