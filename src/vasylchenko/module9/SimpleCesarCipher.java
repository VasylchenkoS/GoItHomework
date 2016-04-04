package vasylchenko.module9;

import vasylchenko.module3.mod3_1.Directory;
import vasylchenko.module3.mod3_1.File;
import vasylchenko.module3.mod3_3.MusicShop;
import vasylchenko.module3.mod3_3.MusicalInstrument;

public class SimpleCesarCipher {
    private static int OFFSET_FOR_CHAR_ELEMENT = 5;
    private static int OFFSET_FOR_DIGIT_ELEMENT = 5;

    public static void main(String[] args) {

        Directory directory = new Directory().createFileList();
        for (File file : directory.getFileList()) {
            String s = file.getName();
            printCodeDecode(s);
        }
        System.out.println("--------------------------------------------------");
        MusicShop musicShop = new MusicShop();
        musicShop.createShop(3, 3, 3);
        for (MusicalInstrument musicalInstrument : musicShop.getShopStock()) {
            String s = musicalInstrument.getType();
            printCodeDecode(s);
        }
    }

    static void printCodeDecode(String s) {
        System.out.printf("%-30s", s);
        s = SimpleCesarCipher.encode(s);
        System.out.printf("%-30s", s);
        s = SimpleCesarCipher.decode(s);
        System.out.printf("%-30s%n", s);
    }

    public static String decode(String enc) {
        if (enc.length() == 0) throw new NullPointerException("String is empty. Nothing to decode");
        return encode(enc);
    }

    public static String encode(String enc) {
        if (enc.length() == 0) throw new NullPointerException("String is empty. Nothing to encode");
        OFFSET_FOR_DIGIT_ELEMENT = (10 - OFFSET_FOR_DIGIT_ELEMENT) % 10 + 10;
        OFFSET_FOR_CHAR_ELEMENT = (26 - OFFSET_FOR_CHAR_ELEMENT) % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + OFFSET_FOR_CHAR_ELEMENT) % 26));
                } else encoded.append((char) ('a' + (i - 'a' + OFFSET_FOR_CHAR_ELEMENT) % 26));
            } else if (Character.isDigit(i))
                encoded.append((char) ('0' + (i - '0' + OFFSET_FOR_DIGIT_ELEMENT) % 10));
            else encoded.append(i);
        }
        return encoded.toString();
    }
}
