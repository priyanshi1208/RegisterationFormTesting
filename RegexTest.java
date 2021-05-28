
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import  org.junit.*;


class RegexTest {

    @Test
    public void validating_firstname_is_True() {
        boolean result=Regex.firstName("Priy");
        Assertions.assertTrue(result);
    }

    @Test
    public void validating_firstname_is_false() {
        boolean result=Regex.firstName("priyanshi");
        boolean result1=Regex.firstName("pri");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result1);
    }

    @Test
    public void validating_lastname_is_True() {
        boolean result=Regex.lastName("Shukla");
        boolean result1=Regex.lastName("Shuk");
        Assertions.assertTrue(result);
        Assertions.assertTrue(result1);
    }
    @Test
    public void validating_lastname_is_False() {
        boolean result=Regex.lastName("shukla");
        boolean result1=Regex.lastName("Shu");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result1);
    }
    @Test
    public void validating_password_is_True() {
        boolean result=Regex.password("Priyanshi@123");
        boolean result1=Regex.password("Priy@1yu");
        Assertions.assertTrue(result);
        Assertions.assertTrue(result1);
    }
    @Test
    public void validating_password_is_False() {
        boolean result=Regex.password("priyanshi@123");
        boolean result1=Regex.password("Priy@@yu");
        boolean result2=Regex.password("y@@yu");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result1);
        Assertions.assertFalse(result2);

    }
    @Test
    public void validating_email_is_True() {
        boolean result = Regex.email("priyanshi@gmai.com");
        boolean result1 = Regex.email("pri-cgfg@vbh.hb.hb");
        boolean result2 = Regex.email("Priy+100@yu.in");
        boolean result3 = Regex.email("abc@5.yu");
        Assertions.assertTrue(result);
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
        Assertions.assertTrue(result3);
    }
    @Test
    public void validating_email_is_False() {
        boolean result = Regex.email("@gmai.com");
        boolean result1 = Regex.email("pr..cgfg@vbh.hb.hb");
        boolean result2 = Regex.email("riy()100@yu.in");
        boolean result3 = Regex.email("Abc@5.yu");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result1);
        Assertions.assertFalse(result2);
        Assertions.assertFalse(result3);
    }
    @Test
    public void validating_phoneNumber_is_True() {
        boolean result=Regex.phoneNumber("91 8299758493");
        Assertions.assertTrue(result);
    }
    @Test
    public void validating_phoneNumber_is_False() {
        boolean result=Regex.phoneNumber("918299758493");
        Assertions.assertFalse(result);
    }
}