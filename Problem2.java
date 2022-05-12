//Get product of all other elements
//Given an array of integers, return a new array such that each element at index i of 
//the new array is the product of all the numbers in the original array except the one 
//at i. 
//For example, if our input was [ 1, 2, 3, 4, 5], the expected output would be [ 120, 
//60, 40, 30, 24]. Ifourinputwas [3, 2, 1],theexpectedoutputwouldbe [2, 
//3, 6]. 
//Follow-up: What if you can't use division?

import java.util.Arrays;

public class Problem2 {

    public static int[] getPrefixProducts(int[] numbers){
        int[] prefix = Arrays.copyOfRange(numbers, 0, numbers.length);
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i] * prefix[i - 1];
        }
        return prefix;
    }

    public static int[] getSuffixProducts(int[] numbers){
        int[] suffix = Arrays.copyOfRange(numbers, 0, numbers.length);
        for(int i = suffix.length - 1; i > 0; i--){
            suffix[i - 1] = suffix[i] * suffix[i - 1];
        }
        return suffix;
    }

    public static int[] getProductOfAllOtherElements(int[] numbers){
        int[] prefixProduct = getPrefixProducts(numbers);
        int[] suffixProduct = getSuffixProducts(numbers);
        int[] products = Arrays.copyOfRange(numbers, 0, numbers.length);
        for(int i = 0; i < products.length; i++){
            if(i == 0){
                products[i] = suffixProduct[1];
            }
            else if(i == products.length - 1){
                products[i] = prefixProduct[products.length - 2];
            }
            else{
                products[i] = prefixProduct[i - 1] * suffixProduct[i + 1];
            }
        }
        return products;
    }
    public static void main(String[] args) {
        int[] testNumbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(getProductOfAllOtherElements(testNumbers)));
    }
}
