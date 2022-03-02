package PracSrc;

public class PasswordValidator {
    public  boolean isValid(String pwd)
    {
        if(pwd.length()>3)
            return true;
        else
        return false;
    }
}
