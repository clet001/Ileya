import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEvenOddSplit{

    @Test
public void TestEvenOddSplit() {
EvenOddSplit Split = new EvenOddSplit();
int[][] expected = {{60,10,22},{45,3,9}};
int[][] actual = Split.EvenOdd();
assertArrayEquals(expected,actual);



}



}
