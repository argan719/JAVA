package TermProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		for(;;)
		{
			System.out.println();
			System.out.println("**** ȯ���մϴ�. PIcar ���α׷��Դϴ�. ****");
			System.out.println();
			System.out.println("1.�ڵ��� ����  2.�ڵ��� ����  3.���α׷� ����");
			System.out.println();
			System.out.print("���� => ");
			int category = keyboard.nextInt();

			if(category == 1) {
				Car.car();
			    System.out.println("===========================================");
			}
			else if(category == 2) Register.register();
			else if (category == 3) {System.out.println("���α׷��� ����Ǿ����ϴ�. ���� ���α׷��� �̿����ּż� �����մϴ�."); break;}
			else { System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �ѹ� �Է����ֽñ� �ٶ��ϴ�."); }

		}
	}
}
