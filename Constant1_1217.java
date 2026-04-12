import java.util.Scanner;
public class Constant1_1217{
	public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	final int BASE_SCORE = 85;
	System.out.print("시험점수 : ");
	int score = scan.nextInt();
	System.out.println(score+"-"+ BASE_SCORE +"="+(score-BASE_SCORE));	
	}
}