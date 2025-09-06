package j$.time.format;

import java.util.Comparator;
import java.util.Map.Entry;

final class z implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((String)((Map.Entry)object1).getKey()).length() - ((String)((Map.Entry)object0).getKey()).length();
    }
}

