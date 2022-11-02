import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {

        //Write a java program to find the second largest number in the array?

        int largest = 0;
        int secondLargest = 0;

        int[] arr = {2, 4, 3, 6, 8, 90, 34, 67};

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > largest) {
               secondLargest = largest;
               largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        //System.out.println(largest);
        System.out.println(secondLargest);

    }
}
