package arrays;

import java.util.Arrays;
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        //syntax of the arrays
    //datatype[] variablename = new datatype[size];
    //int[] rollno = new int[10];
    int[] rollno = new int[5];
    //int rollno is the declaration of the array, rollno is defined in the stack
    // = new int[5] is the initialization of the array , new is used to create an object 
    //here a contiguous block of memory is been created in the heap memory large enough for 5 integers
    //The heap address of that block is returned and stored in the stack variable rollno. 
    //So rollno on the stack now points to the heap block.

    // rollno variable name is stored in the stack which contains the addres to the block
    //this block is created in the heap memory 

    //things on the left hand side happens in compile time (stack memory)
    //things on the right hand side happens in runtime (heap memory)
    //this is called dynamic memory allocation
    //Dynamic Memory Allocation is the process of allocating memory to a program at runtime (while the program is executing), rather than at compile time.
    //or
    int[] rollno1 = {23,12,45,32,15};
    //datatype refers to the type of value which are inside the array
    //all the type of the data in the array should be same
    //if the data type of the array is int then the data inside the araay will be int only
    //vice versa for all the other data types


    //array definition says the array is continous data 
    //but java behaves differntly 
    //java objects are stored in the heap memory
    //heap objects are not continous
    //hence array may not be continous and it depends on jvm

    //indexes of the array
    //roll1[0] = 23
    //roll1[1] = 12 etc etc

    //int[]ros; by default the value of this will be null only\
    int[]array = new int[10];
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    array[4] = 5;
    array[5] = 6;
    array[6] = 7;
    array[7] = 8;
    array[8] = 9;
    array[9] = 10;
    //iterating an array
    for(int i = 0; i < array.length; i++){
        System.out.println(array[i]);
    }
    //another way of iterating the array
    for(int num : array){
        System.out.println(num);
    }
    //another way to print the array
    System.out.println(Arrays.toString(array));

    //array of objects
    // str is a reference variable stored in the stack memory, which holds the address of the block created in heap memory
    // new String[4] creates a block in the heap memory containing 4 slots (reference variables), all initialized to null
    // each slot will point to a String object in the heap only after assignment (str[i] = in.next())
    Scanner in = new Scanner(System.in);
    String[] str = new String[4];
    for(int i = 0; i < str.length; i++){
        str[i] = in.next();
    }
    System.out.println(Arrays.toString(str));
    in.close();
    }
}