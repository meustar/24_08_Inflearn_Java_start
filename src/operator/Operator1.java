package operator;

public class Operator1 {
    public static void main(String[] args) {

        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;    // 5 / 2 -> 2.5 하지만, int는 소수점 표현이 안되는 "정수"이다.
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);

//        int z = 10 / 0;   // xception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
