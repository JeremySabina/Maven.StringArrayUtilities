package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (int arrayValue = 0; arrayValue < array.length; arrayValue++) {
            if (array[arrayValue] == value) {
                return true;
            }

        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList newArray = new ArrayList(Arrays.asList(array));
        Collections.reverse(newArray);

        String[] reversedArray = (String[]) newArray.toArray(new String[0]);
        return reversedArray;
    }
// ASK LEON HERE********

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] palindromicReverse = reverse(array);
        if (Arrays.equals(palindromicReverse, array)) {
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {


        ArrayList<String> stringOfArrays = new ArrayList<String>(Arrays.asList(array));

        String stringIndex = stringOfArrays.toString().toLowerCase();
        String stringOfLetters = "abcedfghijklmnopqrstuvwxyz";

        for (int iterator = 0; iterator < stringOfLetters.length(); iterator++) {
            if (stringIndex.indexOf(stringOfLetters.charAt(iterator)) == -1) {

                return false;
            }
        }
        return true;
    }

    // Found online. Did not return true. not sure why.

 /*           boolean[] mark = new boolean[26];
            int index;
            for (int i = 0; i < newLowercaseArray.length(); i++) {

                if ('a' <= newLowercaseArray.charAt(i) && newLowercaseArray.charAt(i) <= 'z')
                    index = newLowercaseArray.charAt(i) - 'a';
                else
                    continue;
                mark[index] = true;
            }

            for (int i = 0; i <= 25; i++) {
                if (mark[i] == false) {
                    return (false);
                }

            }
                return (true);
        }

*/

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO

    // Find number of times that value comes up
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numberOfOccurrences = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                numberOfOccurrences++;
            }
        }

        return numberOfOccurrences;
    }

//    }
//    int numberOfOccurrences = 0;
//        for (int i = 0; i < array.length; i++) {
//        if (array[i] == value) {
//            numberOfOccurrences += value.length();
//        }
//        return numberOfOccurrences;
//    }
//        return numberOfOccurrences;
//
//}

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        ArrayList<String> removeArrayElement = new ArrayList(Arrays.asList(array));

        while (removeArrayElement.contains(valueToRemove)) {
            removeArrayElement.remove(valueToRemove);
        }
        String[] lastRemoval = removeArrayElement.toArray(new String[0]);

        return lastRemoval;
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {


        ArrayList<String> stringArray = new ArrayList<String>();
        // ArrayList<String> newList = new ArrayList<String>(); // WHYYYYYYYYYYY
        stringArray.add(array[0]);

        for (int iter = 1; iter < array.length; iter++) {

            if (array[iter] != array[iter - 1]) {
                stringArray.add(array[iter]);

            }
        }
        return stringArray.toArray(new String[stringArray.size()]);
    }


    // FAILS THE TEST BUT IS ON THE RIGHT TRACK I THINK>>>

    // DOESNT FAIL NOW


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO


    // What the hell is happening.. each time it loops, its
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> packedList = new ArrayList<String>();
        String firstElement = array[0];
        packedList.add(firstElement);

        for (int currentIndex = 1; currentIndex < array.length; currentIndex++) {
            String currentElement = array[currentIndex];
            String nextElement = array[currentIndex + 1];
            boolean sameElement = currentElement.equals(nextElement);

            if (sameElement) {

                packedList.add(currentElement);
            }
        }


        return packedList.toArray(new String[packedList.size()]);
    }
}

/*            } (array[iter] == array[iter + 2])
                packedArray.add(array[iter]);*/


          //  } else if (array[iter] != array[iter - 1]){
              //      packedArray.add(stringArrray);