package practices1;

interface Blue{
	
	void bike();
	void auto();
	
}

interface red extends Blue {
	
	void car();
	void bus();
	
}

abstract class green implements red{
	
	abstract void fight();
	
}

class colors extends green {

	@Override
	public void car() {
		// TODO Auto-generated method stub
		System.out.println("car method");
	}

	@Override
	public void bus() {
		// TODO Auto-generated method stub
		System.out.println("bus method");
	}

	@Override
	public void bike() {
		// TODO Auto-generated method stub
		System.out.println("bike method");
	}

	@Override
	public void auto() {
		// TODO Auto-generated method stub
		System.out.println("auto method");
		
	}

	@Override
	void fight() {
		// TODO Auto-generated method stub
		System.out.println("flight method");
		
	}

	
		
	}
	


 public class exampleinterface {
	 
	public static void main(String[] args) {
		 colors obj=new colors();
	      obj.car();
	      obj.auto();
	      obj.bike();
	      obj.bus();
	      obj.fight();
	}

}
 

