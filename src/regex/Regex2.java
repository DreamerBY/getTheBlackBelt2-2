package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("^ABC[e-g4-7]");
//        String s1 = "abcd abca abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("bch$");
//        String s1 = "abcd abca abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D");
//        String s1 = "abcd abca abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w+");
//        String s1 = "abcd!?abca== ==abc ++abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W+");

//        String s1 = "poka abc     Zaur          dom kino";
//        Pattern pattern1 = Pattern.compile("\\w{4}");
//        String s1 = "poka abc     Zaur          dom kino";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w"); //[\t\n\r\f]

//       String s1 = "abcd abce3 abcfa78abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D{2,}"); //[\t\n\r\f]
//       String s1 = "ABCABABDA";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}"); //[\t\n\r\f]
//        String s1 = "ABCABABDADABABDABABABABA";
//        Pattern pattern1 = Pattern.compile("D(AB){2,3}");

//        String s1 = "ABCABABDADABABDABABABABA";
//        Pattern pattern1 = Pattern.compile("D(AB)*");
//        String s1 = "abcd abcd4 afc4ced7bch";
//        Pattern pattern1 = Pattern.compile("bch\\Z");


        String s1 = "abcd abcd4 afc4ced7";
        Pattern pattern1 = Pattern.compile("[abcd][efgh3-8]");





        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Postion: "+matcher.start()+"   "+matcher.group());
        }
    }
}

