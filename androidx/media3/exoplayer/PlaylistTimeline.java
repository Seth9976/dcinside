package androidx.media3.exoplayer;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.ShuffleOrder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

final class PlaylistTimeline extends AbstractConcatenatedTimeline {
    private final int h;
    private final int i;
    private final int[] j;
    private final int[] k;
    private final Timeline[] l;
    private final Object[] m;
    private final HashMap n;

    public PlaylistTimeline(Collection collection0, ShuffleOrder shuffleOrder0) {
        this(PlaylistTimeline.N(collection0), PlaylistTimeline.O(collection0), shuffleOrder0);
    }

    private PlaylistTimeline(Timeline[] arr_timeline, Object[] arr_object, ShuffleOrder shuffleOrder0) {
        int v = 0;
        super(false, shuffleOrder0);
        this.l = arr_timeline;
        this.j = new int[arr_timeline.length];
        this.k = new int[arr_timeline.length];
        this.m = arr_object;
        this.n = new HashMap();
        int v1 = 0;
        int v2 = 0;
        for(int v3 = 0; v < arr_timeline.length; ++v3) {
            Timeline timeline0 = arr_timeline[v];
            this.l[v3] = timeline0;
            this.k[v3] = v1;
            this.j[v3] = v2;
            v1 += timeline0.v();
            v2 += this.l[v3].m();
            this.n.put(arr_object[v3], v3);
            ++v;
        }
        this.h = v1;
        this.i = v2;
    }

    @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected int A(int v) {
        return Util.m(this.j, v + 1, false, false);
    }

    @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected int B(int v) {
        return Util.m(this.k, v + 1, false, false);
    }

    @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected Object E(int v) {
        return this.m[v];
    }

    @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected int G(int v) {
        return this.j[v];
    }

    @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected int H(int v) {
        return this.k[v];
    }

    @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected Timeline K(int v) {
        return this.l[v];
    }

    public PlaylistTimeline L(ShuffleOrder shuffleOrder0) {
        Timeline[] arr_timeline = new Timeline[this.l.length];
        for(int v = 0; true; ++v) {
            Timeline[] arr_timeline1 = this.l;
            if(v >= arr_timeline1.length) {
                break;
            }
            arr_timeline[v] = new ForwardingTimeline(arr_timeline1[v]) {
                private final Window f;
                final PlaylistTimeline g;

                {
                    Timeline timeline0 = arr_timeline1[v];  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.f = new Window();
                }

                @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
                public Period k(int v, Period timeline$Period0, boolean z) {
                    Period timeline$Period1 = super.k(v, timeline$Period0, z);
                    if(super.t(timeline$Period1.c, this.f).i()) {
                        timeline$Period1.x(timeline$Period0.a, timeline$Period0.b, timeline$Period0.c, timeline$Period0.d, timeline$Period0.e, AdPlaybackState.l, true);
                        return timeline$Period1;
                    }
                    timeline$Period1.f = true;
                    return timeline$Period1;
                }
            };
        }
        return new PlaylistTimeline(arr_timeline, this.m, shuffleOrder0);
    }

    List M() {
        return Arrays.asList(this.l);
    }

    private static Timeline[] N(Collection collection0) {
        Timeline[] arr_timeline = new Timeline[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_timeline[v] = ((MediaSourceInfoHolder)object0).b();
            ++v;
        }
        return arr_timeline;
    }

    private static Object[] O(Collection collection0) {
        Object[] arr_object = new Object[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_object[v] = ((MediaSourceInfoHolder)object0).a();
            ++v;
        }
        return arr_object;
    }

    @Override  // androidx.media3.common.Timeline
    public int m() {
        return this.i;
    }

    @Override  // androidx.media3.common.Timeline
    public int v() {
        return this.h;
    }

    @Override  // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    protected int z(Object object0) {
        Integer integer0 = (Integer)this.n.get(object0);
        return integer0 == null ? -1 : ((int)integer0);
    }
}

