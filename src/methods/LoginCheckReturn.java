package methods;

public class LoginCheckReturn {
//  Create a method for logging in. User passes the username and password as parameters.
//  If the passed values are the same as the given username and password return true,
//  but if either the username or password is invalid return false
//Username: james123
//Password: password
    public static void main(String[] args) {
        if(loggingCheck("james123", "password")){
            System.out.println("Logged in");
        }else{
            System.out.println("Invalid credentials");
        }
    }

    public static boolean loggingCheck(String username, String password){
        String str1="james123";
        String str2="password";
        if(username.equals(str1)&&password.equals(str2)){
            return true;
        }
        return false;
    }
}

