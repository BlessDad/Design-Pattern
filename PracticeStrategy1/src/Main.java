public class Main {
    public static void main(String[] args) {
        Witcher viper = new Viper();

        viper.setAttack(new Sword());
        viper.setMoving(new Flying());
        viper.attack();
        viper.moving();

        Witcher wolf = new Wolf();
        wolf.setAttack(new Magic());
        wolf.setMoving(new Walking());
        wolf.attack();
        wolf.moving();
    }
}