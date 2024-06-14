
public class Vehicle {
	
	private String type;
	private int size;
	private int price;
	private int count; // to determine the number of car
	
	public Vehicle(String type, int size, int price){
		this.type = type;
		this.size = size;
		this.price = price;
		this.count = 0;
	}
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getCount() {
		return count;	
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void increment() {
		count++;
	}

	
	
	

}
