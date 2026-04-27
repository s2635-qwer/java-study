import java.util.Scanner;
public class Self_For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int small, big;
        if (a < b) {
            small = a;
            big = b;
        } else {
            small = b;
            big = a;
        }

        for (int i = small; i <= big; i++) {
            System.out.print(i + " ");
        }
    }
}