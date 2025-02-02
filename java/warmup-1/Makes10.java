/*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
*/

public class Makes10 {
    public static void main(String [] args){

        System.err.println(ifMakes10(1,9));
    }

    public static boolean ifMakes10(int a, int b){ //method to check if 10 exists or is contained in any variable
        boolean makes10 = false; //boolean to detect if 10 exists
        int sum = a+b; //sum of a,b integer

        if (a == 10 || b == 10 || sum == 10) { //checing if integer value of a and b is 10, or if the sum of the ineger value is 10
            return true; // return true if detected
        }

        return makes10; // return false
    }
}
