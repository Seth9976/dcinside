package androidx.media3.common;

import O1.a;
import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.B;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public interface Player {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface Command {
    }

    public static final class Commands {
        @UnstableApi
        public static final class Builder {
            private final androidx.media3.common.FlagSet.Builder a;
            private static final int[] b;

            static {
                Builder.b = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0x1F, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 0x20};
            }

            public Builder() {
                this.a = new androidx.media3.common.FlagSet.Builder();
            }

            private Builder(Commands player$Commands0) {
                androidx.media3.common.FlagSet.Builder flagSet$Builder0 = new androidx.media3.common.FlagSet.Builder();
                this.a = flagSet$Builder0;
                flagSet$Builder0.b(player$Commands0.a);
            }

            Builder(Commands player$Commands0, androidx.media3.common.Player.1 player$10) {
                this(player$Commands0);
            }

            @a
            public Builder a(int v) {
                this.a.a(v);
                return this;
            }

            @a
            public Builder b(Commands player$Commands0) {
                this.a.b(player$Commands0.a);
                return this;
            }

            @a
            public Builder c(int[] arr_v) {
                this.a.c(arr_v);
                return this;
            }

            @a
            public Builder d() {
                this.a.c(Builder.b);
                return this;
            }

            @a
            public Builder e(int v, boolean z) {
                this.a.d(v, z);
                return this;
            }

            public Commands f() {
                return new Commands(this.a.e(), null);
            }

            @a
            public Builder g(int v) {
                this.a.f(v);
                return this;
            }

            @a
            public Builder h(int[] arr_v) {
                this.a.g(arr_v);
                return this;
            }

            @a
            public Builder i(int v, boolean z) {
                this.a.h(v, z);
                return this;
            }
        }

        private final FlagSet a;
        public static final Commands b;
        private static final String c;

        static {
            Commands.b = new Builder().f();
            Commands.c = "0";
        }

        private Commands(FlagSet flagSet0) {
            this.a = flagSet0;
        }

        Commands(FlagSet flagSet0, androidx.media3.common.Player.1 player$10) {
            this(flagSet0);
        }

        @UnstableApi
        public Builder b() {
            return new Builder(this, null);
        }

        public boolean c(int v) {
            return this.a.a(v);
        }

        public boolean d(int[] arr_v) {
            return this.a.b(arr_v);
        }

        @UnstableApi
        public static Commands e(Bundle bundle0) {
            ArrayList arrayList0 = bundle0.getIntegerArrayList(Commands.c);
            if(arrayList0 == null) {
                return Commands.b;
            }
            Builder player$Commands$Builder0 = new Builder();
            for(int v = 0; v < arrayList0.size(); ++v) {
                player$Commands$Builder0.a(((int)(((Integer)arrayList0.get(v)))));
            }
            return player$Commands$Builder0.f();
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Commands ? this.a.equals(((Commands)object0).a) : false;
        }

        public int f(int v) {
            return this.a.c(v);
        }

        public int g() {
            return this.a.d();
        }

        @UnstableApi
        public Bundle h() {
            Bundle bundle0 = new Bundle();
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < this.a.d(); ++v) {
                arrayList0.add(this.a.c(v));
            }
            bundle0.putIntegerArrayList(Commands.c, arrayList0);
            return bundle0;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface DiscontinuityReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface Event {
    }

    public static final class Events {
        private final FlagSet a;

        @UnstableApi
        public Events(FlagSet flagSet0) {
            this.a = flagSet0;
        }

        public boolean a(int v) {
            return this.a.a(v);
        }

        public boolean b(int[] arr_v) {
            return this.a.b(arr_v);
        }

        public int c(int v) {
            return this.a.c(v);
        }

        public int d() {
            return this.a.d();
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Events ? this.a.equals(((Events)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public interface Listener {
        void A(int arg1);

        @UnstableApi
        @Deprecated
        void C(boolean arg1);

        @UnstableApi
        void E(int arg1);

        void F(boolean arg1);

        void H(int arg1, boolean arg2);

        void I(MediaMetadata arg1);

        void J(PlaybackException arg1);

        void L(Commands arg1);

        void N(Player arg1, Events arg2);

        void Q(Timeline arg1, int arg2);

        void R(long arg1);

        void S(Tracks arg1);

        void T(DeviceInfo arg1);

        void V(boolean arg1, int arg2);

        void Y(PositionInfo arg1, PositionInfo arg2, int arg3);

        void Z(boolean arg1);

        void a(VideoSize arg1);

        void a0(int arg1);

        void c0(int arg1);

        void d(boolean arg1);

        void f0(long arg1);

        void g0(TrackSelectionParameters arg1);

        void h0();

        void i0(@Nullable MediaItem arg1, int arg2);

        void l0(int arg1, int arg2);

        @UnstableApi
        @Deprecated
        void o0(int arg1);

        void p0(boolean arg1);

        void q(PlaybackParameters arg1);

        void q0(float arg1);

        @UnstableApi
        @Deprecated
        void r(List arg1);

        void r0(AudioAttributes arg1);

        @UnstableApi
        @Deprecated
        void u0(boolean arg1, int arg2);

        void v0(MediaMetadata arg1);

        void w(CueGroup arg1);

        void w0(@Nullable PlaybackException arg1);

        @UnstableApi
        void x(Metadata arg1);

        void x0(long arg1);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface MediaItemTransitionReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface PlayWhenReadyChangeReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface PlaybackSuppressionReason {
    }

    public static final class PositionInfo {
        @Nullable
        public final Object a;
        @UnstableApi
        @Deprecated
        public final int b;
        public final int c;
        @Nullable
        @UnstableApi
        public final MediaItem d;
        @Nullable
        public final Object e;
        public final int f;
        public final long g;
        public final long h;
        public final int i;
        public final int j;
        @VisibleForTesting
        static final String k;
        private static final String l;
        @VisibleForTesting
        static final String m;
        @VisibleForTesting
        static final String n;
        @VisibleForTesting
        static final String o;
        private static final String p;
        private static final String q;

        static {
            PositionInfo.k = "0";
            PositionInfo.l = "1";
            PositionInfo.m = "2";
            PositionInfo.n = "3";
            PositionInfo.o = "4";
            PositionInfo.p = "5";
            PositionInfo.q = "6";
        }

        @UnstableApi
        public PositionInfo(@Nullable Object object0, int v, @Nullable MediaItem mediaItem0, @Nullable Object object1, int v1, long v2, long v3, int v4, int v5) {
            this.a = object0;
            this.b = v;
            this.c = v;
            this.d = mediaItem0;
            this.e = object1;
            this.f = v1;
            this.g = v2;
            this.h = v3;
            this.i = v4;
            this.j = v5;
        }

        @UnstableApi
        @Deprecated
        public PositionInfo(@Nullable Object object0, int v, @Nullable Object object1, int v1, long v2, long v3, int v4, int v5) {
            this(object0, v, MediaItem.j, object1, v1, v2, v3, v4, v5);
        }

        @UnstableApi
        public boolean a(PositionInfo player$PositionInfo0) {
            return this.c == player$PositionInfo0.c && this.f == player$PositionInfo0.f && this.g == player$PositionInfo0.g && this.h == player$PositionInfo0.h && this.i == player$PositionInfo0.i && this.j == player$PositionInfo0.j && B.a(this.d, player$PositionInfo0.d);
        }

        @UnstableApi
        public PositionInfo b(boolean z, boolean z1) {
            if(z && z1) {
                return this;
            }
            Object object0 = this.a;
            int v = z1 ? this.c : 0;
            MediaItem mediaItem0 = z ? this.d : null;
            Object object1 = this.e;
            int v1 = z1 ? this.f : 0;
            long v2 = 0L;
            long v3 = z ? this.g : 0L;
            if(z) {
                v2 = this.h;
            }
            int v4 = z ? this.i : -1;
            return z ? new PositionInfo(object0, v, mediaItem0, object1, v1, v3, v2, v4, this.j) : new PositionInfo(object0, v, mediaItem0, object1, v1, v3, v2, v4, -1);
        }

        @UnstableApi
        public static PositionInfo c(Bundle bundle0) {
            int v = bundle0.getInt(PositionInfo.k, 0);
            Bundle bundle1 = bundle0.getBundle(PositionInfo.l);
            return bundle1 == null ? new PositionInfo(null, v, null, null, bundle0.getInt(PositionInfo.m, 0), bundle0.getLong(PositionInfo.n, 0L), bundle0.getLong(PositionInfo.o, 0L), bundle0.getInt(PositionInfo.p, -1), bundle0.getInt(PositionInfo.q, -1)) : new PositionInfo(null, v, MediaItem.b(bundle1), null, bundle0.getInt(PositionInfo.m, 0), bundle0.getLong(PositionInfo.n, 0L), bundle0.getLong(PositionInfo.o, 0L), bundle0.getInt(PositionInfo.p, -1), bundle0.getInt(PositionInfo.q, -1));
        }

        @UnstableApi
        @Deprecated
        public Bundle d() {
            return this.e(0x7FFFFFFF);
        }

        @UnstableApi
        public Bundle e(int v) {
            Bundle bundle0 = new Bundle();
            if(v < 3 || this.c != 0) {
                bundle0.putInt(PositionInfo.k, this.c);
            }
            MediaItem mediaItem0 = this.d;
            if(mediaItem0 != null) {
                Bundle bundle1 = mediaItem0.e();
                bundle0.putBundle(PositionInfo.l, bundle1);
            }
            if(v < 3 || this.f != 0) {
                bundle0.putInt(PositionInfo.m, this.f);
            }
            if(v < 3 || this.g != 0L) {
                bundle0.putLong(PositionInfo.n, this.g);
            }
            if(v < 3 || this.h != 0L) {
                bundle0.putLong(PositionInfo.o, this.h);
            }
            int v1 = this.i;
            if(v1 != -1) {
                bundle0.putInt(PositionInfo.p, v1);
            }
            int v2 = this.j;
            if(v2 != -1) {
                bundle0.putInt(PositionInfo.q, v2);
            }
            return bundle0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return PositionInfo.class == class0 && (this.a(((PositionInfo)object0)) && B.a(this.a, ((PositionInfo)object0).a) && B.a(this.e, ((PositionInfo)object0).e));
            }
            return false;
        }

        @Override
        public int hashCode() {
            return B.b(new Object[]{this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface RepeatMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface State {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface TimelineChangeReason {
    }

    public static final int A = 0;
    public static final int A0 = 14;
    public static final int B = 1;
    public static final int B0 = 15;
    public static final int C = 2;
    public static final int C0 = 16;
    public static final int D = 3;
    public static final int D0 = 17;
    public static final int E = 0;
    @Deprecated
    public static final int E0 = 18;
    public static final int F = 1;
    public static final int F0 = 18;
    public static final int G = 2;
    @Deprecated
    public static final int G0 = 19;
    public static final int H = 3;
    public static final int H0 = 19;
    public static final int I = 4;
    public static final int I0 = 0x1F;
    public static final int J = 5;
    public static final int J0 = 20;
    public static final int K = 6;
    public static final int K0 = 21;
    public static final int L = 7;
    public static final int L0 = 22;
    public static final int M = 8;
    public static final int M0 = 23;
    public static final int N = 9;
    public static final int N0 = 24;
    public static final int O = 10;
    @Deprecated
    public static final int O0 = 25;
    public static final int P = 11;
    public static final int P0 = 33;
    public static final int Q = 12;
    @Deprecated
    public static final int Q0 = 26;
    public static final int R = 13;
    public static final int R0 = 34;
    public static final int S = 14;
    public static final int S0 = 35;
    public static final int T = 15;
    public static final int T0 = 27;
    public static final int U = 16;
    public static final int U0 = 28;
    public static final int V = 17;
    public static final int V0 = 29;
    public static final int W = 18;
    public static final int W0 = 30;
    public static final int X = 19;
    public static final int X0 = 0x20;
    public static final int Y = 20;
    public static final int Y0 = -1;
    public static final int Z = 21;
    public static final int a = 1;
    public static final int a0 = 22;
    public static final int b = 2;
    public static final int b0 = 23;
    public static final int c = 3;
    public static final int c0 = 24;
    public static final int d = 4;
    public static final int d0 = 25;
    public static final int e = 1;
    public static final int e0 = 26;
    public static final int f = 2;
    public static final int f0 = 27;
    public static final int g = 3;
    public static final int g0 = 28;
    public static final int h = 4;
    public static final int h0 = 29;
    public static final int i = 5;
    public static final int i0 = 30;
    public static final int j = 6;
    public static final int j0 = 1;
    public static final int k = 0;
    public static final int k0 = 2;
    public static final int l = 1;
    public static final int l0 = 3;
    @Deprecated
    public static final int m = 2;
    public static final int m0 = 4;
    public static final int n = 3;
    public static final int n0 = 5;
    public static final int o = 0;
    @UnstableApi
    @Deprecated
    public static final int o0 = 5;
    public static final int p = 1;
    public static final int p0 = 6;
    public static final int q = 2;
    @UnstableApi
    @Deprecated
    public static final int q0 = 6;
    public static final int r = 0;
    public static final int r0 = 7;
    public static final int s = 1;
    public static final int s0 = 8;
    public static final int t = 2;
    @UnstableApi
    @Deprecated
    public static final int t0 = 8;
    public static final int u = 3;
    public static final int u0 = 9;
    public static final int v = 4;
    public static final int v0 = 10;
    public static final int w = 5;
    @UnstableApi
    @Deprecated
    public static final int w0 = 10;
    public static final int x = 6;
    public static final int x0 = 11;
    public static final int y = 0;
    public static final int y0 = 12;
    public static final int z = 1;
    public static final int z0 = 13;

    void A(int arg1, MediaItem arg2);

    TrackSelectionParameters A0();

    @UnstableApi
    @Deprecated
    int A1();

    void B(@Nullable TextureView arg1);

    void B1();

    void C(AudioAttributes arg1, boolean arg2);

    long C0();

    boolean D();

    boolean D0();

    void D1(boolean arg1);

    void E0(boolean arg1);

    void F1(int arg1);

    void G(@Nullable Surface arg1);

    MediaItem G0(int arg1);

    @Deprecated
    void H();

    long H0();

    void H1(MediaItem arg1);

    void I(int arg1, int arg2, List arg3);

    int I1();

    void J1(Listener arg1);

    long K0();

    CueGroup L();

    int L0();

    boolean L1();

    void M1(Listener arg1);

    void N(@Nullable TextureView arg1);

    int N0();

    int N1();

    VideoSize O();

    Timeline O1();

    void P(long arg1);

    Looper P1();

    void Q();

    void R0(List arg1, int arg2, long arg3);

    void R1();

    void S(@Nullable SurfaceView arg1);

    void S0(int arg1);

    long T0();

    @Deprecated
    void U(@IntRange(from = 0L) int arg1);

    boolean V0();

    void V1(int arg1, MediaItem arg2);

    boolean W();

    MediaMetadata W0();

    void W1(int arg1, long arg2);

    @UnstableApi
    @Deprecated
    boolean X();

    Commands X1();

    long Y();

    void Y1(@IntRange(from = 0L) int arg1, int arg2);

    void Z0(TrackSelectionParameters arg1);

    boolean Z1();

    boolean a();

    int b();

    void b1(int arg1, int arg2);

    void c();

    void c0(List arg1, boolean arg2);

    @UnstableApi
    @Deprecated
    boolean c2();

    AudioAttributes d();

    long d2();

    long e1();

    @Nullable
    PlaybackException f();

    void f1();

    void f2(int arg1, List arg2);

    void g0(int arg1);

    @UnstableApi
    @Deprecated
    int g2();

    long getCurrentPosition();

    DeviceInfo getDeviceInfo();

    long getDuration();

    @FloatRange(from = 0.0, to = 1.0)
    float getVolume();

    @UnstableApi
    @Deprecated
    boolean hasNext();

    @UnstableApi
    @Deprecated
    boolean hasPrevious();

    int i();

    void i0(MediaMetadata arg1);

    void i1(List arg1);

    long i2();

    boolean isPlaying();

    boolean j0();

    boolean j1();

    void j2(MediaItem arg1, boolean arg2);

    void k0(int arg1, int arg2);

    void k1(boolean arg1, int arg2);

    void l(PlaybackParameters arg1);

    void l1();

    void l2(MediaItem arg1, long arg2);

    PlaybackParameters m();

    @UnstableApi
    @Deprecated
    void m0();

    @Nullable
    MediaItem m1();

    void n();

    @Nullable
    @UnstableApi
    Object n0();

    @IntRange(from = 0L, to = 100L)
    int n1();

    int n2();

    @UnstableApi
    @Deprecated
    void next();

    void o(@FloatRange(from = 0.0, to = 1.0) float arg1);

    int o1();

    @UnstableApi
    @Deprecated
    int o2();

    void p(@FloatRange(from = 0.0, fromInclusive = false) float arg1);

    void p0(MediaItem arg1);

    @UnstableApi
    @Deprecated
    boolean p1();

    void pause();

    @UnstableApi
    @Deprecated
    void previous();

    void q(int arg1);

    void q0();

    void q1();

    @UnstableApi
    @Deprecated
    boolean q2();

    Tracks r0();

    void r1();

    void r2(int arg1, int arg2, int arg3);

    void release();

    void s(@Nullable Surface arg1);

    void s2(List arg1);

    void stop();

    void t(@Nullable SurfaceView arg1);

    boolean t0();

    @UnstableApi
    @Deprecated
    void t1();

    boolean t2();

    void u(@Nullable SurfaceHolder arg1);

    int u0();

    @UnstableApi
    @Deprecated
    boolean u1();

    @Deprecated
    void v(boolean arg1);

    boolean v0(int arg1);

    @UnstableApi
    Size v1();

    void v2();

    @Deprecated
    void w();

    MediaMetadata w2();

    void x(@Nullable SurfaceHolder arg1);

    void x1(int arg1);

    long x2();

    int y1();

    @IntRange(from = 0L)
    int z();

    class androidx.media3.common.Player.1 {
    }

}

