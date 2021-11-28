package co.jcuero.hackerrank;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author <a href="https://github.com/jcuero">Jose Fary Hurtado Cuero</a>
 * @since 27 nov. 2021
 */
public class MigratoryBirds {

    private MigratoryBirds() {
    }

    public static int migratoryBirds(List<Integer> arr) {
        List<Map.Entry<Integer, Long>> entries = arr.stream()
                                                    .collect(
                                                        Collectors.groupingBy(Integer::intValue, Collectors.counting())
                                                    )
                                                    .entrySet().stream().filter(item -> item.getValue() > 1)
                                                    .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                                                    .collect(Collectors.toList());

        if (entries.isEmpty()) {
            return arr.stream().sorted().collect(Collectors.toList()).get(0);
        }

        Iterator<Map.Entry<Integer, Long>> entryIterator = entries.iterator();
        Map.Entry<Integer, Long> selectedEntry = entryIterator.next();

        while (entryIterator.hasNext()) {
            Map.Entry<Integer, Long> currentEntry = entryIterator.next();

            if (currentEntry.getValue().equals(selectedEntry.getValue()) &&
                currentEntry.getKey() < selectedEntry.getKey()) {
                selectedEntry = currentEntry;
            }
        }

        return selectedEntry.getKey();
    }

}
