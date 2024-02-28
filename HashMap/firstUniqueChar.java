

import java.util.*;
class firstUniqueChar {

    public static int firstUniqChar(String s) {    // Apporach 01 

        int[] count = new int[26]; // creating array size of 26
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a'; // finding the correct index according to char to upadte value and asumming all the vlaue in lowwer case
            count[index]++;
        }
        for (int i = 0; i < n; i++) { // iterating in array char wise
            int index = s.charAt(i) - 'a';
            if (count[index] == 1) {
                return i;
            }

        }
        return -1;

    }

    public static int firstUniqCharii(String str) {   // Approach 02
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        int result = -1;

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a string in lower case : ");
        String str = sc.nextLine();
        int result1 = firstUniqChar(str);    // Apporach 01 
        System.out.println();
        System.out.println("The first unique char find at index: "+result1);
        int result = firstUniqCharii(str);  // Apporach 02
        System.out.println("The first unique char find at index: "+result);
        sc.close();
    }
}