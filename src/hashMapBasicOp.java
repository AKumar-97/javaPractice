import java.util.HashMap;
import java.util.Map;

public class hashMapBasicOp {
    //implementing basic operations of hash maps
    public static void main(String args[]){
        int count =1;
        HashMap<Integer,String> map1= new HashMap<Integer,String>();
        //using put function to add to the collection
        map1.put(1,"Virendra Sehwag");
        map1.put(2,"Rahul Dravid");
        map1.put(3,"Sachin Tendulkar");
        map1.put(4,"Jadeja");
        map1.put(5,"Kaif");
        map1.put(6,"Ravi Ashwin");
        map1.put(7,"Bumrah");
        map1.put(8,"Ishant Sharma");

        //note: if we have same keys for two different values then the prior value gets over-written with the new value

       /* //to get only the values
        for(String i: map1.values()){
            System.out.print(i+ " ");
        }
        System.out.println();

        //to get only the keys
        for(Integer i: map1.keySet()){
            System.out.print(i+ " ");
        }*/

        //iterating through the hashmap using for each loop
        for(Map.Entry<Integer,String> e : map1.entrySet()){
            System.out.println("Key : "+ e.getKey() + " Value : "+ e.getValue() );

        }

        System.out.println("Squad for the match using hashmap");
        for(int i=1;i<=map1.size();i++)
        {
            if(i<(map1.size())/2)
            {
                if(count == 1)
                {
                    System.out.println("Batsmen of the team are :");
                    count++;
                }
                System.out.println(map1.get(i));
            }
            else if(i>=(map1.size())/2 && i<((map1.size())-2))
            {
                if(count == 2)
                {
                    System.out.println("Fielders of the team :");
                    count++;
                }
                System.out.println(map1.get(i));
            }
            else
            {
                if(count == 3)
                {
                    System.out.println("Bowlers of the team");
                    count++;
                }
                System.out.println(map1.get(i));
            }
        }

    }
}
