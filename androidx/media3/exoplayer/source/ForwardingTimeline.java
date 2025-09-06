package androidx.media3.exoplayer.source;

import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public abstract class ForwardingTimeline extends Timeline {
    protected final Timeline e;

    public ForwardingTimeline(Timeline timeline0) {
        this.e = timeline0;
    }

    @Override  // androidx.media3.common.Timeline
    public int e(boolean z) {
        return this.e.e(z);
    }

    @Override  // androidx.media3.common.Timeline
    public int f(Object object0) {
        return this.e.f(object0);
    }

    @Override  // androidx.media3.common.Timeline
    public int g(boolean z) {
        return this.e.g(z);
    }

    @Override  // androidx.media3.common.Timeline
    public int i(int v, int v1, boolean z) {
        return this.e.i(v, v1, z);
    }

    @Override  // androidx.media3.common.Timeline
    public Period k(int v, Period timeline$Period0, boolean z) {
        return this.e.k(v, timeline$Period0, z);
    }

    @Override  // androidx.media3.common.Timeline
    public int m() {
        return this.e.m();
    }

    @Override  // androidx.media3.common.Timeline
    public int r(int v, int v1, boolean z) {
        return this.e.r(v, v1, z);
    }

    @Override  // androidx.media3.common.Timeline
    public Object s(int v) {
        return this.e.s(v);
    }

    @Override  // androidx.media3.common.Timeline
    public Window u(int v, Window timeline$Window0, long v1) {
        return this.e.u(v, timeline$Window0, v1);
    }

    @Override  // androidx.media3.common.Timeline
    public int v() {
        return this.e.v();
    }
}

