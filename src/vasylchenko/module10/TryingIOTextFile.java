package vasylchenko.module10;

import vasylchenko.module9.SimpleCesarCipher;

import java.io.*;
import java.util.InputMismatchException;
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
        } catch (Exception e) {
            System.err.println("[Error:]" + e.getMessage());
        }
    }

    public void fileWrite(String writeText) throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(READ_WRITE_PATH))) {
            System.out.println("Text was accepted. You text is:");
            System.out.println(writeText);
            bufferedWriter.write(SimpleCesarCipher.encode(writeText));
        } catch (IOException e) {
            System.err.println("[Error:]An IOException was caught :" + e.getMessage());
        }
    }

    public String fileRead() throws IOException {
        String s;
        String result = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(READ_WRITE_PATH))) {
            while ((s = bufferedReader.readLine()) != null) {
                result += SimpleCesarCipher.decode(s);
                System.out.println("Text before decode :\n" + s);
                System.out.println("Text after decode :\n" + result);
            }
        } catch (IOException e) {
            System.err.println("[Error:]An IOException was caught :" + e.getMessage());
        }
        return result;
    }

    private String scanString() {
        String s = null;
        try (Scanner scan = new Scanner(System.in)) {
            s = scan.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("[Error:]" + e.getMessage());
        } catch (Exception e) {
            System.err.println("[Error:]An IOException was caught :" + e.getMessage());
        }
        return s;
    }
}
