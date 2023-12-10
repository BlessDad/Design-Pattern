public class SecureEmail extends Decorator {

    public SecureEmail(Email e){
        super(e);
    }

    public String getContent(){
        String content = super.getContent();
        return encrypt(super.getContent());
    }

    private String encrypt(String content){
        return (content + " \n본 이메일은 hj.corp 에 의해 법으로 보호됩니다.");
    }
}
