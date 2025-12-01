public class Lab302 {
    public static void main(String[] args) {
        String name = "";
        double height = 0.0;
        double standardWeight = 0.0;


        name = JOptionPane.showInputDialog(null, "Enter your name:", "Input Name", JOptionPane.QUESTION_MESSAGE);

        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name input cancelled or empty. Program terminated.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        String heightInput = JOptionPane.showInputDialog(null, "Hello " + name + ".\nEnter your height (cm.):", "Input Height", JOptionPane.QUESTION_MESSAGE);

        if (heightInput == null) {
            JOptionPane.showMessageDialog(null, "Height input cancelled. Program terminated.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            height = Double.parseDouble(heightInput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid height entered. Program terminated.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        int maleOption = JOptionPane.showConfirmDialog(
                null,
                "Is your biological sex Male?",
                "Sex Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );


        if (maleOption == JOptionPane.YES_OPTION) {

            standardWeight = height - 100;
            JOptionPane.showMessageDialog(
                    null,
                    "Standard weight for " + name + " (Male) with a height of " + height + " cm is: " + String.format("%.2f", standardWeight) + " kg.",
                    "Result: Male",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        else if (maleOption == JOptionPane.NO_OPTION) {

            int femaleOption = JOptionPane.showConfirmDialog(
                    null,
                    "Is your biological sex Female?",
                    "Sex Confirmation",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );


            if (femaleOption == JOptionPane.YES_OPTION) {

                standardWeight = height - 110;
                JOptionPane.showMessageDialog(
                        null,
                        "Standard weight for " + name + " (Female) with a height of " + height + " cm is: " + String.format("%.2f", standardWeight) + " kg.",
                        "Result: Female",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            else if (femaleOption == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "You can use **BMI** to measure your weight and height.",
                        "Alternative Measurement",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
    }
}