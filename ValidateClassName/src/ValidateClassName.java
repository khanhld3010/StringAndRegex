import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static final String REGEX_CLASSNAME = "^[CAP]\\d{4}[GHIK]$";
    Pattern pattern;

    public ValidateClassName() {
         pattern = Pattern.compile(REGEX_CLASSNAME);
    }
    public boolean isValidClassName(String str){
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
