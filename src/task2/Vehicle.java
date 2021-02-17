package task2;

public class Vehicle {

    public void print() {
        System.out.println("Метод print, class Vehicle");
    }

    class Wheel {
        public void print() {
            System.out.println("Метод print, внутренний class Wheel");
        }
    }

    class Door {
        public void print() {
            System.out.println("Метод print, внутренний class Door");
        }
    }
}

