package androidx.media3.extractor.text;

import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O2;
import java.util.List;

@UnstableApi
public class CuesWithTiming {
    public final O2 a;
    public final long b;
    public final long c;
    public final long d;

    public CuesWithTiming(List list0, long v, long v1) {
        this.a = O2.r(list0);
        this.b = v;
        this.c = v1;
        this.d = v == 0x8000000000000001L || v1 == 0x8000000000000001L ? 0x8000000000000001L : v + v1;
    }
}

