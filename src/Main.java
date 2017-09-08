import obsever.ObservableModel;
import obsever.Observer;
import empty.Weather;
import obsever.SimpleObservable;
import obsever.SimpleObserver;
import reflection.ReflectionTest;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        //Observable test
//        ObservableModel<Weather> observableModel = new ObservableModel<>();
//        Observer<Weather> observer = (observable, data) -> System.out.println("observable" + data.toString());
//        observableModel.register(observer);
//        Weather weather = new Weather("晴转多云");
//        observableModel.notifyObservers(weather);
//        observableModel.unRegister(observer);

        //java observer
//        SimpleObservable simpleObservable = new SimpleObservable();
//        SimpleObserver simpleObserver = new SimpleObserver();
//        simpleObservable.addObserver(simpleObserver);
//        simpleObservable.setData(1);

        //Reflection Test
        ReflectionTest reflectionTest=new ReflectionTest();
        reflectionTest.reflection();
    }
}
