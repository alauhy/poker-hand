import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class pokerCardTest {

    @Test
    public void should_return_player2_win_when_compare_given_player1_5C_and_player2_6D() {

        Player player1 = new Player(Arrays.asList("5"),Arrays.asList("C"));
        Player player2 = new Player(Arrays.asList("6"),Arrays.asList("D"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }

}
