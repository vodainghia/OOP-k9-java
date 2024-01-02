package labs.lab_06;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Lab_6_1 {
    public static void main(String[] args) {
        // Given input string: "2hrs and 5 minutes"
        // Please calculate how many minutes in total
        String input = "2hrs and 5 minutes";
        System.out.println(calculateTotalMinutes(input));
    }

    static int calculateTotalMinutes(String input) {
        int totalMins = 0;

        String hourPattern = "(\\d+)hrs";
        String minutePattern = "(\\d+) minutes";

        Pattern hourPatternObj = Pattern.compile(hourPattern);
        Pattern minutePatternObj = Pattern.compile(minutePattern);

        Matcher hourMatcher = hourPatternObj.matcher(input);
        Matcher minuteMatcher = minutePatternObj.matcher(input);

        if (hourMatcher.find()) {
            totalMins += Integer.parseInt(hourMatcher.group(1)) * 60;
        }

        if (minuteMatcher.find()) {
            totalMins += Integer.parseInt(minuteMatcher.group(1));
        }

        return totalMins;
    }
}
