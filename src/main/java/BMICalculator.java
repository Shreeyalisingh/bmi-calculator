public class BMICalculator {
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obesity";
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java BMICalculator <weight_kg> <height_m>");
            return;
        }
        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        System.out.println("BMI Category: " + calculateBMI(weight, height));
    }
}
