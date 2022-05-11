package elice001;

import java.util.Scanner;

public class 조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("피자가게가 열렸나요(y/n)");
		
		Scanner scan = new Scanner(System.in);
		char pizzeria = (char) scan.nextInt();
		
		System.out.println("치킨가게가 열렸나요(y/n)");
		Scanner scan1 = new Scanner(System.in);
		char chicken = (char) scan1.nextInt();
		
		
		if(pizzeria == 'y') {
			System.out.println("피자가게로 가자");
			
		} else if(chicken == 'y') {
			System.out.println("치킨먹으러 가자" );
			
		} else {
			System.out.println("편의점가자");
	}
		scan.close();
		scan1.close();
}

}
//값을 입력하면 error 뜸... 
