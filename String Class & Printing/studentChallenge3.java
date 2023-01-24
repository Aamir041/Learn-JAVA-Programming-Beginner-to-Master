public class studentChallenge3 {
    public static void main(String[] args) {
        // removing special characters
        String str1 = "a!Bc$%u*D#F";
        str1 = str1.replaceAll("\\W", "");
        System.out.println(str1);

        String str2 = "Wel co me T o Pun e";
        str2 = str2.replaceAll("\\s","");
        System.out.println(str2);

        String str3 = "   abc    efg   hij   klm    ";
        str3 = str3.replaceAll("\\s+", " ").trim();
        System.out.println(str3);

        String words[] = str3.split("\\s");
        System.out.println(words.length);

    }
}
