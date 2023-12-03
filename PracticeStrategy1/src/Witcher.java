public abstract class Witcher {

    private AttackWitcher attack;
    private MovingWitcher moving;

    public Witcher() {
    }

    public void setAttack(AttackWitcher attack){
        this.attack = attack;
    }

    public void setMoving (MovingWitcher moving){
        this.moving = moving;
    }

    public void attack(){
        this.attack.attack();
    }

    public void moving(){
        this.moving.moving();
    }

}
