
public class World {

    private int numberOfMaps = 10;
    private int activeMap = 0;

    Map[] mapy = new Map[numberOfMaps];


    public void placePlayerOnMap(Player player, int newX, int newY) {
        player.setCurrentPositionX(newX);
        player.setCurrentPositionY(newY);
    }

    public void displayActiveMap() {

        Player player = new Player();
        int playerX = player.getCurrentPositionX();
        int playerY = player.getCurrentPositionY();

        int sizeX = mapy[activeMap].getSizeX();
        int sizeY = mapy[activeMap].getSizeY();

        for (int iUp = 0; iUp < sizeX + 2; iUp++) {
            System.out.print("-");
        }
        for (int y = 0; y < sizeY; y++) {

            System.out.println("");
            System.out.print("|");
            for (int x = 0; x < sizeX; x++) {

                if (x == playerX && y == playerY) {
                    System.out.print("@");
                } else System.out.print(".");

            }
            System.out.print("|");

        }
        System.out.println("");
        for (int iDown = 0; iDown < sizeX + 2; iDown++) {
            System.out.print("-");
        }

    }

    public void createMaps() {

        for (int i = 0; i < numberOfMaps; i++) {
            mapy[i] = new Map();
        }

    }

}
