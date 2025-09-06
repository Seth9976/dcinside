package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import java.util.Comparator;

public final class a implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return BaseTrackSelection.x(((Format)object0), ((Format)object1));
    }
}

