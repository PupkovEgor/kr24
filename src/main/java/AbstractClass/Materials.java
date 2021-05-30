package AbstractClass;

public abstract class Materials {
	String name;
	 String price;
	 
	public String getName() {
	       return name;
	   }
	public String getPrice() {
	       return price;
	   }
	
	
	public abstract void setName(String name);
	public abstract void setPrice(String price);
}
