
public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double salary;
	//private double bonus;
	/**
	 * default constructor
	 */
	 public BasePlusCommissionEmployee() {
		 super();
	 }
	 /**
		 * overloaded constructor
		 * @param f firstname
		 * @param l lastname
		 * @param s ssn 
		 * @param sal salary
		 * @param p percentage
		 * @param b bonus
		 */
	 public BasePlusCommissionEmployee(String f, String l,String s, double sal,double p,double sa) {
		 super(f,l,s,sa,p);
		 salary = sal;
		 //bonus = b;
	 }
	 //setters and getters
	 public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
	
	 /*public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}*/
	 
	/**
	 * calculates the earnings of the basepluscommission employee class
	 */
	 @Override
		public double getPaymentAmount() {
		 return super.getPaymentAmount()+salary;
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
		else if (!super.equals(obj)||getClass() != obj.getClass())
			return false;
		else{
			BasePlusCommissionEmployee other = (BasePlusCommissionEmployee) obj;
			if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
				return false;
			return true;
		}
	}
	/**
	 * Prints attributes of the BasePlusCommission employee class
	 */

	public String toString(){
			return  "BasePlus"+super.toString()+"Salary: "+salary;
	}


}
