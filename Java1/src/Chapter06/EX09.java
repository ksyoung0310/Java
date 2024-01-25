package Chapter06;

public class EX09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언
				int[] arrayInt1 = new int[10];
				
				// 초기화
				arrayInt1[0] = 1;
				arrayInt1[9] = 10;
				
				// 출력
				System.out.println(arrayInt1[0]);
				System.out.println(arrayInt1[9]);
				
				// 기본값 확인
				System.out.println(arrayInt1[7]);
				
				int[] arrayInt2 = new int[3];
				System.out.println(arrayInt2[0]);
				System.out.println(arrayInt2[1]);
				System.out.println(arrayInt2[2]);
				
				System.out.println(arrayInt2[3]);
				// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	}

}
