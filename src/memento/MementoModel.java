package memento;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * 备忘录模式/快照（Snapshot Pattern）模式/Token模式 行为模式
 * 不需要抽象的一个模式
 */
public class MementoModel {

    /**
     * 备忘录模式 在不破坏封装的前提下，捕捉一个对象的内部状态，并在该对象之外保存这个状态，这样，以后就可将该对象恢复到原先保存的状态
     * 使用的场景：需要保存一个对象在某一个时刻的状态或部分状态
     * Originator 是需要存储的对象，可以记录、恢复自身的内部状态，同时 Originator 还可以根据需要决定 Memento 存储自身的哪些内部状态
     * Memento：备忘录角色，用于存储 Originator 的内部状态，并且可以防止 Originator 以外的对象访问 Memento
     * CareTaker：负责存/取备忘录，不能对备忘录的内容进行操作和访问，只能够将备忘录传递给其他对象
     * “白箱”备忘录模式：内部所存储的状态对所有对象公开
     * “黑箱”备忘录模式：Memento 设计成了 Originator 的内部类，从而将 Memento 的对象封装在 Originator 里面
     * Android中的备忘录模式：onSaveInstanceState & onRestoreInstanceState，Activity 扮演了Caretaker 的角色，
     * 负责存储、恢复 UI 的状态信息；Activity、Fragment、View、ViewGroup 等对象为 Originator 角色，也就是需要存储状态的对象；Memento 则是由 Bundle 类扮演
     */
    public static void main(String[] args) {
        Player player = new Player();
        player.toString();
        player.play();
        player.toString();
        System.out.println("存档");
        Caretaker caretaker = new Caretaker();
        caretaker.save(player.createMemoto());
        player.attackBoss();
        player.toString();
        player.restore(caretaker.load());
        player.toString();
    }

}
