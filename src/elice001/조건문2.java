package elice001;

import java.util.Scanner;

public class 조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("몇학년인가요(1~6)?");
		Scanner scan = new Scanner(System.in);
		
		double grade = scan.nextDouble();
		
		
		if ((grade == 1)&&(grade >= 5)) {
			System.out.println("햄버거먹기");
			
			//1,5,6학년 햄버거먹기
		
		} else if(grade == 2) {
			System.out.println("피자먹기");
		
		} else {
			System.out.println("짜장면먹기");

		}
		
		scan.close();
	}
}
// 피자먹기만 제대로 됨.. 다 짜장면먹기로 됨.. ㅠ 