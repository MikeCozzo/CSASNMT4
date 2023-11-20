import java.util.ArrayList;


public class MusicalInstrument {
	private String name;
	private String type;
	private int numberOfKeysorStrings;
	private double prices;

	
	


	
	final String UNKNOWNNAME = "UNKNOWNNAME";
	final String UNKNOWNTYPE = "UNKNOWNTYPE";
	final int UNKNOWNKEYSORSTRINGS = -1;
	final int UNKNOWNPRICE = -9;
	final int LOWERKEYSORSTRINGS = -1;
	final double LOWERPRICE = 1;
	
	
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public int getNumberofKeysorStrings() {
		return numberOfKeysorStrings;
	}
	public double getprices() {
		return prices;
	}
	
	public void setName(String name) {
	if (name.equals(null))
		this.name = UNKNOWNNAME;
	else if (name.equals(""))
		this.name = UNKNOWNNAME;
	else {
		this.name = name;
	}}
	
	public void setType(String type) {


		if (type.equals(null))
			this.type = UNKNOWNTYPE;
		else if (type.equals(""))
			this.type = UNKNOWNTYPE;
		else {
			this.type = type;
		}}
		
		//if (type.equals("brass")) {
		//this.type = type;
	//	}else if (type.equals("woodwind")) {
	//	this.type = type;
	//}else if (type.equals("string")) {
	//	this.type = type;
	//}else if (type.equals("percussion")) {
	//	this.type = type;
	//}else if (type.equals("keyboard")) {
	//	this.type = type;
	//}else {
	//	this.type = "UNKNOWNTYPE";
	//}}
	public void setnumberOfKeysorStrings(int number) {
		if (number > 100)
			this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
		else if (number < 0)
			this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
		else {
			this.numberOfKeysorStrings = number;
		}}
	
	public void setprice(int price) {
		if (price <= 0)
			this.prices = UNKNOWNPRICE;
		else if (price > 0)
			this.prices = price;
		else {
			this.prices = price;
		}}
		
	//public void setType(String type) {
	//	 this.type = type;
	//}
//	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
	//	this.numberOfKeysorStrings = numberOfKeysorStrings;
	//}
	public MusicalInstrument() {
		getName();
		getType();
		getNumberofKeysorStrings();
		//setType(UNKNOWNTYPE);
		setName(UNKNOWNNAME);
		setnumberOfKeysorStrings(101);
	}
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
		this.type = type;
		this.name = name;
		this.numberOfKeysorStrings = numberOfKeysorStrings;
	}
	public MusicalInstrument(double lowerprice, int lowerkey) {
		this.prices = lowerprice;
		this.numberOfKeysorStrings = lowerkey;
		
	}

	
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings, double lowerprice) {
		this.type = type;
		type = type.toLowerCase();
		this.name = name;
		name = name.toLowerCase();
		this.numberOfKeysorStrings = numberOfKeysorStrings;
		this.prices = lowerprice;
	}
		
		public String toString() {
			return "MusicalInstrument [name=" + name + ", type=" + type + ", numberOfKeysorStrings=" + numberOfKeysorStrings+ ", price=" + prices + "]";
		
	}

	//	for (int oh = 0; oh <= mia.length; oh++) {
		//	System.out.println(mia[oh]);
		//}
		   }
	
	//public String getName() {
//	//	return name;
//	}
	//public void setName(String name) {
//		this.name = name;
//	}
	//public String getType() {
	//	return "nfakn";
	//}
	//public void setType(String type) {
	//	this.type = type;
	//}
	//public int getNumberOfKeysorStrings() 
	//{
	//	return numberOfKeysorStrings;
	//}
//	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
		//this.numberOfKeysorStrings = numberOfKeysorStrings;
//		MusicalInstrument myObj = new MusicalInstrument();
	
