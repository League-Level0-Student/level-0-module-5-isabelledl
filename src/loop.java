
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
		int k=1;
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		
			System.out.print(k);
		k++;
		System.out.print(" ");
			}
				
			
			System.out.println();
		}
		int h=1;
for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		System.out.print(h);
		h++;
		System.out.print(" ");
		
	}
	System.out.println();
}
String g= "*";
int d=1;
for (int i = 0; i < 6; i++) {
	for (int j = 0; j  <  d; j++) {
		System.out.print(g);
		System.out.print(" ");
	}
	System.out.println();
d++;

	
}	
}
	}

