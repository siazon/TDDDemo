package PracSrc;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void isValid() {
        Assert.assertEquals(true,PasswordValidator.isValid("abc123"));
        Assert.assertEquals(false,PasswordValidator.isValid("abc1"));
    }


}