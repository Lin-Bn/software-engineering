/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 28092
 */
public class Check {

    public static boolean checkChinese(String str) {
        String pattern = "[\\u4e00-\\u9fa5]+";
        boolean isMatch = Pattern.matches(pattern, str);
        return isMatch;
    }

    public static boolean checkEngilsh(String str) {
        String pattern = "[a-zA-Z]+";
        boolean isMatch = Pattern.matches(pattern, str);
        return isMatch;
    }

    public static boolean checkChineseAndEnglich(String str) {
        String pattern = "^[a-zA-Z\\u4e00-\\u9fa5\\s]+$";
        boolean isMatch = Pattern.matches(pattern, str);
        return isMatch;
    }

    public static boolean checkNumber(String str) {
        String pattern = "[0-9]+";
        boolean isMatch = Pattern.matches(pattern, str);
        return isMatch;
    }

    public static boolean checkId(String str) {
        String pattern = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
        boolean isMatch = Pattern.matches(pattern, str);
        return isMatch;
    }

    public static boolean checkDate(String str) {
        String pattern = "\\d{4}(\\.|\\/|.)\\d{1,2}\\1\\d{1,2}";//"^((\\d{2}(([02468][048])|([13579][26]))[\\.\\/\\s]?((((0?[13578])|(1[02]))[\\.\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\.\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\.\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\.\\/\\s]?((((0?[13578])|(1[02]))[\\.\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\.\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\.\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))?$";
        boolean isMatch = Pattern.matches(pattern, str);
        return isMatch;
    }

    public static boolean checkFloat(String str) {
        String pattern = "^(\\-|\\+)?\\d+(\\.\\d+)?$";
        boolean isMatch = Pattern.matches(pattern, str);
        return isMatch;
    }

    public static void main(String[] args) {
        String str = "2014.10.11";
        if (checkDate(str)) {
            System.out.println("213");
        }

        String f = "0.5";
        if (checkFloat(f) && (Float.parseFloat(f) - 1) <= 0) {
            System.out.println("is float");
        }
    }
}
