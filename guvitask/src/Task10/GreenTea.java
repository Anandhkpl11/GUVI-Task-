package Task10;

public class GreenTea extends Tea{
	
	//Q.no 6

	@Override
	public void prepareTea() {
		// TODO Auto-generated method stub
		
		System.out.println("Green Tea");
		
	}
	
	public static void main(String[] args) {
		
		GreenTea g= new GreenTea();
		g.prepareTea();
		g.addMilk();
		g.addSugar();
	}

}
