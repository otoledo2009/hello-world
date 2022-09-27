/***********************************************************************/
/*                                                                     */
/*                          Mary Jane Layfield                         */
/*              CS-320-T1181 Software Test Automation & QA             */
/*                      JUnit Testing Module 3-2                       */
/*                     Professor Omar Toledo, M.S.                     */
/*                          September 18, 2022                         */
/*                    Java Class: ContactService.java                  */
/*                                                                     */
/***********************************************************************/


import java.util.ArrayList;



public class ContactService {
	
	//Declare variables that will be used in ContactService Class.
	public static String id;  //declare the variable for the ID as a static string
	public String firstName; //declare the variable for the First Name as a string
	public String lastName; //declare the variable for the Last Name as a string
	public String phoneNumber; //declare the variable for the Phone Number as a string
	public String address; //declare the variable for the Address as a string
	
	//Declares list to store Contacts in an array.
	public static ArrayList<Contact> contactList = new ArrayList<Contact>(0);
	
	//Create unique ID
	public static String uniqueId() {
		String uniqueId;
		if(contactList.isEmpty()) {
			id = "1000000000";
		}
		else {
			int arraySize = contactList.size();
			id = contactList.get(arraySize - 1).getId();
		}
		int tempId = Integer.valueOf(id);
		tempId += 1;
		uniqueId = Integer.toString(tempId);
		return uniqueId;
	}
	//Create contact list by adding the the arrayList.
	public static void addContact(String fName, String lName,String phone,String address) {
		String ID = uniqueId();
		Contact Contact1 = new Contact(ID, fName, lName, phone,address);
		contactList.add(Contact1);
	}
	//add contact for testing
	public static void addContact(Contact newContact) {
		String tempId = newContact.getId();
		for (int i = 0; i < contactList.size(); i++) {
			if(tempId.equals(contactList.get(i).getId())) {
				throw new IllegalArgumentException("Contant ID must be unique.");
			}
		}
		contactList.add(newContact);	
	}
	//Update First Name field method.
	public static void updateFirstName(String uniqueId,String firstName) {
		for (int i = 0; i  < contactList.size(); i++) {
			if(uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				contactList.get(i).setFirstName(firstName);
			}
		}
	}
	//Update Last Name field method.
		public static void updateLastName(String uniqueId,String lastName) {
			for (int i = 0; i  < contactList.size(); i++) {
				if(uniqueId.compareTo(contactList.get(i).getId()) == 0) {
					contactList.get(i).setLastName(lastName);
				}
			}
		}
		//Update Phone Number field method.
		public static void updatePhoneNumber(String uniqueId,String phoneNumber) {
			for (int i = 0; i  < contactList.size(); i++) {
				if(uniqueId.compareTo(contactList.get(i).getId()) == 0) {
					contactList.get(i).setPhone(phoneNumber);
				}
			}
		}
		//Update Address field method.
		public static void updateAddress(String uniqueId,String address) {
			for (int i = 0; i  < contactList.size(); i++) {
				if(uniqueId.compareTo(contactList.get(i).getId()) == 0) {
					contactList.get(i).setAddress(address);
				}
			}
		}
		//Delete contact for list.
		public static void deleteContact(String uniqueId) {
			//finds in list
			for (int i = 0; i < contactList.size(); i++) {
				if(uniqueId.compareTo(contactList.get(i).getId()) == 0) {
					int location = i; 
					contactList.remove(location); //deletes from list
				}
			}
		}
		//Search for testing
		public static int searchContact(String uniqueId) {
			int result = 0; //initializing variable
			for(int i = 0; i < contactList.size(); i++) {
				if(uniqueId.compareTo(contactList.get(i).getId()) == 0) {
					result = 1;
				}
				else {
					result = 2;
				}
			}
			return result;			
		}
		//Quick Index
		public static int index(String uniqueId) {
			int result = 0;
			for (int i=0; i < contactList.size(); i++) {
				if(uniqueId.compareTo(contactList.get(i).getId()) == 0) {
					result = i;
				}
			}
			return result;
		}
}
