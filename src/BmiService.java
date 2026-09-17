public class BmiService {
    public int calculate(double weightKg, double heightM) {
        double index = weightKg / (heightM * heightM);
        return (int) index;

    }
}
