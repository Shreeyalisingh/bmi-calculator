public class BMICalculator {
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obesity";
    }

    public static void main(String[] args) {
        double weight = 70; // kg
        double height = 1.75; // meters
        System.out.println("BMI Category: " + calculateBMI(weight, height));
    }
}

