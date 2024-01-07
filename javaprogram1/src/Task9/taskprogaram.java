package Task9;

public class taskprogaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q.No 1
		
		String k= "malayalam";
		String rev=" " ;
		
		for(int i=k.length()-1;i>=0;i--) {
			  rev=rev+k.charAt(i);
		}
		System.out.println(rev);
		
		if(k.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
			
		}

		 //Q.No 2
		
		String name2="Welcome to GVUI";
		for(int i=name2.length()-1;i>=0;i--) {
			System.out.print(name2.charAt(i));
		}
		
		
		 //Q.No 3
		   
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		
		
		 //Q.No 5
		
		int marks = 78;
		
		if(marks >=99 && marks<=100 ) {
			
			System.out.println("Invalid input");
			
		} else if ( marks >=90 && marks<=99){
			
			System.out.println("Grade A");
			
		} else if ( marks >=80 && marks<=89){
			
			System.out.println("Grade B");
			
		} else if ( marks >=70 && marks<=79){
			
			System.out.println("Grade C");
			
		} else if ( marks >=60 && marks<=69){
			
			System.out.println("Grade D");
			
		} else if ( marks >=50 && marks<=59){
			
			System.out.println("Grade E");
			
		}else {
          
			System.out.println("Grade F");
		}
		
		
		//Q.No 7
		
		int num= 1533;
		int arm=0;
		while(num> 0) {
			int n=num%10;
			arm=arm+(n*n*n);
			num/=10	;				
		}
		if(arm==num) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not a Armstrong number");
		}
		
	}

}
