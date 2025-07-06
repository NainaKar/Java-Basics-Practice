public class AllOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment Operators
        int c = 5;
        c += 3;
        System.out.println("c += 3: " + c);

        // Increment / Decrement
        int d = 7;
        System.out.println("d++: " + d++); // 7
        System.out.println("Now d: " + d); // 8
        System.out.println("++d: " + ++d); // 9
    }
}

