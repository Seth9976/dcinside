package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;

@UnstableApi
public interface TimeToFirstByteEstimator {
    void a(DataSpec arg1);

    long b();

    void c(DataSpec arg1);

    void reset();
}

