package elice001;

import java.util.Scanner;

public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("별나무 줄 숫자를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		double line = scan.nextDouble();
		
		String tree = "";
		
		for (int linenum = 1; linenum <= line; linenum++) {
			for (int num = 1; num <= linenum; num++) {
				tree += "*";
			}
			
			tree += "/n";
		}
			System.out.println(tree);
			
			scan.close();
			}
		
	}

// /n이 사라졌으면 좋겠음.. 
