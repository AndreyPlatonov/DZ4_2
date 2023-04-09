public class Main {
    public static void main(String[] args) {
        BodyMassIndex bmi = new BodyMassIndex();
        int bodyMass = 90;
        double bodyHeight = 1.87;
        int indexBody = bmi.calculate(bodyMass, bodyHeight);
        System.out.println("Индекс массы тела: " + indexBody);
    }
}