package laba4;

public abstract class Materials {
	String name;
	 String price;
	 
	public String getName() {
	       return name;
	   }
	public String getPrice() {
	       return price;
	   }
	
	//абстрактные методы
	public abstract void setName(String name);
	public abstract void setPrice(String price);
}
