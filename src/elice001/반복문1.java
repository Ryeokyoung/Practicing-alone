package elice001;

import java.util.Scanner;

public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println("식권이 몇 장 필요한가요?");
		
		try (Scanner scan = new Scanner(System.in)) {
			double ticket = scan.nextDouble();
			
			for(int num = 1; num <= ticket; num = num +1) {
				System.out.println("[식권]#" + num);
			}
		}
	}

}
//pass! 