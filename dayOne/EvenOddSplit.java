import java.util.Arrays;

public class EvenOddSplit{

    public int[][] EvenOdd(){

        int[] numbers = {45, 60, 3, 10, 9, 22};

       

        int[] storeEven= new int[numbers.length];
        int[] storeOdd = new int[numbers.length];

        int Even = 0;
        int Odd = 0;

        for(int count = 0; count<numbers.length; count++){

        if(numbers[count] % 2 == 0){

        storeEven[Even] = numbers[count];
        Even++;



        }

        else if(numbers[count] % 2 != 0){

        storeOdd[Odd] = numbers[count];
        Odd++;

        }
        
        

        }

         int[][] result = {storeEven, storeOdd};

        return result;






    }







}
