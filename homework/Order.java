//Ikaia Melton
//Dr.Lixin Lee
//March 17, 2022
//Computes three objects with its relating categories and etc

package homework;

import java.util.Date;

public class Order {

	//Public Int Static Data Field 
	public static final int ON_ORDER = 0;
	public static final int CANCELED = 1;
	public static final int SHIPPED = 2;


	//Private Int Static Data Field of totalOrder
	private static int totalOrder;
	//Private Int Status
	private int status;

	//Private Strings
	private String orderName;
	private String shippingAddress;
	private String phoneNumber;
	private String billingAddress;

	//Private Date
	private Date date;

	//Public Order Constructor 
	public Order (String Name) {

		totalOrder += 1;
		orderName = Name;
		status = ON_ORDER;
		date = new Date( );


	}
	//Public Method Cancel
	public void cancel () {

		date = new Date();

		status = CANCELED;

	}
	//Public Method Ship
	public void ship () {

		date = new Date();

		status = SHIPPED;

	}
	//Set Method For Shipping Address
	public void setShippingAddress (String a) {

		shippingAddress = a;

	}
	//Set Method For Phone Number
	public void setPhoneNumber (String p) {

		phoneNumber = p;

	}
	//Set Method For Billing Address
	public void setBillingAddress (String add) {

		billingAddress = add;
	}

	//Get Method For Total Order
	public int getTotalOrder() {

		return totalOrder;

	}
	//Get Method For Status
	public int getStatus() {

		return status;
	}
	//Get Method For Order Name 
	public String getOrderName () {

		return orderName;
	}
	//Get Method For Date
	public Date getDate () {

		return date;
	}
	//Get Method Shipping Address
	public String getShippingAddress() {

		return shippingAddress;
	}
	//Get Method Phone Number
	public String getPhoneNumber() {

		return phoneNumber;
	}
	//Get Method Billing Address
	public String getBillingAddress() {

		return billingAddress;
	}

	//ToString Method
	public  String toString () {

		System.out.print("Order Name: "); return this.orderName + "| Date: " + this.date + "| Status: " + this.status + "| Shipping Address: " + this.shippingAddress + "| Billing Address: " + this.billingAddress + "| Phone Number: " + this.phoneNumber;


	}
}