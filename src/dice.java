import java.util.Random;

public class dice {

    public Integer roll() {
        return new Random().nextInt(7);
    }
}