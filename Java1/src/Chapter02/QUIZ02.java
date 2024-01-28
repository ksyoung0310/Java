package Chapter02;

public class QUIZ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "TEST1234";
		int password = 991005;
		
		System.out.println("ID: " + id);
		System.out.println("Password: " + password);
		
		int noodle = 5000 * 3;
		int rice = 6000 * 2;
		int discount = 3000;
		
		int total = noodle + rice;
		int result = total - discount;
		
		System.out.println("짜장면: " + noodle);
		System.out.println("볶음밥: " + rice);
		System.out.println("합계: " + total);
		System.out.println("최종금액: " + result);
		
	}

}