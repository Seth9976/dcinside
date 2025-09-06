package androidx.media3.exoplayer.drm;

import androidx.media3.common.Format;

public final class f implements Runnable {
    public final PreacquiredSessionReference a;
    public final Format b;

    public f(PreacquiredSessionReference defaultDrmSessionManager$PreacquiredSessionReference0, Format format0) {
        this.a = defaultDrmSessionManager$PreacquiredSessionReference0;
        this.b = format0;
    }

    @Override
    public final void run() {
        this.a.d(this.b);
    }
}

