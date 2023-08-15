package com.nurse.client;

import java.util.List;
import java.util.Scanner;

import com.nurse.controllers.CustomerController;
import com.nurse.controllers.NurseController;
import com.nurse.entity.Customer;
import com.nurse.entity.Nurse;

public class CustomerClient {

	public static void main(String[] args) {
		int choice = -1;
		int innerChoice = -1;
		
		int custId = 0;
		int nurseId= 0;
		String name = null;
		String email = null;
		String mobileNo = null; 
		String address = null;
		String gender = null;
		
		CustomerController customerController = new CustomerController();
		NurseController nurseController = new NurseController();
		
		Customer customer = null;
		Nurse nurse = null;
		
		Scanner scInput = new Scanner(System.in);
		do{
			System.out.println("Following is the choice:");
			System.out.println("1. Customer");
			System.out.println("2. Nurse");
			System.out.println("3. Services");
			System.out.println("4. Appointment");
			System.out.println("5. Payment");
			System.out.println("0. Exit");
			
			choice = Integer.parseInt(scInput.nextLine());
			
			switch(choice) {
			case 1:
					do {
						System.out.println("Following is the choice:");
						System.out.println("1. Insert Customer");
						System.out.println("2. Update Customer");
						System.out.println("3. Delete Customer");
						System.out.println("4. View single customer");
						System.out.println("5. View all customers");
						System.out.println("0. Exit");
						
						innerChoice = Integer.parseInt(scInput.nextLine());
						
						switch(innerChoice) {
						case 1:
							System.out.print("Enter customer ID: ");
							custId = Integer.parseInt(scInput.nextLine());
							
							System.out.print("Enter name: ");
							name = scInput.nextLine();
							
							System.out.print("Enter email: ");
							email = scInput.nextLine();
							
							System.out.print("Enter mobile number: ");
							mobileNo = scInput.nextLine();
							
							System.out.print("Enter address: ");
							address = scInput.nextLine();
							
							System.out.print("Enter gender: ");
							gender = scInput.nextLine();
							
							customer = new Customer(custId, name, email, mobileNo, address, gender);
		
							customerController.insertCustomer(customer);
							break;
						case 2:
							System.out.print("Enter customer ID: ");
							custId = Integer.parseInt(scInput.nextLine());
							
							System.out.print("Enter name: ");
							name = scInput.nextLine();
							
							System.out.print("Enter email: ");
							email = scInput.nextLine();
							
							System.out.print("Enter mobile number: ");
							mobileNo = scInput.nextLine();
							
							System.out.print("Enter address: ");
							address = scInput.nextLine();
							
							System.out.print("Enter gender: ");
							gender = scInput.nextLine();
							
							customer = new Customer(custId, name, email, mobileNo, address, gender);
		
							customerController.updateCustomer(customer);
							break;
						case 3:
							System.out.print("Enter customer ID: ");
							custId = Integer.parseInt(scInput.nextLine());
							
							customerController.deleteCustomer(custId);
							break;
						case 4:
							System.out.print("Enter customer ID: ");
							custId = Integer.parseInt(scInput.nextLine());
							
							customer = customerController.viewCustomer(custId);
							System.out.println(customer);
							break;
						case 5:
							List<Customer>customers = customerController.viewAllCustomers();
							
							System.out.println("Following is the customer list:");
							
							for(Customer cust : customers) {
								System.out.println(cust);
							}
							break;							
						}
					}while(innerChoice != 0);
					break;
			case 2:
				do {
					System.out.println("Following is the choice:");
					System.out.println("1. Insert Nurse");
					System.out.println("2. Modify Nurse");
					System.out.println("3. Delete Nurse");
					System.out.println("4. View single nurse");
					System.out.println("5. View all nurses");
					System.out.println("0. Exit");
					
					innerChoice = Integer.parseInt(scInput.nextLine());
					
					switch(innerChoice) {
					case 1:
						System.out.print("Enter nurse ID: ");
						nurseId = Integer.parseInt(scInput.nextLine());
						
						System.out.print("Enter name: ");
						name = scInput.nextLine();
						
						System.out.print("Enter mobile number: ");
						mobileNo = scInput.nextLine();
						
						System.out.print("Enter address: ");
						address = scInput.nextLine();
						
						nurse = new Nurse(nurseId, name, mobileNo, address);
	
						nurseController.insertNurse(nurse);
						break;
					case 2:
						System.out.print("Enter nurse ID: ");
						nurseId = Integer.parseInt(scInput.nextLine());
						
						System.out.print("Enter name: ");
						name = scInput.nextLine();
						
						System.out.print("Enter mobile number: ");
						mobileNo = scInput.nextLine();
						
						System.out.print("Enter address: ");
						address = scInput.nextLine();
						
						nurse = new Nurse(nurseId, name, mobileNo, address);
	
						nurseController.updateNurse(nurse);
						break;
					case 3:
						System.out.print("Enter nurse ID: ");
						nurseId = Integer.parseInt(scInput.nextLine());
						
						nurseController.deleteNurse(nurseId);
						break;
					case 4:
						System.out.print("Enter nurse ID: ");
						nurseId = Integer.parseInt(scInput.nextLine());
						
						nurse = nurseController.viewNurse(nurseId);
						System.out.println(nurse);
						break;
					case 5:
						List<Nurse>nurses = nurseController.viewAllNurses();
						
						System.out.println("Following is the nurses list:");
						
						for(Nurse nrse : nurses) {
							System.out.println(nrse);
						}
						break;							
					}
				} while(innerChoice != 0);
				break;
			}
		}while(choice != 0);
		scInput.close();
	}

}
