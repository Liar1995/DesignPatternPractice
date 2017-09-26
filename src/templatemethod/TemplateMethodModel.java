package templatemethod;

/**
 * Created by Sunmeng on 2017/9/26.
 * E-Mail:Sunmeng1995@outlook.com
 * 模板方法模式（行为模式）
 */
public class TemplateMethodModel {

    /**
     * 模板方法模式:定义一个操作中的算法的框架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤
     * 使用场景:多个子类有共有的方法，并且逻辑基本相同时,重要、复杂的算法，可以把核心算法设计成模板方法
     * 抽象模板（Abstract Template）:定义了一个或多个抽象操作，以便让子类实现，这些抽象操作叫做基本操作
     * 具体模板（Concrete Template）:实现父类所定义的一个或多个抽象方法
     * Android中:AsyncTask(onPreExecute,doInBackground,onPostExecute)和Activity 的生命周期函数
     * */
    public static void main(String[] args) {
        AbstractTemplate templateA = new ConcreteTemplateA();
        templateA.templateMethod();
        AbstractTemplate templateB = new ConcreteTemplateB();
        templateB.templateMethod();
    }

}
