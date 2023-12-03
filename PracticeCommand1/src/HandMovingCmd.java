public class HandMovingCmd extends WitcherCommand {

    private Hand hand;

    public HandMovingCmd(){
        this.hand = new Hand();
    }


    @Override
    public void execute() {
        hand.movingHand();
    }
}
