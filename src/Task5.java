public class Task5 {

    public static void main(String[] args) {

        /*
         * Create a 2D array of integers. Develop a program which will calculate the sum
         * of even and odd numbers for that array.
         */

        int [][] arr = { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} };

        int evenSum = 0;
        int oddSum = 0;

        for (int[] ar: arr) {
            for (int num: ar) {
                if (num%2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            }
        }

        System.out.println("Odd Sum " + oddSum);
        System.out.println("Even Sum " + evenSum);
    }
}
