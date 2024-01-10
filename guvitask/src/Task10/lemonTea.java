package Task10;

public class lemonTea extends Tea1 {
 
	//Q.no 7
	public lemonTea(String name ) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
   public static void main(String[] args) {
	Tea1[] teas= new Tea1[3];
	
	teas[0]=new Tea1("masala tea");
	teas[1]=new lemonTea(" lemon tea");
	teas[2]=new lemonTea(" green tea");
	
	for (Tea1 tea1 : teas) {
		System.out.println("Tea name: "+tea1.getName());
	}
	
}
}
