package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.MediaSource.Factory;
import com.google.common.base.Q;

public final class y implements Q {
    public final Factory a;

    public y(Factory mediaSource$Factory0) {
        this.a = mediaSource$Factory0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return Builder.p(this.a);
    }
}

