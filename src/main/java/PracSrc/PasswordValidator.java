package PracSrc;

public class PasswordValidator {
    public static boolean isValid(String pwd)
    {
        if(pwd.length()>6)
            return true;
        else
        return false;

    }
    // test copy code
    public  boolean isValid1(String pwd)
    {
        if(pwd.length()>6)
            return true;
        else
            return false;

    }
}
