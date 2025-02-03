/*Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
*/

import java.lang.Math;


public class NearHundred {
    public static void main(String[] args){
        System.err.println(nearValueHun(93));
        System.err.println(nearValueHun(90));
        System.err.println(nearValueHun(89));
    }

    public static boolean nearValueHun(int n){

        boolean isNear = false; // vairable to store the boolean value
        int difference = 10; // variable to store the difference

        //The if condition has an OR operator to check two condition,
        //The Math.abs takes a int parameter value, we are subtracing the input value from 100/200 to check
        //if the result is less than or equal to 10, if YES we turn true else false.
        if (Math.abs(100 - n) <= difference || Math.abs(200-n) <= difference) {
            isNear = true; // value falged to true
        }

        return isNear; //return boolean value
    }
    
}
