package androidx.media3.exoplayer.upstream;

import java.util.Comparator;

public final class i implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return SlidingPercentile.h(((Sample)object0), ((Sample)object1));
    }
}

