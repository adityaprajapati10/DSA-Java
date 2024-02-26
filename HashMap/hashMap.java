import java.util.*;

class hashMap{
    public static void main(String[] args) {
        HashMap<Integer , String > hashMap = new HashMap<>();

        // functionality of put() function 
        hashMap.put(1 , "Priya");
        hashMap.put(2 , "Asha");
        hashMap.put(3 , "Karan");
        hashMap.put(4 , "Astha");

        System.out.println("HashMap of the given data is: "+hashMap);

        // functionality of get() function
        String result = hashMap.get(3);
        System.out.println("Value of the given key is: "+result);

        // functionality of containskey() function
        System.out.println(hashMap.containsKey(2));

        // functionality of remove() function
        hashMap.remove(1);
        System.out.println("updated hashMap : "+hashMap);

        // iterating using for loop
        for(Map.Entry<Integer,String> e : hashMap.entrySet()){
            System.out.println();
            System.out.println("HashMap is : "+e.getKey()+" : "+e.getValue());
        }
    }
}