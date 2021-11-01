package homeworkweek9;

import java.util.HashMap;

public class Pro9 {

        /*
         * Create a HashMap object called people that will store String keys and Integer
         * values: And use for each loop to iterate the value from Map.
         * @param args
         */
        public static void main(String[] args) {
            //Create a HashMap object called people
            HashMap<String,Integer> people = new HashMap<String,Integer>();

            //Add keys and
            people.put("Arvindbhai",65);
            people.put("Kanchanben",63);
            people.put("Bharat",32);
            people.put("Pinal",30);
            for(String i : people.keySet()){
                System.out.println("key:"  + "value:" + people.get(i));
            }

        }
    }
