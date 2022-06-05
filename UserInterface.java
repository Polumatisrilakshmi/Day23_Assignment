package COM.BRIDGELABZ;
import java.util.regex.Pattern;
@FunctionalInterface

public class UserInterface {
    void validate(String str) throws CustomException{

    }
}

    public class UserDetails {
        public static void main(String[] args) throws CustomException {
            // Welcome to lambda expression program......

            // Created a method to validate first name using lambda expression
            UserInterface validateFirstName = (firstName) -> {
                if (firstName.isEmpty()) {
                    throw new CustomException("Invalid input");
                }
                Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
                return pattern.matcher(firstName).matches();
            };
            System.out.println(validateFirstName.validate("Srilakshmi"));


            // Created a method to validate last name using lambda expression
            UserInterface validateLastName = (lastName) -> {
                if (lastName.isEmpty()) {
                    throw new CustomException("Invalid input");
                }
                Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
                return pattern.matcher(LastName).matches();
            };
            System.out.println(validateLastName.validate("Polumati"));


            // Created a method to validate email using lambda expression
            UserInterface validateEmail = (email) -> {
                if (email.isEmpty()) {
                    throw new CustomException("Invalid input");
                }
                Pattern pattern = Pattern.compile("^[a-zA-Z]+@[a-zA-Z]+[.]+[a-zA-Z]{3}$");
                return pattern.matcher(Email).matches();
            };
            System.out.println(validateEmail.validate("polumatisrilakshmi@gmail.com"));


            // Created a method to validate mobile number using lambda expression
            UserInterface validateMobNo = (mobNo) -> {
                if (mobNo.isEmpty()) {
                    throw new CustomException("Invalid input");
                }
                Pattern pattern = Pattern.compile("^[0-9]{2}\s[0-9]{10}$");
                return pattern.matcher(MobNo).matches();
            };
            System.out.println(validateMobNo.validate("9963464457"));


            // Created a method to validate password using lambda expression
            UserInterface validatePassword = (password) -> {
                if (password.isEmpty()) {
                    throw new CustomException("Invalid input");
                }
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9@$!%*#?&]{1,}[a-zA-Z0-9@$!%*#?&]{7,}$");
                return pattern.matcher(Password).matches();
            };
            System.out.println(validateMobNo.validate(""));
        }
    }

