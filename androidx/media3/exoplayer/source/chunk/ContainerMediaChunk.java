package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;

@UnstableApi
public class ContainerMediaChunk extends BaseMediaChunk {
    private final int o;
    private final long p;
    private final ChunkExtractor q;
    private long r;
    private volatile boolean s;
    private boolean t;

    public ContainerMediaChunk(DataSource dataSource0, DataSpec dataSpec0, Format format0, int v, @Nullable Object object0, long v1, long v2, long v3, long v4, long v5, int v6, long v7, ChunkExtractor chunkExtractor0) {
        super(dataSource0, dataSpec0, format0, v, object0, v1, v2, v3, v4, v5);
        this.o = v6;
        this.p = v7;
        this.q = chunkExtractor0;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
    public final void b() {
        this.s = true;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.MediaChunk
    public long f() {
        return this.j + ((long)this.o);
    }

    @Override  // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean g() {
        return this.t;
    }

    protected TrackOutputProvider k(BaseMediaChunkOutput baseMediaChunkOutput0) [...] // Inlined contents

    private void l(BaseMediaChunkOutput baseMediaChunkOutput0) {
        if(!MimeTypes.r(this.d.m)) {
            return;
        }
        int v = this.d.I;
        if((v > 1 || this.d.J > 1) && v != -1 && this.d.J != -1) {
            TrackOutput trackOutput0 = baseMediaChunkOutput0.b(0, 4);
            int v2 = this.d.J * this.d.I;
            long v3 = (this.h - this.g) / ((long)v2);
            for(int v1 = 1; v1 < v2; ++v1) {
                trackOutput0.b(new ParsableByteArray(), 0);
                trackOutput0.f(((long)v1) * v3, 0, 0, 0, null);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
    public final void w() throws IOException {
        BaseMediaChunkOutput baseMediaChunkOutput0 = this.i();
        if(this.r == 0L) {
            baseMediaChunkOutput0.c(this.p);
            this.q.c(baseMediaChunkOutput0, (this.k == 0x8000000000000001L ? 0x8000000000000001L : this.k - this.p), (this.l == 0x8000000000000001L ? 0x8000000000000001L : this.l - this.p));
        }
        try {
            DataSpec dataSpec0 = this.b.e(this.r);
            long v1 = this.i.a(dataSpec0);
            DefaultExtractorInput defaultExtractorInput0 = new DefaultExtractorInput(this.i, dataSpec0.g, v1);
            try {
                while(!this.s && this.q.a(defaultExtractorInput0)) {
                }
                this.l(baseMediaChunkOutput0);
            }
            finally {
                this.r = defaultExtractorInput0.getPosition() - this.b.g;
            }
        }
        finally {
            DataSourceUtil.a(this.i);
        }
        this.t = !this.s;
    }
}

