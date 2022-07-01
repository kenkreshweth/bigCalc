//package assignment2;
import java.lang.Math;
import java.util.Scanner;
public class MathOperation {
private static int X,Y;
private double R;
public void init(int X,int Y){
	this.X=X;
	this.Y=Y;
}
public void add()
{
	System.out.println("Add");
	R=X+Y;
}
public void multiply()
{
	System.out.println("Multiplication");
	R=X*Y;
}
public void power()
{
	int f=1;
	System.out.println("Power");
	//R=Math.pow(X,Y);
	for(int i=1;i<=Y;i++)
	{
		f*=X;
	}
	R=f;
}
public void display()
{
	//System.out.println("Power");
	System.out.println("The value is :"+R);
}
public static void main(String[] args)
{
	char choice;
	//Scanner s= new Scanner(System.in);
	MathOperation m= new MathOperation();
	System.out.println("Enter your choice\nA: Addition\nB: Multiplication\nC: Power\n Any number to Exit");
	//choice=s.next().charAt(0);
	choice='A';
	switch(choice){
	
		case 'A':
		{
			System.out.println("Enter the 2 numbers");
			/*X=s.nextInt();
			Y=s.nextInt();*/
			m.init(5, 10);
			m.add();
			m.display();
			break;
		}
		case 'B':
		{
			System.out.println("Enter the 2 numbers");
			/*X=s.nextInt();
			Y=s.nextInt();*/
			m.init(5,10);
			m.multiply();
			m.display();
			break;
		}
		case 'C':
		{
			System.out.println("Enter the 2 numbers");
			/*X=s.nextInt();
			Y=s.nextInt();*/
			m.init(3,2);
			m.power();
			m.display();
			break;
		}
		default: 
			break;
	}
}
}

