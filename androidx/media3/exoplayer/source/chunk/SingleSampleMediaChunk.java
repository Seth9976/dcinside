package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;

@UnstableApi
public final class SingleSampleMediaChunk extends BaseMediaChunk {
    private final int o;
    private final Format p;
    private long q;
    private boolean r;

    public SingleSampleMediaChunk(DataSource dataSource0, DataSpec dataSpec0, Format format0, int v, @Nullable Object object0, long v1, long v2, long v3, int v4, Format format1) {
        super(dataSource0, dataSpec0, format0, v, object0, v1, v2, 0x8000000000000001L, 0x8000000000000001L, v3);
        this.o = v4;
        this.p = format1;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
    public void b() {
    }

    @Override  // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean g() {
        return this.r;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
    public void w() throws IOException {
        BaseMediaChunkOutput baseMediaChunkOutput0 = this.i();
        baseMediaChunkOutput0.c(0L);
        TrackOutput trackOutput0 = baseMediaChunkOutput0.b(0, this.o);
        trackOutput0.d(this.p);
        try {
            DataSpec dataSpec0 = this.b.e(this.q);
            long v2 = this.i.a(dataSpec0);
            if(v2 != -1L) {
                v2 += this.q;
            }
            DefaultExtractorInput defaultExtractorInput0 = new DefaultExtractorInput(this.i, this.q, v2);
            for(int v = 0; v != -1; v = trackOutput0.e(defaultExtractorInput0, 0x7FFFFFFF, true)) {
                this.q += (long)v;
            }
            trackOutput0.f(this.g, 1, ((int)this.q), 0, null);
        }
        finally {
            DataSourceUtil.a(this.i);
        }
        this.r = true;
    }
}

