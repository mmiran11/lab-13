import java.util.Scanner;
public class Sum_Column {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[][] array = new int[3][4];
		for (int row = 0; row < array.length; row++) //outer loop is current row
		{
			for (int column = 0; column < array[0].length; column++) //inner loop is current column
			{
				int values; //variable to hold user values
				System.out.print("Enter a value: "); //prompt for matrix values
				values = scan.nextInt(); //the inputed value
				array[row][column] = values; //accessing current row index and assign value to current column index
			}
		}
		System.out.println("The entered matrix: ");
		for (int[] row : array) //for each array in the matrix (which the rows represent)
		{
		   for (int column : row) //for which column the current row is in
		   {
		        System.out.print(column + " "); //prints out value in current row and column
		   }
		   System.out.println(); //prints a new line after current array/row has its values printed
		}
		sumColumn(array);
	}
	
	public static void sumColumn(int[][] arr) 
	{
		 // try creating an array to store sums; then create a loop to print values
		int [] columnSum = new int [4];
		for(int j = 0; j < arr[0].length; j++) 
		{
			int sum = 0;
			for(int i = 0; i < arr.length; i++)
			{
				int firstVal = arr[i][0];
				sum = sum + firstVal;
				System.out.println("sum in column " + j + " are " + sum);
				columnSum[j] = sum;
			}
			System.out.println("Column Sum is " + columnSum[j]);
		}
	}

}
