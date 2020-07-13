package com.stayready.assessment.week2.part02;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        int index = 0;
        String[] slice = new String[endingIndex - startingIndex]; 
        for(int i =startingIndex; i < endingIndex;i++){
            slice[index] = arrayToBeSpliced[i];
            index+=1;
        }
        return slice;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        int index = 0;
        String[] slice = new String[ arrayToBeSpliced.length - startingIndex]; 
        for(int i =startingIndex; i < arrayToBeSpliced.length;i++){
            slice[index] = arrayToBeSpliced[i];
            index+=1;
        }
        return slice;
        
}}
