import java.util.Scanner;
public class SwapToTwoNumber {

	public static void main(String[] args) {
		int x,y,temp;
		System.out.println("Enter two values of x and y");
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y= sc.nextInt();
		System.out.println("Before Swapping"  + x +  + y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping:"  +x +    y);

	}

}
