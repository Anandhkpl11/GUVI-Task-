package practices1;

class calculation{
	
	
	int number1;
	int number2;
	int result;
	
	public void add() {     // Normal void
		result =number1+number2;
       System.out.println("addition value is ="+result);
		
	}
  
	
	public int sub() {     // return method
		result =number1-number2;
		System.out.println("subraction value is  ="+ result);
		return result;
	}
	public static void multi() { // static method sub class
		
		int num1=50;
		int num2=80;
		int result;
		
		result= num1*num2;
		
		System.out.println("The Multiplcation value is ="+ result);
		
	}
	
	
}


public class examplemethods {
	
	
	public static void Welcome() { //main class static method
		
		System.out.println("Welcome to GUVI");
		
	}
	
	
	public static void main(String[] args) {
		calculation k=new calculation();
		k.number1=100;
		k.number2=80;
		k.add();
		k.sub();
		calculation.multi();
		
		Welcome();
		
		
	}

}
