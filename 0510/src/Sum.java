import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum=0;
	int a,b=0;
	System.out.print("���� ���� : ");
	a = sc.nextInt();
	
	System.out.print("������ ���� : ");
	b = sc.nextInt();
	
	for(int i=a; i<=b; i++) {
		sum += i;
		System.out.println(a+"����"+b+"������ ����"+sum);
	}
	
	
	
	
	
	}
}
