/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ketanmalik
 */
public class RegexValidations {

    public static boolean nameValidation(String str) {
        Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z\\s\\-0-9]*");
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static boolean usernameValidation(String str) {
        Pattern p = Pattern.compile("[a-zA-Z]{6,12}+");
        Matcher m = p.matcher(str);
        System.out.println(m.matches());
        return m.matches();
    }

    public static boolean passwordValidation(String str) {
        Pattern p = Pattern.compile("^(.{0,7}|[^0-9]*|[^A-Z]*|[^a-z]*|[a-zA-Z0-9]*)$");
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
