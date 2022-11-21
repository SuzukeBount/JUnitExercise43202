import org.example.Verification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VerificationTest {
    private Verification vf = new Verification();

    @DisplayName("Teste de número primos")
    @ParameterizedTest
    @ValueSource(ints = { 3, 23, 311, 487, 653, 947})
    public void primeTest(int arg){
        assertFalse(vf.isPrime(arg));
    }

    @DisplayName("Teste de número pares")
    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    public void parTest(int arg){
        assertFalse(vf.isPrime(arg));
    }

    @DisplayName("Teste de número pares")
    @ParameterizedTest
    @ValueSource(ints = {23, 23, 46, 115, 184, 207, 230})
    public void multTest(int arg){
        int num = 4;
        assertTrue(vf.isMultiple(arg, num));
    }
}
