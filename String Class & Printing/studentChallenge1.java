public class studentChallenge1 {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        int AT_INDEX = str.indexOf("@");
        String userName = str.substring(0, AT_INDEX); // taking username
        System.out.println(userName);

        int DOT_INDEX = str.indexOf(".");
        String domainName = str.substring(AT_INDEX+1, DOT_INDEX); // taking  domain name
        System.out.println(domainName);
        System.out.println(domainName.equals("gmail"));
    }
}
