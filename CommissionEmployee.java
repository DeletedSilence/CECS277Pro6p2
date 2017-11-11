
public class CommissionEmployee extends Employee{
	private double sales;
	private double percentage;
	/**
	 * Default constructor
	 */
	public CommissionEmployee(){
		sales = 0;
		percentage = 0;
	}
	/**
	 * overloaded constructor
	 * @param f firstname
	 * @param l lastname
	 * @param s ssn 
	 * @param sal salary
	 * @param p percentage
	 */
	
	public CommissionEmployee(String f, String l,String s, double sal,double p){
		super(f,l,s);
		sales  = sal;
		percentage = p;
	}
	
	//getters and setters
	
	public double getSales() {
		return sales;
	}
	public void setSales(double s) {
		sales = s;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	/**
	 * returns the hashcode of each object by calculating the objects attribute values
	 */
	@Override
	public int hashCode() {
		
		int result = super.hashCode();
		result += (int)sales;
		result += (int)percentage;
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
			CommissionEmployee other = (CommissionEmployee) obj;
			if (Double.doubleToLongBits(percentage) != Double.doubleToLongBits(other.percentage))
				return false;
			if (Double.doubleToLongBits(sales) != Double.doubleToLongBits(other.sales))
				return false;
			return true;
		}
	}
	/**
	 * calculates the earnings of the commission employee class
	 */
	
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return sales*percentage;
	}

	/**
	 * Prints attributes of the Commission employee class
	 */
	public String toString(){
		return  "CommissionEmployee\n"+super.toString()+"Sales: "+sales+"\n"+"Percentage: "+percentage+"\n";
	}

}
