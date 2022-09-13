import java.util.Random;
import java.util.Scanner;
class Game
{
	static int score=0;
	public static void Start_Game()
	{
		Random random=new Random();
		int x = random.nextInt(101);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your guess :");
		int guess=sc.nextInt();
		if(guess==x)
		{
			System.out.println("Guessed number is correct");
			score++;
		}
		else
		{
			System.out.println("Guessed number is incorrect");
		}
	}	
	public static void Show_Score()
	{
		System.out.println("Your score is :"+score);
	}	
	public static void main(String args[])
	{
		int ch;
	do
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1 for Starting the game");
	System.out.println("Enter 2 for Showing the score");
	System.out.println("Enter 3 for exit");
	System.out.print("Enter choice :");
	 ch = sc.nextInt();
	switch(ch)
	{
		case 1:
		Start_Game();
		break;
		case 2:
		Show_Score();
		break;
		case 3:
		System.out.println("exit from game");
		break;
		default:
		System.out.println("Incorrect choice");
		break;
	}
	}while(ch!=3);
	}
}
	