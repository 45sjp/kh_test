package test.controller;

import java.util.Scanner;

/*
 * 키보드로 1개의 정수형(int) 데이터를 입력 받아,
 * 1~100 사이의 값일 때만 2의 배수인지 아닌지를 출력 처리한다.
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 100 사이의 정수를 입력하세요. >> ");
		int inputNum = sc.nextInt();
		
		if(inputNum <= 0 || inputNum > 100) {
			System.out.println("1부터 100 사이의 정수가 아닙니다.");
			return;	
		} else {
			
			if(inputNum % 2 != 0) {
				System.out.println("2의 배수가 아닙니다.");
				return;
			}
			else {
				System.out.println("2의 배수입니다.");
			}
		}
	}
}
