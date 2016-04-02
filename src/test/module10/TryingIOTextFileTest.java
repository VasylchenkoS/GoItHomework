package test.module10;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import vasylchenko.module10.TryingIOTextFile;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TryingIOTextFileTest {
    private static final String testText = "some test text";
    @ClassRule
    public static TemporaryFolder folder = new TemporaryFolder();
    private static TryingIOTextFile tryingIOTextFile;
    private static File file;

    @BeforeClass
    public static void setUpClass() throws Exception{
        tryingIOTextFile = new TryingIOTextFile();
        file = folder.newFile("test.txt");
    }

    @Test (timeout = 1000)
    public void testFileReadWrite() throws Exception {
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        out.write(testText);
        out.close();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String expected = reader.readLine();
        tryingIOTextFile.fileWrite(testText);
        assertTrue(new File(TryingIOTextFile.READ_WRITE_PATH).exists());
        String result = tryingIOTextFile.fileRead();
        assertEquals(expected, result);
    }

}