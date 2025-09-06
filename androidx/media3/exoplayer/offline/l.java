package androidx.media3.exoplayer.offline;

import java.util.Comparator;

public final class l implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return InternalHandler.d(((Download)object0), ((Download)object1));
    }
}

