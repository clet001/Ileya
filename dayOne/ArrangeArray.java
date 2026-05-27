public class ArrangeArray{

public static void moveZeros(int[] numbers){

    int position = 0;

    for(int count = 0; count < numbers.length; i++){
    
        if(numbers[count] != 0){
        
            numbers[position] = numbers[count];
            position++;
        }
    }

    
}

}
