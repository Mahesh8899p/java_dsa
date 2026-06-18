package arrays;

import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        //here internally when we declare a change method then in stack its pointing to the same block of memory in heap memory where the objects get initilized
        //so when we pass some change in the array the original array object is been changed too
        //this is called mutability
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
