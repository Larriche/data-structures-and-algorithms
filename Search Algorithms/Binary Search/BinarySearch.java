import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
	/**
	 * Run binary search on a set of number inputs
	 * 
	 * @param  args Array of command line arguments
	 */
	public static void main(String[] args)
	{
		int length;
		int[] numbers;
		Scanner in = new Scanner(System.in);

		System.out.println("How many numbers are you entering?");
		length = in.nextInt();
		numbers = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.println("Enter number:");
			numbers[i] = in.nextInt();
		}

		Arrays.sort(numbers);

        while (true) {
			System.out.println("Enter number to search for: ");
			int key = in.nextInt();
			int location = BinarySearch.search(numbers, key);

			if (location < 0) {
				System.out.println("The number was not found");
			} else {
				System.out.println("Found the number at index " + location);
			}
        }
	}

	/**
	 * Implementation of binary search 
	 * Assumes given array is sorted
	 * 
	 * @param numbers Array to search
	 * @param key     Number to search for
	 */
	public static int search(int[] numbers, int key)
	{
		int low = 0;
        int high = numbers.length - 1;

	    while (low <= high) {
	        int mid = low + ((high - low) / 2);
	        int midVal = numbers[mid];

	        if ( key < midVal) {
	        	high = mid - 1;
	        } else if (key > midVal) {
	        	low = mid + 1;
	        } else {
	        	return mid;
	        }
	    }
        
        // No match found
        return -1; 
	}
}