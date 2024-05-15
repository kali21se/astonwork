package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BasketballPlayer lebron = new BasketballPlayer("Lebron James", 39, 2.06);
        lebron.say();
        lebron.say("Good luck to you!");
        System.out.println("Is it December 30th today?");
        String checker = scan.next();
        if(checker.equals("Yes"))
            lebron.setAge(40);
        lebron.displayInfo();

        SoccerPlayer ronaldo = new SoccerPlayer("Christiano Ronaldo", 31, "Real Madrid");
        ronaldo.displayInfo();
        ronaldo.clubName = "Al-Nassr";
        ronaldo.setAge(39);
        ronaldo.displayInfo();
        ronaldo.say();
        ronaldo.say("I am a best player in the world!");
    }
}
