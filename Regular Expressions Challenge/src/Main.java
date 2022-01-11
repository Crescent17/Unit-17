import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));
        System.out.println("------------");
        String challenge2 = "I want a ball.";
        String reg = "I want a \\w+.";
        System.out.println(challenge1.matches(reg));
        System.out.println(challenge2.matches(reg));
        System.out.println("------------");
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());
        System.out.println("------------");
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));
        System.out.println("------------");
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[a-g]+"));
        System.out.println("------------");
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println("------------");
        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-Za-z]+\\.[0-9]+$"));
        System.out.println("------------");
        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern1 = Pattern.compile("\\d+");
        Matcher matcher1 = pattern1.matcher(challenge8);
        while (matcher1.find()) {
            System.out.println("Occurrence " + matcher1.group());
        }
        System.out.println("------------");
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern2 = Pattern.compile("(\\d+)");
        Matcher matcher2 = pattern2.matcher(challenge9);
        while (matcher2.find()) {
            System.out.println("Occurrence " + matcher2.group());
        }
        System.out.println("------------");
        matcher2.reset();
        while (matcher2.find()) {
            System.out.println("Occurrence start = " + matcher2.start(1) + ", end = " + (matcher2.end() - 1));
        }
        System.out.println("------------");
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern3 = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher3 = pattern3.matcher(challenge11);
        while (matcher3.find()) {
            System.out.println("Occurrence " + matcher3.group(1));
        }
        System.out.println("------------");
        String challenge12 = "11111";
        Pattern pattern4 = Pattern.compile("\\d{5}");
        Matcher matcher4 = pattern4.matcher(challenge12);
        System.out.println(matcher4.matches());
        System.out.println("------------");
        String challenge13 = "11111-1111";
        Pattern pattern5 = Pattern.compile("^\\d{5}-\\d{4}$");
        Matcher matcher5 = pattern5.matcher(challenge13);
        System.out.println(matcher5.matches());
        System.out.println("------------");
        String challenge14 = "11111-1111";
        Pattern pattern6 = Pattern.compile("^\\d{5}(-\\d{4})?$");
        Matcher matcher6 = pattern6.matcher(challenge14);
        System.out.println(matcher6.matches());
    }
}
