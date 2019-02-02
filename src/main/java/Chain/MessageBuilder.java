package Chain;

/**
 * Created by dobransk on 5/18/2017.
 */
public class MessageBuilder implements AfterFrom, AfterGetInstance, AfterTo
{
    private Message message = new Message();

    private MessageBuilder()
    {
    }

    public static AfterGetInstance getInstance()
    {
        return new MessageBuilder();
    }

    public MessageBuilder from(String from)
    {
        message.setFrom(from);
        return this;
    }

    public MessageBuilder to(String to)
    {
        message.setTo(to);
        return this;
    }

    public Message getMessage()
    {
        return message;
    }
}
