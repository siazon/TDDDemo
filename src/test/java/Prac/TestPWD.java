package Prac;


import PracSrc.PasswordValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPWD {
    @Test
    public void text()
    {
        //test
        Assert.assertEquals(true,PasswordValidator.isValid("abc123"));
    }
}
