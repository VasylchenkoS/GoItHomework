package test.module10;

import org.junit.BeforeClass;
import org.junit.Test;
import vasylchenko.module10.TryingIOTextFile;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TryingIOTextFileTest {

    private static final String expectedText = "some test text";
    private static TryingIOTextFile tryingIOTextFile;

    @BeforeClass
    public static void setUpClass() throws Exception{
        tryingIOTextFile = new TryingIOTextFile();
    }

    @Test (timeout = 1000)
    public void testFileReadWrite() throws Exception {
        tryingIOTextFile.fileWrite(expectedText);
        assertTrue(new File(TryingIOTextFile.READ_WRITE_PATH).exists());
        String result = tryingIOTextFile.fileRead();
        assertEquals(expectedText, result);
    }

}