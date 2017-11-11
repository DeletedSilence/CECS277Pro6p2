import java.lang.Comparable;

public abstract class Employee implements Payable, Comparable<Employee>{
	private String firstname;
	private String lastname;
	private String ssn;
	/**
	 * default constructor
	 */
	public Employee(){
		firstname = "Jane";
		lastname = "Doe";
		ssn = "000-00-000";
	}
	/**
	 * overloaded constructor
	 * @param f
	 * @param l
	 * @param s
	 */
	public Employee(String f, String l, String s){
		firstname=  f;
		lastname = l;
		ssn = s;
	}
	//setters and getters
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	/**
	 * returns the hashcode of each object by calculating the objects attribute values
	 */
	@Override
	public int hashCode() {
		int result = 0;
		for( int i =0;i<firstname.length();i++){
			char c = getFirstname().charAt(i);
			result += (int)c;
		}
		for( int i =0;i<lastname.length();i++){
			char l = getLastname().charAt(i);
			result += (int)l;
		}
		for(int i =0; i<ssn.length();i++){
			char s = getSsn().charAt(i);
			result+=(int)s;
		}
		return result;
	}
	/**
	 * determines whether two objects are equal by checking their attributes
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else if (obj == null||getClass() != obj.getClass())
			return false;		
		else {
			Employee other = (Employee) obj;
			if (firstname == null) {
				if (other.firstname != null)
					return false;
			} else if (!firstname.equals(other.firstname))
				return false;
			if (lastname == null) {
				if (other.lastname != null)
					return false;
			} else if (!lastname.equals(other.lastname))
				return false;
			if (ssn == null) {
				if (other.ssn != null)
					return false;
			} else if (!ssn.equals(other.ssn))
				return false;
			return true;
		
		}
	}
	/**
	 * compares two objects 
	 * @param employee object to compare with
	 * @return integer value that determines whether it is less,greater, or equal to object
	 */
	@Override
    public int compareTo(Employee employee)
    {
		int a = hashCode();
		int b = employee.hashCode();
        if (a == b) return 0;
        else return (a < b) ? -1 : 1;
    }

	//abstract double earnings();
	/**
	 * Prints attributes of the employee class
	 */
	@Override
	public String toString() {
		return "Firstname: " + firstname + " \nLastname: " + lastname + "\nSSN: " + ssn + "\n";
	}
	

}
