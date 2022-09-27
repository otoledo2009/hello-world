/***********************************************************************/
/*                                                                     */
/*                          Mary Jane Layfield                         */
/*              CS-320-T1181 Software Test Automation & QA             */
/*                      JUnit Testing Module 3-2                       */
/*                     Professor Omar Toledo, M.S.                     */
/*                          September 18, 2022                         */
/*                       Java Class: Contact.java                      */
/*                                                                     */
/***********************************************************************/



public class Contact {
	
	private static String uniqueId; //declare the variable for the ID as a string
	private static String firstName; //declare the variable for the contact first name as a string
	private static String lastName; //declare the variable for the contact last name as a string
	private static String phoneNumber; //declare the variable for the phone number as a string
	private static String address; //declare the variable for the address as a string
	
	
	//Constructor
	public  Contact(String uniqueId, String firstName, String lastName, String phoneNumber, String address) {
		
		//Conditional check for uniqueId of length less than 10 characters
				if(uniqueId == null || uniqueId.length()>10) {
					throw new IllegalArgumentException("Invalid ID");
				}
		//Conditional check for First Name of length less than 10 characters
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		//Conditional check for Last Name of length less than 10 characters
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		//Conditional check for Phone Number of length exactly 10 characters
		if(phoneNumber == null || phoneNumber.length()!=10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		//Conditional check for Address of length less than 30 characters
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		//Identifies the value to be returned for each variable
		Contact.uniqueId = uniqueId;
		Contact.firstName = firstName;
		Contact.lastName = lastName;
		Contact.phoneNumber = phoneNumber;
		Contact.address = address;
	}
	
	
	//GET Method for each variable that will return the value for the variable from the ContactService class.
	public String getId() {
		return uniqueId;
	}
	public  String getFirstName() {
		return firstName;
	}
	public  String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	//Set methods to add contact updates to first name, last name, phone number and address.
	//No method for Id. This is a unique value and will not be updated.
	public void setFirstName(String fName) {
		if(fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("First Name is Invalid.");
		}
		Contact.firstName = fName;
	}
	public void setLastName(String lName) {
		if(lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Last Name is Invalid.");
		}
		Contact.lastName = lName;
	}
	public void setPhone(String newPhone) {
		if(newPhone == null || newPhone.length() > 10) {
			throw new IllegalArgumentException("Phone Number is Invalid.");
		}
		Contact.phoneNumber = newPhone;
	}
	public void setAddress(String newAddress) {
		if(newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException("Address is Invalid.");
		}
		Contact.address = newAddress;
	}

}
