package task7;

/**
 * Created by dobransk on 6/12/2017.
 */
public class Team
{
    private String name;
    private Fans fans;

    public Team(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Fans getFans()
    {
        return fans;
    }

    public void setFans(Fans fans)
    {
        this.fans = fans;
    }
}
