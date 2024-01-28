package Chapter05;

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 10까지 합을 구하시오.
		
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
//		// 1번
//		for (int i = 1; i < 11; i++) {
//			int iSum = 0;
//			iSum = iSum + i;
//			System.out.println("합: " + iSum);
//		}
		
		// 2번
		int iSum = 0;
		for (int i = 1; i < 11; i++) {
			iSum = iSum + i;
//			System.out.println("합: " + iSum);
//			합: 1
//			합: 3
//			합: 6
//			합: 10
//			합: 15
//			합: 21
//			합: 28
//			합: 36
//			합: 45
//			합: 55

		}
		System.out.println("합: " + iSum);
	} 

}
