import java.util.Scanner;

public class CircleExam {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("������ �� >>");
		 int radius = scan.nextInt();// �Է¹��� ������ �� radius �������ֱ�
		 
		 Circle c = new Circle(radius);//  Circle Ŭ������ ���� ��ü c����
		 System.out.println("������ "+ radius + "�� ���� ���̴� " + c.Area() + "�̴�.");  // ��¹�
	}
}

class Circle{
	int radius;
	 public Circle(int radius){
		 this.radius= radius;// ������(radius) �� �ʱ�ȭ
	 }
	
	public double Area() {   
		return radius*radius*3.14;// ���� ���� return (���� ���� = ������*������*3.14)
	}
}