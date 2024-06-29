package HomeWork_12_1;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity is started");
    }

    private void startCommand() {
        System.out.println("Start command is called");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system is started");
    }

}

class CarTest{
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
