package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {

        Car car = new Car();
        car.toggleSwitch();
        car.openDoor(2);
        car.closeDoor(1);
        car.gas();
    }
}
