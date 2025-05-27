import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] Array =new int[size];

        for(int i=0;i<size;i++){
            Array[i]=sc.nextInt();
        }
        int sum=0;
        
        for(int i=0;i<size;i++){
            sum=sum+Array[i];
        }
        float avg=sum/size;
        System.out.println("Sum of the Array is:"+sum);
        System.out.println("Average of Array is: "+avg);
    }
}
