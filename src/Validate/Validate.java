package Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean emailStudent(String email) {
        String regex = "\\be_+[0-9]{10}+[A-Za-z]{1}+@uncp.edu.pe";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean emailTeacher(String email) {
        String regex = "\\b[A-Za-z0-9._%-]+@uncp.edu.pe";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean password(String password){
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean namePerson(String name){
        String regex = "^[a-zA-Z \\-\\.\\u00f1\u00d1\']*$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
