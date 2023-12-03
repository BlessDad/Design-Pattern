public class Robot {
    private MovingStrategy m;
    private AttackStrategy a;
    protected String name;
    public Robot(String name){
        this.name = name;
    };
    public String getName(){
        return name;
    };
    public void setMove(MovingStrategy m){
        this.m = m;
    }
    public void setAttack(AttackStrategy a){
        this.a = a;
    }


    public void move(){
        this.m.move();

    };
    public void attack(){
        this.a.attack();
    };

}
