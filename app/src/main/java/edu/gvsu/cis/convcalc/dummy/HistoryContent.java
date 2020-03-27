package edu.gvsu.cis.convcalc.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>

 */
public class HistoryContent {

    public static final List<HistoryItem> ITEMS = new ArrayList<HistoryItem>();

    /*
    public static final Map<String, HistoryItem> ITEM_MAP = new HashMap<String, HistoryItem>();
    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }
     */

    static {
        DateTime now = DateTime.now();
        addItem(new HistoryItem(2.0, 1.829, "Length", "Yards", "Meters", now.minusDays(1)));
        addItem(new HistoryItem(1.0, 3.785, "Volume", "Gallons", "Liters", now.minusDays(1)));
        addItem(new HistoryItem(2.0, 1.829, "Length", "Yards", "Meters", now.plusDays(1)));
        addItem(new HistoryItem(1.0, 3.785, "Volume", "Gallons", "Liters", now.plusDays(1)));
    }


    public static void addItem(HistoryItem item) {
        ITEMS.add(item);
        //ITEM_MAP.put(item.id, item);
    }

    /*
    private static HistoryItem createDummyItem(int position) {
        return new HistoryItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
     */

    public static class HistoryItem {
        public final Double fromVal;
        public final Double toVal;
        public final String mode;
        public final String fromUnits;
        public final String toUnits;

        public final DateTime timestamp;

        public HistoryItem(Double fromVal, Double toVal, String mode,
                           String fromUnits, String toUnits, DateTime timestamp) {
            this.fromVal = fromVal;
            this.toVal = toVal;
            this.mode = mode;
            this.fromUnits = fromUnits;
            this.toUnits = toUnits;
            this.timestamp = timestamp;
        }

        @Override
        public String toString() {
            return this.fromVal + " " + this.fromUnits + " = " + this.toVal + " " + this.toUnits;
        }
    }
}
