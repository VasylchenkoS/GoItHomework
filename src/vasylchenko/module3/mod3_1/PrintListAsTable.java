package vasylchenko.module3.mod3_1;

import java.util.Collection;


public class PrintListAsTable {
    PrintListAsTable(Collection<File> printList) {
        if (printList == null) throw new NullPointerException("Collection is empty. Nothing to sort");
        System.out.printf("||%-30s||%-10s||%-10s%n", "Name", "Type", "Size");
        for (File file : printList) {
            System.out.printf("||%-30s||%-10s||%-10d%n", file.getName(), file.getType(), file.getSize());
        }
        System.out.println("\n");
    }
}
