public class TestCustomException {
    static void validate(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be 18 or older");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (MyCustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
