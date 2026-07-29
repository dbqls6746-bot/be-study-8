package be_study.quiz.quiz52;

import java.util.List;

public class Quiz52 {
	
	public static class UserDTO{
		int id;
		String name;
		List<ContactSDTO> contacts;
		AddressDTO address;
		List<OrdersDTO> orders;
	}
	
	public static class ContactSDTO{
		String type;
		String value;
	}
	
	public static class AddressDTO{
		String street;
		String city;
		String zipcode;
	}
	
	public static class OrdersDTO{
		String orderId;
		String date;
		List<ItemsDTO> items;
	}
	
	public static class ItemsDTO{
		int id;
		String name;
		int quantity;
	}
}
