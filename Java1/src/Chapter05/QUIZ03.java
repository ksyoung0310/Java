package Chapter05;
import java.util.Scanner;
public class QUIZ03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numSum = 0;
		while(true) {
			System.out.print("수 입력: ");
			int num = input.nextInt();
			numSum += num;
			if (num == 0) {
				System.out.println("합: " + numSum);
				System.out.println("Program Exit~");
				break;
			} else {
				System.out.println("다시 입력해 주세요!");
			}
		}
		input.close();
	}
}
