package pracprc;

public class PasswordValidator {
    public PasswordValidator(){
        //no thing to do
    }
    public  boolean isValid(String pwd)
    {
        //test bug
        return pwd.length() > 5;
    }
    public  boolean isUserNameValid(String userName)
    {
        //test bug
        boolean b = userName.length() > 3;
        return
                b;

    }
}
