/***********************************************************************/
/*                                                                     */
/*                          Mary Jane Layfield                         */
/*              CS-320-T1181 Software Test Automation & QA             */
/*                      JUnit Testing Module 3-2                       */
/*                     Professor Omar Toledo, M.S.                     */
/*                          September 18, 2022                         */
/*                JUnit Test: ContactServiceTest.java                  */
/*                                                                     */
/***********************************************************************/


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ContactServiceTest {
	
	//Test creation of a contact and the values.
	@Test
	void testContactService() {
		ContactService.addContact("Trixi","Franklin","1234512345","155 Abby Lane");
		int size = ContactService.contactList.size();
		String id = ContactService.contactList.get(size-1).getId();
		assertTrue(ContactService.contactList.get(0).getId().equals(id));
		assertTrue(ContactService.contactList.get(0).getFirstName().equals("Trixi"));
		assertTrue(ContactService.contactList.get(0).getLastName().equals("Franklin"));
		assertTrue(ContactService.contactList.get(0).getPhoneNumber().equals("1234512345"));
		assertTrue(ContactService.contactList.get(0).getAddress().equals("155 Abby Lane"));
	}
	//Check Update First Name
	@Test
	void testUpdateFirstName() {
		ContactService.addContact("Trixi","Franklin","1234512345","155 Abby Lane");
		int size = ContactService.contactList.size();
		String id = ContactService.contactList.get(size-1).getId();
		ContactService.updateFirstName(id, "Suzie");
		assertTrue(ContactService.contactList.get(size-1).getFirstName().equals("Suzie"));
	}
	
	//Check Update Last Name
	@Test
	void testUpdateLastName() {
		ContactService.addContact("Trixi","Franklin","1234512345","155 Abby Lane");
		int size = ContactService.contactList.size();
		String id = ContactService.contactList.get(size-1).getId();
		ContactService.updateLastName(id, "Smith");
		assertTrue(ContactService.contactList.get(size-1).getLastName().equals("Smith"));
	}
	//Check Update Phone number
	@Test
	void testUpdatePhoneNumber() {
		ContactService.addContact("Trixi","Franklin","1234512345","155 Abby Lane");
		int size = ContactService.contactList.size();
		String id = ContactService.contactList.get(size-1).getId();
		ContactService.updatePhoneNumber(id, "9876543212");
		assertTrue(ContactService.contactList.get(size-1).getPhoneNumber().equals("9876543212"));
	}
	//Check Update Address
	@Test
	void testUpdateAddress() {
		ContactService.addContact("Trixi","Franklin","1234512345","155 Abby Lane");
		int size = ContactService.contactList.size();
		String id = ContactService.contactList.get(size-1).getId();
		ContactService.updateAddress(id, "123 Main Street");
		assertTrue(ContactService.contactList.get(size-1).getAddress().equals("123 Main Street"));
	}
	//Check the deletion of a contact.
	@Test
	void testContactServiceDelete() {
		ContactService.addContact("Trixi","Franklin","1234512345","155 Abby Lane");
		int size = ContactService.contactList.size();
		String id = ContactService.contactList.get(size-1).getId();
		ContactService.deleteContact(id);
		assertTrue(ContactService.searchContact(id) == 1);
	}
}
