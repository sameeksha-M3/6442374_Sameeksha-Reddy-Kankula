public class StringReversal {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("String reverse using manual methods by for loop");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("String reverse using the built-in method:");
        System.out.println(sb.toString());
    }
}
