/**
 * DummySongGenerator
 */
public class DummySongGenerator {

    public static void main(String[] args) {

        /*
         * Exercise 4. Based on: https://books.trinket.io/thinkjava/chapter5.html ex5
         * 
         * 
         * The purpose of this exercise is to take a problem and break it into smaller
         * problems, and to solve the smaller problems by writing simple methods.
         * Consider the first verse of the song “99 Bottles of lemoniade”:
         * 
         * "99 bottles of lemoniade on the wall, 99 bottles of lemoniade, ya’ take one
         * down, ya’ pass it around, 98 bottles of lemoniade on the wall." Subsequent
         * verses are identical except that the number of bottles gets smaller by one in
         * each verse, until the last verse:
         * 
         * "No bottles of lemoniade on the wall, no bottles of lemoniade, ya’ can’t take
         * one down, ya’ can’t pass it around, ’cause there are no more bottles of
         * lemoniade on the wall!" And then the song (finally) ends.
         * 
         * Write a program that displays the entire lyrics of “99 Bottles of lemoniade”.
         * Your program should include a recursive method that does the hard part, but
         * you might want to write additional methods to separate other parts of the
         * program. As you develop your code, test it with a small number of verses,
         * like 3.
         */

        String[] songLines = { " bottles of lemoniade on the wall", " bottles of lemoniade",
                "ya’ take one down, ya’ pass it around\n" };
        String endVerse = "No bottles of lemoniade on the wall,\nno bottles of lemoniade,\nya’ can’t take one down, ya’ can’t pass it around,\n’cause there are no more bottles of lemoniade on the wall!";
        int verseNumber = 3;

        for (; verseNumber > 0; verseNumber--) {
            for (int i = 0; i < songLines.length; i++) {
                if (i != 2) {
                    System.out.println(verseNumber + songLines[i]);
                } else {
                    System.out.println(songLines[i]);
                }

            }
        }
        System.out.println(endVerse);
    }
}