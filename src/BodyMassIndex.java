public class BodyMassIndex {
    public int calculate(int bodyMass, double bodyHeight) {
        double indexBody = bodyMass / bodyHeight;
        return (int) indexBody;
    }
}
