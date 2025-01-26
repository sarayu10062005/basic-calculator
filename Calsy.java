import java.util.Scanner;

public class Calsy {
    public static void main(String[] args) {
        int opt, Add, Sub, Div, Mul;
        String menu = "1. Addition\n2. Subtraction\n3. Multiply\n4. Division";
        
        try (Scanner get = new Scanner(System.in)) {
            System.out.println("Enter your 1st Value: ");
            int A = get.nextInt();
            System.out.println("Enter your 2nd Value: ");
            int B = get.nextInt();
            System.out.println("\n*****Menu*****");
            System.out.println(menu); System.out.println("\nEnter your choice: ");
            opt = get.nextInt();
            switch (opt) {
                case 1 -> {
                    Add = A+B;
                    System.out.printf("\nAddition: %d", Add);
                }
                case 2 -> {
                    Sub = A-B;
                    System.out.printf("\nSubtraction: %d", Sub);
                }
                case 3 -> {
                    Mul = A*B;
                    System.out.printf("\nMultiplication: %d", Mul);
                }
                case 4 -> {
                    Div = A/B;
                    System.out.printf("\nDivision: %.2f", (float) Div);
                }
            }
        }
    }
}
