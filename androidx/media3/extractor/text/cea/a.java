package androidx.media3.extractor.text.cea;

import java.util.Comparator;

public final class a implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Cea708CueInfo.c(((Cea708CueInfo)object0), ((Cea708CueInfo)object1));
    }
}

