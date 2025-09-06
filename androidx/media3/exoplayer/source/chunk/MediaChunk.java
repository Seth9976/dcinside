package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;

@UnstableApi
public abstract class MediaChunk extends Chunk {
    public final long j;

    public MediaChunk(DataSource dataSource0, DataSpec dataSpec0, Format format0, int v, @Nullable Object object0, long v1, long v2, long v3) {
        super(dataSource0, dataSpec0, 1, format0, v, object0, v1, v2);
        Assertions.g(format0);
        this.j = v3;
    }

    public long f() {
        return this.j == -1L ? -1L : this.j + 1L;
    }

    public abstract boolean g();
}

