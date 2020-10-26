package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Shrek 82");
        System.out.println("Bee Movie 3");
        System.out.println("Wario Land 4 on the Game Boy Advance");
        System.out.println("The Movie");
        System.out.println("Egg");

        short myFirstNumber  = 42;
        byte mySecondNumber = 56;
        System.out.println(myFirstNumber);

        long total = myFirstNumber * mySecondNumber;
        System.out.println(total);

        boolean myBool = false;

        float myFloat = 3.14f;
        double myDouble = 2.71818;

        String favoriteMovie = "Shrek 3";
        String secondFavoriteMovie = "Shrek 2";
        System.out.println("My favorite movie is " + favoriteMovie);

        boolean amICool = true;


        if (amICool) {
            System.out.println("you are cool");
        } else {
            System.out.println("you are not cool");
        }

        int number = 65;

        if (number != 65) {
            System.out.println("Not equals");
        } else {
            System.out.println("Equals");
        }

        int obama = 8;
        int bricks = 5;

        if (obama + bricks >= 10) {
            System.out.println("Greater");
        } else {
            System.out.println("not greater");
        }
        // boolean operators

        // == is equal to
        // ! not
        // != is not equal to
        // && and
        // < > <= >=
        // || or
        // ^ xor

        // thing1 operator thing2
        // 52 == 47     false
        // 52 == 30 + 22     true
        // 52 != 47     true
        // 52 >= 47     true
        // false && true     true
        // false || true     true
        // true ^ true  false

        int potato = 0;

        while (potato < 1000) {
            System.out.println(potato);
            potato = potato + 1;
        }

        for (int potatoTwo = 0; potatoTwo < 1000; potatoTwo = potatoTwo + 1) {
            System.out.println(potatoTwo);
        }
    }
}