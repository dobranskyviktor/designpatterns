package task7;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dobransk on 6/12/2017. Pozorovatelia pozoruju Game
 */
public class Fans implements Observer
{
    private String fansName;

    public Fans(String fansName, Team fansOf)
    {
        this.fansName = fansName;
        this.fansOf = fansOf;
    }

    private Team fansOf;

    public void applaude()
    {
        System.out.println("APPLAUDE for team " + fansOf.getName());
    }

    public void whisle()
    {
        System.out.println("WHISLE for team " + fansOf.getName());
    }

    @Override
    public void update(Observable o, Object arg)
    {
        Team team = (Team) arg;
        if (this.fansOf.equals(team))
        {
            applaude();
        }
        else
        {
            whisle();
        }
    }
}
