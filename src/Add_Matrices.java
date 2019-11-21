import java.util.Scanner;
public class Add_Matrices {

		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[][] A = new int[3][3];
	        int[][] B = new int[3][3];
	        System.out.println("Enter first matrix");
	        for(int i = 0; i < 3; ++i) {
	            for(int j = 0; j < 3; ++j) {
	                A[i][j] = in.nextInt();
	            }
	        }
	        System.out.println("Enter second matrix");
	        for(int i = 0; i < 3; ++i) {
	            for(int j = 0; j < 3; ++j) {
	                B[i][j] = in.nextInt();
	            }
	        }
	        System.out.println("Matrix A:");
	        for(int i = 0; i < 3; ++i) {
	            for (int j = 0; j < 3; ++j) {
	                System.out.print("  " + A[i][j]);
	            }
	            System.out.println();
	        }
	        System.out.println("Matrix B:");
	        for(int i = 0; i < 3; ++i) {
	            for (int j = 0; j < 3; ++j) {
	                System.out.print("  " + B[i][j]);
	            }
	            System.out.println();
	        }
	        int[][] C = Addition(A, B);

	        System.out.println("A + B:");
	        for(int i = 0; i < 3; ++i) {
	            for (int j = 0; j < 3; ++j) {
	                System.out.print("  " + C[i][j]);
	            }
	            System.out.println();
	        }
	    }
		
		 public static int[][] Addition(int[][] A, int[][] B) {
		        int[][] C = new int[A.length][];
		        for(int i = 0; i < A.length; ++i) {
		            C[i] = new int[A[i].length];
		            for(int j = 0; j < A[i].length; ++j) {
		                C[i][j] = A[i][j] + B[i][j];
		            }
		        }
		        return C;
		    }

	}