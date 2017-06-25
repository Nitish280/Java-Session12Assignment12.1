//here we are creating the class array
public class Array {
	// here we are creating the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here we are Applying the try block
		try {
			// here Declaring two array arr & arr1 of length 10 & 9 respectively
			int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

			int arr1[] = new int[9];
			// here we are Applying the for loop
			for (int i = 0; i < arr.length; i++) {
				// here we copying the element of array arr into array arr1
				arr1[i] = arr[i];
				System.out.println("print the copied array" + arr[i]);
			}
		}
		// Applying catch block to catch the exception
		catch (ArrayIndexOutOfBoundsException aioobe) {
			// printing out the exception message
			System.out.println("we can not store 10 elements in a array of  size 9 ");
		}
	}

}
