package number_guessing_game;
import java.util.Scanner;
public class NumberGuessingGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Let's play the Number Guessing Game");
		System.out.println("Press any key to start");
		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		char begin = start.charAt(0);
		one(8);
		two(89);
		two(56);
		three(359);
		three(809);
		three(618);
		four(5115);
		four(3963);
		four(1984);
		four(2201);
		five(62526);
		five(76800);
		five(45105);
		five(15723);
		five(50586);
		
		System.out.println("Congratulations!!!!!   You beat the game");
		System.out.println("Thanks for playing");
	}
	
	private static void one(int i) {
		// TODO Auto-generated method stub
		System.out.println("Guess the 1 digit number");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		//incorrect guesses
		while(x!=i)
		{	
			//must be a positive integer
			if(x < 0)
			{
				System.out.println("Number must be a positive integer.  Try again");
				x = input.nextInt();
			}
			
			//must be 1 digit
			else if(x>9)
			{
				System.out.println("Number must be 1 digit.  Try again");
				x = input.nextInt();
			}
			
			//guess is too high
			else if(x > i)
			{
				System.out.println("Lower");
				x = input.nextInt();
			}
			
			//guess is too low
			else if(x > -1 && x < i)
			{
			
				System.out.println("Higher");
				x = input.nextInt();
			}
		}
		
			//correct guess
			System.out.println("You got it.  Press any key to continue");
			Scanner scan = new Scanner(System.in);
			String next = scan.next();
			char proceed = next.charAt(0);
	}
	
	private static void two(int i) {
		// TODO Auto-generated method stub
		System.out.println("Guess the 2 digit number");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		//incorrect guesses
		while(x!=i)
		{
			//must be a positive integer
			if(x < 0)
			{
				System.out.println("Number must be a positive integer.  Try again");
				x = input.nextInt();
			}
			
			//must be 2 digits
			else if(x < 10  || x > 99)
			{
				System.out.println("Number must be 2 digits.  Try again");
				x = input.nextInt();
			}
			
			//guess is too high
			else if(x >i)
			{
				System.out.println("Lower");	
				x = input.nextInt();
			}
			
			//guess is too low
			else if(x > 9 && x < i)
			{
				System.out.println("Higher");
				x = input.nextInt();
			}
		}
		
			//correct
			System.out.println("You got it.  Press any key to continue");
			Scanner scan = new Scanner(System.in);
			String next = scan.next();
			char proceed = next.charAt(0);
	}
	
	private static void three(int i) {
		// TODO Auto-generated method stub
		System.out.println("Guess the 3 digit number");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		//incorrect guesses
		while(x!=i)
		{	
			//must be a positive integer
			if(x < 0)
			{
				System.out.println("Number must be a positive integer.  Try again");
				x = input.nextInt();
			}
			
			//must be 3 digits
			else if(x < 100 || x > 999)
			{
				System.out.println("Number must be 3 digits.  Try again");
				x = input.nextInt();
			}
			
			//guess is too high
			else if(x >i )
			{
				System.out.println("Lower");	
				x = input.nextInt();
			}
			
			//guess is too low
			else if(x > 99 && x < i)
			{
				System.out.println("Higher");
				x = input.nextInt();
			}
			
		}
		
			//correct
			System.out.println("You got it.  Press any key to continue");
			Scanner scan = new Scanner(System.in);
			String next = scan.next();
			char proceed = next.charAt(0);	
	}
	
	private static void four(int i) {
		// TODO Auto-generated method stub
		System.out.println("Guess the 4 digit number");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		//incorrect guesses
		while(x!=i)
		{
			
			//must be a positive integer
			if(x < 0)
			{
				System.out.println("Number must be a positive integer.  Try again");
				x = input.nextInt();
			}
			
			//must be 4 digits
			else if(x < 1000 || x > 9999)
			{
				System.out.println("Number must be 4 digits.  Try again");
				x = input.nextInt();
			}
			
			//guess is too high
			else if(x >i )
			{
				System.out.println("Lower");	
				x = input.nextInt();
			}
			
			//guess is too low
			else if(x > 999 && x < i)
			{
				System.out.println("Higher");
				x = input.nextInt();
			}
			
		}
		
			//correct
			System.out.println("You got it.  Press any key to continue");
			Scanner scan = new Scanner(System.in);
			String next = scan.next();
			char proceed = next.charAt(0);
	}
	
	private static void five(int i) {
		// TODO Auto-generated method stub
		System.out.println("Guess the 5 digit number");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		//incorrect guesses
		while(x!=i)
		{
			//must be a positive integer
			if(x < 0)
			{
				System.out.println("Number must be a positive integer.  Try again");
				x = input.nextInt();
			}
			
			//must be 5 digits
			while(x < 10000 || x > 99999)
			{
				System.out.println("Number must be 5 digits.  Try again");
				x = input.nextInt();
			}	
			
			//guess is too high
			if(x >i )
			{
				System.out.println("Lower");	
				x = input.nextInt();
			}
			
			//guess is too low
			else if(x > 9999 && x < i)
			{
				System.out.println("Higher");
				x = input.nextInt();
			}
			
		}
		
			//correct
			System.out.println("You got it.  Press any key to continue");
			Scanner scan = new Scanner(System.in);
			String next = scan.next();
			char proceed = next.charAt(0);
	
	}
	
	
}

