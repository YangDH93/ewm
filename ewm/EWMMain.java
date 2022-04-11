package ewm;

import java.util.Scanner;

import yangMenu.Yang;

public class EWMMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Menu m = null;

		while(true) {
			System.out.print("1.오늘 뭐 먹지?(say 양동훈)\n2.오늘 뭐 먹지?(say 방지훈)"
					+ "\n3.오늘 뭐 먹지?(say 최지원)\n4.오늘 뭐 먹지?(say 예린홍)\n5.뽑기 시작\n>>> ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: { // 오늘 뭐 먹 양동훈
				m = new Yang();
				m.menu();
			}break; 
			case 2: { // 오늘 뭐 먹 방지훈

			}break;
			case 3: { // 오늘 뭐 먹 최지원

			}break;
			case 4: { // 오늘 뭐 먹 예린홍

			}break;

			}
			if(choice == 5) break;

		}// while문 종료 
		int num = (int) (Math.random()*4+1);
		System.out.println(num + "번 당첨~!");
		sc.close();
	}
}