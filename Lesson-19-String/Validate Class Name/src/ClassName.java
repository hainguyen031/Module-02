import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String Name_Regex = "^[CAP]\\d{4}[GHIK]$";
    public ClassName() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(Name_Regex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
