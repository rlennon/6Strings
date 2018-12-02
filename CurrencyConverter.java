
import java.util.*;
public class CurrencyConverter {
    private float exchange,  output,  input;
    private int conversion;
    public CurrencyConverter() {
    }
    public float DollarsBananaBucks(float input, float exchange) {
        output = (input / exchange);
        return output;
    }
    public float BananaBucksDollars(float input, float exchange) {
        output = (input * exchange);
        return output;
    }
}