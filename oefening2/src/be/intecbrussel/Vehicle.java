package be.intecbrussel;

public interface Vehicle extends Switch, Motor {

    int doors = 5; // static final, not good idea for app

    void openDoor(int doors);
    void closeDoor(int doors);
}
