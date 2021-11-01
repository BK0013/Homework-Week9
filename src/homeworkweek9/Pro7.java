package homeworkweek9;

import java.util.ArrayList;

public class Pro7 {


    public static void main(String[] args)
        {
            ArrayList<String> al = new ArrayList<String>();
            // before checking ArrayList using isEmpty() method
            System.out.println("Is ArrayList empty: " + al.isEmpty());
            al.add("Waterloo Line");
            al.add("Bakerloo Line");
            al.add("Metropolitan Line");
            al.add("Elizabeth Line");
            // after checking ArrayList using isEmpty() method
            System.out.println("Is ArrayList empty: " + al.isEmpty());
            for(String tube : al)
            {
                System.out.println(tube);
            }
        }
    }

