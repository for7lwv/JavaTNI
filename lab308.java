public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Lab308: Number Analysis ---");


        System.out.print("Enter the total number of integers you will input: ");
        int totalCount = scanner.nextInt();


        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int evenCount = 0;
        int oddCount = 0;


        for (int i = 1; i <= totalCount; i++) {
            System.out.print("Enter number #" + i + ": ");
            int currentNumber = scanner.nextInt();


            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }


            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }


            if (currentNumber % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }


        System.out.println("\n--- Analysis Result ---");

        if (totalCount > 0) {
            System.out.println("The maximum number is: **" + maxNumber +"**");
            System.out.println("The minimum number is: **" + minNumber + "**");
            System.out.println("Total Even numbers: **" + evenCount + "**");
            System.out.println("Total Odd numbers: **" + oddCount + "**");
        } else {
            System.out.println("No numbers were entered for analysis.");
        }

        scanner.close();
    }
}
