public class Task4 {

    public static void main(String[] args) {

        /* Create a 2D array or integer type where you will store odd and even numbers.
         Develop a program which will identify/print the even numbers only. */

        int[][] arr = { {2, 3, 4}, {5, 6, 7}, {8, 9, 10} };

        for (int[] ar: arr) {
            for (int num: ar) {
                if (num%2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
