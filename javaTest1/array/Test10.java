package array;

/*
 * 2차원 배열에 들어있는 데이터들 중 3의 배수만 골라내서
 * 새로운 1차원 배열에 기록하고 출력한다.
 * 단 중복 값은 하나만 기록되게 한다.
 */
public class Test10 {

	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56},
						 {82, 10, 12, 61},
						 {14, 16, 18, 78},
						 {45, 26, 72, 23}};
		
		int i = 0;
		int j = 0;
		
		int row = array.length;
		int col = array[i].length;
		
		int[] copyAr = new int[row * col];
		int length = 0;
		
		for(i = 0; i < row; i++) {
			
			innerLoop:
			for(j = 0; j < col; j++) {
				
				if(array[i][j] % 3 == 0) {
					
					for(int k = 0; k < copyAr.length; k++) {
						
						if(copyAr[k] == array[i][j]) {
							continue innerLoop;
						}
					}
					copyAr[length++] = array[i][j];
				}
			}
		}
		
		System.out.print("copyAr : ");
		for(i = 0; i < copyAr.length; i++) {
			if(copyAr[i] != 0)
				System.out.print(copyAr[i] + " ");
		}
	}
}
