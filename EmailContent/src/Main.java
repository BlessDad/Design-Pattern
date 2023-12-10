public class Main {
    public static void main(String[] args) {
        Email secureAndExternal = new SecureEmail(new ExternalEmail(new EmailContent("옛다 이메일이다.")));
        System.out.println(secureAndExternal.getContent());




    }
}