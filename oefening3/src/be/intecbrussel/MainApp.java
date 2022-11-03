package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {

        Battery battery1 = new DuracelDoubleA();
        Battery battery2 = new DuracelTripleA();
        Battery battery3 = new VartaDoubleA();
        Battery battery4 = new DuracelDoubleA();


        Flashlight flashlight1 = new Flashlight(battery1);
        Flashlight flashlight2 = new Flashlight(battery2);

        Flashlight flashlight3 = new Flashlight(battery3, battery4);
    }
}
