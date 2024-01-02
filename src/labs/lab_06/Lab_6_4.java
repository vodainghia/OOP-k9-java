package labs.lab_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab_6_4 {
    public static void main(String[] args) {
        // String url = "https://google.com";
        // Check http OR https; domain name, .com OR .net
        String url = "https://google.com";
        String urlPattern = "(http|https)://(.+?)\\.(com|net)";

        Pattern urlPatternObj = Pattern.compile(urlPattern);
        Matcher urlMatcher = urlPatternObj.matcher(url);

        if (urlMatcher.find()) {
            System.out.println("URL Schema: " + urlMatcher.group(1));
            System.out.println("Domain: " + urlMatcher.group(2));
            System.out.println("Top Level Domain: " + urlMatcher.group(3));
        } else {
            System.out.println("No match found.");
        }
    }
}
