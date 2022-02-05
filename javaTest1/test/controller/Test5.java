package test.controller;

import java.util.Scanner;

/*
 * 키보드로 2개의 정수형 데이터를 입력 받아,
 * 두 수가 모두 1부터 9까지의 수일 때만
 * 두 수의 곱이 한자리 수인지 두자리 수인지를 출력한다. 
 */
public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요. >> ");
		int inputNum1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요. >> ");
		int inputNum2 = sc.nextInt();
		
		int result = inputNum1 * inputNum2;
		
		if((inputNum1 > 0 && inputNum1 < 10) && 
		   (inputNum2 > 0 && inputNum2 < 10)) {
			
			if(result < 10) {
				System.out.println("한자리 수 입니다.");
			}
			else {
				System.out.println("두자리 수 입니다.");
			}
		}
	}
}
