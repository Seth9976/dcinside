package androidx.media3.exoplayer.source.chunk;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.upstream.Loader.Loadable;
import java.util.Map;

@UnstableApi
public abstract class Chunk implements Loadable {
    public final long a;
    public final DataSpec b;
    public final int c;
    public final Format d;
    public final int e;
    @Nullable
    public final Object f;
    public final long g;
    public final long h;
    protected final StatsDataSource i;

    public Chunk(DataSource dataSource0, DataSpec dataSpec0, int v, Format format0, int v1, @Nullable Object object0, long v2, long v3) {
        this.i = new StatsDataSource(dataSource0);
        this.b = (DataSpec)Assertions.g(dataSpec0);
        this.c = v;
        this.d = format0;
        this.e = v1;
        this.f = object0;
        this.g = v2;
        this.h = v3;
        this.a = LoadEventInfo.a();
    }

    public final long a() {
        return this.i.u();
    }

    public final long c() {
        return this.h - this.g;
    }

    public final Map d() {
        return this.i.w();
    }

    public final Uri e() {
        return this.i.v();
    }
}

