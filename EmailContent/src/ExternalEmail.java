public class ExternalEmail extends Decorator {

    public ExternalEmail(Email e){
       super(e);
    }

    public String getContent(){
        super.getContent();
        return disclaimer(super.getContent());

    }

    private String disclaimer(String content){
        return (content + "\n본 이메일은 당사와 관련이 없습니다.");
    }
}
