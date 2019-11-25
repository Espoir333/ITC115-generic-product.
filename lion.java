public class snake {
	
	private String name;
	private int x;
	private String descript;
	private double y;
	private int z;


	public snake(String snakeName, int code, String snakeDescript, double price, int count) {
		name = snakeName;
		x = code;
		descript = snakeDescript;
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

snakeMain.java

public class snakeMain {

	public static void main(String[] args) {
		
		snake anaconda = new snake("Anaconda", 5678, "This is a large, green snake.", 24.00, 82);
		snake python = new snake("Python", 7623, "This is a reticulated snake.", 36.00, 99);
		
		System.out.println(anaconda.toString());
		System.out.println("Product Code: SNK" + anaconda.getX());
		System.out.println("Price: " + anaconda.getPriceFormatted());
		System.out.println("Count: " + anaconda.getZ() + " Available");
		System.out.println();
		System.out.println(python.toString());
		System.out.println("Product Code: SNK" + python.getX());
		System.out.println("Price: " + python.getPriceFormatted());
		System.out.println("Count: " + python.getZ() + " Available");
		
		
	}

}
