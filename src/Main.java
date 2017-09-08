import dp.ObservableModel;
import dp.Observer;
import empty.Weather;

public class Main {

    public static void main(String[] args) {
        //Observable test
        ObservableModel<Weather> observableModel = new ObservableModel<>();
        Observer<Weather> observer = (observable, data) -> System.out.println("observable" + data.toString());
        observableModel.register(observer);
        Weather weather = new Weather("晴转多云");
        observableModel.notifyObservers(weather);
        observableModel.unRegister(observer);
    }
}
