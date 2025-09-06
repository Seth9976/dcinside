package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Consumer;

public final class d implements Consumer {
    public final Throwable a;

    public d(Throwable throwable0) {
        this.a = throwable0;
    }

    @Override  // androidx.media3.common.util.Consumer
    public final void accept(Object object0) {
        DefaultDrmSession.v(this.a, ((EventDispatcher)object0));
    }
}

