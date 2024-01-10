package Task10;

public class Employee {
	
	//Q.NO: 2
	
	private int Id;
	private String firstName;
	private String lastName;
	private int salary;
	
	 
	// constructor
	public Employee(int id,String firstname,String lastname,int salary) {
		
		this.Id=id;
		this.firstName=firstname;
		this.lastName=lastname;
		this.salary=salary;
		
		
	}


	public int getId() {
		return Id;
	}


	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}


    public String getname() {
		return firstName+" "+lastName;
	
    	
    }

	public int getSalary() {
		return salary;
	}
	
	public void setsalary(int salary) {
		this.salary=salary;
	}
	
	public int Annualsalary() {
		
		return salary * 12;
		
	}

	public int  Raisesalary(double precentage) {
		
		if (precentage >0) {
			double raiseamount=salary *(precentage/100);
			salary +=raiseamount;
			return salary;
			
			
		} else {
			System.out.println("Invalid percentage");
			return salary;

		}
		
	}

	public static void main(String[] args) {
		Employee obj=new Employee(1, "Anandh", "kumar", 25000);
		
		System.out.println("Employee details before salary raise:");
		System.out.println("ID:" + obj.Id);
		System.out.println("Name:" + obj.getname());
		System.out.println("Salary: $" + obj.salary);
		
		obj.Raisesalary(20);
		
		System.out.println("Employee detail after salary raise:");
		System.out.println("ID:" + obj.Id);
		System.out.println("Name:" + obj.getname());
		System.out.println("Salary: $" + obj.salary);
		System.out.println("Anual salary :" + obj.Annualsalary());
	}

}
