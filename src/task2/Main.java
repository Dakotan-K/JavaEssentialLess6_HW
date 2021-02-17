package task2;

public class Main {
    public static void main(String[] args) {

        Vehicle printVehicle = new Vehicle();
        Vehicle.Wheel printWheel = new Vehicle().new Wheel();
        Vehicle.Door printDoor = new Vehicle().new Door();

        printVehicle.print();
        printWheel.print();
        printDoor.print();
    }
}
