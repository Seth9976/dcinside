package androidx.media3.exoplayer.source;

import com.google.common.base.Q;

public final class i implements Q {
    public final Class a;

    public i(Class class0) {
        this.a = class0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return DefaultMediaSourceFactory.p(this.a);
    }
}

