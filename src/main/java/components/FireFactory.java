package components;

/**
 * Created by dobransk on 5/18/2017.
 */
public class FireFactory implements Factory
{

    public Label createLabel()
    {
        return new FireLabel();
    }

    public Button createButton()
    {
        return new FireButton();
    }

    public Field createField()
    {
        return new FireField();
    }
}
