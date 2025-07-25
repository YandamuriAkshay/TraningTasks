public class Topic10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8 , 9}};
		System.out.println("Transpose");
		for (int i =0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
					System.out.println(matrix[j][i] + " ");
				}
				System.out.println();
			}
		}
}
