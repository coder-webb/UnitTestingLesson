import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testIsPrime2()
    {
        // Arrange - not useful in this example because we're testing a static method
        // used for testing non-static methods, this is where you would create a new instance

        // Act
        boolean actualResult = Main.isPrime(2);
        boolean expectedResult = true;

        // Assert
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testIsPrime17()
    {
        boolean actualResult = Main.isPrime(17);
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testIsPrime1()
    {
        boolean actualResult = Main.isPrime(1);
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testIsPrime0()
    {
        boolean actualResult = Main.isPrime(0);
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testIsPrime18()
    {
        boolean actualResult = Main.isPrime(18);
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testIsPrimeNegative3()
    {
        boolean actualResult = Main.isPrime(-3);
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testIsPrimeSpecialCase()
    {
        // Used if a case should throw an exception
        assertThrows(NullPointerException.class, () -> Main.isPrime(2022));
    }
}
