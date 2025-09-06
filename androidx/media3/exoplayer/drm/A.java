package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Consumer;

public final class a implements Consumer {
    public final int a;

    public a(int v) {
        this.a = v;
    }

    @Override  // androidx.media3.common.util.Consumer
    public final void accept(Object object0) {
        DefaultDrmSession.w(this.a, ((EventDispatcher)object0));
    }
}

