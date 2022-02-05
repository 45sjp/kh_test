package array;

/*
 * 배열에 들어있는 데이터 중 홀수의 값들을 출력하고 합을 구한다.
 * 단, continue를 이용하여 작성한다.
 */
public class Test7 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		double sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(i % 2 == 0)
				continue;
			else sum += i;
		}
		System.out.println("홀수값들의 합계 : " + sum);
	}
}
