import java.util.Scanner;
public class FindNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int Ocount = 0;
		int Ecount = 0;
		for(int i = m+1; i <= n; i++)
			
		{
			if(i % 2 == 0)
			 Ecount++;
			else
			 Ocount++;
			}
		        System.out.println("no of Even count is "+Ecount);
				System.out.println("no of odd count is "+Ocount);
			}
				
		

	}


