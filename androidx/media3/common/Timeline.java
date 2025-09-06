package androidx.media3.common;

import O1.a;
import O1.l;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.t;
import com.google.common.collect.O2;
import java.util.ArrayList;

public abstract class Timeline {
    public static final class Period {
        @Nullable
        public Object a;
        @Nullable
        public Object b;
        public int c;
        @UnstableApi
        public long d;
        @UnstableApi
        public long e;
        public boolean f;
        private AdPlaybackState g;
        private static final String h;
        private static final String i;
        private static final String j;
        private static final String k;
        private static final String l;

        static {
            Period.h = "0";
            Period.i = "1";
            Period.j = "2";
            Period.k = "3";
            Period.l = "4";
        }

        public Period() {
            this.g = AdPlaybackState.l;
        }

        @UnstableApi
        public static Period b(Bundle bundle0) {
            int v = bundle0.getInt(Period.h, 0);
            long v1 = bundle0.getLong(Period.i, 0x8000000000000001L);
            long v2 = bundle0.getLong(Period.j, 0L);
            boolean z = bundle0.getBoolean(Period.k, false);
            Bundle bundle1 = bundle0.getBundle(Period.l);
            AdPlaybackState adPlaybackState0 = bundle1 == null ? AdPlaybackState.l : AdPlaybackState.d(bundle1);
            Period timeline$Period0 = new Period();
            timeline$Period0.x(null, null, v, v1, v2, adPlaybackState0, z);
            return timeline$Period0;
        }

        public int c(int v) {
            return this.g.e(v).b;
        }

        public long d(int v, int v1) {
            AdGroup adPlaybackState$AdGroup0 = this.g.e(v);
            return adPlaybackState$AdGroup0.b == -1 ? 0x8000000000000001L : adPlaybackState$AdGroup0.g[v1];
        }

        public int e() {
            return this.g.b;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return Period.class.equals(class0) && (Util.g(this.a, ((Period)object0).a) && Util.g(this.b, ((Period)object0).b) && this.c == ((Period)object0).c && this.d == ((Period)object0).d && this.e == ((Period)object0).e && this.f == ((Period)object0).f && Util.g(this.g, ((Period)object0).g));
            }
            return false;
        }

        public int f(long v) {
            return this.g.f(v, this.d);
        }

        public int g(long v) {
            return this.g.g(v, this.d);
        }

        public long h(int v) {
            return this.g.e(v).a;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            Object object0 = this.b;
            if(object0 != null) {
                v = object0.hashCode();
            }
            return ((((((v1 + 0xD9) * 0x1F + v) * 0x1F + this.c) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + ((int)(this.e ^ this.e >>> 0x20))) * 0x1F + this.f) * 0x1F + this.g.hashCode();
        }

        public long i() {
            return this.g.c;
        }

        @UnstableApi
        public int j(int v, int v1) {
            AdGroup adPlaybackState$AdGroup0 = this.g.e(v);
            return adPlaybackState$AdGroup0.b == -1 ? 0 : adPlaybackState$AdGroup0.f[v1];
        }

        @Nullable
        public Object k() {
            return this.g.a;
        }

        @UnstableApi
        public long l(int v) {
            return this.g.e(v).h;
        }

        public long m() {
            return Util.B2(this.d);
        }

        public long n() {
            return this.d;
        }

        public int o(int v) {
            return this.g.e(v).e();
        }

        public int p(int v, int v1) {
            return this.g.e(v).h(v1);
        }

        public long q() {
            return Util.B2(this.e);
        }

        public long r() {
            return this.e;
        }

        public int s() {
            return this.g.e;
        }

        public boolean t(int v) {
            return !this.g.e(v).i();
        }

        // 去混淆评级： 低(20)
        @UnstableApi
        public boolean u(int v) {
            return v == this.e() - 1 && this.g.i(v);
        }

        @UnstableApi
        public boolean v(int v) {
            return this.g.e(v).i;
        }

        @a
        @UnstableApi
        public Period w(@Nullable Object object0, @Nullable Object object1, int v, long v1, long v2) {
            return this.x(object0, object1, v, v1, v2, AdPlaybackState.l, false);
        }

        @a
        @UnstableApi
        public Period x(@Nullable Object object0, @Nullable Object object1, int v, long v1, long v2, AdPlaybackState adPlaybackState0, boolean z) {
            this.a = object0;
            this.b = object1;
            this.c = v;
            this.d = v1;
            this.e = v2;
            this.g = adPlaybackState0;
            this.f = z;
            return this;
        }

        @UnstableApi
        public Bundle y() {
            Bundle bundle0 = new Bundle();
            int v = this.c;
            if(v != 0) {
                bundle0.putInt(Period.h, v);
            }
            long v1 = this.d;
            if(v1 != 0x8000000000000001L) {
                bundle0.putLong(Period.i, v1);
            }
            long v2 = this.e;
            if(v2 != 0L) {
                bundle0.putLong(Period.j, v2);
            }
            if(this.f) {
                bundle0.putBoolean(Period.k, true);
            }
            if(!this.g.equals(AdPlaybackState.l)) {
                Bundle bundle1 = this.g.k();
                bundle0.putBundle(Period.l, bundle1);
            }
            return bundle0;
        }
    }

    @UnstableApi
    public static final class RemotableTimeline extends Timeline {
        private final O2 e;
        private final O2 f;
        private final int[] g;
        private final int[] h;

        public RemotableTimeline(O2 o20, O2 o21, int[] arr_v) {
            Assertions.a(o20.size() == arr_v.length);
            this.e = o20;
            this.f = o21;
            this.g = arr_v;
            this.h = new int[arr_v.length];
            for(int v = 0; v < arr_v.length; ++v) {
                this.h[arr_v[v]] = v;
            }
        }

        @Override  // androidx.media3.common.Timeline
        public int e(boolean z) {
            if(this.w()) {
                return -1;
            }
            return z ? this.g[0] : 0;
        }

        @Override  // androidx.media3.common.Timeline
        public int f(Object object0) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.media3.common.Timeline
        public int g(boolean z) {
            if(this.w()) {
                return -1;
            }
            return z ? this.g[this.v() - 1] : this.v() - 1;
        }

        @Override  // androidx.media3.common.Timeline
        public int i(int v, int v1, boolean z) {
            if(v1 == 1) {
                return v;
            }
            if(v == this.g(z)) {
                return v1 == 2 ? this.e(z) : -1;
            }
            return z ? this.g[this.h[v] + 1] : v + 1;
        }

        @Override  // androidx.media3.common.Timeline
        public Period k(int v, Period timeline$Period0, boolean z) {
            Period timeline$Period1 = (Period)this.f.get(v);
            timeline$Period0.x(timeline$Period1.a, timeline$Period1.b, timeline$Period1.c, timeline$Period1.d, timeline$Period1.e, timeline$Period1.g, timeline$Period1.f);
            return timeline$Period0;
        }

        @Override  // androidx.media3.common.Timeline
        public int m() {
            return this.f.size();
        }

        @Override  // androidx.media3.common.Timeline
        public int r(int v, int v1, boolean z) {
            if(v1 == 1) {
                return v;
            }
            if(v == this.e(z)) {
                return v1 == 2 ? this.g(z) : -1;
            }
            return z ? this.g[this.h[v] - 1] : v - 1;
        }

        @Override  // androidx.media3.common.Timeline
        public Object s(int v) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.media3.common.Timeline
        public Window u(int v, Window timeline$Window0, long v1) {
            Object object0 = this.e.get(v);
            timeline$Window0.j(((Window)object0).a, ((Window)object0).c, ((Window)object0).d, ((Window)object0).e, ((Window)object0).f, ((Window)object0).g, ((Window)object0).h, ((Window)object0).i, ((Window)object0).j, ((Window)object0).l, ((Window)object0).m, ((Window)object0).n, ((Window)object0).o, ((Window)object0).p);
            timeline$Window0.k = ((Window)object0).k;
            return timeline$Window0;
        }

        @Override  // androidx.media3.common.Timeline
        public int v() {
            return this.e.size();
        }
    }

    public static final class Window {
        private static final String A;
        private static final String B;
        private static final String C;
        private static final String D;
        private static final String E;
        private static final String F;
        public Object a;
        @Nullable
        @UnstableApi
        @Deprecated
        public Object b;
        public MediaItem c;
        @Nullable
        public Object d;
        public long e;
        public long f;
        public long g;
        public boolean h;
        public boolean i;
        @Nullable
        public LiveConfiguration j;
        public boolean k;
        @UnstableApi
        public long l;
        @UnstableApi
        public long m;
        public int n;
        public int o;
        @UnstableApi
        public long p;
        public static final Object q;
        private static final Object r;
        private static final MediaItem s;
        private static final String t;
        private static final String u;
        private static final String v;
        private static final String w;
        private static final String x;
        private static final String y;
        private static final String z;

        static {
            Window.q = new Object();
            Window.r = new Object();
            Window.s = new Builder().E("androidx.media3.common.Timeline").M(Uri.EMPTY).a();
            Window.t = "1";
            Window.u = "2";
            Window.v = "3";
            Window.w = "4";
            Window.x = "5";
            Window.y = "6";
            Window.z = "7";
            Window.A = "8";
            Window.B = "9";
            Window.C = "a";
            Window.D = "b";
            Window.E = "c";
            Window.F = "d";
        }

        public Window() {
            this.a = Window.q;
            this.c = Window.s;
        }

        @UnstableApi
        public static Window a(Bundle bundle0) {
            Bundle bundle1 = bundle0.getBundle(Window.t);
            MediaItem mediaItem0 = bundle1 == null ? MediaItem.j : MediaItem.b(bundle1);
            long v = bundle0.getLong(Window.u, 0x8000000000000001L);
            long v1 = bundle0.getLong(Window.v, 0x8000000000000001L);
            long v2 = bundle0.getLong(Window.w, 0x8000000000000001L);
            boolean z = bundle0.getBoolean(Window.x, false);
            boolean z1 = bundle0.getBoolean(Window.y, false);
            Bundle bundle2 = bundle0.getBundle(Window.z);
            LiveConfiguration mediaItem$LiveConfiguration0 = bundle2 == null ? null : LiveConfiguration.b(bundle2);
            boolean z2 = bundle0.getBoolean(Window.A, false);
            long v3 = bundle0.getLong(Window.B, 0L);
            long v4 = bundle0.getLong(Window.C, 0x8000000000000001L);
            int v5 = bundle0.getInt(Window.D, 0);
            int v6 = bundle0.getInt(Window.E, 0);
            long v7 = bundle0.getLong(Window.F, 0L);
            Window timeline$Window0 = new Window();
            timeline$Window0.j(Window.r, mediaItem0, null, v, v1, v2, z, z1, mediaItem$LiveConfiguration0, v3, v4, v5, v6, v7);
            timeline$Window0.k = z2;
            return timeline$Window0;
        }

        public long b() {
            return Util.y0(this.g);
        }

        public long c() {
            return Util.B2(this.l);
        }

        public long d() {
            return this.l;
        }

        public long e() {
            return Util.B2(this.m);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return Window.class.equals(class0) && (Util.g(this.a, ((Window)object0).a) && Util.g(this.c, ((Window)object0).c) && Util.g(this.d, ((Window)object0).d) && Util.g(this.j, ((Window)object0).j) && this.e == ((Window)object0).e && this.f == ((Window)object0).f && this.g == ((Window)object0).g && this.h == ((Window)object0).h && this.i == ((Window)object0).i && this.k == ((Window)object0).k && this.l == ((Window)object0).l && this.m == ((Window)object0).m && this.n == ((Window)object0).n && this.o == ((Window)object0).o && this.p == ((Window)object0).p);
            }
            return false;
        }

        public long f() {
            return this.m;
        }

        public long g() {
            return Util.B2(this.p);
        }

        public long h() {
            return this.p;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            int v1 = this.c.hashCode();
            int v2 = 0;
            int v3 = this.d == null ? 0 : this.d.hashCode();
            LiveConfiguration mediaItem$LiveConfiguration0 = this.j;
            if(mediaItem$LiveConfiguration0 != null) {
                v2 = mediaItem$LiveConfiguration0.hashCode();
            }
            return ((((((((((((((v + 0xD9) * 0x1F + v1) * 0x1F + v3) * 0x1F + v2) * 0x1F + ((int)(this.e ^ this.e >>> 0x20))) * 0x1F + ((int)(this.f ^ this.f >>> 0x20))) * 0x1F + ((int)(this.g ^ this.g >>> 0x20))) * 0x1F + this.h) * 0x1F + this.i) * 0x1F + this.k) * 0x1F + ((int)(this.l ^ this.l >>> 0x20))) * 0x1F + ((int)(this.m ^ this.m >>> 0x20))) * 0x1F + this.n) * 0x1F + this.o) * 0x1F + ((int)(this.p ^ this.p >>> 0x20));
        }

        public boolean i() {
            return this.j != null;
        }

        @a
        @UnstableApi
        public Window j(Object object0, @Nullable MediaItem mediaItem0, @Nullable Object object1, long v, long v1, long v2, boolean z, boolean z1, @Nullable LiveConfiguration mediaItem$LiveConfiguration0, long v3, long v4, int v5, int v6, long v7) {
            Object object2;
            this.a = object0;
            this.c = mediaItem0 == null ? Window.s : mediaItem0;
            if(mediaItem0 == null) {
                object2 = null;
            }
            else {
                LocalConfiguration mediaItem$LocalConfiguration0 = mediaItem0.b;
                object2 = mediaItem$LocalConfiguration0 == null ? null : mediaItem$LocalConfiguration0.i;
            }
            this.b = object2;
            this.d = object1;
            this.e = v;
            this.f = v1;
            this.g = v2;
            this.h = z;
            this.i = z1;
            this.j = mediaItem$LiveConfiguration0;
            this.l = v3;
            this.m = v4;
            this.n = v5;
            this.o = v6;
            this.p = v7;
            this.k = false;
            return this;
        }

        @UnstableApi
        public Bundle k() {
            Bundle bundle0 = new Bundle();
            if(!MediaItem.j.equals(this.c)) {
                bundle0.putBundle("1", this.c.e());
            }
            long v = this.e;
            if(v != 0x8000000000000001L) {
                bundle0.putLong("2", v);
            }
            long v1 = this.f;
            if(v1 != 0x8000000000000001L) {
                bundle0.putLong("3", v1);
            }
            long v2 = this.g;
            if(v2 != 0x8000000000000001L) {
                bundle0.putLong("4", v2);
            }
            if(this.h) {
                bundle0.putBoolean("5", true);
            }
            if(this.i) {
                bundle0.putBoolean("6", true);
            }
            LiveConfiguration mediaItem$LiveConfiguration0 = this.j;
            if(mediaItem$LiveConfiguration0 != null) {
                bundle0.putBundle("7", mediaItem$LiveConfiguration0.c());
            }
            if(this.k) {
                bundle0.putBoolean("8", true);
            }
            long v3 = this.l;
            if(v3 != 0L) {
                bundle0.putLong("9", v3);
            }
            long v4 = this.m;
            if(v4 != 0x8000000000000001L) {
                bundle0.putLong("a", v4);
            }
            int v5 = this.n;
            if(v5 != 0) {
                bundle0.putInt("b", v5);
            }
            int v6 = this.o;
            if(v6 != 0) {
                bundle0.putInt("c", v6);
            }
            long v7 = this.p;
            if(v7 != 0L) {
                bundle0.putLong("d", v7);
            }
            return bundle0;
        }
    }

    public static final Timeline a;
    private static final String b;
    private static final String c;
    private static final String d;

    static {
        Timeline.a = new Timeline() {
            @Override  // androidx.media3.common.Timeline
            public int f(Object object0) {
                return -1;
            }

            @Override  // androidx.media3.common.Timeline
            public Period k(int v, Period timeline$Period0, boolean z) {
                throw new IndexOutOfBoundsException();
            }

            @Override  // androidx.media3.common.Timeline
            public int m() {
                return 0;
            }

            @Override  // androidx.media3.common.Timeline
            public Object s(int v) {
                throw new IndexOutOfBoundsException();
            }

            @Override  // androidx.media3.common.Timeline
            public Window u(int v, Window timeline$Window0, long v1) {
                throw new IndexOutOfBoundsException();
            }

            @Override  // androidx.media3.common.Timeline
            public int v() {
                return 0;
            }
        };
        Timeline.b = "0";
        Timeline.c = "1";
        Timeline.d = "2";
    }

    @UnstableApi
    public final Timeline a(int v) {
        int v2;
        if(this.v() == 1) {
            return this;
        }
        Window timeline$Window0 = this.u(v, new Window(), 0L);
        com.google.common.collect.O2.a o2$a0 = O2.n();
        for(int v1 = timeline$Window0.n; true; ++v1) {
            v2 = timeline$Window0.o;
            if(v1 > v2) {
                break;
            }
            Period timeline$Period0 = this.k(v1, new Period(), true);
            timeline$Period0.c = 0;
            o2$a0.j(timeline$Period0);
        }
        timeline$Window0.o = v2 - timeline$Window0.n;
        timeline$Window0.n = 0;
        return new RemotableTimeline(O2.B(timeline$Window0), o2$a0.n(), new int[]{0});
    }

    @UnstableApi
    public static Timeline b(Bundle bundle0) {
        O2 o20 = Timeline.c(new H0(), bundle0.getBinder(Timeline.b));
        O2 o21 = Timeline.c(new I0(), bundle0.getBinder(Timeline.c));
        int[] arr_v = bundle0.getIntArray(Timeline.d);
        if(arr_v == null) {
            arr_v = Timeline.d(o20.size());
        }
        return new RemotableTimeline(o20, o21, arr_v);
    }

    private static O2 c(t t0, @Nullable IBinder iBinder0) {
        return iBinder0 == null ? O2.A() : BundleCollectionUtil.d(t0, BundleListRetriever.a(iBinder0));
    }

    private static int[] d(int v) {
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = v1;
        }
        return arr_v;
    }

    // 去混淆评级： 低(20)
    public int e(boolean z) {
        return this.w() ? -1 : 0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Timeline)) {
            return false;
        }
        if(((Timeline)object0).v() == this.v() && ((Timeline)object0).m() == this.m()) {
            Window timeline$Window0 = new Window();
            Period timeline$Period0 = new Period();
            Window timeline$Window1 = new Window();
            Period timeline$Period1 = new Period();
            for(int v = 0; v < this.v(); ++v) {
                if(!this.t(v, timeline$Window0).equals(((Timeline)object0).t(v, timeline$Window1))) {
                    return false;
                }
            }
            for(int v1 = 0; v1 < this.m(); ++v1) {
                if(!this.k(v1, timeline$Period0, true).equals(((Timeline)object0).k(v1, timeline$Period1, true))) {
                    return false;
                }
            }
            int v2 = this.e(true);
            if(v2 != ((Timeline)object0).e(true)) {
                return false;
            }
            int v3 = this.g(true);
            if(v3 != ((Timeline)object0).g(true)) {
                return false;
            }
            while(v2 != v3) {
                int v4 = this.i(v2, 0, true);
                if(v4 != ((Timeline)object0).i(v2, 0, true)) {
                    return false;
                }
                v2 = v4;
            }
            return true;
        }
        return false;
    }

    public abstract int f(Object arg1);

    // 去混淆评级： 低(20)
    public int g(boolean z) {
        return this.w() ? -1 : this.v() - 1;
    }

    public final int h(int v, Period timeline$Period0, Window timeline$Window0, int v1, boolean z) {
        int v2 = this.j(v, timeline$Period0).c;
        if(this.t(v2, timeline$Window0).o == v) {
            int v3 = this.i(v2, v1, z);
            return v3 == -1 ? -1 : this.t(v3, timeline$Window0).n;
        }
        return v + 1;
    }

    @Override
    public int hashCode() {
        Window timeline$Window0 = new Window();
        Period timeline$Period0 = new Period();
        int v = this.v() + 0xD9;
        for(int v1 = 0; v1 < this.v(); ++v1) {
            v = v * 0x1F + this.t(v1, timeline$Window0).hashCode();
        }
        int v2 = v * 0x1F + this.m();
        for(int v3 = 0; v3 < this.m(); ++v3) {
            v2 = v2 * 0x1F + this.k(v3, timeline$Period0, true).hashCode();
        }
        for(int v4 = this.e(true); v4 != -1; v4 = this.i(v4, 0, true)) {
            v2 = v2 * 0x1F + v4;
        }
        return v2;
    }

    public int i(int v, int v1, boolean z) {
        switch(v1) {
            case 0: {
                return v == this.g(z) ? -1 : v + 1;
            }
            case 1: {
                return v;
            }
            default: {
                if(v1 != 2) {
                    throw new IllegalStateException();
                }
                return v == this.g(z) ? this.e(z) : v + 1;
            }
        }
    }

    public final Period j(int v, Period timeline$Period0) {
        return this.k(v, timeline$Period0, false);
    }

    public abstract Period k(int arg1, Period arg2, boolean arg3);

    public Period l(Object object0, Period timeline$Period0) {
        return this.k(this.f(object0), timeline$Period0, true);
    }

    public abstract int m();

    @l(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @UnstableApi
    @Deprecated
    public final Pair n(Window timeline$Window0, Period timeline$Period0, int v, long v1) {
        return this.p(timeline$Window0, timeline$Period0, v, v1);
    }

    @l(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @Nullable
    @UnstableApi
    @Deprecated
    public final Pair o(Window timeline$Window0, Period timeline$Period0, int v, long v1, long v2) {
        return this.q(timeline$Window0, timeline$Period0, v, v1, v2);
    }

    public final Pair p(Window timeline$Window0, Period timeline$Period0, int v, long v1) {
        return (Pair)Assertions.g(this.q(timeline$Window0, timeline$Period0, v, v1, 0L));
    }

    @Nullable
    public final Pair q(Window timeline$Window0, Period timeline$Period0, int v, long v1, long v2) {
        Assertions.c(v, 0, this.v());
        this.u(v, timeline$Window0, v2);
        if(v1 == 0x8000000000000001L) {
            v1 = timeline$Window0.d();
            if(v1 == 0x8000000000000001L) {
                return null;
            }
        }
        int v3 = timeline$Window0.n;
        this.j(v3, timeline$Period0);
        while(v3 < timeline$Window0.o && timeline$Period0.e != v1 && this.j(v3 + 1, timeline$Period0).e <= v1) {
            ++v3;
        }
        this.k(v3, timeline$Period0, true);
        long v4 = v1 - timeline$Period0.e;
        long v5 = timeline$Period0.d;
        if(v5 != 0x8000000000000001L) {
            v4 = Math.min(v4, v5 - 1L);
        }
        return Pair.create(Assertions.g(timeline$Period0.b), Math.max(0L, v4));
    }

    public int r(int v, int v1, boolean z) {
        switch(v1) {
            case 0: {
                return v == this.e(z) ? -1 : v - 1;
            }
            case 1: {
                return v;
            }
            default: {
                if(v1 != 2) {
                    throw new IllegalStateException();
                }
                return v == this.e(z) ? this.g(z) : v - 1;
            }
        }
    }

    public abstract Object s(int arg1);

    public final Window t(int v, Window timeline$Window0) {
        return this.u(v, timeline$Window0, 0L);
    }

    public abstract Window u(int arg1, Window arg2, long arg3);

    public abstract int v();

    public final boolean w() {
        return this.v() == 0;
    }

    public final boolean x(int v, Period timeline$Period0, Window timeline$Window0, int v1, boolean z) {
        return this.h(v, timeline$Period0, timeline$Window0, v1, z) == -1;
    }

    @UnstableApi
    public final Bundle y() {
        ArrayList arrayList0 = new ArrayList();
        int v = this.v();
        Window timeline$Window0 = new Window();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(this.u(v1, timeline$Window0, 0L).k());
        }
        ArrayList arrayList1 = new ArrayList();
        int v2 = this.m();
        Period timeline$Period0 = new Period();
        for(int v3 = 0; v3 < v2; ++v3) {
            arrayList1.add(this.k(v3, timeline$Period0, false).y());
        }
        int[] arr_v = new int[v];
        if(v > 0) {
            arr_v[0] = this.e(true);
        }
        for(int v4 = 1; v4 < v; ++v4) {
            arr_v[v4] = this.i(arr_v[v4 - 1], 0, true);
        }
        Bundle bundle0 = new Bundle();
        BundleListRetriever bundleListRetriever0 = new BundleListRetriever(arrayList0);
        bundle0.putBinder(Timeline.b, bundleListRetriever0);
        BundleListRetriever bundleListRetriever1 = new BundleListRetriever(arrayList1);
        bundle0.putBinder(Timeline.c, bundleListRetriever1);
        bundle0.putIntArray(Timeline.d, arr_v);
        return bundle0;
    }
}

