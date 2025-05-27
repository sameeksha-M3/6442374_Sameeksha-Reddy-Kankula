import java.util.Scanner;
public class DataTypeDemonstration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int integer= sc.nextInt();
        System.out.println(integer+" is a Integer");
        System.out.println("Enter an float");
        float decimalnumber= sc.nextFloat();
        System.out.println(decimalnumber+" is float");
        System.out.println("Enter an doublenumber");
        double doublenumber = sc.nextDouble();
        System.out.println(doublenumber+" is doubleNumber");
        System.out.println("Enter an character");
        char character = sc.next().charAt(0);
        System.out.println(character+" is character");
        
    }
}
