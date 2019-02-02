package task7;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dobransk on 6/12/2017. Pozorovatel pozoruje game.
 */
public class ScoreBoard implements Observer
{
    private Game game;
    private int homeTeamScore;
    private int guestTeamScore;

    public ScoreBoard(Game game)
    {
        this.game = game;
    }

    public void showScore()
    {
        System.out.println("SCORE: " + homeTeamScore + " : " + guestTeamScore);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        Team team = (Team) arg;
        Game game = (Game) o;
        if (team.equals(game.getHomeTeam()))
        {
            homeTeamScore++;
        }
        else if (team.equals(game.getGuestTeam()))
        {
            guestTeamScore++;
        }
        showScore();
    }
}
