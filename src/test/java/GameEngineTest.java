import jdk.nashorn.internal.ir.annotations.Ignore;

public class GameEngineTest {

    @Ignore
    //@Test (timeout = 5000)
    public void shouldRunGame() {

        GameEngine game = new GameEngine();
        game.runGame();

    }

}
