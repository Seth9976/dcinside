package androidx.media3.exoplayer.trackselection;

import java.util.Comparator;

public final class b implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return DefaultTrackSelector.V(((Integer)object0), ((Integer)object1));
    }
}

