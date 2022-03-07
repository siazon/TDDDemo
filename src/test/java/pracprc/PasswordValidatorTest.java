package pracprc;


import org.junit.*;

public class PasswordValidatorTest {
    PasswordValidator pv=new PasswordValidator();
    @Test
  public   void isValid() {

        Assert.assertEquals(true,pv.isValid("abc123"));
        Assert.assertEquals(false,pv.isValid("abc1"));
    }
    @Test
    public  void isNameValid() {
        Assert.assertEquals(true,pv.isUserNameValid("abc123"));
        Assert.assertEquals(false,pv.isUserNameValid("c1"));
    }


}