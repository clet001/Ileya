import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPalindrome {

    
    @Test
    public void testWedaPalindromeReturnsTrue() {
        int[] input = {45, 0, 8, 0, 45};
        boolean actual = Palindrome.isPalindrome(input);
        assertEquals(true, actual);
    }

    
    @Test
    public void testWedaPalindromeReturnsFalse() {
        int[] input = {45, 0, 8, 0, 12};
        boolean actual = Palindrome.isPalindrome(input);
        assertEquals(false, actual);
    }
}

