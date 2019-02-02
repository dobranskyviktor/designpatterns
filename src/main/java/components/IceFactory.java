package components;

/**
 * Created by dobransk on 5/18/2017.
 */
public class IceFactory implements Factory
{

    public Label createLabel()
    {
        return new IceLabel();
    }

    public Button createButton()
    {
        return new IceButton();
    }

    public Field createField()
    {
        return new IceField();
    }
}
