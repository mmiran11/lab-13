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
		int [] columnSum = new int [arr[0].length]; //creates an array to hold the sum values
		int columnIndex = 0; //initial column index; outside loop so value will stay updated
		for(int i = 0; i < arr[0].length; i++) //outer loop to cycle through column index
		{
			int sum = 0; //sum in outer loop to reinitialize every column
			for(int rowIndex = 0; rowIndex < arr.length; rowIndex++) //inner loop to cycle through row index; inner loop will complete before going to next iteration of outer loop
				{
					int value = arr[rowIndex][columnIndex]; //creates a variable to store value of current row and column
					sum = sum + value; //updates sum to be the total of the stored values
					columnSum[i] = sum; //fills columnSum array at index i to hold current value of sum; last/final value of sum will be the value for that index in columnSum
				}
			System.out.println("Sum of column " + i + " is " + sum); //prints current column and the final sum for that column
			columnIndex++; //moves to next column
		}
	}

}
