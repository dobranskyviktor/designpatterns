package task7;

/**
 * Created by dobransk on 6/12/2017.
 */
public class Main
{

    public static void main(String[] args)
    {
        Team kosice = new Team("KOSICE");
        Team trebisov = new Team("TREBISOV");

        Fans koFans = new Fans("Kosice", kosice);
        Fans tvFans = new Fans("Trebisov", trebisov);

        Game game = new Game(kosice, trebisov);
        game.addObserver(koFans);
        game.addObserver(tvFans);
        game.addObserver(new ScoreBoard(game));

        // ScoreBoard scoreBoard = new ScoreBoard(game);

        game.scoreGoal(trebisov);

        game.scoreGoal(trebisov);

        game.scoreGoal(kosice);
    }
}
