import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        int math,phy,chem,c,python,java;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter math marks:");
        math=sc.nextInt();
        System.out.println("Enter phy marks:");
        phy=sc.nextInt();
        System.out.println("Enter chem marks:");
        chem=sc.nextInt();
        System.out.println("Enter c marks:");
        c=sc.nextInt();
        System.out.println("Enter python marks:");
        python=sc.nextInt();
        System.out.println("Enter java marks:");
        java=sc.nextInt();
        
        int total =(math+phy+chem+c+python+java )/6;
        if(total>=90 || total>=100){
            System.out.println("A Grade");
        }
        else if(total>=80 || total>=89){
            System.out.println("B Grade");
        }
        else if(total>=70 || total>=79){
            System.out.println("B Grade");
        }
        else if(total>=60 || total>=69){
            System.out.println("B Grade");
        }
        else{
            System.out.println("F Grade");
        }
    }
}
