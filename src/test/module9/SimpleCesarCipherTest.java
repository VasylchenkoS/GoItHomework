package test.module9;

import org.junit.Assert;
import org.junit.Test;
import vasylchenko.module9.SimpleCesarCipher;

public class SimpleCesarCipherTest {

    private String inputString = "Some test text";
    private String outputExpected;

    @Test
    public void testCode() throws Exception {
        outputExpected = SimpleCesarCipher.decode(SimpleCesarCipher.encode(inputString));
        Assert.assertEquals(outputExpected, inputString);
    }
}