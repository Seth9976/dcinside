package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import java.util.ArrayList;
import java.util.List;

final class MediaPeriodQueue {
    private final Period a;
    private final Window b;
    private final AnalyticsCollector c;
    private final HandlerWrapper d;
    private final Factory e;
    private long f;
    private int g;
    private boolean h;
    @Nullable
    private MediaPeriodHolder i;
    @Nullable
    private MediaPeriodHolder j;
    @Nullable
    private MediaPeriodHolder k;
    private int l;
    @Nullable
    private Object m;
    private long n;
    private PreloadConfiguration o;
    private List p;
    public static final long q = 1000000000000L;
    private static final int r = 100;

    public MediaPeriodQueue(AnalyticsCollector analyticsCollector0, HandlerWrapper handlerWrapper0, Factory mediaPeriodHolder$Factory0, PreloadConfiguration exoPlayer$PreloadConfiguration0) {
        this.c = analyticsCollector0;
        this.d = handlerWrapper0;
        this.e = mediaPeriodHolder$Factory0;
        this.o = exoPlayer$PreloadConfiguration0;
        this.a = new Period();
        this.b = new Window();
        this.p = new ArrayList();
    }

    private boolean A(Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0) {
        if(!this.y(mediaSource$MediaPeriodId0)) {
            return false;
        }
        int v = timeline0.l(mediaSource$MediaPeriodId0.a, this.a).c;
        int v1 = timeline0.f(mediaSource$MediaPeriodId0.a);
        return timeline0.t(v, this.b).o == v1;
    }

    public boolean B(MediaPeriod mediaPeriod0) {
        return this.k != null && this.k.a == mediaPeriod0;
    }

    private static boolean C(Period timeline$Period0) {
        long v = 0L;
        int v1 = timeline$Period0.e();
        if(v1 != 0 && (v1 != 1 || !timeline$Period0.u(0)) && (timeline$Period0.v(timeline$Period0.s()) && timeline$Period0.g(0L) == -1)) {
            if(timeline$Period0.d == 0L) {
                return true;
            }
            int v2 = timeline$Period0.u(v1 - 1) ? 2 : 1;
            for(int v3 = 0; v3 <= v1 - v2; ++v3) {
                v += timeline$Period0.l(v3);
            }
            return timeline$Period0.d <= v;
        }
        return false;
    }

    // 检测为 Lambda 实现
    private void D(a o2$a0, MediaPeriodId mediaSource$MediaPeriodId0) [...]

    private void E() {
        a o2$a0 = O2.n();
        for(MediaPeriodHolder mediaPeriodHolder0 = this.i; mediaPeriodHolder0 != null; mediaPeriodHolder0 = mediaPeriodHolder0.k()) {
            o2$a0.j(mediaPeriodHolder0.f.a);
        }
        J0 j00 = () -> {
            O2 o20 = o2$a0.n();
            this.c.D(o20, (this.j == null ? null : this.j.f.a));
        };
        this.d.k(j00);
    }

    public void F(long v) {
        MediaPeriodHolder mediaPeriodHolder0 = this.k;
        if(mediaPeriodHolder0 != null) {
            mediaPeriodHolder0.u(v);
        }
    }

    private void G(List list0) {
        for(int v = 0; v < this.p.size(); ++v) {
            ((MediaPeriodHolder)this.p.get(v)).v();
        }
        this.p = list0;
    }

    public void H() {
        if(!this.p.isEmpty()) {
            this.G(new ArrayList());
        }
    }

    public boolean I(MediaPeriodHolder mediaPeriodHolder0) {
        Assertions.k(mediaPeriodHolder0);
        boolean z = false;
        if(mediaPeriodHolder0.equals(this.k)) {
            return false;
        }
        this.k = mediaPeriodHolder0;
        while(mediaPeriodHolder0.k() != null) {
            mediaPeriodHolder0 = (MediaPeriodHolder)Assertions.g(mediaPeriodHolder0.k());
            if(mediaPeriodHolder0 == this.j) {
                this.j = this.i;
                z = true;
            }
            mediaPeriodHolder0.v();
            --this.l;
        }
        ((MediaPeriodHolder)Assertions.g(this.k)).y(null);
        this.E();
        return z;
    }

    @Nullable
    private MediaPeriodHolder J(MediaPeriodInfo mediaPeriodInfo0) {
        for(int v = 0; v < this.p.size(); ++v) {
            if(((MediaPeriodHolder)this.p.get(v)).d(mediaPeriodInfo0)) {
                return (MediaPeriodHolder)this.p.remove(v);
            }
        }
        return null;
    }

    public MediaPeriodId K(Timeline timeline0, Object object0, long v) {
        return MediaPeriodQueue.L(timeline0, object0, v, this.N(timeline0, object0), this.b, this.a);
    }

    private static MediaPeriodId L(Timeline timeline0, Object object0, long v, long v1, Window timeline$Window0, Period timeline$Period0) {
        timeline0.l(object0, timeline$Period0);
        timeline0.t(timeline$Period0.c, timeline$Window0);
        int v2 = timeline0.f(object0);
        Object object1 = object0;
        while(MediaPeriodQueue.C(timeline$Period0) && v2 <= timeline$Window0.o) {
            timeline0.k(v2, timeline$Period0, true);
            object1 = Assertions.g(timeline$Period0.b);
            ++v2;
        }
        timeline0.l(object1, timeline$Period0);
        int v3 = timeline$Period0.g(v);
        return v3 == -1 ? new MediaPeriodId(object1, v1, timeline$Period0.f(v)) : new MediaPeriodId(object1, v3, timeline$Period0.o(v3), v1);
    }

    public MediaPeriodId M(Timeline timeline0, Object object0, long v) {
        long v1 = this.N(timeline0, object0);
        timeline0.l(object0, this.a);
        timeline0.t(this.a.c, this.b);
        int v2 = timeline0.f(object0);
        int v3 = 0;
        while(v2 >= this.b.n) {
            int v4 = 1;
            timeline0.k(v2, this.a, true);
            if(this.a.e() <= 0) {
                v4 = 0;
            }
            v3 |= v4;
            if(this.a.g(this.a.d) != -1) {
                object0 = Assertions.g(this.a.b);
            }
            if(v3 != 0 && (v4 == 0 || this.a.d != 0L)) {
                break;
            }
            --v2;
        }
        return MediaPeriodQueue.L(timeline0, object0, v, v1, this.b, this.a);
    }

    private long N(Timeline timeline0, Object object0) {
        int v = timeline0.l(object0, this.a).c;
        Object object1 = this.m;
        if(object1 != null) {
            int v1 = timeline0.f(object1);
            if(v1 != -1 && timeline0.j(v1, this.a).c == v) {
                return this.n;
            }
        }
        for(MediaPeriodHolder mediaPeriodHolder0 = this.i; mediaPeriodHolder0 != null; mediaPeriodHolder0 = mediaPeriodHolder0.k()) {
            if(mediaPeriodHolder0.b.equals(object0)) {
                return mediaPeriodHolder0.f.a.d;
            }
        }
        for(MediaPeriodHolder mediaPeriodHolder1 = this.i; mediaPeriodHolder1 != null; mediaPeriodHolder1 = mediaPeriodHolder1.k()) {
            int v2 = timeline0.f(mediaPeriodHolder1.b);
            if(v2 != -1 && timeline0.j(v2, this.a).c == v) {
                return mediaPeriodHolder1.f.a.d;
            }
        }
        long v3 = this.O(object0);
        if(v3 != -1L) {
            return v3;
        }
        long v4 = this.f;
        this.f = v4 + 1L;
        if(this.i == null) {
            this.m = object0;
            this.n = v4;
        }
        return v4;
    }

    private long O(Object object0) {
        for(int v = 0; v < this.p.size(); ++v) {
            MediaPeriodHolder mediaPeriodHolder0 = (MediaPeriodHolder)this.p.get(v);
            if(mediaPeriodHolder0.b.equals(object0)) {
                return mediaPeriodHolder0.f.a.d;
            }
        }
        return -1L;
    }

    // 去混淆评级： 低(20)
    public boolean P() {
        return this.k == null || !this.k.f.i && this.k.s() && this.k.f.e != 0x8000000000000001L && this.l < 100;
    }

    private boolean Q(Timeline timeline0) {
        MediaPeriodHolder mediaPeriodHolder0 = this.i;
        if(mediaPeriodHolder0 == null) {
            return true;
        }
        int v = timeline0.f(mediaPeriodHolder0.b);
        while(true) {
            v = timeline0.h(v, this.a, this.b, this.g, this.h);
            while(((MediaPeriodHolder)Assertions.g(mediaPeriodHolder0)).k() != null && !mediaPeriodHolder0.f.g) {
                mediaPeriodHolder0 = mediaPeriodHolder0.k();
            }
            MediaPeriodHolder mediaPeriodHolder1 = mediaPeriodHolder0.k();
            if(v == -1 || mediaPeriodHolder1 == null || timeline0.f(mediaPeriodHolder1.b) != v) {
                break;
            }
            mediaPeriodHolder0 = mediaPeriodHolder1;
        }
        boolean z = this.I(mediaPeriodHolder0);
        mediaPeriodHolder0.f = this.v(timeline0, mediaPeriodHolder0.f);
        return !z;
    }

    public void R(Timeline timeline0, PreloadConfiguration exoPlayer$PreloadConfiguration0) {
        this.o = exoPlayer$PreloadConfiguration0;
        this.x(timeline0);
    }

    public boolean S(Timeline timeline0, long v, long v1) {
        MediaPeriodInfo mediaPeriodInfo1;
        MediaPeriodHolder mediaPeriodHolder0 = this.i;
        MediaPeriodHolder mediaPeriodHolder1 = null;
        while(mediaPeriodHolder0 != null) {
            MediaPeriodInfo mediaPeriodInfo0 = mediaPeriodHolder0.f;
            if(mediaPeriodHolder1 == null) {
                mediaPeriodInfo1 = this.v(timeline0, mediaPeriodInfo0);
            }
            else {
                MediaPeriodInfo mediaPeriodInfo2 = this.k(timeline0, mediaPeriodHolder1, v);
                if(mediaPeriodInfo2 == null) {
                    return !this.I(mediaPeriodHolder1);
                }
                if(!this.e(mediaPeriodInfo0, mediaPeriodInfo2)) {
                    return !this.I(mediaPeriodHolder1);
                }
                mediaPeriodInfo1 = mediaPeriodInfo2;
            }
            mediaPeriodHolder0.f = mediaPeriodInfo1.a(mediaPeriodInfo0.c);
            if(!MediaPeriodQueue.d(mediaPeriodInfo0.e, mediaPeriodInfo1.e)) {
                mediaPeriodHolder0.C();
                long v2 = mediaPeriodInfo1.e == 0x8000000000000001L ? 0x7FFFFFFFFFFFFFFFL : mediaPeriodHolder0.B(mediaPeriodInfo1.e);
                boolean z = mediaPeriodHolder0 == this.j && !mediaPeriodHolder0.f.f && (v1 == 0x8000000000000000L || v1 >= v2);
                return !this.I(mediaPeriodHolder0) && !z;
            }
            mediaPeriodHolder1 = mediaPeriodHolder0;
            mediaPeriodHolder0 = mediaPeriodHolder0.k();
        }
        return true;
    }

    public boolean T(Timeline timeline0, int v) {
        this.g = v;
        return this.Q(timeline0);
    }

    public boolean U(Timeline timeline0, boolean z) {
        this.h = z;
        return this.Q(timeline0);
    }

    @Nullable
    public MediaPeriodHolder b() {
        MediaPeriodHolder mediaPeriodHolder0 = this.i;
        if(mediaPeriodHolder0 == null) {
            return null;
        }
        if(mediaPeriodHolder0 == this.j) {
            this.j = mediaPeriodHolder0.k();
        }
        this.i.v();
        int v = this.l - 1;
        this.l = v;
        if(v == 0) {
            this.k = null;
            this.m = this.i.b;
            this.n = this.i.f.a.d;
        }
        this.i = this.i.k();
        this.E();
        return this.i;
    }

    public MediaPeriodHolder c() {
        this.j = ((MediaPeriodHolder)Assertions.k(this.j)).k();
        this.E();
        return (MediaPeriodHolder)Assertions.k(this.j);
    }

    static boolean d(long v, long v1) {
        return v == 0x8000000000000001L || v == v1;
    }

    private boolean e(MediaPeriodInfo mediaPeriodInfo0, MediaPeriodInfo mediaPeriodInfo1) {
        return mediaPeriodInfo0.b == mediaPeriodInfo1.b && mediaPeriodInfo0.a.equals(mediaPeriodInfo1.a);
    }

    public void f() {
        if(this.l == 0) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder0 = (MediaPeriodHolder)Assertions.k(this.i);
        this.m = mediaPeriodHolder0.b;
        this.n = mediaPeriodHolder0.f.a.d;
        while(mediaPeriodHolder0 != null) {
            mediaPeriodHolder0.v();
            mediaPeriodHolder0 = mediaPeriodHolder0.k();
        }
        this.i = null;
        this.k = null;
        this.j = null;
        this.l = 0;
        this.E();
    }

    public MediaPeriodHolder g(MediaPeriodInfo mediaPeriodInfo0) {
        long v = this.k == null ? 1000000000000L : this.k.m() + this.k.f.e - mediaPeriodInfo0.b;
        MediaPeriodHolder mediaPeriodHolder0 = this.J(mediaPeriodInfo0);
        if(mediaPeriodHolder0 == null) {
            mediaPeriodHolder0 = this.e.a(mediaPeriodInfo0, v);
        }
        else {
            mediaPeriodHolder0.f = mediaPeriodInfo0;
            mediaPeriodHolder0.z(v);
        }
        MediaPeriodHolder mediaPeriodHolder1 = this.k;
        if(mediaPeriodHolder1 == null) {
            this.i = mediaPeriodHolder0;
            this.j = mediaPeriodHolder0;
        }
        else {
            mediaPeriodHolder1.y(mediaPeriodHolder0);
        }
        this.m = null;
        this.k = mediaPeriodHolder0;
        ++this.l;
        this.E();
        return mediaPeriodHolder0;
    }

    @Nullable
    private Pair h(Timeline timeline0, Object object0, long v) {
        int v1 = timeline0.i(timeline0.l(object0, this.a).c, this.g, this.h);
        return v1 == -1 ? null : timeline0.q(this.b, this.a, v1, 0x8000000000000001L, v);
    }

    @Nullable
    private MediaPeriodInfo i(PlaybackInfo playbackInfo0) {
        return this.n(playbackInfo0.a, playbackInfo0.b, playbackInfo0.c, playbackInfo0.s);
    }

    @Nullable
    private MediaPeriodInfo j(Timeline timeline0, MediaPeriodHolder mediaPeriodHolder0, long v) {
        long v8;
        Object object2;
        long v7;
        long v6;
        long v5;
        MediaPeriodInfo mediaPeriodInfo0 = mediaPeriodHolder0.f;
        int v1 = timeline0.h(timeline0.f(mediaPeriodInfo0.a.a), this.a, this.b, this.g, this.h);
        if(v1 == -1) {
            return null;
        }
        int v2 = timeline0.k(v1, this.a, true).c;
        Object object0 = Assertions.g(this.a.b);
        long v3 = mediaPeriodInfo0.a.d;
        if(timeline0.t(v2, this.b).n == v1) {
            Pair pair0 = timeline0.q(this.b, this.a, v2, 0x8000000000000001L, Math.max(0L, v));
            if(pair0 == null) {
                return null;
            }
            Object object1 = pair0.first;
            long v4 = (long)(((Long)pair0.second));
            MediaPeriodHolder mediaPeriodHolder1 = mediaPeriodHolder0.k();
            if(mediaPeriodHolder1 == null || !mediaPeriodHolder1.b.equals(object1)) {
                v5 = this.O(object1);
                if(v5 == -1L) {
                    v5 = this.f;
                    this.f = v5 + 1L;
                }
            }
            else {
                v5 = mediaPeriodHolder1.f.a.d;
            }
            v6 = v5;
            v7 = 0x8000000000000001L;
            object2 = object1;
            v8 = v4;
        }
        else {
            v6 = v3;
            v7 = 0L;
            object2 = object0;
            v8 = 0L;
        }
        MediaPeriodId mediaSource$MediaPeriodId0 = MediaPeriodQueue.L(timeline0, object2, v8, v6, this.b, this.a);
        if(v7 != 0x8000000000000001L && mediaPeriodInfo0.c != 0x8000000000000001L) {
            boolean z = this.w(mediaPeriodInfo0.a.a, timeline0);
            if(mediaSource$MediaPeriodId0.c() && z) {
                return this.n(timeline0, mediaSource$MediaPeriodId0, mediaPeriodInfo0.c, v8);
            }
            return z ? this.n(timeline0, mediaSource$MediaPeriodId0, v7, mediaPeriodInfo0.c) : this.n(timeline0, mediaSource$MediaPeriodId0, v7, v8);
        }
        return this.n(timeline0, mediaSource$MediaPeriodId0, v7, v8);
    }

    @Nullable
    private MediaPeriodInfo k(Timeline timeline0, MediaPeriodHolder mediaPeriodHolder0, long v) {
        MediaPeriodInfo mediaPeriodInfo0 = mediaPeriodHolder0.f;
        long v1 = mediaPeriodHolder0.m() + mediaPeriodInfo0.e - v;
        return mediaPeriodInfo0.g ? this.j(timeline0, mediaPeriodHolder0, v1) : this.l(timeline0, mediaPeriodHolder0, v1);
    }

    @Nullable
    private MediaPeriodInfo l(Timeline timeline0, MediaPeriodHolder mediaPeriodHolder0, long v) {
        MediaPeriodInfo mediaPeriodInfo0 = mediaPeriodHolder0.f;
        MediaPeriodId mediaSource$MediaPeriodId0 = mediaPeriodInfo0.a;
        timeline0.l(mediaSource$MediaPeriodId0.a, this.a);
        if(mediaSource$MediaPeriodId0.c()) {
            int v1 = mediaSource$MediaPeriodId0.b;
            int v2 = this.a.c(v1);
            if(v2 == -1) {
                return null;
            }
            int v3 = this.a.p(v1, mediaSource$MediaPeriodId0.c);
            if(v3 < v2) {
                return this.o(timeline0, mediaSource$MediaPeriodId0.a, v1, v3, mediaPeriodInfo0.c, mediaSource$MediaPeriodId0.d);
            }
            long v4 = mediaPeriodInfo0.c;
            if(v4 == 0x8000000000000001L) {
                Pair pair0 = timeline0.q(this.b, this.a, this.a.c, 0x8000000000000001L, Math.max(0L, v));
                if(pair0 == null) {
                    return null;
                }
                v4 = (long)(((Long)pair0.second));
            }
            long v5 = Math.max(this.r(timeline0, mediaSource$MediaPeriodId0.a, mediaSource$MediaPeriodId0.b), v4);
            return this.p(timeline0, mediaSource$MediaPeriodId0.a, v5, mediaPeriodInfo0.c, mediaSource$MediaPeriodId0.d);
        }
        if(mediaSource$MediaPeriodId0.e != -1 && this.a.u(mediaSource$MediaPeriodId0.e)) {
            return this.j(timeline0, mediaPeriodHolder0, v);
        }
        int v6 = this.a.o(mediaSource$MediaPeriodId0.e);
        boolean z = this.a.v(mediaSource$MediaPeriodId0.e) && this.a.j(mediaSource$MediaPeriodId0.e, v6) == 3;
        if(v6 != this.a.c(mediaSource$MediaPeriodId0.e) && !z) {
            return this.o(timeline0, mediaSource$MediaPeriodId0.a, mediaSource$MediaPeriodId0.e, v6, mediaPeriodInfo0.e, mediaSource$MediaPeriodId0.d);
        }
        long v7 = this.r(timeline0, mediaSource$MediaPeriodId0.a, mediaSource$MediaPeriodId0.e);
        return this.p(timeline0, mediaSource$MediaPeriodId0.a, v7, mediaPeriodInfo0.e, mediaSource$MediaPeriodId0.d);
    }

    @Nullable
    public MediaPeriodHolder m() {
        return this.k;
    }

    private MediaPeriodInfo n(Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0, long v, long v1) {
        timeline0.l(mediaSource$MediaPeriodId0.a, this.a);
        return mediaSource$MediaPeriodId0.c() ? this.o(timeline0, mediaSource$MediaPeriodId0.a, mediaSource$MediaPeriodId0.b, mediaSource$MediaPeriodId0.c, v, mediaSource$MediaPeriodId0.d) : this.p(timeline0, mediaSource$MediaPeriodId0.a, v1, v, mediaSource$MediaPeriodId0.d);
    }

    private MediaPeriodInfo o(Timeline timeline0, Object object0, int v, int v1, long v2, long v3) {
        MediaPeriodId mediaSource$MediaPeriodId0 = new MediaPeriodId(object0, v, v1, v3);
        long v4 = timeline0.l(mediaSource$MediaPeriodId0.a, this.a).d(mediaSource$MediaPeriodId0.b, mediaSource$MediaPeriodId0.c);
        long v5 = v1 == this.a.o(v) ? this.a.i() : 0L;
        boolean z = this.a.v(mediaSource$MediaPeriodId0.b);
        return v4 == 0x8000000000000001L || v5 < v4 ? new MediaPeriodInfo(mediaSource$MediaPeriodId0, v5, v2, 0x8000000000000001L, v4, z, false, false, false) : new MediaPeriodInfo(mediaSource$MediaPeriodId0, Math.max(0L, v4 - 1L), v2, 0x8000000000000001L, v4, z, false, false, false);
    }

    private MediaPeriodInfo p(Timeline timeline0, Object object0, long v, long v1, long v2) {
        long v5;
        boolean z1;
        timeline0.l(object0, this.a);
        int v3 = this.a.f(v);
        int v4 = 0;
        boolean z = v3 != -1 && this.a.u(v3);
        if(v3 != -1) {
            if(!this.a.v(v3) || (this.a.h(v3) != this.a.d || !this.a.t(v3))) {
                z1 = false;
            }
            else {
                v3 = -1;
                z1 = true;
            }
        }
        else if(this.a.e() > 0 && this.a.v(this.a.s())) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        MediaPeriodId mediaSource$MediaPeriodId0 = new MediaPeriodId(object0, v2, v3);
        boolean z2 = this.y(mediaSource$MediaPeriodId0);
        boolean z3 = this.A(timeline0, mediaSource$MediaPeriodId0);
        boolean z4 = this.z(timeline0, mediaSource$MediaPeriodId0, z2);
        boolean z5 = v3 != -1 && this.a.v(v3) && !z;
        if(v3 == -1 || z) {
            v5 = z1 ? this.a.d : 0x8000000000000001L;
        }
        else {
            v5 = this.a.h(v3);
        }
        long v6 = v5 == 0x8000000000000001L || v5 == 0x8000000000000000L ? this.a.d : v5;
        if(v6 != 0x8000000000000001L && v >= v6) {
            if(z4 || !z1) {
                v4 = 1;
            }
            v = Math.max(0L, v6 - ((long)v4));
        }
        return new MediaPeriodInfo(mediaSource$MediaPeriodId0, v, v1, v5, v6, z5, z2, z3, z4);
    }

    private MediaPeriodInfo q(Timeline timeline0, Object object0, long v, long v1) {
        MediaPeriodId mediaSource$MediaPeriodId0 = MediaPeriodQueue.L(timeline0, object0, v, v1, this.b, this.a);
        return mediaSource$MediaPeriodId0.c() ? this.o(timeline0, mediaSource$MediaPeriodId0.a, mediaSource$MediaPeriodId0.b, mediaSource$MediaPeriodId0.c, v, mediaSource$MediaPeriodId0.d) : this.p(timeline0, mediaSource$MediaPeriodId0.a, v, 0x8000000000000001L, mediaSource$MediaPeriodId0.d);
    }

    private long r(Timeline timeline0, Object object0, int v) {
        timeline0.l(object0, this.a);
        long v1 = this.a.h(v);
        return v1 == 0x8000000000000000L ? this.a.d : v1 + this.a.l(v);
    }

    @Nullable
    public MediaPeriodInfo s(long v, PlaybackInfo playbackInfo0) {
        return this.k == null ? this.i(playbackInfo0) : this.k(playbackInfo0.a, this.k, v);
    }

    @Nullable
    public MediaPeriodHolder t() {
        return this.i;
    }

    @Nullable
    public MediaPeriodHolder u() {
        return this.j;
    }

    public MediaPeriodInfo v(Timeline timeline0, MediaPeriodInfo mediaPeriodInfo0) {
        long v2;
        long v1;
        MediaPeriodId mediaSource$MediaPeriodId0 = mediaPeriodInfo0.a;
        boolean z = this.y(mediaSource$MediaPeriodId0);
        boolean z1 = this.A(timeline0, mediaSource$MediaPeriodId0);
        boolean z2 = this.z(timeline0, mediaSource$MediaPeriodId0, z);
        timeline0.l(mediaPeriodInfo0.a.a, this.a);
        if(mediaSource$MediaPeriodId0.c()) {
            v1 = 0x8000000000000001L;
        }
        else {
            int v = mediaSource$MediaPeriodId0.e;
            v1 = v == -1 ? 0x8000000000000001L : this.a.h(v);
        }
        if(mediaSource$MediaPeriodId0.c()) {
            v2 = this.a.d(mediaSource$MediaPeriodId0.b, mediaSource$MediaPeriodId0.c);
        }
        else {
            v2 = v1 == 0x8000000000000001L || v1 == 0x8000000000000000L ? this.a.n() : v1;
        }
        if(mediaSource$MediaPeriodId0.c()) {
            boolean z3 = this.a.v(mediaSource$MediaPeriodId0.b);
            return new MediaPeriodInfo(mediaSource$MediaPeriodId0, mediaPeriodInfo0.b, mediaPeriodInfo0.c, v1, v2, z3, z, z1, z2);
        }
        return mediaSource$MediaPeriodId0.e == -1 || !this.a.v(mediaSource$MediaPeriodId0.e) ? new MediaPeriodInfo(mediaSource$MediaPeriodId0, mediaPeriodInfo0.b, mediaPeriodInfo0.c, v1, v2, false, z, z1, z2) : new MediaPeriodInfo(mediaSource$MediaPeriodId0, mediaPeriodInfo0.b, mediaPeriodInfo0.c, v1, v2, true, z, z1, z2);
    }

    private boolean w(Object object0, Timeline timeline0) {
        int v = timeline0.l(object0, this.a).e();
        int v1 = this.a.s();
        return v > 0 && this.a.v(v1) && (v > 1 || this.a.h(v1) != 0x8000000000000000L);
    }

    public void x(Timeline timeline0) {
        if(this.o.a != 0x8000000000000001L) {
            MediaPeriodHolder mediaPeriodHolder0 = this.k;
            if(mediaPeriodHolder0 != null) {
                ArrayList arrayList0 = new ArrayList();
                Pair pair0 = this.h(timeline0, mediaPeriodHolder0.f.a.a, 0L);
                if(pair0 != null && !timeline0.t(timeline0.l(pair0.first, this.a).c, this.b).i()) {
                    long v = this.O(pair0.first);
                    if(v == -1L) {
                        v = this.f;
                        this.f = v + 1L;
                    }
                    MediaPeriodInfo mediaPeriodInfo0 = this.q(timeline0, pair0.first, ((long)(((Long)pair0.second))), v);
                    MediaPeriodHolder mediaPeriodHolder1 = this.J(mediaPeriodInfo0);
                    if(mediaPeriodHolder1 == null) {
                        mediaPeriodHolder1 = this.e.a(mediaPeriodInfo0, mediaPeriodHolder0.m() + mediaPeriodHolder0.f.e - mediaPeriodInfo0.b);
                    }
                    arrayList0.add(mediaPeriodHolder1);
                }
                this.G(arrayList0);
                return;
            }
        }
        this.H();
    }

    private boolean y(MediaPeriodId mediaSource$MediaPeriodId0) {
        return !mediaSource$MediaPeriodId0.c() && mediaSource$MediaPeriodId0.e == -1;
    }

    private boolean z(Timeline timeline0, MediaPeriodId mediaSource$MediaPeriodId0, boolean z) {
        int v = timeline0.f(mediaSource$MediaPeriodId0.a);
        return !timeline0.t(timeline0.j(v, this.a).c, this.b).i && timeline0.x(v, this.a, this.b, this.g, this.h) && z;
    }
}

