package arrays;

public class Multidimension {
    public static void main(String[] args) {
        // int[][]arr = new int[3][];
        //adding the rows is mandatory
        //add the columns is not mandatory
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        //stack memory Just one reference variable arr on the stack, holding the address of the outer array in heap.
        //heap memory Java 2D arrays are arrays of arrays — not a single flat block.
        //The outer array holds 3 references (addresses), not the actual numbers.
        //Each inner array is a separate, independent block in the heap storing the actual int values.
        //The inner arrays are not contiguous with each other in memory — they can be anywhere in the heap.
        //Heap:
        //arr ──► [ addr_A | addr_B | addr_C ]   <- outer array (3 reference slots)
        //             |        |        |
        //             v        v        v
        //          [1,2,3]  [4,5,6]  [7,8,9]   <- 3 separate inner int[] blocks
    int[][] arr2D = {
        {},
        {},
        {}
    }
    
    
    }

}
