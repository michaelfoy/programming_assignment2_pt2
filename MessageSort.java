import java.util.ArrayList;
import java.util.Collections;
/**
 * Class to sort messages using Selection Sort based on message content
 * Sorts Arrays and ArrayList of Messages
 */
public class MessageSort
{
    /**
     * Method to alphabetically sort message content of Messages
     *
     * @param m    Array of Messages to be checked
     */
    public static void selectionSort(Message[] m)
    {
        //TODO... 
        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m.length; j++)
            {
                if(m[i].messageText.compareToIgnoreCase(m[j].messageText) < 0 )
                {
                    swap(m, j, i);
                }
            }
        }
    }
    /**
     * Method to swap Message from one location to another
     * based on value
     *
     *@param arMsg    Array of Messages
     *@param to       The 
     */
    private static void swap(Message[] arMsg, int to, int from)
    {
        //TODO...
        Message swap = arMsg[to]; 
        
        arMsg[to] = arMsg[from];
        arMsg[from] = swap;
    }
    
    //Task 10
    public static void selectionSort(ArrayList<Message> m)
    {
        //TODO...
        for(int i = 0; i < m.size(); i++)
        {
            for(int j = 0; j < m.size(); j++)
            {
                if(m.get(i).messageText.compareToIgnoreCase(m.get(j).messageText) < 0 )
                {
                    swap(m, j, i);
                }
            }
        }

    }

    private static void swap(ArrayList<Message> list, int to, int from)
    {
        //TODO...
        Collections.swap(list, to, from);
    }

}
