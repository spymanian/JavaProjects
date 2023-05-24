public class GuessingGame{

    public static void main (String[] args) {
        int n = ((int) Math.random() * 1000) + 1;
        int guess = 0;
        while(guess != n){
            StdOut.print("What's your guess?");
            guess = StdIn.readInt();
            if (guess == n){
                StdOut.println("You win!");
            }
            if (guess < n){
                StdOut.println("Too Low!");
            }
            if (guess > n){
                StdOut.println("Too High!");

            }
        }
        
        
        }
    }