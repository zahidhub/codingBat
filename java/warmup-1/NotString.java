/*Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad" */

public class NotString {
    public static void main(String[] args){

        System.out.println(notString("not")); //print statement for the method called
        System.out.println(notString("hello")); //print statement for the method called
        System.out.println(notString("gay")); //print statement for the method called
    }

    public static String notString(String str){

        String inputString = str; //stores the userinput string in the variable
        String newString = "not " + str; //adds the word not to the string

        //Checks if the word has more than or equal to 3 words and if the first three words are 'not'
        if (inputString.length() >= 3 && inputString.substring(0, 3).equals("not")) { 
            return inputString; //if true, it returns the userinput
        }
        return newString; //else it return the new string made with 'not'
    } 
}
