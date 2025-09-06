package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaSource;

public final class a implements Runnable {
    public final BasePreloadManager a;
    public final MediaSource b;

    public a(BasePreloadManager basePreloadManager0, MediaSource mediaSource0) {
        this.a = basePreloadManager0;
        this.b = mediaSource0;
    }

    @Override
    public final void run() {
        this.a.j(this.b);
    }
}

