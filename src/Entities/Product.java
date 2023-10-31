package Entities;

public class Product {

	protected String nome;
	protected Double price;
	
	public Product(){
		
	}

	public Product(String nome, Double price) {
		
		this.nome = nome;
		this.price = price;
	}

	public String getNome() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	public String pricetag (){
		return nome + " $ " + price; 
	}
	
}
