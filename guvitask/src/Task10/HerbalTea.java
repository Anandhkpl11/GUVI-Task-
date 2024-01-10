package Task10;

public class HerbalTea extends Tea {
	
	//Q.no 6

	@Override
	public void prepareTea() {
		// TODO Auto-generated method stub
		
		System.out.println("Herbal Tea");
		
	}
    
	public static void main(String[] args) {
		HerbalTea h=new HerbalTea();
		h.prepareTea();
		h.addMilk();
		h.addSugar();
		
	}
}
