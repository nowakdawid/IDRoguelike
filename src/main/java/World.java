
public class World {

    Map[] mapy = new Map[10];

    public void placePlayerOnMap(Player player, int newX, int newY) {
        player.setCurrentPositionX(newX);
        player.setCurrentPositionY(newY);
    }

    public void displayActiveMap() {

        Player player = new Player();
        int playerX = player.getCurrentPositionX();
        int playerY = player.getCurrentPositionY();

        mapy[0] = new Map();
        Map map = mapy[0];
        int sizeX = mapy[0].getSizeX();
        int sizeY = mapy[0].getSizeY();

        for (int iUp = 0; iUp < sizeX + 2; iUp++) {
            System.out.print("-");
        }
        for (int x = 0; x < sizeX; x++) {

            System.out.println("");
            System.out.print("|");
            for (int y = 0; y < sizeY; y++) {

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

}
