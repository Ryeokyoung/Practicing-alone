package elice001;

import java.util.Scanner;

public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("별나무 줄 숫자를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		double line = scan.nextDouble();
		
		String startree = "";
		
		for (int linenum = 1; linenum <= line; linenum++) {
			for (int num = 1; num <= linenum; num++) {
				startree += "*";
			}
			if (linenum <= line-1) {
			startree += "";
		}
			System.out.println(startree);
			
			scan.close();
			}
		
	
	}
}

