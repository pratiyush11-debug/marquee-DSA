package HashMap;
import java.util.Map;
import java.util.HashMap;

public class keyValuePairs {
    public static void main(String[] args) {
        Map<String,Integer> mp= new HashMap<>();
        //akash is key and 21 is value in key-value pair.
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Ayush",22);
        mp.put("Jatin",20);
        System.out.println(mp.get("Jatin"));//20
        //if there is no mapping then it will give null.
        System.out.println(mp.get("rahul"));//null
        //we can also change the value of the key but.
        //we can not have the same name in the key .
        //key will always unique.
        mp.put("Akash",25);
        System.out.println(mp);
        mp.remove("Akash");
        System.out.println(mp);//akash will get removed...
        System.out.println(mp.remove("Pratiyush"));//null
        //for checking if the exist or not exist
        //we have contains method
        //it will give true or false.
        System.out.println(mp.containsKey("Akash"));//false
        System.out.println(mp.containsKey("Jatin"));//true
        //we have one method called mp.putIfAbsent()
        //adding a new entry only if the new key doesn't exist.
        System.out.println(mp.putIfAbsent("Amit",22));//will enter
        System.out.println(mp.putIfAbsent("Jatin",20));//will not enter as the key already exist.
        System.out.println(mp);
        //keySet
        System.out.println(mp.keySet());//all keys
        System.out.println(mp.values());//all values
        System.out.println(mp.entrySet());//key value pairs
        //traversing all keys form multiple methods.
        for(String key:mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println("----------------------------------------------------");

        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());

        }
        System.out.println("---------------");
        //var se directly aaja rha hai because java has this features in it.
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());

        }


    }
}
