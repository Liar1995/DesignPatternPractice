package memento;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * Originator
 */
public class Player {

    private int lv = 1;
    private int hp = 100;
    private int mp = 50;

    public void play() {
        lv++;
        hp += 100;
        mp += 50;
        System.out.println("升级了，当前级别" + lv + " hp:" + hp + " mp:" + mp);
    }

    public void attackBoss() {
        hp -= 80;
        mp -= 40;
        System.out.println("打boss之后，当前级别" + lv + " hp:" + hp + " mp:" + mp);
    }

    public Memoto createMemoto() {
        Memoto memoto = new Memoto();
        memoto.lv = lv;
        memoto.hp = hp;
        memoto.mp = mp;
        return memoto;
    }

    public void restore(Memoto memoto) {
        lv = memoto.lv;
        hp = memoto.hp;
        mp = memoto.mp;
        System.out.println("回档了，当前级别" + lv + " hp:" + hp + " mp:" + mp);
    }

    @Override
    public String toString() {
        return "当前状态：级别" + lv + " hp:" + hp + " mp:" + mp;
    }

}
