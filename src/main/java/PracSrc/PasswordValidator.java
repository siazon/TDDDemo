package PracSrc;

public class PasswordValidator {
    public static boolean isValid(String pwd)
    {
        //test bug
        if(pwd.length()>5) {
            return true;
        }
        else
        return false;
    }
}
