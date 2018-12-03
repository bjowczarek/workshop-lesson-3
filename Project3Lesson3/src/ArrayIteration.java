/**
 * ArrayIteration
 */
public class ArrayIteration {

    public static void main(String[] args) {
        /*
         * Exercise 3. Iterate over arrays and print their content Provided listings
         * have errors - fix them.
         * 
         * Look to solution/ directory if stucked.
         */

        // point 1
        System.out.println("################ integerArray ##############");
        int[] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12345 };
        for (int i = 0; i < integerArray.length - 5; ++i) {
            System.out.println("Id " + i + ": " + integerArray[i]);
        }

        // point 2
        System.out.println("################ doubleArray ##############");
        double[] doubleArray = { 1.5, 2d, 3.56, 4.125, 5.09, 6.0, 7d, 8.732 };
        for (int i = 0; i <= doubleArray.length; i++) {
            System.out.println("Id " + i + ": " + doubleArray[i]);
        }

        // point 3
        System.out.println("################ stringArray ##############");
        String[] stringArray = { "one", "two", "three", "four", "five" };
        int id = 0;
        for (String var : stringArray) {
            System.out.println("Id " + id + ": ");
            id++;
        }

        // point 4
        System.out.println("################ booleanArray ##############");
        boolean[] booleanArray = { true, true, true, false, false, true };
        int boolId = 0;
        while (boolId < booleanArray.length) {
            System.out.println("Id " + boolId + ": " + booleanArray[boolId]);
            boolId -= 1;
        }

        // point 5
        System.out.println("################ emptyArray ##############");
        String[] emptyArray = new String[5];
        for (String str : emptyArray) {
            System.out.println("Array item: " + str);
        }
        System.out.println("emptyArray elements are not yet assign!!!!");
        /*
         * point 6 - assign values to emptyArray elements it could be done in loop or
         * manualy: ex. emptyArray[3]="my new element"; emptyArray[3]="3";
         */

        for (String str : emptyArray) {
            System.out.println("Array item: " + str);
        }

    }
}