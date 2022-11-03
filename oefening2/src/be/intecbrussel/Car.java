package be.intecbrussel;

public class Car implements Vehicle { //interface aggregation --> Vehicle extends Switch, Motor

    private boolean isCarOn = false;
    private int openedDoors = 0;

    @Override
    public void gas() {
        if (isCarOn == true && openedDoors == 0) {
            System.out.println("driving");
        } else {
            System.out.println("unable to give gas");
        }
    }

    @Override
    public void toggleSwitch() {
        if (isCarOn == false) {
            isCarOn = true;
        } else {
            isCarOn = false;
        }
        // korte versie
        // isCarOn = !isCarOn;
    }

    @Override
    public void openDoor(int door) {
        if (door > doors) {
            System.out.println("failed, this car has only " + doors + " doors");
        } else if (door <= 0) {
            System.out.println("failed, at least 1 door is open");
        } else {
            openedDoors += door;
        }
    }

    @Override
    public void closeDoor(int door) {
        if (door == 0) {
            System.out.println("you have to close at least 1 door");
        } else if (door > doors) {
            System.out.println("you can not close more doors than " + doors);
        } else if (door > openedDoors) {
            System.out.println("you cannot close more doors than the opened doors, which are/is: " + openedDoors);
        } else {
            openedDoors -= door;
        }
    }
}
