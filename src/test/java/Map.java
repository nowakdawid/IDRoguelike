import java.util.ArrayList;

/**
 * Created by izasemczuk on 2015-08-17.
 */
public class Map {
    private int sizeX=35;
    private int sizeY=35;
    private String terrain;
    private ArrayList<Player> playersOnMap = new ArrayList<Player>();

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public ArrayList<Player> getPlayersOnMap() {
        return playersOnMap;
    }

    public void setPlayersOnMap(ArrayList<Player> playersOnMap) {
        this.playersOnMap = playersOnMap;
    }
}
