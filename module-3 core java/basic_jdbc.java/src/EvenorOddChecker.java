import java.util.Scanner;
public class EvenorOddChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to check Even or Odd");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println(number+" is Even NUmber");
        }
        else{
            System.out.println(number+" is Odd Number");
        }
    }
}
