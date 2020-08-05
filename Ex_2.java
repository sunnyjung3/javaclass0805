package board;

public class Ex_2 {
	public static void main(String[] args) {
		
		int lastIndex = 5;
		int[] arr = {1,2,3,4,5};
		
		for(int i = 0; i < lastIndex; i++) {
			System.out.println(arr[i]);
		}
		
		
		for(int j = 1; j < lastIndex - 1; j++) {
			arr[j] = arr[j+1];
		}
		lastIndex--;
		
		for(int i = 0; i < lastIndex; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
}
