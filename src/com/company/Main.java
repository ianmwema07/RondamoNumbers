package com.company;
import java.util.Arrays;
import java.util.Random;

/**Program showing some array uses*/
public class Main {

    public static void main(String[] args) {
	// write your code here
        int data[] = new int[10]; //creating an array called data
        Random rand = new Random(); // a pseudo random number generator
        rand.setSeed(System.currentTimeMillis()); //use the current time as the seed
        //fill the array with pseudo-random numbers from 0 - 99
        for (int i = 0;i < data.length; i++)
            data[i] = rand.nextInt(100); //the next pseudo-random number
        int[] orig = Arrays.copyOf(data,data.length); // makes a copy of  the data array.
        System.out.println("Arrays equal before sort: " + Arrays.equals(data,orig));
        Arrays.sort(data); //sorting the data array orig is unchanged
        System.out.println("arrays equal after sort: " + Arrays.equals(data,orig));
        System.out.println("orig = " + Arrays.toString(orig));
        System.out.println("data = " + Arrays.toString(data));

    }
}
