package issuer.invoicer;

public class Issuer {
	
	private String name;
	private String address;
	//unique identification code:
	private int eikNumber;
	private final String IN_TAX_NUMBER = "BG";
	private String iban;
	private String bicCode;
	private String bankName;	

	public Issuer(String name, String address, int eikNumber, String iban, String bicCode, String bankName) {
		super();
		this.name = name;
		this.address = address;
		this.eikNumber = eikNumber;
		this.iban = iban;
		this.bicCode = bicCode;
		this.bankName = bankName;
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
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getBicCode() {
		return bicCode;
	}
	public void setBicCode(String bicCode) {
		this.bicCode = bicCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIN_TAX_NUMBER() {
		return IN_TAX_NUMBER;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Issuer [name=" + name + ", address=" + address + ", eikNumber=" + eikNumber + ", IN TAX NUMBER="
				+ IN_TAX_NUMBER + eikNumber + ", iban=" + iban + ", bicCode=" + bicCode + ", bankName=" + bankName + "]";
	}
	

}
