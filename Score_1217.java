import java.util.Scanner;

public class Score_1217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수 입력: ");
        int korean = sc.nextInt();

        System.out.print("영어 점수 입력: ");
        int english = sc.nextInt();

        System.out.print("수학 점수 입력: ");
        int math = sc.nextInt();

        System.out.print("자바 점수 입력: ");
        int javaScore = sc.nextInt(); // 변수명 변경 추천

        int sum = korean + english + math + javaScore;
        double avg = sum / 4.0;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);

        sc.close();
    }
}