package Chapter6;

import java.security.SecureRandom;
public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status {
        CONTINUE, WON, LOST
    };
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_EVEN = 11;
    private static final int BOX_CARS = 12;
    public static int rollDie() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
    public static void main(String[] arge) {
        int myPoint = 0;
        Status gameStatus;
        int SumOfDice = rollDie();
        switch (SumOfDice) {
            case SEVEN:
            case YO_EVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = SumOfDice;
                System.out.printf("My point is  %d%n", myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE) {
            SumOfDice = rollDie();
            if (SumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (SumOfDice == SEVEN) {
                gameStatus = Status.LOST;
            }
        }
        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }
    }
}
