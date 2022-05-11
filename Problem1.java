//This problem was recently asked by Google.

//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

import java.util.HashSet;
import java.util.Set;

public class Problem1 {

    public static boolean isAnyPairSumEqualsK(int[] numbers, int k){
        Set<Integer> numberSet = new HashSet<Integer>();
        for(int number : numbers){
            if(numberSet.contains(k - number)){
                return true;
            }
            else{
                numberSet.add(number);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] testNumbers = {10,15,3,7};
        int k = 17;
        boolean response = isAnyPairSumEqualsK(testNumbers,k);
        System.out.println(response);
    }
}