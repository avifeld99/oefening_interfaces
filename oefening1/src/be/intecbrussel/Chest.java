package be.intecbrussel;

public class Chest implements Lock {

    @Override
    public void lock() {
        System.out.println("chest is locked");
    }

    @Override
    public void unlock() {
        System.out.println("chest is unlocked");
    }
}
