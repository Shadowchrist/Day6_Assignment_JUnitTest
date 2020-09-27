package UserRegistration;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationParameterizedEmailTest {

	private String email;
	private boolean expected;
	private UserRegistration userRegistration;

	//Instance of UserRegistration Class created
	@Before
	public void setup() {
		userRegistration = new UserRegistration();
	}

	//constructor
	public UserRegistrationParameterizedEmailTest(String email, boolean expected) {
		this.email = email;
		this.expected = expected;
	}


	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection emailSamples() {
		return Arrays.asList(new Object[][] { {"abc@yahoo.com", true}, {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true}, {"abc111@abc.com", true},
											  {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.com", false},
											  {"abc+100@gmail.com", true}, {"abc", false}, {"abc@.com.my", false}, {"abc123@gmail.a", false},
											  {"abc123@.com", false}, {"abc123@.com.com", false}, {".abc@abc.com", false}, {"abc()*@gmail.com", false},
											  {"abc@%*.com", false}, {"abc..2002@gmail.com", false}, {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false},
											  {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au", false}});
	}

	@Test
	public void testEmailValidation() {
		assertEquals(expected, userRegistration.checkEmail(email));
	}

}