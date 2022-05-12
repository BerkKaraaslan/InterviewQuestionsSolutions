//Locate smallest window to be sorted
//Given an array of integers that are out of order, determine the bounds of the smallest 
//window that must be sorted in order for the entire array to be sorted. For example, 
//given [ 3 , 7 , 5 , 6 , 9] , you should return ( 1 , 3 ) .
// [ 3, 7, 5, 9   ]

public class Problem3 {

    public static Pair getSmallestWindowToBeSorted(int[] numbers){ // if array is sorted then return -1,-1
        int startIndex = 0;
        int endIndex = 0;
        boolean isSorted = true;
        int value = 0;

        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] > numbers[i + 1]){
                isSorted = false;
                startIndex = i;
                value = numbers[i];
                break;
            }
        }

        if(isSorted){
            return new Pair(-1, -1);
        }

        for(int i = 0; i < numbers.length; i++){ 
            if(numbers[i] > value){
                endIndex = i - 1;
                break;
            }
        }

        if(endIndex == 0){
            endIndex = numbers.length - 1;
        }
        
        return new Pair(startIndex, endIndex);
    }
    
    public static void main(String[] args) {
        int[] numbers = {100,1,2,3,4};
        System.out.println(getSmallestWindowToBeSorted(numbers));
    }
}