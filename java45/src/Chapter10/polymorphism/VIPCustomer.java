package Chapter10.polymorphism;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRaio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRaio = 0.2;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += price*this.bonusRatio;
		return price -(int)(price *this.saleRaio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "[담당 상담원 번호 : " + this.agentID +"]";
	}
}
