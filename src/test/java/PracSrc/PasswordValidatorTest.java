package PracSrc;


import org.junit.*;

public class PasswordValidatorTest {

    @Test
  public   void isValid() {
        Assert.assertEquals(true,PasswordValidator.isValid("abc123"));
        Assert.assertEquals(false,PasswordValidator.isValid("abc1"));
    }
    @Test
    public  void isNameValid() {
        Assert.assertEquals(true,PasswordValidator.isUserNameValid("abc123"));
        Assert.assertEquals(false,PasswordValidator.isUserNameValid("c1"));
    }


}