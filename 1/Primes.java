import java.util.Scanner;

public class Primes
{
	public static boolean isPrime(int n) 
	{
		for (int i=2; i<n;i++)
		{
			if (n%i==0){ return false;} 
		}
		return true;
	}

	public static void main(String[] args) 
	{
		System.out.println("Введите число для проверки:");
		//Scanner scan= new Scanner(System.in);
		//int n=scan.nextInt();
		for (int i=2;i<=100;i++)
		{
			if (isPrime(i))
			System.out.println(i);
		}
	}

	
}
