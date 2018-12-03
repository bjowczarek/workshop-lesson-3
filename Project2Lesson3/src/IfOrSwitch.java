/**
 * IfOrSwitch
 */
public class IfOrSwitch {
    public static void main(String[] args) {
        /*
         * Exercise 2. Switch could be nested also, you may even put nest IF inside Swich's
         * case. Think about nested switch vs chained if in the following scenario:
         * Retail Company from previous exercise decided that:
         * - every client from 'unknown' category will receive same discount as 'regular' if he/she buys 10 or 15 items. 
         * - every client from 'newsletter_member' category will receive same discount as 'vip' if he/she knows secret password.
         * 
         * Try to implement it in various ways and observe readability of the code.
         * Refer to workshop slides for solution.
         */


        int price = 100;
        String clientType = "unknown";
        int numberOfItems = 9;
        boolean knowSecretPassword = false;

        /*
         * Here write
         */

        System.out.printf("ClientType is '%s' with '%d' items. He/she knows password '%b'. That gives price: '%d'\n", clientType, numberOfItems, knowSecretPassword, price);
    }
}