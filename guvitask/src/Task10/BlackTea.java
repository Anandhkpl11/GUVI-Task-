package Task10;

public class BlackTea extends Tea {
	//Q.no 6

	@Override
	public void prepareTea() {
		// TODO Auto-generated method stub
		
		System.out.println("Black tea");
		
	}

	public static void main(String[] args) {
		BlackTea b=new BlackTea();
		b.prepareTea();
		b.addMilk();
		b.addSugar();
	}
}
