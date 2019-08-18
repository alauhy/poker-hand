import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class pokerCardTest {


    @Test
    public void should_return_player2_win_when_compare_given_player1_5C7DJCKHAS_and_player2_5C8DJCKHAS() {

        Player player1 = new Player(Arrays.asList("5","7","J","K","A"),Arrays.asList("C","D","C","H","S"));
        Player player2 = new Player(Arrays.asList("5","8","J","K","A"),Arrays.asList("C","D","C","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }
    @Test
    public void should_return_player2_win_when_compare_given_player1_5C7DJCKHAS_and_player2_5C5DJCKHAS() {

        Player player1 = new Player(Arrays.asList("5","7","J","K","A"),Arrays.asList("C","D","C","H","S"));
        Player player2 = new Player(Arrays.asList("5","5","J","K","A"),Arrays.asList("C","D","C","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }
    @Test
    public void should_return_player1_win_when_compare_given_player1_5C7CJCKCAC_and_player2_5C5DJCKHAS() {

        Player player1 = new Player(Arrays.asList("5","7","J","K","A"),Arrays.asList("C","C","C","C","C"));
        Player player2 = new Player(Arrays.asList("5","5","J","K","A"),Arrays.asList("C","D","C","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player1 win!", result);

    }
    @Test
    public void should_return_player1_win_when_compare_given_player1_5C5D5HKCAC_and_player2_5C5DJCKHAS() {

        Player player1 = new Player(Arrays.asList("5","5","5","K","A"),Arrays.asList("C","D","H","C","C"));
        Player player2 = new Player(Arrays.asList("5","5","J","K","A"),Arrays.asList("C","D","C","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player1 win!", result);

    }
    @Test
    public void should_return_player2_win_when_compare_given_player1_5C5D5HKCAC_and_player2_5C5D5HCKHKS() {

        Player player1 = new Player(Arrays.asList("5","5","5","K","A"),Arrays.asList("C","D","H","C","C"));
        Player player2 = new Player(Arrays.asList("5","5","5","K","K"),Arrays.asList("C","D","H","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }
    @Test
    public void should_return_player1_win_when_compare_given_player1_5C5D5H5SAC_and_player2_5C5D5HKHKS() {

        Player player1 = new Player(Arrays.asList("5","5","5","5","A"),Arrays.asList("C","D","H","S","C"));
        Player player2 = new Player(Arrays.asList("5","5","5","K","K"),Arrays.asList("C","D","H","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player1 win!", result);

    }
    @Test
    public void should_return_player1_win_when_compare_given_player1_5C6D7H8S9C_and_player2_4C4D5D5HKS() {

        Player player1 = new Player(Arrays.asList("5","6","7","8","9"),Arrays.asList("C","D","H","S","C"));
        Player player2 = new Player(Arrays.asList("4","4","5","5","K"),Arrays.asList("C","D","D","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player1 win!", result);

    }
    @Test
    public void should_return_player1_win_when_compare_given_player1_5C6C7C8C9C_and_player2_4C4S4D4HKS() {

        Player player1 = new Player(Arrays.asList("5","6","7","8","9"),Arrays.asList("C","C","C","C","C"));
        Player player2 = new Player(Arrays.asList("4","4","4","4","K"),Arrays.asList("C","S","D","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player1 win!", result);

    }
    @Test
    public void should_return_player1_win_when_compare_given_player1_5C5D7C8C9C_and_player2_4C4D7H8HKS() {

        Player player1 = new Player(Arrays.asList("5","5","7","8","9"),Arrays.asList("C","D","C","C","C"));
        Player player2 = new Player(Arrays.asList("4","4","7","8","K"),Arrays.asList("C","D","H","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player1 win!", result);

    }
    @Test
    public void should_return_player2_win_when_compare_given_player1_5C5D7C8C9C_and_player2_5H5S7H8HKS() {

        Player player1 = new Player(Arrays.asList("5","5","7","8","9"),Arrays.asList("C","D","C","C","C"));
        Player player2 = new Player(Arrays.asList("5","5","7","8","K"),Arrays.asList("H","S","H","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }
    @Test
    public void should_return_player2_win_when_compare_given_player1_5C5D7C7D9C_and_player2_5H5S8D8HKS() {

        Player player1 = new Player(Arrays.asList("5","5","7","7","9"),Arrays.asList("C","D","C","D","C"));
        Player player2 = new Player(Arrays.asList("5","5","8","8","K"),Arrays.asList("H","S","D","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }
    @Test
    public void should_return_player2_win_when_compare_given_player1_5C5D7C7D9C_and_player2_5H5S7S7HKS() {

        Player player1 = new Player(Arrays.asList("5","5","7","7","9"),Arrays.asList("C","D","C","D","C"));
        Player player2 = new Player(Arrays.asList("5","5","7","7","K"),Arrays.asList("H","S","S","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }
    @Test
    public void should_return_player2_win_when_compare_given_player1_5C5D5H7D9C_and_player2_7H7S7D8HKS() {

        Player player1 = new Player(Arrays.asList("5","5","5","7","9"),Arrays.asList("C","D","H","D","C"));
        Player player2 = new Player(Arrays.asList("7","7","7","8","K"),Arrays.asList("H","S","D","H","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }
    @Test
    public void should_return_player2_win_when_compare_given_player1_5C5D5H5S9C_and_player2_7H7D7C7SKS() {

        Player player1 = new Player(Arrays.asList("5","5","5","5","9"),Arrays.asList("C","D","H","S","C"));
        Player player2 = new Player(Arrays.asList("7","7","7","7","K"),Arrays.asList("H","D","C","S","S"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }
    @Test
    public void should_return_player2_win_when_compare_given_player1_5C6C7C8C9C_and_player2_6H7H8H9H10H() {

        Player player1 = new Player(Arrays.asList("5","6","7","8","9"),Arrays.asList("C","C","C","C","C"));
        Player player2 = new Player(Arrays.asList("6","7","8","9","10"),Arrays.asList("H","H","H","H","H"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }
    @Test
    public void should_return_player2_win_when_compare_given_player1_5C6C7C8C10C_and_player2_6H7H8H9HJH() {

        Player player1 = new Player(Arrays.asList("5","6","7","8","10"),Arrays.asList("C","C","C","C","C"));
        Player player2 = new Player(Arrays.asList("6","7","8","9","J"),Arrays.asList("H","H","H","H","H"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }
    @Test
    public void should_return_player2_win_when_compare_given_player1_5C6D7H8C9C_and_player2_6H7S8D9C10H() {

        Player player1 = new Player(Arrays.asList("5","6","7","8","9"),Arrays.asList("C","D","H","C","C"));
        Player player2 = new Player(Arrays.asList("6","7","8","9","10"),Arrays.asList("H","S","D","C","H"));
        Game game = new Game();

        String result = game.compare(player1, player2);

        Assert.assertEquals("player2 win!", result);

    }
}
