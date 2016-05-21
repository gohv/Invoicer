package invoiceto.invoicer;

public class Receiver {
	
	private String name;
	private String address;
	//unique identification code:
	private int eikNumber;
	private final String IN_TAX_NUMBER = "BG";
	
	public Receiver(String name, String address, int eikNumber) {
		super();
		this.name = name;
		this.address = address;
		this.eikNumber = eikNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getEikNumber() {
		return eikNumber;
	}
	public void setEikNumber(int eikNumber) {
		this.eikNumber = eikNumber;
	}

	public String getIN_TAX_NUMBER() {
		return IN_TAX_NUMBER;
	}
	@Override
	public String toString() {
		return "Issuer [name=" + name + ", address=" + address + ", eikNumber=" + eikNumber + ", IN TAX NUMBER="
				+ IN_TAX_NUMBER + eikNumber + "]";
	}
	
	
	
	

}
