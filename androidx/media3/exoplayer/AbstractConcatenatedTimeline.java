package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.ShuffleOrder;

@UnstableApi
public abstract class AbstractConcatenatedTimeline extends Timeline {
    private final int e;
    private final ShuffleOrder f;
    private final boolean g;

    public AbstractConcatenatedTimeline(boolean z, ShuffleOrder shuffleOrder0) {
        this.g = z;
        this.f = shuffleOrder0;
        this.e = shuffleOrder0.getLength();
    }

    protected abstract int A(int arg1);

    protected abstract int B(int arg1);

    public static Object C(Object object0) {
        return ((Pair)object0).second;
    }

    public static Object D(Object object0) {
        return ((Pair)object0).first;
    }

    protected abstract Object E(int arg1);

    public static Object F(Object object0, Object object1) {
        return Pair.create(object0, object1);
    }

    protected abstract int G(int arg1);

    protected abstract int H(int arg1);

    private int I(int v, boolean z) {
        if(z) {
            return this.f.b(v);
        }
        return v >= this.e - 1 ? -1 : v + 1;
    }

    private int J(int v, boolean z) {
        if(z) {
            return this.f.a(v);
        }
        return v <= 0 ? -1 : v - 1;
    }

    protected abstract Timeline K(int arg1);

    @Override  // androidx.media3.common.Timeline
    public int e(boolean z) {
        int v = 0;
        if(this.e == 0) {
            return -1;
        }
        if(this.g) {
            z = false;
        }
        if(z) {
            v = this.f.e();
        }
        while(this.K(v).w()) {
            v = this.I(v, z);
            if(v == -1) {
                return -1;
            }
            if(false) {
                break;
            }
        }
        return this.H(v) + this.K(v).e(z);
    }

    @Override  // androidx.media3.common.Timeline
    public final int f(Object object0) {
        if(!(object0 instanceof Pair)) {
            return -1;
        }
        Object object1 = AbstractConcatenatedTimeline.D(object0);
        Object object2 = AbstractConcatenatedTimeline.C(object0);
        int v = this.z(object1);
        if(v == -1) {
            return -1;
        }
        int v1 = this.K(v).f(object2);
        return v1 == -1 ? -1 : this.G(v) + v1;
    }

    @Override  // androidx.media3.common.Timeline
    public int g(boolean z) {
        int v = this.e;
        if(v == 0) {
            return -1;
        }
        if(this.g) {
            z = false;
        }
        int v1 = z ? this.f.c() : v - 1;
        while(this.K(v1).w()) {
            v1 = this.J(v1, z);
            if(v1 == -1) {
                return -1;
            }
            if(false) {
                break;
            }
        }
        return this.H(v1) + this.K(v1).g(z);
    }

    @Override  // androidx.media3.common.Timeline
    public int i(int v, int v1, boolean z) {
        int v2 = 0;
        if(this.g) {
            if(v1 == 1) {
                v1 = 2;
            }
            z = false;
        }
        int v3 = this.B(v);
        int v4 = this.H(v3);
        Timeline timeline0 = this.K(v3);
        if(v1 != 2) {
            v2 = v1;
        }
        int v5 = timeline0.i(v - v4, v2, z);
        if(v5 != -1) {
            return v4 + v5;
        }
        int v6;
        for(v6 = this.I(v3, z); v6 != -1 && this.K(v6).w(); v6 = this.I(v6, z)) {
        }
        if(v6 != -1) {
            return this.H(v6) + this.K(v6).e(z);
        }
        return v1 == 2 ? this.e(z) : -1;
    }

    @Override  // androidx.media3.common.Timeline
    public final Period k(int v, Period timeline$Period0, boolean z) {
        int v1 = this.A(v);
        int v2 = this.H(v1);
        int v3 = this.G(v1);
        this.K(v1).k(v - v3, timeline$Period0, z);
        timeline$Period0.c += v2;
        if(z) {
            timeline$Period0.b = AbstractConcatenatedTimeline.F(this.E(v1), Assertions.g(timeline$Period0.b));
        }
        return timeline$Period0;
    }

    @Override  // androidx.media3.common.Timeline
    public final Period l(Object object0, Period timeline$Period0) {
        Object object1 = AbstractConcatenatedTimeline.D(object0);
        Object object2 = AbstractConcatenatedTimeline.C(object0);
        int v = this.z(object1);
        int v1 = this.H(v);
        this.K(v).l(object2, timeline$Period0);
        timeline$Period0.c += v1;
        timeline$Period0.b = object0;
        return timeline$Period0;
    }

    @Override  // androidx.media3.common.Timeline
    public int r(int v, int v1, boolean z) {
        int v2 = 0;
        if(this.g) {
            if(v1 == 1) {
                v1 = 2;
            }
            z = false;
        }
        int v3 = this.B(v);
        int v4 = this.H(v3);
        Timeline timeline0 = this.K(v3);
        if(v1 != 2) {
            v2 = v1;
        }
        int v5 = timeline0.r(v - v4, v2, z);
        if(v5 != -1) {
            return v4 + v5;
        }
        int v6;
        for(v6 = this.J(v3, z); v6 != -1 && this.K(v6).w(); v6 = this.J(v6, z)) {
        }
        if(v6 != -1) {
            return this.H(v6) + this.K(v6).g(z);
        }
        return v1 == 2 ? this.g(z) : -1;
    }

    @Override  // androidx.media3.common.Timeline
    public final Object s(int v) {
        int v1 = this.A(v);
        int v2 = this.G(v1);
        Object object0 = this.K(v1).s(v - v2);
        return AbstractConcatenatedTimeline.F(this.E(v1), object0);
    }

    @Override  // androidx.media3.common.Timeline
    public final Window u(int v, Window timeline$Window0, long v1) {
        int v2 = this.B(v);
        int v3 = this.H(v2);
        int v4 = this.G(v2);
        this.K(v2).u(v - v3, timeline$Window0, v1);
        Object object0 = this.E(v2);
        if(!Window.q.equals(timeline$Window0.a)) {
            object0 = AbstractConcatenatedTimeline.F(object0, timeline$Window0.a);
        }
        timeline$Window0.a = object0;
        timeline$Window0.n += v4;
        timeline$Window0.o += v4;
        return timeline$Window0;
    }

    protected abstract int z(Object arg1);
}

