package Chapter03;
import java.util.Scanner;

public class QUIZ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String id,password;
		System.out.print("ID 입력: ");
		id = scanner.nextLine();
		System.out.print("PASSWORD 입력: ");
		password = scanner.nextLine();
		scanner.close();
		
		System.out.println("===== 회원 가입 완료 ===== ");
		System.out.println("ID : "+ id);
		System.out.println("PASSWORD : " + password);
	}

}
