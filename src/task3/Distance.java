package task3;

public class Distance {

    private double distance;
    public void print() {
        System.out.println("Method print");
    }

    public static class Converter {

        public static double mFromKm (double m) {
            return m/1000;
        }

        public static double kmFromMils (double km) {
            return km/1.60934;
        }
    }
}
