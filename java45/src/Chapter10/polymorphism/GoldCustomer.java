package Chapter10.polymorphism;

public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += price*this.bonusRatio;
		return price -(int)(price*this.saleRatio);
	}
}
