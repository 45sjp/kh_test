package test.controller;

/*
 * 1부터 100까지의 모든 정수들의
 * 합과 평균을 구하는 프로그램을 작성한다.
 * 단, while문이나 do while문을 이용하여 작성한다.
 */
public class Test3 {
	
	public static void main(String[] args) {
		int i = 1;
		double sum = 0;
		double avg;
		
		do {
			sum += i;
			avg = sum / i;
			i++;
			
		} while(i > 0 && i < 101);
		
		
		System.out.printf("합계 : %.0f%n"
						+ "평균 : %.1f", sum, avg);
	}
}
