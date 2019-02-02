package task7;

import java.util.Observable;

/**
 * Created by dobransk on 6/12/2017. Pozorovany subjekt.
 */
public class Game extends Observable
{
    private Team homeTeam;
    private Team guestTeam;

    public Team getHomeTeam()
    {
        return homeTeam;
    }

    public Team getGuestTeam()
    {
        return guestTeam;
    }

    public Game(Team homeTeam, Team guestTeam)
    {
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
    }

    public void scoreGoal(Team team)
    {
        System.out.println("Gol dal: " + team.getName());
        setChanged();
        notifyObservers(team);
    }

}
