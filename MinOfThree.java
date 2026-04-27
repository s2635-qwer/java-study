import java.util.Scanner;

public class MinOfThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수 입력: ");
        int a = sc.nextInt();
        System.out.print("두 번째 수 입력: ");
        int b = sc.nextInt();
        System.out.print("세 번째 수 입력: ");
        int c = sc.nextInt();

        int min;

        if (a < b) {
            if (a < c) {
                min = a;
            } else {
                min = c;
            }
        } else {
            if (b < c) {
                min = b;
            } else {
                min = c;
            }
        }

        System.out.println("가장 작은 값: " + min);
    }
}