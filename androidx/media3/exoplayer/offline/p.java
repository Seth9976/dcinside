package androidx.media3.exoplayer.offline;

import androidx.media3.datasource.cache.CacheWriter.ProgressListener;

public final class p implements ProgressListener {
    public final ProgressiveDownloader a;

    public p(ProgressiveDownloader progressiveDownloader0) {
        this.a = progressiveDownloader0;
    }

    @Override  // androidx.media3.datasource.cache.CacheWriter$ProgressListener
    public final void a(long v, long v1, long v2) {
        this.a.d(v, v1, v2);
    }
}

