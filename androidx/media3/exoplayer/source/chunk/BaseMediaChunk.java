package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;

@UnstableApi
public abstract class BaseMediaChunk extends MediaChunk {
    public final long k;
    public final long l;
    private BaseMediaChunkOutput m;
    private int[] n;

    public BaseMediaChunk(DataSource dataSource0, DataSpec dataSpec0, Format format0, int v, @Nullable Object object0, long v1, long v2, long v3, long v4, long v5) {
        super(dataSource0, dataSpec0, format0, v, object0, v1, v2, v5);
        this.k = v3;
        this.l = v4;
    }

    public final int h(int v) {
        return ((int[])Assertions.k(this.n))[v];
    }

    protected final BaseMediaChunkOutput i() {
        return (BaseMediaChunkOutput)Assertions.k(this.m);
    }

    public void j(BaseMediaChunkOutput baseMediaChunkOutput0) {
        this.m = baseMediaChunkOutput0;
        this.n = baseMediaChunkOutput0.a();
    }
}

