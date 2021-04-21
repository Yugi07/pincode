import java.util.regex.*;

public class validation {


public static boolean isvalidpincode(string pincode) {

  string regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$

  Pattern p = Pattern.compile(regex);
  
  if (pincode == null) {
    return flase;
}
    Matcher m = p.matcher(pincode);
 return m.matches();
}
public static void main(string args[])) {

  string num1 = "123456";
  syster.out.println(nim1 +": "+isvalidpincode(num1))
}
