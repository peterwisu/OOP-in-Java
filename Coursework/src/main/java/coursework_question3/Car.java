package coursework_question3;

import java.text.DecimalFormat; 

/**Car.java
 * 
 * This class define an attribute of a car in a constructor and validate its value.
 * 
 * @author Wish Suharitdamrong
 *
 */

public class Car {

	//The identical number(ID) of a car.
	private int id=0;
	//The name of a car.
	private String name=null;
	//the color of a car.
	private String colour=null;
	//The reserve price of a car
	private double reservePrice=0;
	//The type of gear box of a car.
	private CarType gearbox=null;
	//The type of body of a car.
	private CarBody body=null;
	//The number of seats available in a car.
	private int numberOfSeats =0;
	//The conditions of a car.
	private Condition condition=null;
	//The type of sale of a car
	private SaleType saletype=null;
	/**
	 * Constructor 
	 * 
	 * @param id 			ID no. of a car.
	 * @param name 			The name of a model of an car.
	 * @param reservePrice 	The price of a car.
	 * @param condition 	The condition of the car
	 * @throws IllegalArgumentException
	 */
	public Car(int id ,String name ,double reservePrice, Condition condition,SaleType saletype ) throws IllegalArgumentException{
		super();
		/** Validation **/
		//Check the value of an input parameter is in incorrect format or not. 
		if(id<0 || reservePrice<0 || name ==null) {
			
			//if the condition is true means the value is in incorrect format and will throw IllegalArgumentException.
			throw new IllegalArgumentException();
		}else  {
			
			//if the condition is false means the value of input parameters is in correct format and range and will be initialize.
			this.id =id;
			this.name = name;
			this.reservePrice = reservePrice;
			this.condition = condition;
			this.saletype =saletype;
			
		}
	}
	
	/**
	 * 
	 * @param colour  Color of a car.
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	/**
	 * 
	 * @param gearbox The type of gear box.
	 */
	public void setGearbox(CarType gearbox) {
		this.gearbox = gearbox;
	}
	
	/**
	 * 
	 * @param body 	Type of the body.
	 */
	public void setBody(CarBody body) {
		this.body = body;
	}

	/**
	 * 
	 * @param numberOfSeats  No. of the seat in the car.
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	/**
	 * 
	 * @return The ID of the car
	 */
	public int getID() {
		return id;
	}

	/**
	 * 
	 * @return Name of the car.
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return The reserve price of the car
	 */
	public double getPrice() {
		return reservePrice;
	}
	
	/**
	 * 
	 * @return	The color of the car
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * 
	 * @return The type of the gear box.
	 */
	public CarType getGearbox() {
		return gearbox;
	}

	/**
	 * 
	 * @return The Body style of the car
	 */
	public CarBody getBodyStyle() {
		return body;
	}

	/**
	 * 
	 * @return The number of seats of the car.
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	

	
	/**
	 * 
	 * @return The sale tyor of the car.
	 */
	public SaleType getType() {
		return saletype;
	}

	/**
	 * 
	 * @return The specification of a car in the String format
	 */
	public String displayCarSpecification() {
		
		//DecimalFormat is use to format a second decimal place example 1.00.
		DecimalFormat seconddecimalplace =new DecimalFormat(".00");
		//StringBuffer used to store a details of a car
		StringBuffer displayCarSpec = new StringBuffer();
		
		//Add a car details to StringBuffer displayCarSpec
		displayCarSpec.append(this.toString()+" (£"+seconddecimalplace.format(reservePrice)+")\n");
		displayCarSpec.append("	 Type: "+this.gearbox+"\n");
		displayCarSpec.append("	 Style: "+this.body+"\n");
		displayCarSpec.append("	 Colour: "+this.colour+"\n");
		displayCarSpec.append("	 No. of Seats: "+this.numberOfSeats+"\n");
		displayCarSpec.append("	 Condition: "+this.condition);
		
		//Convert StringBuffer to String Literals
		return displayCarSpec.toString();
	}

	/**
	 * @return The ID and name of car in a format "ID - name".
	 */
	@Override
	public String toString() {
		return this.id+" - "+this.name;
	}



	
	
	
	
}
