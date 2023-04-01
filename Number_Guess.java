import java.util.*;
public class Number_Guess
{
	public static void main( String abc[] )
	{
		System.out.println("Welcome to the Number guessing game!");
		System.out.println("I am thinking of a number between 0-1000");
		System.out.println("-------------");
		System.out.println("");
		Random a = new Random();
		HashSet<Integer> guessed=new HashSet<Integer>();
		int rand = a.nextInt(1000);
		int nog , guess , warning ; // nog = no of guesses
		nog = 10 ;
		warning = 2 ;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Guess : " ) ;
		guess=sc.nextInt();
		while(nog!=0)
		{
			if(guess==rand)
			{
				System.out.println(" Your Guess is Correct");
				System.out.println("        You Won!!!      ");
				break;
			}
			if(guess!=rand) 
			{

				guessed.add(guess);
				nog--;
				System.out.println("You're Guess is Incorrect ");
				System.out.println("You have tries left : " + nog );
				System.out.println("Guessed Numbers : " + guessed );
				System.out.println("");
				if(guess<rand)
				{
					System.out.println("guess is small");
				}
				if(guess>rand)
				{
					System.out.println("guess is large");
				}
				System.out.println("");
				System.out.print(" Enter Guess : " );
				guess=sc.nextInt();
				System.out.println("---------");
				for( Integer bc : guessed )
				{	
					if(guess==bc)
					{
						warning--;
						System.out.println("Repeated");
						System.out.println("You have " + warning +" warning left");
						
					}	
				}
				if(warning==0)
				{
					System.out.println("So. ");
					System.out.println("Game Over!");
					System.out.println(" The Number to be Guessed was : " + rand );
					break;
				}
			}
		}
		if( nog==0 )
		{
			System.out.println(" Game Over !");
			System.out.println(" The Number to be Guessed was : " + rand );
		}
		
	}
}