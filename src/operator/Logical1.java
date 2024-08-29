package operator;

public class Logical1 {
    public static void main(String[] args) {

        System.out.println("&&: AND 연산");
        System.out.println(true && true);   // t
        System.out.println(true && false);  // f
        System.out.println(false && false); // f

        System.out.println("||: OR 연산");
        System.out.println(true || true);   // t
        System.out.println(true || false);  // t
        System.out.println(false || false); // f

        System.out.println("! 연산");
        System.out.println(!true);          // f
        System.out.println(!false);         // t

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);         // f
        System.out.println(a || b);         // t
        System.out.println(!a);             // f
        System.out.println(!b);             // t
    }
}
