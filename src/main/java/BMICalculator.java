public class BMICalculator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java BMICalculator <weight_kg> <height_m>");
            return;
        }

        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double bmi = weight / (height * height);

        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal_weight";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        System.out.printf("BMI Category: %s%n", category);

        // Send BMI numeric value
        MetricSender.send("value", (int) bmi);

        // Send BMI category marker (send 1 to the category name)
        MetricSender.send("category." + category, 1);
    }
}

