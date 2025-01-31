/*sleepInCheckparameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
*/



public class sleepInCheck {
    public static void main(String[] args) {

        System.out.println(sleepIn(false, false));;
        
    }
    // method that takes two parameter
    static boolean sleepIn(boolean weekday, boolean vacation){
        if (weekday && !vacation){ // checks if its weekday and not vacation
            return false;
        } else {
            return true;
        }
    }
}

