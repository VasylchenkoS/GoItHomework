package vasylchenko.module10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by v.vasilchenko on 27.03.2016.
 */
public class TryingIOTextFile {
    public static void main(String[] args) throws IOException {
        TryingIOTextFile ioTextFile = new TryingIOTextFile();
        try {
            ioTextFile.fileWrite();
            System.out.println("----------------------------------");
            ioTextFile.fileRead();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileWrite() throws IOException {
        FileWriter fileWriter = null;
        StringBuilder s = new StringBuilder();
        try {
            fileWriter = new FileWriter("D://Home//Java//MyProjects//Modules//src//vasylchenko//module10//write.txt");
            System.out.println("Enter text that has been writhing to file");
            Scanner scan = new Scanner(System.in);
            s.append(scan.nextLine() + "\n");
            s.append(scan.nextLine() + "\n");
            s.append(scan.nextLine() + "\n");
            System.out.println("Text was accepted");
            fileWriter.write(s.toString());
        } finally {
            if (fileWriter != null)
                fileWriter.close();
        }
    }

    public void fileRead() throws IOException {
        String s = "";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader
                    (new FileReader("D://Home//Java//MyProjects//Modules//src//vasylchenko//module10//write.txt"));
            while ((s = bufferedReader.readLine()) != null)
                System.out.println(s);
        } finally {
            if (bufferedReader != null)
                bufferedReader.close();
        }
    }
}
