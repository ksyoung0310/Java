package Chapter03;
import java.util.Scanner;

public class QUIZ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.print("진입 시간 입력: ");
		int h1 = input.nextInt();
		int m1 = input.nextInt();
		System.out.print("진출 시간 입력: ");
		int h2 = input.nextInt();
		int m2 = input.nextInt();
		input.close();
		
		int t1 = h1 * 60 + m1;
		int t2 = h2 * 60 + m2;
		int time = t2 - t1;
		int hour = time / 60;
		int minute = time % 60;
		
		System.out.println("주차 시간: " + hour + "시간" + minute + "분");
	}

}
