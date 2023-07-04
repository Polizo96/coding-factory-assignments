package gr.aueb.cf.ch20;

public class MatchesApp {

    public static void main(String[] args) {
        String s = "red";
        System.out.println(isRed(s));

        String digit = "1";
        System.out.println(isOneDigit(digit));
    }

    public static boolean isRed(String s) {
        return s.matches("red");
    }

    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    public static boolean isOneDigit(String s) {
//        return s.matches("[0123456789]"); // 0 or 1 or 2 or 3 ... or 9
        return s.matches("\\d"); // digit
    }

    public static boolean isOneWordChar(String s) {
//        return s.matches("[a-zA-z0-9_]");
        // return s.matches("[^1]") not 1 (inside square brackets ^ is NOT)
        return s.matches("\\w");
    }

    public static boolean isNotOneWordChar(String s) {
        return s.matches("\\W"); // not one word
    }

    public static boolean isNotOneDigit(String s) {
        return s.matches("\\D"); // not a digit
    }

    public static boolean isWhiteSpace(String s) { //spaces, tabs, newlines
        return s.matches("\\s");

    }

    public static boolean isNotWhiteSpace(String s) { //spaces, tabs, newlines
        return s.matches("\\S");
    }

    public static boolean isAnySymbol(String s) {
        return s.matches(".");
    }

    public static boolean isWholeString(String s) {
        return s.matches("^.$");
    }

    /*
     * . any char
     * ^, $ αρχή κ τέλος string
     * [^] negation
     * \d, \D digit, not digit
     * \w, \W word, not word (a-zA-Z0-9_)
     * \s, \S space, not space
     */

    public static boolean isZeroOrMoreDigits(String s) {
        return s.matches("\\d*") ;// 0 or more digits
    }

    public static boolean isOneOrMoreDigits(String s) {
        return s.matches("\\d+") ;// 1 or more
    }

    public static boolean isThreeDigits(String s) {
        return s.matches("\\d{3}") ;// 3 digits
    }

    public static boolean isZeroToThreeDigits(String s) {
        return s.matches("\\d{0,3}") ;// 0 1 2 or 3
    }

    public static boolean isMoreThanFiveDigits(String s) {
        return s.matches("\\d{5,}"); //5 or more
    }

    public static boolean isLessThanFiveDigits(String s) {
        return s.matches("\\d{0,5}"); // less than 5
    }

    public static boolean isZeroOrOneDigit(String s) {
        return s.matches("\\d?"); // 0 or one
    }

    public static boolean isZeroOrOneAnySymbol(String s) {
        return s.matches(".?");
    }

    public static boolean isValidEmailAddress(String s) { // athan.andr@xxx.com or .gr , alice@xxx.com or .gr
        return s.matches("^[a-zA-Z]\\w*\\.?\\w+@\\w+\\.(com|gr)$");
    }

}
