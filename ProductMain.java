public class ProductMain {
    public static void main(String[] args) {

        javax.swing.JOptionPane.showMessageDialog(null,
                "Welcome to Product Stock System");


        Product product = new Product();


        product.name = javax.swing.JOptionPane.showInputDialog("Enter product name:");
        product.price = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Enter product price per item:"));
        product.quantity = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter product stock:"));


        System.out.println("Name  : " + product.name);
        System.out.println("Price : " + product.price+ " Baht/Item");
        System.out.println("Stock : " + product.quantity+ " Item");
        System.out.println("Stock Value : " + product.stockValue());
        System.out.println();  // เว้นบรรทัดให้โล่งเหมือนตัวอย่าง



        int addChoice = javax.swing.JOptionPane.showConfirmDialog(null, "Do you want to add more item?");
        if (addChoice == javax.swing.JOptionPane.YES_OPTION) {
            int addAmount = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("How many items to add in stock:"));
            product.quantity += addAmount;

            System.out.println("Added " + addAmount + " item to stock");
        }


        int priceChoice = javax.swing.JOptionPane.showConfirmDialog(null, "Do you want change price?");
        if (priceChoice == javax.swing.JOptionPane.YES_OPTION) {
            double newPrice = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("How much is the new price per item?"));
            product.price = newPrice;

            System.out.println("Change price to " + newPrice + " baht");
        }

        System.out.println();



        System.out.println("Name  : " + product.name);
        System.out.println("Price : " + product.price + " Baht/Item");
        System.out.println("Stock : " + product.quantity + " Item");
        System.out.println("Stock Value : " + product.stockValue());
    }
}
