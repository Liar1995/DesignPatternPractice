package Strategy;

/**
 * Created by Sunmeng on 2017/9/20.
 * E-Mail:Sunmeng1995@outlook.com
 * 策略模式
 */
public class StrategyModel {

    /**
     * 策略模式 一个类的行为或其算法可以在运行时更改
     * 环境(Context) 持有一个Strategy的引用
     * 抽象策略(Strategy) 这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口
     * 具体策略(ConcreteStrategy) 包装了相关的算法或行为
     * Android中ListAdapter=Strategy，ArrayAdapter/BaseAdapter=ConcreteStrategy，setAdapter=Context
     * 时间插值器 TimeInterpolator=Strategy，AccelerateDecelerateInterpolator,AccelerateInterpolator=ConcreteStrategy，setInterpolator=Context
     */
    public static void main(String[] args) {
        System.out.print(calc(new AddStrategy(), 66, 66));
        System.out.print(calc(new SubStrategy(), 66, 66));
        System.out.print(calc(new MultiStrategy(), 66, 66));
        System.out.print(calc(new DivStrategy(), 66, 66));
    }

    //针对操作进行抽象 抽象策略
    public interface Strategy {
        double calc(double paramA, double paramB);
    }

    //加法的具体实现策略
    public static class AddStrategy implements Strategy {
        @Override
        public double calc(double paramA, double paramB) {
            System.out.println("执行加法策略...");
            return paramA + paramB;
        }
    }

    //减法的具体实现策略
    public static class SubStrategy implements Strategy {
        @Override
        public double calc(double paramA, double paramB) {
            System.out.println("执行减法策略...");
            return paramA - paramB;
        }
    }

    //乘法的具体实现策略
    public static class MultiStrategy implements Strategy {
        @Override
        public double calc(double paramA, double paramB) {
            System.out.println("执行乘法策略...");
            return paramA * paramB;
        }
    }

    //除法的具体实现策略
    public static class DivStrategy implements Strategy {
        @Override
        public double calc(double paramA, double paramB) {
            System.out.println("执行除法策略...");
            if (paramB == 0) {
                throw new IllegalArgumentException("除数不能为0!");
            }
            return paramA / paramB;
        }
    }

    //执行方法
    private static double calc(Strategy strategy, double paramA, double paramB) {
        Calc calc = new Calc();
        calc.setStrategy(strategy);
        return calc.calc(paramA, paramB);
    }

    public static class Calc {
        private Strategy strategy;

        void setStrategy(StrategyModel.Strategy strategy) {
            this.strategy = strategy;
        }

        double calc(double paramA, double paramB) {
            if (this.strategy == null) {
                throw new IllegalStateException("你还没有设置计算的策略");
            }
            return this.strategy.calc(paramA, paramB);
        }
    }


}
