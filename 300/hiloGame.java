/*
    hiloGame.java
    Program 305
    Ehan Haque
    10/24/2023
    A game of Hi-Lo.
*/

import java.util.Scanner;

public class hiloGame {
    public static void main(String[] args) {
    
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("______    ______       ________________                  _______                ________________ ");
        System.out.println("|    |    |    |       |              |                  |     |                |              | ");
        System.out.println("|    |    |    |       |_____    _____|                  |     |                |    ______    | ");
        System.out.println("|    |____|    |            |    |         __________    |     |                |    |    |    | ");
        System.out.println("|              |            |    |         |        |    |     |                |    |    |    | ");
        System.out.println("|    ______    |            |    |         |________|    |     |                |    |    |    | ");
        System.out.println("|    |    |    |       _____|    |_____                  |     |_________       |    |____|    | ");
        System.out.println("|    |    |    |       |              |                  |              |       |              | ");
        System.out.println("|____|    |____|       |______________|                  |______________|       |______________| ");
       
        System.out.println("\n\tWelcome to Hi-Lo. The rules are simple:" + 
                           "\n\tThe computer will choose a number between 1-100. It is your job to guess it." + 
                           "\n\tOnce you guess it, it will be the computers turn to guess your number." + 
                           "\n\tOnce both numbers are guessed, the side with least amount of guesses wins.");
                           
        Scanner input = new Scanner(System.in);
        System.out.print("\n\tAre you ready? Type 'Y' to play. -> ");
        char gameStart = input.nextLine().toUpperCase().charAt(0);
        
        while (gameStart != 'Y') {
            System.out.print("\tThat is not a valid input! Try again. -> ");
            gameStart = input.nextLine().toUpperCase().charAt(0);
        }

        int playerGuess;
        int playerGuesses = 1;   
        int playerLastGuess;   
        int compNum = (int)(Math.random() * 100) + 1;

        System.out.print("\t[Computer] I'm thinking of a number between 1-100. What's your guess? -> ");
        playerGuess = input.nextInt();
        playerLastGuess = playerGuess;

        while (playerGuess > 100 || playerGuess < 1) {
            System.out.print("\t[Computer] I said a number between 1-100! Guess again. (This won't count towards your total guesses) -> ");
            playerGuess = input.nextInt();
        }

        while (playerGuess != compNum) {
     
            if (playerGuess < compNum) {
                System.out.print("\t[Computer] Your number is too low! Guess again -> ");
                playerGuess = input.nextInt();
                while (playerGuess < playerLastGuess) {
                    System.out.print("\t[Computer] I said your last number was too low but you entered a lower numnber. Try again (This won't count towards your total guesses) -> ");
                    playerGuess = input.nextInt();
                }
            }
            else {
                System.out.print("\t[Computer] Your number is too high! Guess again -> ");
                playerGuess = input.nextInt();
                while (playerGuess > playerLastGuess) {
                    System.out.print("\t[Computer] I said your last number was too high but you entered a higher numnber. Try again (This won't count towards your total guesses) -> ");
                    playerGuess = input.nextInt();
                }
            }
            while (playerGuess == playerLastGuess) {
                System.out.print("\t[Computer] You already guessed this number. Try again (This won't count towards your total guesses) -> ");
                playerGuess = input.nextInt();
            }
            playerLastGuess = playerGuess;
            playerGuesses++;
        }
        
        System.out.println("\t[Computer] That's right! You got it in " + playerGuesses + " guesses!");

        System.out.print("\t[Computer] Alright. Now it's my turn. Are you ready? Type 'Y' to continue. -> ");
        char gameContinue = input.next().toUpperCase().charAt(0);
        
        while (gameContinue != 'Y') {
            System.out.print("\tThat is not a valid input! Try again. -> ");
            gameContinue = input.next().toUpperCase().charAt(0);
        }

        char compGuessCheck;
        int compLow = 1;
        int compHigh = 100;
        int compGuesses = 1;
        boolean cheatingDetected = false;

        int compGuess = (compHigh + compLow) / 2;
        System.out.println("\n\n\t[Computer] I guess " + compGuess + ".");
        System.out.println("\t\t  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.");
        System.out.print("\t\t\t\t\t");
        compGuessCheck = input.next().toUpperCase().charAt(0);

        while (compGuessCheck != 'L' && compGuessCheck != 'Y' && compGuessCheck != 'H') {
            System.out.print("\tThat is not a valid input! Try again. -> ");
            compGuessCheck = input.next().toUpperCase().charAt(0);
        }
        
        while (compGuessCheck != 'Y') {
            
            if (compGuesses >= 7)
                {
                    cheatingDetected = true;
                    break;
                }
            
            if (compGuessCheck == 'L') {
                compGuesses++;
                compLow = compGuess + 1;
            }
            else {
                compGuesses++;
                compHigh = compGuess - 1;
                
            }
            
            if (compHigh == 0)
                {
                    cheatingDetected = true;
                    break;
                }

            compGuess = (compHigh + compLow) / 2;
            System.out.println("\n\n\t[Computer] I guess " + compGuess);
            System.out.println("\t\t  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.");
            System.out.print("\t\t\t\t\t");
            compGuessCheck = input.next().toUpperCase().charAt(0);

            while (compGuessCheck != 'L' && compGuessCheck != 'Y' && compGuessCheck != 'H') {
                System.out.print("\tThat is not a valid input! Try again. -> ");
                compGuessCheck = input.next().toUpperCase().charAt(0);
            }
        }

        if (cheatingDetected == false) {
            System.out.println("\t[Computer] Yay! I got it in " + compGuesses + " guesses!");

            System.out.print("\n\tYou got it in " + playerGuesses + " guesses and the computer got it in " + compGuesses + " guesses.");
            if (playerGuesses == compGuesses)
                System.out.println(" It's a tie! Computer wins.");
            else if (playerGuesses > compGuesses)
                System.out.println(" Computer has less guesses! Computer wins.");
            else
                System.out.println(" You have less guesses! You win.");
        }
        else {
            System.out.println("\t[Computer] Cheating detected. I win!");
        }
        input.close();
    }
}

/*
______    ______       ________________                  _______                ________________ 
|    |    |    |       |              |                  |     |                |              | 
|    |    |    |       |_____    _____|                  |     |                |    ______    | 
|    |____|    |            |    |         __________    |     |                |    |    |    | 
|              |            |    |         |        |    |     |                |    |    |    | 
|    ______    |            |    |         |________|    |     |                |    |    |    | 
|    |    |    |       _____|    |_____                  |     |_________       |    |____|    | 
|    |    |    |       |              |                  |              |       |              | 
|____|    |____|       |______________|                  |______________|       |______________| 

        Welcome to Hi-Lo. The rules are simple:
        The computer will choose a number between 1-100. It is your job to guess it.
        Once you guess it, it will be the computers turn to guess your number.
        Once both numbers are guessed, the side with least amount of guesses wins.

        Are you ready? Type 'Y' to play. -> s
        That is not a valid input! Try again. -> y
        [Computer] I'm thinking of a number between 1-100. What's your guess? -> 101
        [Computer] I said a number between 1-100! Guess again. (This won't count towards your total guesses) -> 50
        [Computer] Your number is too high! Guess again -> 25
        [Computer] Your number is too low! Guess again -> 33
        [Computer] Your number is too high! Guess again -> 29
        [Computer] That's right! You got it in 4 guesses!
        [Computer] Alright. Now it's my turn. Are you ready? Type 'Y' to continue. -> b
        That is not a valid input! Try again. -> y


        [Computer] I guess 50.
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        d
        That is not a valid input! Try again. -> h


        [Computer] I guess 25
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        h


        [Computer] I guess 12
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 18
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        h


        [Computer] I guess 15
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 16
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        y
        [Computer] Yay! I got it in 6 guesses!

        You got it in 4 guesses and the computer got it in 6 guesses. You have less guesses! You win.


______    ______       ________________                  _______                ________________ 
|    |    |    |       |              |                  |     |                |              | 
|    |    |    |       |_____    _____|                  |     |                |    ______    | 
|    |____|    |            |    |         __________    |     |                |    |    |    | 
|              |            |    |         |        |    |     |                |    |    |    | 
|    ______    |            |    |         |________|    |     |                |    |    |    | 
|    |    |    |       _____|    |_____                  |     |_________       |    |____|    | 
|    |    |    |       |              |                  |              |       |              | 
|____|    |____|       |______________|                  |______________|       |______________| 

        Welcome to Hi-Lo. The rules are simple:
        The computer will choose a number between 1-100. It is your job to guess it.
        Once you guess it, it will be the computers turn to guess your number.
        Once both numbers are guessed, the side with least amount of guesses wins.

        Are you ready? Type 'Y' to play. -> y
        [Computer] I'm thinking of a number between 1-100. What's your guess? -> 40
        [Computer] Your number is too low! Guess again -> 50
        [Computer] Your number is too low! Guess again -> 60
        [Computer] Your number is too low! Guess again -> 70
        [Computer] Your number is too low! Guess again -> 80
        [Computer] Your number is too low! Guess again -> 90
        [Computer] Your number is too low! Guess again -> 100
        [Computer] Your number is too high! Guess again -> 99
        [Computer] Your number is too high! Guess again -> 92
        [Computer] Your number is too low! Guess again -> 94
        [Computer] Your number is too low! Guess again -> 95
        [Computer] Your number is too low! Guess again -> 96
        [Computer] Your number is too low! Guess again -> 97
        [Computer] Your number is too low! Guess again -> 98
        [Computer] That's right! You got it in 14 guesses!
        [Computer] Alright. Now it's my turn. Are you ready? Type 'Y' to continue. -> y


        [Computer] I guess 50.
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 75
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 88
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 94
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 97
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 99
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 100
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l
        [Computer] Cheating detected. I win!


______    ______       ________________                  _______                ________________ 
|    |    |    |       |              |                  |     |                |              | 
|    |    |    |       |_____    _____|                  |     |                |    ______    | 
|    |____|    |            |    |         __________    |     |                |    |    |    | 
|              |            |    |         |        |    |     |                |    |    |    | 
|    ______    |            |    |         |________|    |     |                |    |    |    | 
|    |    |    |       _____|    |_____                  |     |_________       |    |____|    | 
|    |    |    |       |              |                  |              |       |              | 
|____|    |____|       |______________|                  |______________|       |______________| 

        Welcome to Hi-Lo. The rules are simple:
        The computer will choose a number between 1-100. It is your job to guess it.
        Once you guess it, it will be the computers turn to guess your number.
        Once both numbers are guessed, the side with least amount of guesses wins.

        Are you ready? Type 'Y' to play. -> y
        [Computer] I'm thinking of a number between 1-100. What's your guess? -> 50
        [Computer] Your number is too high! Guess again -> 25
        [Computer] Your number is too high! Guess again -> 12
        [Computer] Your number is too low! Guess again -> 18
        [Computer] Your number is too high! Guess again -> 15
        [Computer] Your number is too low! Guess again -> 17
        [Computer] That's right! You got it in 6 guesses!
        [Computer] Alright. Now it's my turn. Are you ready? Type 'Y' to continue. -> y


        [Computer] I guess 50.
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 75
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 88
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        y
        [Computer] Yay! I got it in 3 guesses!

        You got it in 6 guesses and the computer got it in 3 guesses. Computer has less guesses! Computer wins.

______    ______       ________________                  _______                ________________ 
|    |    |    |       |              |                  |     |                |              | 
|    |    |    |       |_____    _____|                  |     |                |    ______    | 
|    |____|    |            |    |         __________    |     |                |    |    |    | 
|              |            |    |         |        |    |     |                |    |    |    | 
|    ______    |            |    |         |________|    |     |                |    |    |    | 
|    |    |    |       _____|    |_____                  |     |_________       |    |____|    | 
|    |    |    |       |              |                  |              |       |              | 
|____|    |____|       |______________|                  |______________|       |______________| 

        Welcome to Hi-Lo. The rules are simple:
        The computer will choose a number between 1-100. It is your job to guess it.
        Once you guess it, it will be the computers turn to guess your number.
        Once both numbers are guessed, the side with least amount of guesses wins.

        Are you ready? Type 'Y' to play. -> y
        [Computer] I'm thinking of a number between 1-100. What's your guess? -> 50
        [Computer] Your number is too low! Guess again -> 75
        [Computer] That's right! You got it in 2 guesses!
        [Computer] Alright. Now it's my turn. Are you ready? Type 'Y' to continue. -> y


        [Computer] I guess 50.
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 75
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        y
        [Computer] Yay! I got it in 2 guesses!

        You got it in 2 guesses and the computer got it in 2 guesses. It's a tie! Computer wins.

______    ______       ________________                  _______                ________________ 
|    |    |    |       |              |                  |     |                |              | 
|    |    |    |       |_____    _____|                  |     |                |    ______    | 
|    |____|    |            |    |         __________    |     |                |    |    |    | 
|              |            |    |         |        |    |     |                |    |    |    | 
|    ______    |            |    |         |________|    |     |                |    |    |    | 
|    |    |    |       _____|    |_____                  |     |_________       |    |____|    | 
|    |    |    |       |              |                  |              |       |              | 
|____|    |____|       |______________|                  |______________|       |______________| 

        Welcome to Hi-Lo. The rules are simple:
        The computer will choose a number between 1-100. It is your job to guess it.
        Once you guess it, it will be the computers turn to guess your number.
        Once both numbers are guessed, the side with least amount of guesses wins.

        Are you ready? Type 'Y' to play. -> y
        [Computer] I'm thinking of a number between 1-100. What's your guess? -> 50
        [Computer] Your number is too high! Guess again -> 40
        [Computer] Your number is too low! Guess again -> 30
        [Computer] I said your last number was too low but you entered a lower numnber. Try again (This won't count towards your total guesses) -> 45
        [Computer] Your number is too high! Guess again -> 46
        [Computer] I said your last number was too high but you entered a higher numnber. Try again (This won't count towards your total guesses) -> 40
        [Computer] Your number is too low! Guess again -> 40
        [Computer] You already guessed this number. Try again (This won't count towards your total guesses) -> 44
        [Computer] That's right! You got it in 5 guesses!
        [Computer] Alright. Now it's my turn. Are you ready? Type 'Y' to continue. -> y


        [Computer] I guess 50.
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        h


        [Computer] I guess 25
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 37
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 43
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.

l


        [Computer] I guess 46
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        l


        [Computer] I guess 48
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        h


        [Computer] I guess 47
                  'L' : Too Low.  |  'Y' : Correct.  |  'H' : Too high.
                                        y
        [Computer] Yay! I got it in 7 guesses!

        You got it in 5 guesses and the computer got it in 7 guesses. You have less guesses! You win.
 */

