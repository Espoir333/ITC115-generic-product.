public class lion {
	
	private String name;
	private int x;
	private String descript;
	private double y;
	private int z;


	public lion(String lionName, int code, String lionDescript, double price, int count) {
		name = lionName;
		x = code;
		descript = lionDescript;
		y = price;
		z = count;
	
	}
	
	public String toString() {
		return ("Name: " + name + " Description: " + descript);
	}
	
	public String getPriceFormatted() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.y);
        return formattedPrice;
    }

	 
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}

lionMain.java

public class lionMain {

	public static void main(String[] args) {
		
		lion african  = new lion("African", 5678, "This is a large, tawny yellow lion.", 24.00, 82);
		lion Asian = new lion("Asian", 7623, "This is a reticulated lion.", 36.00, 99);
		
		System.out.println(african.toString());
		System.out.println("Product Code: LN" + african.getX());
		System.out.println("Price: " + african.getPriceFormatted());
		System.out.println("Count: " + african.getZ() + " Available");
		System.out.println();
		System.out.println(asian.toString());
		System.out.println("Product Code: LN" + asian.getX());
		System.out.println("Price: " + asian.getPriceFormatted());
		System.out.println("Count: " + asian.getZ() + " Available");
		
		
	}

}
