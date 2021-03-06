package empty;

/**
 * Created by Sunmeng on 2017/9/8.
 * E-Mail:Sunmeng1995@outlook.com
 * Description:建造者模式的Person类
 */


public class Person {

    public Person() {
    }

    private String name;
    private int age;
    private double height;
    private double weight;

    Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static class Builder {
        private String name;
        private int age;
        private double height;
        private double weight;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

}
