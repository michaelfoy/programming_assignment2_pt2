//Question 4 Task 3
import java.util.ArrayList;

/**
 * Class to create a group of Users including
 * methods to add members, send a broadcast message
 * and get details of the group
 * 
 * @author michaelfoy
 * @version 23.03.2016
 */
public class Group
{
    String groupName;

    ArrayList<User> members;

    /**
     * Constructor for new Group object
     * 
     * @param groupName    The group's name
     */
    public Group(String groupName)
    {
        //TODO
        this.groupName = groupName;
        members = new ArrayList<User>();
    }

    /**
     * Method to add a new User to the group,
     * prints an error message if User is already a member
     * 
     * @param user    User to be added to the group
     */
    public void addGroupMember(User user)
    {
        //TODO
        if(!members.contains(user))
        {
            members.add(user);
        }
        
        else
        {
            System.out.println("Oops, " + user.firstName + " " + user.lastName + " already belongs to this group!");
        }

    }
    /**
     * Send a message to the inbox of each group member
     * 
     * @param message    The message to be sent
     */
    public void broadcastMessage(Message message)
    {
       //TODO
       for (User user : members)
       {
           user.inbox.add(message);
       }
    }

    /*
     * @return all the group names in a single string
     * Use the \n between each name to ensure printed on separate lines
     */
    private String groupList()
    {
        String names = "";
        //TODO
        for(User user : members)
        {
            names += (user.firstName + "\n");
        }
        return names;
    }
    
    @Override
    public String toString()
    {
        return "GroupName=" + groupName + "\n" + groupList();
    } 
}
