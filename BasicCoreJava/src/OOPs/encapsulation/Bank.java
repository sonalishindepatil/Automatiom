package OOPs.encapsulation;

public class Bank 
{
	
	private int balance;
    private String customerName;
    
    public int getBalance() {
		return balance;
	}
	public void setBalance(int amt) {
		if (balance>1000)
		{
		this.balance = amt+150;
		}
		else if(balance<=1000)
		{
			this.balance=amt-50;
		}
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	 
}
