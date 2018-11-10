
public class Fibonacci {	
public static void main(String[] args) {
int last=1;
int secondlast=1;
System.out.println(1);
System.out.println(1);
for (int i = 0; i <10 ; i++) {
int newnum=last+secondlast;
secondlast=last;
last=newnum;
System.out.println(last);
	
}
}	
}

