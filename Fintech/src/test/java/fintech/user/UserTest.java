package fintech.user;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


public class UserTest {

    private User user = new User();
    String email = "email@email.com";
    String firstName = "first";
    String lastName = "last";
    double phone = 9133022733d;

    @Test
    public void test_user_object() {
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhone(phone);
        user.setUserId(user.hashCode());

        assertEquals(user.getEmail(), email);
        assertEquals(user.getFirstName(), firstName);
        assertEquals(user.getLastName(), lastName);
        assertEquals(user.getPhone(), phone);
        assertNotNull(user.getUserId());
    }
}
