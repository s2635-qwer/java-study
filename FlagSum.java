import java.util.Scanner;

public class FlagSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.print("-" + i);
                result -= i;
            } else {
                if(i != 1) System.out.print("+");
                System.out.print(i);
                result += i;
            }
        }

        System.out.println("=" + result);
    }
}