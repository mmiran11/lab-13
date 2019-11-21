import java.util.Scanner;
public class Locate_Largest {

	public static void main(String[] args) {
		  int matrix[][] = new int[3][4];
	        fillMatrix(matrix);
	        System.out.print("The entered matrix: ");
	        for (int row = 0; row < matrix.length; row++) {
	            for (int col = 0; col < matrix[row].length; col++) {
	                System.out.print(matrix[row][col] + " ");
	            }
	        }
	        System.out.println();
	        int largestNumIndex[] = locateLargest(matrix);
	        System.out.println("First largest value is located at row " +
	                largestNumIndex[0] + " and column " + largestNumIndex[1]);
	   }

	    public static int[] locateLargest(int[][] matrix) {
	        int index[] = {0, 0};
	        for (int row = 0; row < matrix.length; row++) {
	            for (int col = 0; col < matrix[row].length; col++) {
	                if (matrix[row][col] > matrix[index[0]][index[1]]) {
	                    index[0] = row;
	                    index[1] = col;
	                }
	            }
	        }
	        return index;
	    }

	    public static void fillMatrix(int[][] matrix) {

	        Scanner scan = new Scanner(System.in);
	        for (int row = 0; row < matrix.length; row++) {
	            System.out.print("Enter " + matrix[row].length + " numbers separated by space for row " + (row + 1) + ": ");
	            for (int col = 0; col < matrix[row].length; col++) {
	                matrix[row][col] = scan.nextInt();
	            }
	        }
	    }
}
