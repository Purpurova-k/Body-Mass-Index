public class Main {
    public static void main(String[] args) {
        BodyMassIndexServer service = new BodyMassIndexServer();
        double bmi = service.calculate(160,48);
        // Рост в сантиметрах, вес в килограммах
        String result = String.format("%.1f",bmi);
        System.out.println(result);
    }
}
