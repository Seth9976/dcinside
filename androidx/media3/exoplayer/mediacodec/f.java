package androidx.media3.exoplayer.mediacodec;

import com.google.common.base.Q;

public final class f implements Q {
    public final int a;

    public f(int v) {
        this.a = v;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return Factory.g(this.a);
    }
}

