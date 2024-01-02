package labs.lab_06;

public class Lab_6_3 {
    public static void main(String[] args) {
        // String myStr = "100 minutes";
        // NOT using REGEX, extract digit character from that String
        // Expected output: "100".
        // EX: "12345nabc678" -> "12345678"
        String myStr = "100 minutes";
        String result = "";
        for (char ch : myStr.toCharArray()) if (Character.isDigit(ch)) result += ch;
        System.out.println(result);
    }
}
