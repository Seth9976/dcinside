package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.AbstractConcatenatedTimeline;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.HashMap;
import java.util.Map;

@UnstableApi
@Deprecated
public final class LoopingMediaSource extends WrappingMediaSource {
    static final class InfinitelyLoopingTimeline extends ForwardingTimeline {
        public InfinitelyLoopingTimeline(Timeline timeline0) {
            super(timeline0);
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public int i(int v, int v1, boolean z) {
            int v2 = this.e.i(v, v1, z);
            return v2 == -1 ? this.e(z) : v2;
        }

        @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
        public int r(int v, int v1, boolean z) {
            int v2 = this.e.r(v, v1, z);
            return v2 == -1 ? this.g(z) : v2;
        }
    }

    static final class LoopingTimeline extends AbstractConcatenatedTimeline {
        private final Timeline h;
        private final int i;
        private final int j;
        private final int k;

        public LoopingTimeline(Timeline timeline0, int v) {
            boolean z = false;
            super(false, new UnshuffledShuffleOrder(v));
            this.h = timeline0;
            int v1 = timeline0.m();
            this.i = v1;
            this.j = timeline0.v();
            this.k = v;
            if(v1 > 0) {
                if(v <= 0x7FFFFFFF / v1) {
                    z = true;
                }
                Assertions.j(z, "LoopingMediaSource contains too many periods");
            }
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int A(int v) {
            return v / this.i;
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int B(int v) {
            return v / this.j;
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected Object E(int v) {
            return v;
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int G(int v) {
            return v * this.i;
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int H(int v) {
            return v * this.j;
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected Timeline K(int v) {
            return this.h;
        }

        @Override  // androidx.media3.common.Timeline
        public int m() {
            return this.i * this.k;
        }

        @Override  // androidx.media3.common.Timeline
        public int v() {
            return this.j * this.k;
        }

        @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        protected int z(Object object0) {
            return object0 instanceof Integer ? ((int)(((Integer)object0))) : -1;
        }
    }

    private final int m;
    private final Map n;
    private final Map o;

    public LoopingMediaSource(MediaSource mediaSource0) {
        this(mediaSource0, 0x7FFFFFFF);
    }

    public LoopingMediaSource(MediaSource mediaSource0, int v) {
        boolean z = false;
        super(new MaskingMediaSource(mediaSource0, false));
        if(v > 0) {
            z = true;
        }
        Assertions.a(z);
        this.m = v;
        this.n = new HashMap();
        this.o = new HashMap();
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        if(this.m == 0x7FFFFFFF) {
            return this.k.C(mediaSource$MediaPeriodId0, allocator0, v);
        }
        MediaPeriodId mediaSource$MediaPeriodId1 = mediaSource$MediaPeriodId0.a(AbstractConcatenatedTimeline.C(mediaSource$MediaPeriodId0.a));
        this.n.put(mediaSource$MediaPeriodId1, mediaSource$MediaPeriodId0);
        MediaPeriod mediaPeriod0 = this.k.C(mediaSource$MediaPeriodId1, allocator0, v);
        this.o.put(mediaPeriod0, mediaSource$MediaPeriodId1);
        return mediaPeriod0;
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    @Nullable
    protected MediaPeriodId G0(MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.m == 0x7FFFFFFF ? mediaSource$MediaPeriodId0 : ((MediaPeriodId)this.n.get(mediaSource$MediaPeriodId0));
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void M0(Timeline timeline0) {
        LoopingTimeline loopingMediaSource$LoopingTimeline0 = this.m == 0x7FFFFFFF ? new InfinitelyLoopingTimeline(timeline0) : new LoopingTimeline(timeline0, this.m);
        this.p0(loopingMediaSource$LoopingTimeline0);
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public boolean R() {
        return false;
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public void r(MediaPeriod mediaPeriod0) {
        this.k.r(mediaPeriod0);
        MediaPeriodId mediaSource$MediaPeriodId0 = (MediaPeriodId)this.o.remove(mediaPeriod0);
        if(mediaSource$MediaPeriodId0 != null) {
            this.n.remove(mediaSource$MediaPeriodId0);
        }
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    @Nullable
    public Timeline x() {
        MaskingMediaSource maskingMediaSource0 = (MaskingMediaSource)this.k;
        return this.m != 0x7FFFFFFF ? new LoopingTimeline(maskingMediaSource0.U0(), this.m) : new InfinitelyLoopingTimeline(maskingMediaSource0.U0());
    }
}

