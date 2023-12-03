public class HandFightCmd extends WitcherCommand {

    private Hand hand;

    @Override
    public void execute() {
        hand.hitWithHand();
    }
}
