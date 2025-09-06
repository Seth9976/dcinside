package androidx.media3.extractor.metadata.mp4;

import java.util.Comparator;

public final class a implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Segment.a(((Segment)object0), ((Segment)object1));
    }
}

