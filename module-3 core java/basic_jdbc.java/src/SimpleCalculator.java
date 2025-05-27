import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a:");
        a=sc.nextInt();
        System.out.println("Enter the value for b:");
        b=sc.nextInt();
        System.out.println("1. Addition, 2. Substraction, 3. Multiplication, 4. Division");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Performing Addition Operation:");
                int c = a+b;
                System.out.println("Sum of two number:"+c);
                break;
            case 2:
                System.out.println("Performing Substratction Operation:");
                int sub = a-b;
                System.out.println("Substratction of two number:"+sub);
                break;
            case 3:
                System.out.println("Performing multiplication Operation:");
                int mul = a*b;
                System.out.println("division of two number:"+mul);
                break;
            case 4:
                System.out.println("Performing Division Operation:");
                int div = a/b;
                System.out.println("division of two number:"+div);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}
