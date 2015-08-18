import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorldTest {

    @Test
    public void shouldDisplayMap() {

        World world = new World();
        world.createMaps();
        world.displayActiveMap();

    }

    @Test
    public void shouldRandomlyPlacePlayerOnMap() {

        World world = new World();
        Player player = new Player();
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);

        world.placePlayerOnMap(player, x, y);

        assertEquals(player.getCurrentPositionX(), x);
        assertEquals(player.getCurrentPositionY(), y);

    }


}
