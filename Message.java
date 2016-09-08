
//Task 6
public class Message
{
    Subject   subject;
    String    messageText;
    User      from;
    User      to;

    public Message(Subject subject, User from, User to, String messageText)
    {
        // TODO initialize Subject field
        this.from           = from;
        this.to             = to;
        this.messageText    = messageText;
        this.subject        = subject;
    } 
    
    /**
     * Method to display the details of a message
     */
    public void displayMessage()
    {
        String nameFrom = from.firstName;
        String nameTo   = to.firstName;
        // TODO System.out.println(... + " says \""+messageText + "\" to " + nameTo);
        System.out.print("Message subject: " + subject + " " +
                              nameFrom + " says \"" + 
                                  messageText + "\" to " + nameTo + "\n");
    }

    public void displayMessageContent()
    {
        System.out.println(messageText);
    }
}