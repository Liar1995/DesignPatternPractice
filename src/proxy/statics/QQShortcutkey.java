package proxy.statics;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class QQShortcutkey extends ChatSubject {

    private ChatSubject chatSubject = new TencentQQ();

    @Override
    public void chat() {
        chatSubject.chat();
    }
}
