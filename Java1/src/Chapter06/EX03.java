package Chapter06;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ref_1 = "펭수";
		String ref_2 = new String("펭수");
		String ref_3 = "범이";
		
		System.out.println(ref_1 == ref_2);
		System.out.println(ref_1 != ref_2);
		System.out.println(ref_1 == ref_3);
	}

}
