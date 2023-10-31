package Entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	
	public ImportedProduct(){
		super();
	}


	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


	public Double getCustomsFee() {
		return customsFee;
	}


	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String pricetag (){
		return nome + " $ " + (price+customsFee) + "(Custms fee: $ " + customsFee + ")";
	}
	
	
	
	
	
	
}
