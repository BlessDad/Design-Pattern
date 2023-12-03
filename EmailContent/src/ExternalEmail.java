public class ExternalEmail extends Decorator {

    private EmailContent email;
    public ExternalEmail(EmailContent email){
        this.email = email;
    }

    public String getContent(){
        return disclaimer(email.getContent());

    }

    private String disclaimer(String content){
        return (content + "\n본 이메일은 당사와 관련이 없습니다.");
    }
}
