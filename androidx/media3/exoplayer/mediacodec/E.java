package androidx.media3.exoplayer.mediacodec;

import com.google.common.base.Q;

public final class e implements Q {
    public final int a;

    public e(int v) {
        this.a = v;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return Factory.f(this.a);
    }
}

