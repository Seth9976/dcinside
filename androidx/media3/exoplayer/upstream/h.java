package androidx.media3.exoplayer.upstream;

import java.util.Comparator;

public final class h implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return SlidingPercentile.g(((Sample)object0), ((Sample)object1));
    }
}

