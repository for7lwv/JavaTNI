import javax.swing.*;public class Lab309 {


    private static final String MENU =
            "*** Yakitori Menu ***\n" +
                    "1: Chicken Wing (99 Baht)\n" +
                    "2: Pork with Leek (89 Baht)\n" +
                    "3: Beef Tongue (109 Baht)\n" +
                    "0: Exit and Calculate";

    public static void main(String[] args) {

        int startOption;

        do {

            startOption = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to start a new order?",
                    "Yakitori Order System",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );


            if (startOption == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Thank you for using the Yakitori Order System.", "Goodbye", JOptionPane.INFORMATION_MESSAGE);
                break;
            }


            if (startOption == JOptionPane.YES_OPTION) {
                calculateNewOrder();
            }

        } while (startOption == JOptionPane.YES_OPTION);
    }

    /**
     * เมธอดสำหรับรับออร์เดอร์และคำนวณราคารวม
     */
    private static void calculateNewOrder() {
        double totalPrice = 0.0;
        int menuCode = -1;


        while (menuCode != 0) {
            String input = JOptionPane.showInputDialog(
                    null,
                    "Total: " + String.format("%.2f", totalPrice) + " Baht\n" + MENU + "\n\nEnter menu number:",
                    "Enter Order",
                    JOptionPane.QUESTION_MESSAGE
            );


            if (input == null) {
                menuCode = 0;
                continue;
            }

            try {
                menuCode = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Invalid menu input! Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (menuCode) {
                case 1:
                    totalPrice += 99;
                    break;
                case 2:
                    totalPrice += 89;
                    break;
                case 3:
                    totalPrice += 109;
                    break;
                case 0:

                    break;
                default:

                    JOptionPane.showMessageDialog(null, "Invalid menu number " + menuCode + "! Please try again.", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }


        JOptionPane.showMessageDialog(
                null,
                "*** Order Summary ***\n" +
                        "Your total bill is: **" + String.format("%.2f", totalPrice) + " Baht**\n" +
                        "Thank you!",
                "Total Amount",
                JOptionPane.INFORMATION_MESSAGE
        );


    }
}
