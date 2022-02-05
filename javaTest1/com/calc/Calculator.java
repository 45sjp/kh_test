package com.calc;

import java.util.Arrays;

/*
 * main의 argument로
 * 1자리 정수형(1부터 9까지만) 값을 2개 입력받아
 * 4칙연산 결과를 출력한다.
 * 입력값은 모두 int 형으로 처리한다.
 */
public class Calculator {
	
	public static void main(String[] args) {
		int inum1 = 0;
		int inum2 = 0;
		
		inum1 = Integer.parseInt(args[0]);
		inum2 = Integer.parseInt(args[1]);
		
		if((inum1 > 0 && inum1 < 10) &&
		   (inum2 > 0 && inum2 < 10)) {
			
			System.out.println("합 : " + (inum1 + inum2));
			System.out.println("차 : " + (inum1 - inum2));
			System.out.println("곱 : " + (inum1 * inum2));
			
			if(inum2 <= 0)
				System.out.println("나누기 : 0");
			else
				System.out.println("나누기 : " + (inum1 / inum2));
		}
	}
}
