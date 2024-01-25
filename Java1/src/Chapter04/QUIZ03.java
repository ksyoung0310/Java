package Chapter04;
import java.util.Scanner;

public class QUIZ03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로 부터 키와 몸무게를 입력받아 bmi를 구하시오.
				// ex) height: 180 weight: 90 > bmi: 27.77778
				Scanner input = new Scanner(System.in);
				
				System.out.print("키: ");
				float height = input.nextFloat();
				System.out.print("몸무게: ");
				float weight = input.nextFloat();
				float h = height / 100;
				
				// bmi = 체중(kg)/키(m)*키(m)
				float bmi = weight / (h*h);
				
				System.out.println("bmi: " + bmi);
				input.close();
	}

}
