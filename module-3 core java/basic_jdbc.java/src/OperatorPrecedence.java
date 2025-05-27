public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        
        int result1 = a + b * c;   
        System.out.println("a + b * c = " + result1);  // 10 + (5 * 2) = 20

        
        int result2 = (a + b) * c; 
        System.out.println("(a + b) * c = " + result2);  // (10 + 5) * 2 = 30

       
        int result3 = a + b * c - b / c;
        System.out.println("a + b * c - b / c = " + result3);
        // Equivalent to: 10 + (5 * 2) - (5 / 2) = 10 + 10 - 2 = 18
    }
}
