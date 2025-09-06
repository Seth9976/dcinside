package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@UnstableApi
public final class LoadEventInfo {
    public final long a;
    public final DataSpec b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;
    private static final AtomicLong h;

    static {
        LoadEventInfo.h = new AtomicLong();
    }

    public LoadEventInfo(long v, DataSpec dataSpec0, long v1) {
        Map map0 = Collections.emptyMap();
        this(v, dataSpec0, dataSpec0.a, map0, v1, 0L, 0L);
    }

    public LoadEventInfo(long v, DataSpec dataSpec0, Uri uri0, Map map0, long v1, long v2, long v3) {
        this.a = v;
        this.b = dataSpec0;
        this.c = uri0;
        this.d = map0;
        this.e = v1;
        this.f = v2;
        this.g = v3;
    }

    public static long a() {
        return LoadEventInfo.h.getAndIncrement();
    }
}

