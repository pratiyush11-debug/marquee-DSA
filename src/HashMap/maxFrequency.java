package HashMap;
import java.util.*;
public class maxFrequency {
    public static void main(String[] args) {
        Map<Integer,Integer> freq = new HashMap<>();
        int arr[]= {1,2,1,2,3,3,44,5,5,3,4,3,5,66,67};
        for( int ele: arr){
            if(!freq.containsKey(ele)){
                freq.put(ele,1);
            }else{
                freq.put(ele,freq.get(ele) +1);
            }
        }
        System.out.println("frequency map");
        System.out.println(freq.entrySet());
        int maxfq=0;int ansKey=0;
//        for( var e: freq.entrySet()){
//            if(e.getValue()>maxfq){
//                maxfq=e.getValue();
//                ansKey=e.getKey();
//
//            }
//        }

//        System.out.println(ansKey);
//        System.out.printf("%d is occuring %d times in an HashMap",ansKey,maxfq);


        //another method traversing using directly on key
        for(var key:freq.keySet()){
            if(freq.get(key)>maxfq){
                maxfq=freq.get(key);
                ansKey=key;
            }
        }
        System.out.printf("%d is occuring %d times in an HashMap",ansKey,maxfq);



    }
}
