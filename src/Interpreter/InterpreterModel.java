package Interpreter;


/**
 * Created by Sunmeng on 2017/9/25.
 * E-Mail:Sunmeng1995@outlook.com
 * 解释器模式
 */
public class InterpreterModel {

    /**
     * 解释器模式 给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子
     * AbstractExpression：抽象表达式，声明一个抽象的解释操作父类，并定义一个抽象的 interpret() 解释方法
     * TerminalExpression：终结符表达式，实现了抽象表达式角色所要求的接口，主要是一个interpret()方法
     * NonterminalExpression：非终结符表达式
     * Context：上下文环境类
     * 在android系统中，包管理服务对应用包的解析使用了解释器模式
     */
    public static void main(String[] args) {
        Expression isMale = InterpreterPatternDemo.getMaleExpression();
        Expression isMarriedWoman = InterpreterPatternDemo.getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }

}
