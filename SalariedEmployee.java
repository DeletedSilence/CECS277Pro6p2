
public class SalariedEmployee extends Employee{
	private double salary;
	/**
	 * Default constructor
	 */
	public SalariedEmployee(){
		salary = 0;
	}
	/**
	 * overloaded constructor
	 * @param f firstname
	 * @param l lastname
	 * @param s ssn 
	 * @param sal salary
	 */
	public SalariedEmployee(String f, String l,String s, double sal){
		super(f,l,s);
		salary  = sal;
	}
	
	//getters and setters
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * returns the hashcode of each object by calculating the objects attribute values
	 */
	@Override
	public int hashCode() {
		return super.hashCode()+(int)salary;
	}
	/**
	 * determines whether two objects are equal by checking their attributes
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalariedEmployee other = (SalariedEmployee) obj;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	/**
	 * returns the earnings of SalariedEmployee
	 */
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return salary;
	}

	/**
	 * Prints attributes of the Salaried employee class
	 */
	public String toString(){
		return  "SalariedEmployee\n"+super.toString()+"Salary: "+salary+"\n";
	}
	
	
	

}
