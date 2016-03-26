package vasylchenko.module3.mod3_1;

import java.util.Collection;

/**
 * Created by v.vasilchenko on 26.03.2016.
 */
public class PrintListAsTable {
    PrintListAsTable(Collection<File> printList) {
        System.out.printf("||%-30s||%-10s||%-10s%n", "Name", "Type", "Size");
        for (File file : printList) {
            System.out.printf("||%-30s||%-10s||%-10d%n", file.getName(), file.getType(), file.getSize());
        }
        System.out.println("\n");
    }
}
