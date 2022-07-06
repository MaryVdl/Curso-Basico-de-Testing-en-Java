package comm.platzi.javatests.util;

public class PasswordUtil {

    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String password){
        //matches para uso de expresiones regulares
        if (password.length()<8 | password.matches("[a-zA-Z]+")) {
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }
}
