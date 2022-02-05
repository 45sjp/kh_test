package array;

/*
 * 2차원 배열에 들어있는 데이터들의 합계와 평균을 구한다.
 */
public class Test8 {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56},
						  {82, 10, 12, 61},
						  {14, 16, 18, 78},
						  {45, 26, 72, 23}};
		
		double sum = 0;
		double avg = 0;
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = sum / count;
		
		System.out.printf("합계 : %.1f%n"
						+ "평균 : %.3f", sum, avg);
	}
}
