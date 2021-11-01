public class BodyMassIndexServer {
    public double calculate(int height, int weight) {
        double m = (double) height / 100;
        double h2 = m * m;
        double bmi = weight / h2;
        return (double) bmi;
    }
}

