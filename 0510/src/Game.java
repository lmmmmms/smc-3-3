import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i =(int)(Math.random()*3);
		System.out.println("∞°¿ß πŸ¿ß ∫∏");
		String a = sc.next();
		if(i==0)System.out.println("∞°¿ß");
		else if(i==1)System.out.println("πŸ¿ß");
		else if(i==2)System.out.println("∫∏");
		
		if(a.equals("∞°¿ß")) {
			if(i==0)System.out.println("∫Ò±Ë");
			else if(i==1)System.out.println("¡¸");
			else if(i==2)System.out.println("¿Ã±Ë");
		}
		if(a.equals("∫∏")) {
			if(i==0)System.out.println("¡¸");
			else if(i==1)System.out.println("¿Ã±Ë");
			else if(i==2)System.out.println("∫Ò±Ë");
		}
		if(a.equals("πŸ¿ß")) {
			if(i==0)System.out.println("¿Ã±Ë");
			else if(i==1)System.out.println("∫Ò±Ë");
			else if(i==2)System.out.println("¡¸");
		}
		
		
	
	}
}