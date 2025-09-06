package androidx.media3.exoplayer.trackselection;

import java.util.Comparator;
import java.util.List;

public final class i implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return VideoTrackInfo.g(((List)object0), ((List)object1));
    }
}

