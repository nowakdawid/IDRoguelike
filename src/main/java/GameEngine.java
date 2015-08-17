import java.util.Scanner;

public class GameEngine {

    World world = new World();

    public void getPlayerInput() {

        Scanner read = new Scanner(System.in);
        System.out.println("\nWelcome to Roguelike game!\n");
        System.out.println("What would you like to do?");
        System.out.println("---> \'play\'");
        System.out.println("---> \'exit\'");
        System.out.println("Your input: ");

        if(read.nextLine() == "exit") {

            //quit the game

        }

    }

    public void visualiseWorld() {

        world.displayActiveMap();

    }

    public void runGame() {

        visualiseWorld();
        getPlayerInput();

    }

}
