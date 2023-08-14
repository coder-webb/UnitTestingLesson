import java.security.InvalidAlgorithmParameterException;

public class Airplane {
    double miles;

    public void Fly(double distance) throws Exception
    {
        if (distance < 0)
            throw new InvalidAlgorithmParameterException("Cannot fly negative miles");

        miles += distance;
    }
}
