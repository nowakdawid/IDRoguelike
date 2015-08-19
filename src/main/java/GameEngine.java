import java.util.Scanner;

public class GameEngine {

    World world = new World();

    public void getPlayerInput() {

        Scanner read = new Scanner(System.in);
        System.out.println("\n\nWelcome to Roguelike game!\n");
        System.out.println("What would you like to do?");
        System.out.println("---> \'play\'");
        System.out.println("---> \'exit\'");
        String input = "";

        while (!input.equals("exit")) {

            System.out.print("> ");
            input = read.nextLine();

        }
        System.exit(0);

    }

    public void visualiseWorld() {

        world.createMaps();
        world.displayActiveMap();

    }

    public void runGame() {

        visualiseWorld();
        getPlayerInput();

    }

}
