
public class loop {
	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {
			System.out.println(i);

		}
		for (int i = 0; i < 101; i++) {
			System.out.println(i);

		}
		for (int i = 2; i < 101; i += 2) {
			System.out.println(i);
		}
		for (int i = 1; i < 100; i--) {

		}
		for (int i = 0; i < 501; i++) {

			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd ");
			}
		}
		for (int j = 2007; j < 2020; j++) {
			int age = j - 2007;
			System.out.println(" In "+ j+ " I was " + age+" years old");
		}
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println(i+"  "+j);
		}	
		}
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		for (int j2 = 0; j2 < 3; j2++) {
			System.out.println(i+" "+j+" "+j2);
			}
				
			}
			
		}

	}
}
