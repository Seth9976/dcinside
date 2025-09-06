package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.extractor.DefaultExtractorInput;
import java.io.IOException;

@UnstableApi
public final class InitializationChunk extends Chunk {
    private final ChunkExtractor j;
    private TrackOutputProvider k;
    private long l;
    private volatile boolean m;

    public InitializationChunk(DataSource dataSource0, DataSpec dataSpec0, Format format0, int v, @Nullable Object object0, ChunkExtractor chunkExtractor0) {
        super(dataSource0, dataSpec0, 2, format0, v, object0, 0x8000000000000001L, 0x8000000000000001L);
        this.j = chunkExtractor0;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
    public void b() {
        this.m = true;
    }

    public void f(TrackOutputProvider chunkExtractor$TrackOutputProvider0) {
        this.k = chunkExtractor$TrackOutputProvider0;
    }

    @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
    public void w() throws IOException {
        if(this.l == 0L) {
            this.j.c(this.k, 0x8000000000000001L, 0x8000000000000001L);
        }
        try {
            DataSpec dataSpec0 = this.b.e(this.l);
            long v1 = this.i.a(dataSpec0);
            DefaultExtractorInput defaultExtractorInput0 = new DefaultExtractorInput(this.i, dataSpec0.g, v1);
            try {
                while(!this.m && this.j.a(defaultExtractorInput0)) {
                }
            }
            finally {
                this.l = defaultExtractorInput0.getPosition() - this.b.g;
            }
        }
        finally {
            DataSourceUtil.a(this.i);
        }
    }
}

