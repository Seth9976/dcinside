package androidx.media3.exoplayer.trackselection;

import java.util.Comparator;

public final class w implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return VideoTrackInfo.e(((VideoTrackInfo)object0), ((VideoTrackInfo)object1));
    }
}

