package Entities;

import java.time.LocalDate;

public class UsedProduct extends Product {

	private LocalDate manufateDate;
	
	
	
	public UsedProduct(){
	super();	
	}



	public UsedProduct(String name, Double price, LocalDate manufateDate) {
		super(name, price);
		this.manufateDate = manufateDate;
	}



	public LocalDate getManufateDate() {
		return manufateDate;
	}



	public void setManufateDate(LocalDate manufateDate) {
		this.manufateDate = manufateDate;
	}
	
	
	@Override
	public String pricetag (){
		return nome + " (Used)"  + " $ " + price + " (Data de Fabricação: " + manufateDate + ")"; 
	}
	
}


