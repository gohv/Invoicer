package invoice.invoicer;

import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class Invoice {

	private int invoiceID = 000000001;
	private String issueAddress;
	private boolean isDebit;
	private boolean isCredit;
	private HashMap<Integer, String> service = new HashMap<>();
	private double unitPrice;
	private int quantity;
	private double totalPriceOfEachUnit;
	private String totalPriceInWords;
	private double totalPriceOfallServices;
	private boolean includeTax;
	private String receiverName;
	private Date duePaymentDate;
	private Date issueDate;
	private boolean payCash;
	private boolean payBank;
	private String nameOfIssuer;
	
	
private double maxValue;
	
	public double calculateMaxValue(int quantity, double unitPrice){
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	maxValue = this.quantity * this.unitPrice; 
		return maxValue;
	}
	
	public void setService(Integer number, String service){
		this.service.put(number, service);
	}
	public HashMap<Integer, String> getService(){
		return this.service;
	}
	
	public void invoiceIncrement(){
		invoiceID++;
	}

	public int getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}

	public String getIssueAddress() {
		return issueAddress;
	}

	public void setIssueAddress(String issueAddress) {
		this.issueAddress = issueAddress;
	}

	public boolean isDebit() {
		return isDebit;
	}

	public void setDebit(boolean isDebit) {
		this.isDebit = isDebit;
	}

	public boolean isCredit() {
		return isCredit;
	}

	public void setCredit(boolean isCredit) {
		this.isCredit = isCredit;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPriceOfEachUnit() {
		return totalPriceOfEachUnit;
	}

	public void setTotalPriceOfEachUnit(double totalPriceOfEachUnit) {
		this.totalPriceOfEachUnit = totalPriceOfEachUnit;
	}

	public String getTotalPriceInWords() {
		return totalPriceInWords;
	}

	public void setTotalPriceInWords(String totalPriceInWords) {
		this.totalPriceInWords = totalPriceInWords;
	}

	public double getTotalPriceOfallServices() {
		return totalPriceOfallServices;
	}

	public void setTotalPriceOfallServices(double totalPriceOfallServices) {
		this.totalPriceOfallServices = totalPriceOfallServices;
	}

	public boolean isIncludeTax() {
		return includeTax;
	}

	public void setIncludeTax(boolean includeTax) {
		this.includeTax = includeTax;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public Date getDuePaymentDate() {
		return duePaymentDate;
	}

	public void setDuePaymentDate(Date duePaymentDate) {
		this.duePaymentDate = duePaymentDate;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public boolean isPayCash() {
		return payCash;
	}

	public void setPayCash(boolean payCash) {
		this.payCash = payCash;
	}

	public boolean isPayBank() {
		return payBank;
	}

	public void setPayBank(boolean payBank) {
		this.payBank = payBank;
	}

	public String getNameOfIssuer() {
		return nameOfIssuer;
	}

	public void setNameOfIssuer(String nameOfIssuer) {
		this.nameOfIssuer = nameOfIssuer;
	}

}
