public class Task3 {

    public static void main(String[] args) {

        /* Create a 2D array of integer values. Print the sum of all numbers */

        int [][] arr = {

                {5, 10, 15},
                {20, 25, 30},
                {35, 40}
        };

        int sum = 0;
        for(int[] ar:arr) {

            for(int num:ar) {
                sum+=num;
            }
        }
        System.out.println(sum);
    }
}
