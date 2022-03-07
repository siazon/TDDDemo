package pracprc;

public class PasswordValidator {
    public PasswordValidator(){}
    public static boolean isValid(String pwd)
    {
        //test bug
        return pwd.length() > 5;
    }
    public static boolean isUserNameValid(String pwd)
    {
        //test bug
        return pwd.length() > 3;
    }
}
