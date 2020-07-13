package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String space = "";
        for(int i =0; i < amountOfPadding; i++){
            space += " ";
        }
        return space + stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        for(int i =0; i < amountOfPadding; i++){
            stringToBePadded += " ";
        }
        return stringToBePadded;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String repeated = "";
        for(int i =numberOfTimeToRepeat;i>0; i--){
            repeated += stringToBeRepeated;
        }
        return repeated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        boolean bal = true;
        for(int i = 0; i< string.length();i++){
        char cage = string.charAt(i);
        if(Character.isLetter(cage)){
            bal = true;}
        else{
            bal = false;
                }
            }
            return bal;
        }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        boolean bal = true;
        for(int i = 0; i< string.length();i++){    
        char cage = string.charAt(i);
        if(Character.isDigit(cage)){
            bal = true;}
        else{
            return false;
                }
            }
            return bal;
        }


    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        boolean bal = true;
        for(int i = 0; i< string.length();i++){    
        char cage = string.charAt(i);
        if(Character.isDigit(cage) || Character.isLetter(cage)){
            return false;}
        else{
            bal = true;
                }
            }
            return bal;
        }
    }
