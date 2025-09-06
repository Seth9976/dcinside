package androidx.media3.extractor.text.webvtt;

import java.util.Comparator;

public final class a implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Element.e(((Element)object0), ((Element)object1));
    }
}

