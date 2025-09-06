package androidx.media3.extractor.text.webvtt;

import java.util.Comparator;

public final class b implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return WebvttSubtitle.f(((WebvttCueInfo)object0), ((WebvttCueInfo)object1));
    }
}

