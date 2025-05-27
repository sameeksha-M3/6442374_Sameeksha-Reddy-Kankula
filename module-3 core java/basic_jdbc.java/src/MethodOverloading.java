public class MethodOverloading {
    void display(int a, int b){
        System.out.println(a+b);
    }
    void display(double c, double d){
        System.out.println(c+d);
    }
    void display(int p,int q, int r){
        System.out.println(p+q+r);
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(10, 12);
        obj.display(12.98765, 34.9876543);
        obj.display(23, 45, 55);
    }
}
