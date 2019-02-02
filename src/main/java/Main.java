import Chain.MessageBuilder;
import components.Factory;
import components.IceFactory;
import components.Label;
import enumSingleton.AudioClipManager;

/**
 * Created by dobransk on 5/18/2017.
 */
public class Main
{

    public static void main(String[] args)
    {
        Factory iceFactory = new IceFactory();

        Label l1 = iceFactory.createLabel();

        AudioClipManager.INSTANCE.play();

        MessageBuilder.getInstance().from("ja").to("ty").getMessage();

    }
}
