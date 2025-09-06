package androidx.media3.exoplayer;

import com.google.common.base.Q;

public final class o implements Q {
    public final LoadControl a;

    public o(LoadControl loadControl0) {
        this.a = loadControl0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return Builder.g(this.a);
    }
}

