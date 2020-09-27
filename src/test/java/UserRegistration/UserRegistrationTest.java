package UserRegistration;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

	public UserRegistration userRegistration;
	
	public UserRegistrationTest() {
		// constructor 
		userRegistration = new UserRegistration();
	}


	/*@Before
	public void setup() {
		UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
	}*/
	
	
	//FirstName Validation Test
		@Test
		public void FirstNameWhenStartsWithUpperCase_HappyCase() 
		{
			boolean result = userRegistration.checkFirstName("Josh");
			assertTrue(result);
		}

		@Test
		public void FirstNameStartsWithLowerCase_SadCase() 
		{
			boolean result = userRegistration.checkFirstName("harry");
			assertFalse(result);
		}

		@Test
		public void FirstNameContainsDigits_SadCase() 
		{
			boolean result = userRegistration.checkFirstName("Winn1e");
			assertFalse(result);
		}

		@Test
		public void FirstNameContainsSpecialCharacters_SadCase() 
		{
			boolean result = userRegistration.checkFirstName("P@rker");
			assertFalse(result);
		}

		@Test
		public void FirstNameContainsLessThan3Characters_SadCase() 
		{
			boolean result = userRegistration.checkFirstName("Pa");
			assertFalse(result);
		}
		
		//LastName Validation Test
		@Test
		public void LastNameWhenStartsWithUpperCase_HappyCase() 
		{
			boolean result = userRegistration.checkFirstName("Josh");
			assertTrue(result);
		}

		@Test
		public void LastNameStartsWithLowerCase_SadCase() 
		{
			boolean result = userRegistration.checkFirstName("harry");
			assertFalse(result);
		}

		@Test
		public void LastNameContainsDigits_SadCase() 
		{
			boolean result = userRegistration.checkFirstName("Winn1e");
			assertFalse(result);
		}

		@Test
		public void LastNameContainsSpecialCharacters_SadCase() 
		{
			boolean result = userRegistration.checkFirstName("P@rker");
			assertFalse(result);
		}

		@Test
		public void LastNameContainsLessThan3Characters_SadCase() 
		{
			boolean result = userRegistration.checkFirstName("Pa");
			assertFalse(result);
		}

		//Test Cases for Email Validation
		@Test
		public void validEmail_HappyCase() 
		{
			boolean result = userRegistration.checkEmail("abc.winchester+dean-12wsd@yawai.com.in");
			assertTrue(result);
		}

		@Test
		public void invalidEmail_Case1_SadCase() 
		{
			boolean result = userRegistration.checkEmail("abc.@gmail.com");
			assertFalse(result);
		}

		@Test
		public void invalidEmail_Case2_SadCase()  
		{
			boolean result = userRegistration.checkEmail("abc.@gmail.com");
			assertFalse(result);
		}

		@Test
		public void invalidEmail_Case3_SadCase()  
		{
			boolean result = userRegistration.checkEmail("abc.ac@gmail.com.aa.ai");
			assertFalse(result);
		}
		
		@Test
		public void invalidEmail_Case4_SadCase()  
		{
			boolean result = userRegistration.checkEmail("abc.ac@gmail@com.aa.ai");
			assertFalse(result);
		}
		
		//Test Cases for phone number Validation
		@Test
		public void validPhoneNumber_HappyCase() 
		{
			boolean result = userRegistration.checkPhoneNumber("12 1234567890");
			assertTrue(result);
		}

		@Test
		public void invalidPhoneNumber_Case1_SadCase() 
		{
			boolean result = userRegistration.checkPhoneNumber("12 123a567890");
			assertFalse(result);
		}

		@Test
		public void invalidPhoneNumber_Case2_SadCase() 
		{
			boolean result = userRegistration.checkPhoneNumber("12 1234@567890");
			assertFalse(result);
		}
	
		@Test		
		public void invalidPhoneNumber_LessThan10Digits_SadCase() 
		{
			boolean result = userRegistration.checkPhoneNumber("12 123567890");	
			assertFalse(result);
		}
		
		//Password Validation Test
		@Test
		public void validPassword_HappyCase() 
		{
			boolean result = userRegistration.checkPassword("Asdf@1234");
			assertTrue(result);
		}

		@Test
		public void Password_NoDigitUsed_SadCase() 
		{
			boolean result = userRegistration.checkPassword("Awer@asdf");
			assertFalse(result);
		}

		@Test
		public void Password_NoCapsUsed_SadCase() 
		{
			boolean result = userRegistration.checkPassword("1qwe@asdf");
			assertFalse(result);
		}

		@Test
		public void Password_NoSpecialCharacterUsed_SadCase() 
		{
			boolean result = userRegistration.checkPassword("A1wa2asdf");
			assertFalse(result);
		}
		
		@Test
		public void Password_LessThan8Characters_SadCase() 
		{
			boolean result = userRegistration.checkPassword("Aqwe@a1");
			assertFalse(result);
		}

}
