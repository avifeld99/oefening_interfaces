package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {

        Chest chest = new Chest();

        chest.lock();
        chest.unlock();

    }
}
