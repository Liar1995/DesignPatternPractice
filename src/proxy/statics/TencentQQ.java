package proxy.statics;

import proxy.statics.ChatSubject;

/**
 * Created by Sunmeng on 2017/9/15.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class TencentQQ extends ChatSubject {
    @Override
    public void chat() {
        System.out.println("Tencent QQ Chat");
    }
}
