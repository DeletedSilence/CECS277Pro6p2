import java.lang.Comparable;
public class Invoice implements Payable, Comparable<Invoice>{
	private String num;
	private String product;
	private int quantity;
	private double amount;
	/**
	 * default constructor
	 */
	public Invoice(){
		num = "";
		product = "";
		quantity = 0;
		amount = 0;
	}
	/**
	 * overloaded constructor
	 * @param n num
	 * @param p product
	 * @param q quantity
	 * @param a amount
	 */
	public Invoice(String n , String p , int q, double a){
		num = n;
		product =p;
		quantity = q;
		amount = a;
	}
	/**
	 * method from interface class payable
	 */
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return (double)quantity*amount;
	}
	//setters and getters

	public String getNum() {
		return num;
	}



	public void setNum(String num) {
		this.num = num;
	}



	public String getProduct() {
		return product;
	}



	public void setProduct(String product) {
		this.product = product;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/**
	 * returns the hashcode of each object by calculating the objects attribute values
	 */
	@Override
	public int hashCode() {
		int result = 1;
		for( int i =0;i<num.length();i++){
			char c = num.charAt(i);
			result += (int)c;
		}
		for( int i =0;i<product.length();i++){
			char l = product.charAt(i);
			result += (int)l;
		}
		result  = result + (int)amount + quantity;
		return result;
	}
	/**
	 * determines whether two objects are equal by checking their attributes
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null||getClass() != obj.getClass())
			return false;
		else{
			Invoice other = (Invoice) obj;
			if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
				return false;
			if (num == null) {
				if (other.num != null)
					return false;
			} else if (!num.equals(other.num))
				return false;
			if (product == null) {
				if (other.product != null)
					return false;
			} else if (!product.equals(other.product))
				return false;
			if (quantity != other.quantity)
				return false;
			return true;
		}
	}
	/**
	 * compares two Invoice objects
	 */
	@Override
	public int compareTo(Invoice i) {
		// TODO Auto-generated method stub
		int a = hashCode();
		int b = i.hashCode();
        if (a == b) return 0;
        else return (a < b) ? -1 : 1;
	}

	/**
	 * Prints attributes from the invoice class
	 */
	@Override
	public String toString() {
		return "Invoice: \nID = " + num + "\nProduct = " + product + "\nQuantity = " + quantity + "\nAmount = " + amount + "\n";
	}
		

}
