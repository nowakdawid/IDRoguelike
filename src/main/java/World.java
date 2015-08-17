
public class World {

    Map[] mapy = new Map[10];

    public void placePlayerOnMap() {



    }
    public void displayActiveMap() {

        mapy[0] = new Map();
        Map map = mapy[0];
        int sizeX = mapy[0].getSizeX();
        int sizeY = mapy[0].getSizeY();

        for(int iUp = 0;iUp < sizeX+2;iUp++) { System.out.print("-"); }
        for(int x = 0;x < sizeX;x++) {

            System.out.println("\n");
            System.out.print("|");
            for(int y = 0;y < sizeY;y++) {

                if(x == (int)sizeX/2 && y == (int)sizeY/2) { System.out.print("@"); }
                else System.out.print(".");

            }
            System.out.print("|");

        }
        System.out.println("\n");
        for(int iDown = 0;iDown < sizeX+2;iDown++) { System.out.print("-"); }

    }

}
