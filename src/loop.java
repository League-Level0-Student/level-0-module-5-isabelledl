
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
			System.out.println(j);
			System.out.print("I was" + age);
		}

	}
}
