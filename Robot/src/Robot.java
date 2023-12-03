public class Robot {
    private String name;

    public String getName() {
        return name;
    }

    public Robot(String name) {
        this.name = name;
    }


    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void move(){
        this.movingStrategy.move();
    }
    public void attack(){
        this.attackStrategy.attack();
    }



}
