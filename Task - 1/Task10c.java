public class Task10c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 3, 8, 1, 2};
		
		for (int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
				}
			}
		}
		
		for (int n : arr)
			System.out.println(n + " ");
	}

}
