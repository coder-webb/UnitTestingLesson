import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.security.InvalidAlgorithmParameterException;

import org.junit.Test;

public class AirplaneTest {
    @Test
    public void TestFlyPositive() throws Exception
    {
        // Arrange
        Airplane plane = new Airplane();
        // Act
        plane.Fly(2000);
        // Assert
        assertEquals(2000, plane.miles, 0);
    }
    @Test
    public void TestFlyNegative() throws Exception
    {
        // Arrange
        Airplane plane = new Airplane();
        // Assert
        assertThrows(InvalidAlgorithmParameterException.class, () -> plane.Fly(-2000));
    }
    @Test
    public void TestFlyMultiple() throws Exception
    {
        // Arrange
        Airplane plane = new Airplane();
        // Act
        plane.Fly(2000);
        plane.Fly(1000.5);
        plane.Fly(1000);
        // Assert
        assertEquals(4000.5, plane.miles, 0);
    }
}
