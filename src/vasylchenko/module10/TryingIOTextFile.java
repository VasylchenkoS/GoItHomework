package vasylchenko.module10;

import vasylchenko.module9.SimpleCesarCipher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TryingIOTextFile {

    public static final String READ_WRITE_PATH = "D://Home//Java//MyProjects//Modules//src//vasylchenko//module10//write.txt";

    public static void main(String[] args) throws IOException {
        TryingIOTextFile ioTextFile = new TryingIOTextFile();
        try {
            System.out.println("Enter text that has been writhing to file");
            ioTextFile.fileWrite(ioTextFile.scanString());
            System.out.println("----------------------------------");
            ioTextFile.fileRead();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileWrite(String writeText) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(READ_WRITE_PATH);
            System.out.println("Text was accepted. You text is:");
            System.out.println(writeText);
            fileWriter.write(SimpleCesarCipher.encode(writeText));
        } finally {
            if (fileWriter != null)
                fileWriter.close();
        }
    }

    private String scanString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public String fileRead() throws IOException {
        String s;
        String result="";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader
                    (new FileReader(READ_WRITE_PATH));
            while ((s = bufferedReader.readLine()) != null) {
                result += SimpleCesarCipher.decode(s);
                System.out.println("Text before decode :\n" + s);
                System.out.println("Text after decode :\n" + result);
            }
        } finally {

            if (bufferedReader != null)
                bufferedReader.close();
        }
        return result;
    }
}
