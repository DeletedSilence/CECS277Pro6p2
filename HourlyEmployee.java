
public class HourlyEmployee extends Employee{
	private double salary;
	private int hours;
	/**
	 * Default constructor
	 */
	public HourlyEmployee(){
		salary = 0;
		hours = 0;
	}
	/**
	 * overloaded constructor
	 * @param f firstname
	 * @param l lastname
	 * @param s ssn 
	 * @param sal salary
	 * @param h hours
	 */
	public HourlyEmployee(String f, String l,String s, double sal , int h){
		super(f,l,s);
		salary  = sal;
		hours = h;
	}
	
	//getters and setters
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getPercentage() {
		return hours;
	}
	public void setPercentage(int h) {
		this.hours = h;
	}
	/**
	 * returns the hashcode of each object by calculating the objects attribute values
	 */
	@Override
	public int hashCode() {
		int result = super.hashCode();
		result+=(int)salary;
		result+=hours;
		return result;
	}
	/**
	 * determines whether two objects are equal by checking their attributes
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj)||getClass() != obj.getClass())
			return false;
		else{
			HourlyEmployee other = (HourlyEmployee) obj;
			if (hours != other.hours)
				return false;
			if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
				return false;
			return true;
		}
	}
	/**
	 * Calculates the total earnings of an hourly employee
	 */
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		double earnings;
		if(hours<=40){
			earnings = hours * salary;
		}
		else{
			earnings = 40*salary+(hours-40)*salary*1.5;
		}
		return earnings;
	}
	/**
	 * Prints attributes of the hourly employee class
	 */
	public String toString(){
		return "HourlyEmployee\n"+super.toString()+"Salary: "+salary+"\n"+"Hours: "+hours+"\n";
	}

}

