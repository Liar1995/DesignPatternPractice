package memento;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class Caretaker {

    private Memoto memoto;

    public void save(Memoto memoto) {
        this.memoto = memoto;
    }

    public Memoto load() {
        return memoto;
    }

}
