package androidx.core.text.util;

import java.util.Comparator;

public final class a implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return LinkifyCompat.o(((LinkSpec)object0), ((LinkSpec)object1));
    }
}

