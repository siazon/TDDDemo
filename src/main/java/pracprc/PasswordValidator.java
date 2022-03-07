package pracprc;

public class PasswordValidator {
    public PasswordValidator(){
        //TODO
    }
    public  boolean isValid(String pwd)
    {
        //test bug
        return pwd.length() > 5;
    }
    public  boolean isUserNameValid(String pwd)
    {
        //test bug
        return pwd.length() > 3;
    }
}
