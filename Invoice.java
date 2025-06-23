package ques2;

class Pices{
	private String part_number;
	private String decsription;
	private int purchesed;
	private double price;

public Pices(String part_number, String decsription, int purchesed, double price) {
		this.part_number = part_number;
		this.decsription = decsription;
		if(purchesed < 0)
			this.purchesed=0;
		else
			this.purchesed = purchesed;
		if(price < 0.0)
			this.price=0.0;
		else
			this.price = price;
	}

public String getPart_number() {
	return part_number;
}

public void setPart_number(String part_number) {
	this.part_number = part_number;
}

public String getDecsription() {
	return decsription;
}

public void setDecsription(String decsription) {
	this.decsription = decsription;
}

public int getPurchesed() {
	return purchesed;
}

public void setPurchesed(int purchesed) {
	if(purchesed < 0)
		this.purchesed=0;
	else
		this.purchesed = purchesed;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	if(price < 0.0)
		this.price=0.0;
	else
		this.price = price;
}

public double getAmountprice() {
	return purchesed*price;
}
public void displayInvoice() {
		System.out.println("Part Number:"+part_number);
		System.out.println("Description:"+decsription);
		System.out.println("Quantity:"+purchesed);
		System.out.println("Part time Price:"+price);
	}

}
public class Invoice {
	public static void main(String[] args) {
	Pices p =new Pices("A01","pooja",-1,1200.0);
	p.displayInvoice();
	
	System.out.println("Total amount invoice is " +p.getAmountprice());
	
	}
}


