package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import com.google.common.base.I;

public final class c implements I {
    public final DefaultTrackSelector a;

    public c(DefaultTrackSelector defaultTrackSelector0) {
        this.a = defaultTrackSelector0;
    }

    @Override  // com.google.common.base.I
    public final boolean apply(Object object0) {
        return this.a.O(((Format)object0));
    }
}

