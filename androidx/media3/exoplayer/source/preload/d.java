package androidx.media3.exoplayer.source.preload;

import com.google.common.base.I;

public final class d implements I {
    public final long a;

    public d(long v) {
        this.a = v;
    }

    @Override  // com.google.common.base.I
    public final boolean apply(Object object0) {
        return SourcePreloadControl.j(this.a, ((Status)object0));
    }
}

