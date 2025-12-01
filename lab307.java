import javax.swing.JOptionPane;
public class Lab307 {
    public static void main(String[] args) {
        int totalPrice = 0;
        while (true) {
            // ปรับแก้ตรงนี้: ระบุหัวข้อ “Input” และไอคอน QUESTION_MESSAGE
            String input = JOptionPane.showInputDialog(
                    null,
                    “Input Price:”,
                “Input”,
            JOptionPane.QUESTION_MESSAGE
                    );

            // กรณีผู้ใช้กด Cancel หรือปิดหน้าต่าง
            if (input == null) {
                break;
            }

            int price = 0;
            try {
                price = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, “Please enter a number only!”, “Error”, JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (price == 0) {
                break;
            }

            if (price < 0) {
                JOptionPane.showMessageDialog(null, “Invalid price!!”, “Warning”, JOptionPane.WARNING_MESSAGE);
            } else {
                totalPrice += price;
            }
        }

        JOptionPane.showMessageDialog(null, “Total Price = “ + totalPrice, “Result”, JOptionPane.INFORMATION_MESSAGE);
    }
}