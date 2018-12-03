public class ClientDiscount {

    public static void main(String[] args) {
        /*
         * Exercise 1. Based on clientType variable which could be 'other',
         * 'newsletter_member', 'regular', 'vip', 'special' calculate price by adding
         * discount to it. It's up to you how big it'll be.
         * 
         * Do it using 3 possible flow control schames: nested if, chained if and
         * switch. Refer to workshop slides for solution.
         */

        int price = 100;
        String clientType = "unknown";
        
         /*
          *  Here write Nested if 
          */

        System.out.printf("\"Nested if\" ClientType is '%s', so price is '%d'\n", clientType, price);
    
        /**************************************************** */
        /**************************************************** */
        /**************************************************** */
        
        price = 47;
        clientType = "vip";

        /*
         * Here write Chainde if
         */

        System.out.printf("\"Chainde if\" ClientType is '%s', so price is '%d'\n", clientType, price);

        /**************************************************** */
        /**************************************************** */
        /**************************************************** */


        price = 163;
        clientType = "newsletter_member";
    
        /*
         * Here write switch
         */

        System.out.printf("\"Switch\" ClientType is '%s', so price is '%d'\n", clientType, price);
    
    }
}