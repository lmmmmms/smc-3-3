import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i =(int)(Math.random()*3);
		System.out.println("���� ���� ��");
		String a = sc.next();
		if(i==0)System.out.println("����");
		else if(i==1)System.out.println("����");
		else if(i==2)System.out.println("��");
		
		if(a.equals("����")) {
			if(i==0)System.out.println("���");
			else if(i==1)System.out.println("��");
			else if(i==2)System.out.println("�̱�");
		}
		if(a.equals("��")) {
			if(i==0)System.out.println("��");
			else if(i==1)System.out.println("�̱�");
			else if(i==2)System.out.println("���");
		}
		if(a.equals("����")) {
			if(i==0)System.out.println("�̱�");
			else if(i==1)System.out.println("���");
			else if(i==2)System.out.println("��");
		}
		
		
	
	}
}