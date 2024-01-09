package Task8;

public class ControlStatement {
	
	
		
		    public static void main(String[] args) {
		    	
		  // Q.No 1  	
		       
  		        int a = 5;
		        int b = 7;
		        int c = 3;
		        int d = 8;
		        
		        if ((a + b) > (c + d)) {
		            System.out.println("The sum of " + a + " and " + b + " is greater than the sum of " + c + " and " + d);
		        }
		        
		    //Q.NO 2
		        
		        int h=10;
		        if (h%2==0) {
		        	System.out.println("Even number ");
		        }else {
		        	System.out.println("odd number");
		        }
		        
		       
		      // Q.No 3
		        
		        for (char ch = 'A'; ch <= 'Z'; ch++) {
                    System.out.print(ch + " ");
                }
		           
		       // Q.No 4   swap
		        
		      int s1= 10;
		      int s2 =20;
		      
		      System.out.println("s1 ="+s1);
		      System.out.println("s2 ="+s2);
		      
		      int s3=s1;
		      s1=s2;
		      s2=s3;
		           
		      System.out.println("s1 ="+s1);
		      System.out.println("s2 ="+s2);     
		        

		    // Q.No 5  prime or not
		      
		      int n= 121;
		      if(n%2!=0) {
		    	  System.out.println("prime number");
		      }else {
		    	  System.out.println("No prime number");
		      }
		      
		      //Q.No 6
		      
		      int s=5;
		      
		      while(a>0) {
		    	  s=s*a;
		    	  a-=1;	 
		    	      
		      }
		      System.out.println(s);
		      
		      
		      // Q.No 7
		       String name="Guvi Geek";
		       System.out.println(name.length());
		        
		       
		    // Q.No 8
		       
		       String name2= "Welcome To GUVI";
		       for(int i =1;i<=10;i++) {
		    	   System.out.println(name2);
		       }
		       
		       
		    // Q.No 9
		       
		       int personage= 61;
		       if (personage>=60) {
		    	   
		    	   System.out.println("You are a senior citizen.");
			} else {
				System.out.println("You are not a senior citizen.");

			}
		       
		       // Q.No 10
		       
		      
		       
		       int count1 =0;
		        while (n > 0) {
		            n = 10;
		            count1++;
		        }
		       System.out.println(count1);
		       
		       
		       
		    }
		
		
		
	}


