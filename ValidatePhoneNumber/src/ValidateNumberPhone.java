import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    public static final String REGEX_PHONENUMBER = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    Pattern pattern;

    public ValidateNumberPhone() {
        pattern = Pattern.compile(REGEX_PHONENUMBER);
    }

    public boolean validateNumberPhone(String str) {
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
