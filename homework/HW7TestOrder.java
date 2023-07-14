//Ikaia Melton
//Dr.Lixin Lee
//March 17, 2022
//Computes three objects with its relating categories and etc

package homework;

public class HW7TestOrder {

	public static void main(String[] args) {


		//First Object w/ the No-Argument Constructor One PC
		Order o1 = new Order("One PC");
		o1.cancel();


		//Second Object Using the Constructor with Arguments Two Cars
		Order o2 = new Order("Two Cars");
		o2.setShippingAddress("91 Oliverio Drive");
		o2.setBillingAddress("255 Counts Lane");
		o2.setPhoneNumber("(620)-562-5212");
		o2.ship();


		//Third Object w/ the No-Argument Constructor Three Basket
		Order o3 = new Order("Three Baskets");
		o3.setShippingAddress("123 Ave Street");
		o3.setPhoneNumber("(999)-999-9999");
		o3.setBillingAddress("67 North Lane");


		//Print Everything Out as Referenced 
		System.out.println("Order 2's Name: " + o2.getOrderName() +  "\r\n"
				+ "Order 3's Date: " + o3.getDate() + "\r\n"
				+ "Order 2's Status: " + o2.getStatus() + "\r\n"
				+ "Order 3's Shipping Address: " + o3.getShippingAddress() + "\r\n"
				+ "Order 2's Billing Address: " + o2.getBillingAddress() + "\r\n"
				+ "Order 3's Number: " + o3.getPhoneNumber() + "\r\n"
				+ "The number of orders is: " + o3.getTotalOrder());


		System.out.println(o1.toString());
		System.out.println(o2.toString());
		System.out.println(o3.toString());


	}

}
