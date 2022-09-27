/***********************************************************************/
/*                                                                     */
/*                          Mary Jane Layfield                         */
/*              CS-320-T1181 Software Test Automation & QA             */
/*                      JUnit Testing Module 3-2                       */
/*                     Professor Omar Toledo, M.S.                     */
/*                          September 18, 2022                         */
/*                    JUnit Test: ContactTest.java                     */
/*                                                                     */
/***********************************************************************/


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class ContactTest {
	
	//Test that all the variables are correct
	@Test
	void testContact() {
		Contact contact = new Contact("1234567891", "Arthur","Dent","1234567890","155 Country Lane");
		assertTrue(contact.getFirstName().equals("Arthur"));
		assertTrue(contact.getLastName().equals("Dent"));
		assertTrue(contact.getId().equals("1234567891"));
		assertTrue(contact.getPhoneNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("155 Country Lane"));
	}

	//Test the exception for the First Name being too long is thrown
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Bartholomew","Dent","12345","1234567890","155 Country Lane");
		});	
	}
	//Test the exception for the Last Name being too long is thrown
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Arthur","Montepulciano","12345","1234567890","155 Country Lane");
		});	
	}
	//Test the exception for the ID being too long is thrown
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Arthur","Dent","12345678901","1234567890","155 Country Lane");
		});	
	}
	//Test the exception for the Phone Number being too long is thrown
	@Test
	void testContactPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Arthur","Dent","12345678901","12345678901","155 Country Lane");
		});	
	}
	//Test the exception for the Address being too long is thrown
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Arthur","Dent","12345","1234567890","155 Country Lane Cottington Cottingshire County");
		});	
	}
	//Test the exception for the First Name being null is thrown
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null,"Dent","12345","1234567890","155 Country Lane");
		});	
	}
	//Test the exception for the Last Name being null is thrown
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Arthur",null,"12345","1234567890","155 Country Lane");
		});	
	}
	//Test the exception for the ID being null is thrown
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Arthur","Dent",null,"1234567890","155 Country Lane");
		});	
	}
	//Test the exception for the Phone Number being null is thrown
	@Test
	void testContactPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Arthur","Dent","12345678901",null,"155 Country Lane");
		});	
	}
	//Test the exception for the Address being null is thrown
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Arthur","Dent","12345","1234567890",null);
		});	
	}
	//Test the exception for the Phone Number being too short is thrown
	@Test
	void testContactPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("Arthur","Dent","12345","123456789","155 Country Lane");
		});	
	}
}
