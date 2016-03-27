package vasylchenko.module9;

import vasylchenko.module3.mod3_1.Directory;
import vasylchenko.module3.mod3_1.File;
import vasylchenko.module3.mod3_3.MusicShop;
import vasylchenko.module3.mod3_3.MusicalInstrument;

/**
 * Created by v.vasilchenko on 27.03.2016.
 */
public class SimpleCesarCipher {
    private static int offsetForCesarCipher = 12;

    public static void main(String[] args) {

        Directory directory = new Directory().createFileList();
        for (File file : directory.getFileList()) {
            String s = SimpleCesarCipher.encode(file.getName());
            System.out.printf("%-30s", s);
            s = SimpleCesarCipher.decode(s);
            System.out.printf("%-30s%n", s);
        }
        System.out.println("--------------------------------------------------");
        MusicShop musicShop = new MusicShop();
        musicShop.createShop(3, 3, 3);
        for (MusicalInstrument musicalInstrument : musicShop.getShopStock()) {
            String s = SimpleCesarCipher.encode(musicalInstrument.getType());
            System.out.printf("%-30s", s);
            s = SimpleCesarCipher.decode(s);
            System.out.printf("%-30s%n", s);

        }
    }

    public static String decode(String enc) {
        return encode(enc);
    }

    public static String encode(String enc) {
        offsetForCesarCipher = (26 - offsetForCesarCipher) % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offsetForCesarCipher) % 26));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offsetForCesarCipher) % 26));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
}
