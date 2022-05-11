package elice001;

import java.util.Scanner;

public class 조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("몇 등인가요?");
		
		/*Scanner scan = new Scanner(System.in);//scanner 객체, 'system in' 자바의 표준 입력 스트림 
		//읽은 바이트를 문자,정수,실수, 문자열 등 다양한 타입으로 변환하여 리턴하는 클래스 */
		
		Scanner scan = new Scanner(System.in);
		
		Double rank =scan.nextDouble();
				
		if( rank == 1 ) {
			System.out.println("TV를 보며 편하게 쉬세요");
			
		} else if(rank == 2){
			System.out.println("설거지당첨!");
		} else {
			System.out.println("나머지당첨!");
		}
		
		scan.close();
	}

}
//pass! 
