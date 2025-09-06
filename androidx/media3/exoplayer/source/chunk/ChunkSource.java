package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;
import java.util.List;

@UnstableApi
public interface ChunkSource {
    boolean a(Chunk arg1, boolean arg2, LoadErrorInfo arg3, LoadErrorHandlingPolicy arg4);

    void b() throws IOException;

    long c(long arg1, SeekParameters arg2);

    void d(Chunk arg1);

    void e(LoadingInfo arg1, long arg2, List arg3, ChunkHolder arg4);

    int g(long arg1, List arg2);

    boolean i(long arg1, Chunk arg2, List arg3);

    void release();
}

