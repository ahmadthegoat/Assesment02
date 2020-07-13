package com.stayready.assessment.week2.part02;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.InputMap;

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(integerArray));

    // Add the new element 
    list.add(valueToBeAdded); 

    // Convert the Arraylist to array 
    integerArray= list.toArray(integerArray);
    return integerArray; 
  }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(integerArray));

        int i = 0;
        for(int num:list){
            if(num % 2 != 0){
                num -= 1;
                list.set(i,num);
                i+= 1;
                
            }
            else{
                num+=1;
                list.set(i,num);
                i+=1;
            }
        }
        integerArray= list.toArray(integerArray);
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(integerArray));
        int i = 0;
        for(int num:list){
            if(num % 2 == 0){
            num += 1;
            list.set(i,num);
            i+=1;
            }
        }
        integerArray = list.toArray(integerArray);
        return integerArray;
    }
    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
        int i = 0;
        for(int num:input){
            if(num % 2 != 0){
                num -= 1;
                list.set(i,num);
                i+= 1;
                
            }}
            input= list.toArray(input);
            return input;
    
}
}