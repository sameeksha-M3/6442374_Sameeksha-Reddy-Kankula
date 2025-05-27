public class PatternMatch {
    public static void checkType(Object obj) {
        if (obj instanceof Integer i) {
            System.out.println("It's an Integer: " + i);
        } else if (obj instanceof String s) {
            System.out.println("It's a String: " + s);
        } else if (obj instanceof Double d) {
            System.out.println("It's a Double: " + d);
        } else if (obj == null) {
            System.out.println("It's null!");
        } else {
            System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        checkType(123);
        checkType("Java");
        checkType(3.14);
        checkType(true);
        checkType(null);
    }
}
