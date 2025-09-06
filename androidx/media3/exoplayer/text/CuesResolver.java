package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.O2;

interface CuesResolver {
    O2 a(long arg1);

    long b(long arg1);

    void c(long arg1);

    void clear();

    boolean d(CuesWithTiming arg1, long arg2);

    long e(long arg1);
}

