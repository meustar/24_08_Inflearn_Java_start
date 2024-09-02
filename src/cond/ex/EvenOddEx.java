package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {

        int x = 5;

        String result = ( x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("정수 x는 " + result + "입니다.");
    }
}
