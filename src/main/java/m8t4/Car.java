package m8t4;

public class Car {
    private String carModel;
    private Engine engine;

    public Car(String carModel){
        this.carModel = carModel;
    }


    class Engine{
        private boolean isWorking;
        private int horsepower;


        public Engine(int horsepower){
            isWorking = false;
            this.horsepower = horsepower;
        }


        public String startStopEngine() {
            if (isWorking) {
                isWorking = false;
                return "engine was stopped";
            } else {
                isWorking = true;
                return "engine was started";
            }
        }
    }
}
