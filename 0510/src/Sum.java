import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum=0;
	int a,b=0;
	System.out.print("시작 숫자 : ");
	a = sc.nextInt();
	
	System.out.print("마지막 숫자 : ");
	b = sc.nextInt();
	
	for(int i=a; i<=b; i++) {
		sum += i;
		System.out.println(a+"부터"+b+"까지의 합은"+sum);
	}
	
	
	
	
	
	}
}
