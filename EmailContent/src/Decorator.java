public abstract class Decorator extends Email{
    private Email decorated;
    public Decorator(Email email){
        this.decorated = email;

    }

    public String getContent(){
        return decorated.getContent();
    }

}
