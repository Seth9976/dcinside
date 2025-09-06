package androidx.media3.exoplayer;

import com.google.common.base.Q;

public final class v implements Q {
    public final RenderersFactory a;

    public v(RenderersFactory renderersFactory0) {
        this.a = renderersFactory0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return Builder.q(this.a);
    }
}

