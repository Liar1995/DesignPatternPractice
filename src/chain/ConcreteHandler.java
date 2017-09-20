package chain;

/**
 * Created by Sunmeng on 2017/9/20.
 * E-Mail:Sunmeng1995@outlook.com
 */
public class ConcreteHandler extends Handler {

    private String name;

    public ConcreteHandler(String name) {
        this.name = name;
    }

    @Override
    public void handleFeeRequest() {
        if (getSuccessor() != null) {
            System.out.println("放过请求");
            getSuccessor().handleFeeRequest();
        } else {
            System.out.println("处理请求");
        }
    }

}
