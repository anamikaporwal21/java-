import java.util.Scanner;
public class fun {
    public static void bunny(int n){
        if(n%2==0){
            System.out.println("even");

        }
        else {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter an integer: ");
        // Checking if input is an integer
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            bunny(x);  // Call the funny method
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
    
    }

