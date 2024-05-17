package Module5;
import java.util.Scanner;

public class Module5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        int product = productOfNumbers(numbers, 0);

        
        System.out.println("The product of the entered numbers is: " + product);

        scanner.close();
    }

    
    public static int productOfNumbers(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        } else {
            return numbers[index] * productOfNumbers(numbers, index + 1);
        }
    }
}
