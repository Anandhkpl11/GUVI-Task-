package practices1;

import java.util.Scanner;

public class ConstructoreExample{
	
	
	public  ConstructoreExample() {
		int num=100;
		int num1=70;
		System.out.println("Divd value is = "+num/num1);
		
	}
	public  ConstructoreExample(int a,int b) {
		//int num1=a;
		//int num2=b;
		int c=a*b;
		System.out.println("Multiplcation value is = "+c );
		
	}
	
	
	public static void main(String[] args) {
		
		ConstructoreExample obj=new ConstructoreExample();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		ConstructoreExample obj1=new ConstructoreExample(a,b);
		
	}

}
