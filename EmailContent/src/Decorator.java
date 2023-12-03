public abstract class Decorator extends Email{
    private Email decorated;
    public Decorator(){

    }

    public String getContent(){
        return decorated;
    }

}
