public class Palindrome{
    public static boolean isPalindrome(int [] input){



        for (int count = 0; count < input.length/2; count++ ){

            if(input[count] != input[input.length -1 - count]){

            return false

            }

            else{
                return true
                
            }
    

        }


    }


}
