package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat.Builder;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer.OnSpatializerStateChangedListener;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes.AudioAttributesV21;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities.Listener;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.Y0;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.base.I;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import com.google.common.collect.c4;
import com.google.common.collect.p1;
import com.google.common.primitives.l;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

@UnstableApi
public class DefaultTrackSelector extends MappingTrackSelector implements Listener {
    static final class AudioTrackInfo extends TrackInfo implements Comparable {
        private final int e;
        private final boolean f;
        @Nullable
        private final String g;
        private final Parameters h;
        private final boolean i;
        private final int j;
        private final int k;
        private final int l;
        private final boolean m;
        private final boolean n;
        private final int o;
        private final int p;
        private final boolean q;
        private final int r;
        private final int s;
        private final int t;
        private final int u;
        private final boolean v;
        private final boolean w;

        public AudioTrackInfo(int v, TrackGroup trackGroup0, int v1, Parameters defaultTrackSelector$Parameters0, int v2, boolean z, I i0, int v3) {
            super(v, trackGroup0, v1);
            int v11;
            int v8;
            int v6;
            this.h = defaultTrackSelector$Parameters0;
            int v4 = defaultTrackSelector$Parameters0.t0 ? 24 : 16;
            boolean z1 = true;
            this.m = defaultTrackSelector$Parameters0.p0 && (v3 & v4) != 0;
            this.g = DefaultTrackSelector.a0(this.d.d);
            this.i = Y0.n(v2, false);
            int v5;
            for(v5 = 0; true; ++v5) {
                v6 = 0x7FFFFFFF;
                if(v5 >= defaultTrackSelector$Parameters0.n.size()) {
                    v5 = 0x7FFFFFFF;
                    v8 = 0;
                    break;
                }
                String s = (String)defaultTrackSelector$Parameters0.n.get(v5);
                int v7 = DefaultTrackSelector.I(this.d, s, false);
                if(v7 > 0) {
                    v8 = v7;
                    break;
                }
            }
            this.k = v5;
            this.j = v8;
            this.l = DefaultTrackSelector.M(this.d.f, defaultTrackSelector$Parameters0.o);
            this.n = this.d.f == 0 || (this.d.f & 1) != 0;
            this.q = (this.d.e & 1) != 0;
            this.r = this.d.B;
            this.s = this.d.C;
            this.t = this.d.i;
            this.f = (this.d.i == -1 || this.d.i <= defaultTrackSelector$Parameters0.q) && (this.d.B == -1 || this.d.B <= defaultTrackSelector$Parameters0.p) && i0.apply(this.d);
            String[] arr_s = Util.I0();
            int v9;
            for(v9 = 0; true; ++v9) {
                if(v9 >= arr_s.length) {
                    v9 = 0x7FFFFFFF;
                    v11 = 0;
                    break;
                }
                int v10 = DefaultTrackSelector.I(this.d, arr_s[v9], false);
                if(v10 > 0) {
                    v11 = v10;
                    break;
                }
            }
            this.o = v9;
            this.p = v11;
            for(int v12 = 0; v12 < defaultTrackSelector$Parameters0.r.size(); ++v12) {
                String s1 = this.d.n;
                if(s1 != null && s1.equals(defaultTrackSelector$Parameters0.r.get(v12))) {
                    v6 = v12;
                    break;
                }
            }
            this.u = v6;
            this.v = (v2 & 0x180) == 0x80;
            if((v2 & 0x40) != 0x40) {
                z1 = false;
            }
            this.w = z1;
            this.e = this.f(v2, z, v4);
        }

        @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo
        public int a() {
            return this.e;
        }

        @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo
        public boolean b(TrackInfo defaultTrackSelector$TrackInfo0) {
            return this.g(((AudioTrackInfo)defaultTrackSelector$TrackInfo0));
        }

        public static int c(List list0, List list1) {
            return ((AudioTrackInfo)Collections.max(list0)).d(((AudioTrackInfo)Collections.max(list1)));
        }

        @Override
        public int compareTo(Object object0) {
            return this.d(((AudioTrackInfo)object0));
        }

        public int d(AudioTrackInfo defaultTrackSelector$AudioTrackInfo0) {
            c4 c40 = !this.f || !this.i ? DefaultTrackSelector.q.P() : DefaultTrackSelector.q;
            p1 p10 = p1.n().k(this.i, defaultTrackSelector$AudioTrackInfo0.i);
            c4 c41 = c4.K().P();
            p1 p11 = p10.j(this.k, defaultTrackSelector$AudioTrackInfo0.k, c41).f(this.j, defaultTrackSelector$AudioTrackInfo0.j).f(this.l, defaultTrackSelector$AudioTrackInfo0.l).k(this.q, defaultTrackSelector$AudioTrackInfo0.q).k(this.n, defaultTrackSelector$AudioTrackInfo0.n);
            c4 c42 = c4.K().P();
            p1 p12 = p11.j(this.o, defaultTrackSelector$AudioTrackInfo0.o, c42).f(this.p, defaultTrackSelector$AudioTrackInfo0.p).k(this.f, defaultTrackSelector$AudioTrackInfo0.f);
            c4 c43 = c4.K().P();
            p1 p13 = p12.j(this.u, defaultTrackSelector$AudioTrackInfo0.u, c43);
            if(this.h.y) {
                c4 c44 = DefaultTrackSelector.q.P();
                p13 = p13.j(this.t, defaultTrackSelector$AudioTrackInfo0.t, c44);
            }
            p1 p14 = p13.k(this.v, defaultTrackSelector$AudioTrackInfo0.v).k(this.w, defaultTrackSelector$AudioTrackInfo0.w).j(this.r, defaultTrackSelector$AudioTrackInfo0.r, c40).j(this.s, defaultTrackSelector$AudioTrackInfo0.s, c40);
            if(Util.g(this.g, defaultTrackSelector$AudioTrackInfo0.g)) {
                p14 = p14.j(this.t, defaultTrackSelector$AudioTrackInfo0.t, c40);
            }
            return p14.m();
        }

        public static O2 e(int v, TrackGroup trackGroup0, Parameters defaultTrackSelector$Parameters0, int[] arr_v, boolean z, I i0, int v1) {
            a o2$a0 = O2.n();
            for(int v2 = 0; v2 < trackGroup0.a; ++v2) {
                o2$a0.j(new AudioTrackInfo(v, trackGroup0, v2, defaultTrackSelector$Parameters0, arr_v[v2], z, i0, v1));
            }
            return o2$a0.n();
        }

        private int f(int v, boolean z, int v1) {
            if(!Y0.n(v, this.h.v0)) {
                return 0;
            }
            if(!this.f && !this.h.o0) {
                return 0;
            }
            if(this.h.s.a == 2 && !DefaultTrackSelector.b0(this.h, v, this.d)) {
                return 0;
            }
            return Y0.n(v, false) && this.f && this.d.i != -1 && (!this.h.z && !this.h.y && (this.h.x0 || !z) && this.h.s.a != 2 && (v & v1) != 0) ? 2 : 1;
        }

        public boolean g(AudioTrackInfo defaultTrackSelector$AudioTrackInfo0) {
            if(!this.h.r0) {
                int v = this.d.B;
                if(v != -1 && v == defaultTrackSelector$AudioTrackInfo0.d.B) {
                    goto label_3;
                }
                return false;
            }
        label_3:
            if(!this.m) {
                String s = this.d.n;
                if(s == null || !TextUtils.equals(s, defaultTrackSelector$AudioTrackInfo0.d.n)) {
                    return false;
                }
            }
            Parameters defaultTrackSelector$Parameters0 = this.h;
            if(!defaultTrackSelector$Parameters0.q0) {
                int v1 = this.d.C;
                return v1 == -1 || v1 != defaultTrackSelector$AudioTrackInfo0.d.C ? false : defaultTrackSelector$Parameters0.s0 || this.v == defaultTrackSelector$AudioTrackInfo0.v && this.w == defaultTrackSelector$AudioTrackInfo0.w;
            }
            return defaultTrackSelector$Parameters0.s0 || this.v == defaultTrackSelector$AudioTrackInfo0.v && this.w == defaultTrackSelector$AudioTrackInfo0.w;
        }
    }

    static final class ImageTrackInfo extends TrackInfo implements Comparable {
        private final int e;
        private final int f;

        public ImageTrackInfo(int v, TrackGroup trackGroup0, int v1, Parameters defaultTrackSelector$Parameters0, int v2) {
            super(v, trackGroup0, v1);
            this.e = Y0.n(v2, defaultTrackSelector$Parameters0.v0);
            this.f = this.d.f();
        }

        @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo
        public int a() {
            return this.e;
        }

        @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo
        public boolean b(TrackInfo defaultTrackSelector$TrackInfo0) {
            return this.f(((ImageTrackInfo)defaultTrackSelector$TrackInfo0));
        }

        public static int c(List list0, List list1) {
            return ((ImageTrackInfo)list0.get(0)).d(((ImageTrackInfo)list1.get(0)));
        }

        @Override
        public int compareTo(Object object0) {
            return this.d(((ImageTrackInfo)object0));
        }

        public int d(ImageTrackInfo defaultTrackSelector$ImageTrackInfo0) {
            return Integer.compare(this.f, defaultTrackSelector$ImageTrackInfo0.f);
        }

        public static O2 e(int v, TrackGroup trackGroup0, Parameters defaultTrackSelector$Parameters0, int[] arr_v) {
            a o2$a0 = O2.n();
            for(int v1 = 0; v1 < trackGroup0.a; ++v1) {
                o2$a0.j(new ImageTrackInfo(v, trackGroup0, v1, defaultTrackSelector$Parameters0, arr_v[v1]));
            }
            return o2$a0.n();
        }

        public boolean f(ImageTrackInfo defaultTrackSelector$ImageTrackInfo0) {
            return false;
        }
    }

    static final class OtherTrackScore implements Comparable {
        private final boolean a;
        private final boolean b;

        public OtherTrackScore(Format format0, int v) {
            this.a = (format0.e & 1) != 0;
            this.b = Y0.n(v, false);
        }

        public int a(OtherTrackScore defaultTrackSelector$OtherTrackScore0) {
            return p1.n().k(this.b, defaultTrackSelector$OtherTrackScore0.b).k(this.a, defaultTrackSelector$OtherTrackScore0.a).m();
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((OtherTrackScore)object0));
        }
    }

    public static final class Parameters extends TrackSelectionParameters {
        public static final class Builder extends androidx.media3.common.TrackSelectionParameters.Builder {
            private boolean C;
            private boolean D;
            private boolean E;
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private boolean N;
            private boolean O;
            private boolean P;
            private boolean Q;
            private final SparseArray R;
            private final SparseBooleanArray S;

            @Deprecated
            public Builder() {
                this.R = new SparseArray();
                this.S = new SparseBooleanArray();
                this.V0();
            }

            public Builder(Context context0) {
                super(context0);
                this.R = new SparseArray();
                this.S = new SparseBooleanArray();
                this.V0();
            }

            private Builder(Bundle bundle0) {
                super(bundle0);
                this.V0();
                this.n1(bundle0.getBoolean(Parameters.D0, Parameters.B0.k0));
                this.g1(bundle0.getBoolean(Parameters.E0, Parameters.B0.l0));
                this.h1(bundle0.getBoolean(Parameters.F0, Parameters.B0.m0));
                this.f1(bundle0.getBoolean(Parameters.R0, Parameters.B0.n0));
                this.l1(bundle0.getBoolean(Parameters.G0, Parameters.B0.o0));
                this.a1(bundle0.getBoolean(Parameters.H0, Parameters.B0.p0));
                this.b1(bundle0.getBoolean(Parameters.I0, Parameters.B0.q0));
                this.Y0(bundle0.getBoolean(Parameters.J0, Parameters.B0.r0));
                this.Z0(bundle0.getBoolean(Parameters.S0, Parameters.B0.s0));
                this.c1(bundle0.getBoolean(Parameters.V0, Parameters.B0.t0));
                this.i1(bundle0.getBoolean(Parameters.T0, Parameters.B0.u0));
                this.m1(bundle0.getBoolean(Parameters.K0, Parameters.B0.v0));
                this.S1(bundle0.getBoolean(Parameters.L0, Parameters.B0.w0));
                this.e1(bundle0.getBoolean(Parameters.M0, Parameters.B0.x0));
                this.d1(bundle0.getBoolean(Parameters.U0, Parameters.B0.y0));
                this.R = new SparseArray();
                this.Q1(bundle0);
                this.S = this.W0(bundle0.getIntArray(Parameters.Q0));
            }

            Builder(Bundle bundle0, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.1 defaultTrackSelector$10) {
                this(bundle0);
            }

            private Builder(Parameters defaultTrackSelector$Parameters0) {
                super(defaultTrackSelector$Parameters0);
                this.C = defaultTrackSelector$Parameters0.k0;
                this.D = defaultTrackSelector$Parameters0.l0;
                this.E = defaultTrackSelector$Parameters0.m0;
                this.F = defaultTrackSelector$Parameters0.n0;
                this.G = defaultTrackSelector$Parameters0.o0;
                this.H = defaultTrackSelector$Parameters0.p0;
                this.I = defaultTrackSelector$Parameters0.q0;
                this.J = defaultTrackSelector$Parameters0.r0;
                this.K = defaultTrackSelector$Parameters0.s0;
                this.L = defaultTrackSelector$Parameters0.t0;
                this.M = defaultTrackSelector$Parameters0.u0;
                this.N = defaultTrackSelector$Parameters0.v0;
                this.O = defaultTrackSelector$Parameters0.w0;
                this.P = defaultTrackSelector$Parameters0.x0;
                this.Q = defaultTrackSelector$Parameters0.y0;
                this.R = Builder.U0(defaultTrackSelector$Parameters0.z0);
                this.S = defaultTrackSelector$Parameters0.A0.clone();
            }

            Builder(Parameters defaultTrackSelector$Parameters0, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.1 defaultTrackSelector$10) {
                this(defaultTrackSelector$Parameters0);
            }

            @O1.a
            public Builder A1(TrackSelectionOverride trackSelectionOverride0) {
                super.b0(trackSelectionOverride0);
                return this;
            }

            @O1.a
            public Builder B1(@Nullable String s) {
                super.c0(s);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder C(TrackSelectionOverride trackSelectionOverride0) {
                return this.K0(trackSelectionOverride0);
            }

            @O1.a
            public Builder C1(String[] arr_s) {
                super.d0(arr_s);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            public TrackSelectionParameters D() {
                return this.L0();
            }

            @O1.a
            public Builder D1(@Nullable String s) {
                super.e0(s);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder E(TrackGroup trackGroup0) {
                return this.M0(trackGroup0);
            }

            @O1.a
            public Builder E1(String[] arr_s) {
                super.f0(arr_s);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder F() {
                return this.N0();
            }

            @O1.a
            public Builder F1(int v) {
                super.g0(v);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder G(int v) {
                return this.O0(v);
            }

            @O1.a
            public Builder G1(@Nullable String s) {
                super.h0(s);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder H() {
                return this.S0();
            }

            @O1.a
            public Builder H1(Context context0) {
                super.i0(context0);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder I() {
                return this.T0();
            }

            @O1.a
            public Builder I1(String[] arr_s) {
                super.j0(arr_s);
                return this;
            }

            @O1.a
            public Builder J1(int v) {
                super.k0(v);
                return this;
            }

            @O1.a
            public Builder K0(TrackSelectionOverride trackSelectionOverride0) {
                super.C(trackSelectionOverride0);
                return this;
            }

            @O1.a
            public Builder K1(@Nullable String s) {
                super.l0(s);
                return this;
            }

            public Parameters L0() {
                return new Parameters(this, null);
            }

            @O1.a
            public Builder L1(String[] arr_s) {
                super.m0(arr_s);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            protected androidx.media3.common.TrackSelectionParameters.Builder M(TrackSelectionParameters trackSelectionParameters0) {
                return this.X0(trackSelectionParameters0);
            }

            @O1.a
            public Builder M0(TrackGroup trackGroup0) {
                super.E(trackGroup0);
                return this;
            }

            @O1.a
            public Builder M1(int v) {
                super.n0(v);
                return this;
            }

            @O1.a
            public Builder N0() {
                super.F();
                return this;
            }

            @O1.a
            public Builder N1(int v, boolean z) {
                if(this.S.get(v) == z) {
                    return this;
                }
                if(z) {
                    this.S.put(v, true);
                    return this;
                }
                this.S.delete(v);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            @Deprecated
            public androidx.media3.common.TrackSelectionParameters.Builder O(Set set0) {
                return this.k1(set0);
            }

            @O1.a
            public Builder O0(int v) {
                super.G(v);
                return this;
            }

            @O1.a
            public Builder O1(boolean z) {
                super.p0(z);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder P(boolean z) {
                return this.o1(z);
            }

            @O1.a
            @Deprecated
            public Builder P0(int v, TrackGroupArray trackGroupArray0) {
                Map map0 = (Map)this.R.get(v);
                if(map0 != null && map0.containsKey(trackGroupArray0)) {
                    map0.remove(trackGroupArray0);
                    if(map0.isEmpty()) {
                        this.R.remove(v);
                    }
                }
                return this;
            }

            @O1.a
            @Deprecated
            public Builder P1(int v, TrackGroupArray trackGroupArray0, @Nullable SelectionOverride defaultTrackSelector$SelectionOverride0) {
                Map map0 = (Map)this.R.get(v);
                if(map0 == null) {
                    map0 = new HashMap();
                    this.R.put(v, map0);
                }
                if(map0.containsKey(trackGroupArray0) && Util.g(map0.get(trackGroupArray0), defaultTrackSelector$SelectionOverride0)) {
                    return this;
                }
                map0.put(trackGroupArray0, defaultTrackSelector$SelectionOverride0);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder Q(boolean z) {
                return this.p1(z);
            }

            @O1.a
            @Deprecated
            public Builder Q0() {
                if(this.R.size() == 0) {
                    return this;
                }
                this.R.clear();
                return this;
            }

            private void Q1(Bundle bundle0) {
                int[] arr_v = bundle0.getIntArray(Parameters.N0);
                ArrayList arrayList0 = bundle0.getParcelableArrayList(Parameters.O0);
                O2 o20 = arrayList0 == null ? O2.A() : BundleCollectionUtil.d(new n(), arrayList0);
                SparseArray sparseArray0 = bundle0.getSparseParcelableArray(Parameters.P0);
                SparseArray sparseArray1 = sparseArray0 == null ? new SparseArray() : BundleCollectionUtil.e(new o(), sparseArray0);
                if(arr_v != null && arr_v.length == o20.size()) {
                    for(int v = 0; v < arr_v.length; ++v) {
                        this.P1(arr_v[v], ((TrackGroupArray)o20.get(v)), ((SelectionOverride)sparseArray1.get(v)));
                    }
                }
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder R(int v) {
                return this.q1(v);
            }

            @O1.a
            @Deprecated
            public Builder R0(int v) {
                Map map0 = (Map)this.R.get(v);
                if(map0 != null && !map0.isEmpty()) {
                    this.R.remove(v);
                }
                return this;
            }

            @O1.a
            public Builder R1(int v, boolean z) {
                super.q0(v, z);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder S(int v) {
                return this.r1(v);
            }

            @O1.a
            public Builder S0() {
                super.H();
                return this;
            }

            @O1.a
            public Builder S1(boolean z) {
                this.O = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder T(int v) {
                return this.s1(v);
            }

            @O1.a
            public Builder T0() {
                super.I();
                return this;
            }

            @O1.a
            public Builder T1(int v, int v1, boolean z) {
                super.r0(v, v1, z);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder U(int v) {
                return this.t1(v);
            }

            private static SparseArray U0(SparseArray sparseArray0) {
                SparseArray sparseArray1 = new SparseArray();
                for(int v = 0; v < sparseArray0.size(); ++v) {
                    sparseArray1.put(sparseArray0.keyAt(v), new HashMap(((Map)sparseArray0.valueAt(v))));
                }
                return sparseArray1;
            }

            @O1.a
            public Builder U1(Context context0, boolean z) {
                super.s0(context0, z);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder V(int v) {
                return this.u1(v);
            }

            private void V0() {
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = true;
                this.H = false;
                this.I = false;
                this.J = false;
                this.K = false;
                this.L = true;
                this.M = true;
                this.N = true;
                this.O = false;
                this.P = true;
                this.Q = false;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder W(int v, int v1) {
                return this.v1(v, v1);
            }

            private SparseBooleanArray W0(@Nullable int[] arr_v) {
                if(arr_v == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray0 = new SparseBooleanArray(arr_v.length);
                for(int v = 0; v < arr_v.length; ++v) {
                    sparseBooleanArray0.append(arr_v[v], true);
                }
                return sparseBooleanArray0;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder X() {
                return this.w1();
            }

            @O1.a
            protected Builder X0(TrackSelectionParameters trackSelectionParameters0) {
                super.M(trackSelectionParameters0);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder Y(int v) {
                return this.x1(v);
            }

            @O1.a
            public Builder Y0(boolean z) {
                this.J = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder Z(int v) {
                return this.y1(v);
            }

            @O1.a
            public Builder Z0(boolean z) {
                this.K = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder a0(int v, int v1) {
                return this.z1(v, v1);
            }

            @O1.a
            public Builder a1(boolean z) {
                this.H = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder b0(TrackSelectionOverride trackSelectionOverride0) {
                return this.A1(trackSelectionOverride0);
            }

            @O1.a
            public Builder b1(boolean z) {
                this.I = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder c0(@Nullable String s) {
                return this.B1(s);
            }

            @O1.a
            public Builder c1(boolean z) {
                this.L = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder d0(String[] arr_s) {
                return this.C1(arr_s);
            }

            @O1.a
            public Builder d1(boolean z) {
                this.Q = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder e0(@Nullable String s) {
                return this.D1(s);
            }

            @O1.a
            public Builder e1(boolean z) {
                this.P = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder f0(String[] arr_s) {
                return this.E1(arr_s);
            }

            @O1.a
            public Builder f1(boolean z) {
                this.F = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder g0(int v) {
                return this.F1(v);
            }

            @O1.a
            public Builder g1(boolean z) {
                this.D = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder h0(@Nullable String s) {
                return this.G1(s);
            }

            @O1.a
            public Builder h1(boolean z) {
                this.E = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder i0(Context context0) {
                return this.H1(context0);
            }

            @O1.a
            public Builder i1(boolean z) {
                this.M = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder j0(String[] arr_s) {
                return this.I1(arr_s);
            }

            @O1.a
            @Deprecated
            public Builder j1(int v) {
                return this.q1(v);
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder k0(int v) {
                return this.J1(v);
            }

            @O1.a
            @Deprecated
            public Builder k1(Set set0) {
                super.O(set0);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder l0(@Nullable String s) {
                return this.K1(s);
            }

            @O1.a
            public Builder l1(boolean z) {
                this.G = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder m0(String[] arr_s) {
                return this.L1(arr_s);
            }

            @O1.a
            public Builder m1(boolean z) {
                this.N = z;
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder n0(int v) {
                return this.M1(v);
            }

            @O1.a
            public Builder n1(boolean z) {
                this.C = z;
                return this;
            }

            @O1.a
            public Builder o1(boolean z) {
                super.P(z);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder p0(boolean z) {
                return this.O1(z);
            }

            @O1.a
            public Builder p1(boolean z) {
                super.Q(z);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder q0(int v, boolean z) {
                return this.R1(v, z);
            }

            @O1.a
            public Builder q1(int v) {
                super.R(v);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder r0(int v, int v1, boolean z) {
                return this.T1(v, v1, z);
            }

            @O1.a
            public Builder r1(int v) {
                super.S(v);
                return this;
            }

            @Override  // androidx.media3.common.TrackSelectionParameters$Builder
            @O1.a
            public androidx.media3.common.TrackSelectionParameters.Builder s0(Context context0, boolean z) {
                return this.U1(context0, z);
            }

            @O1.a
            public Builder s1(int v) {
                super.T(v);
                return this;
            }

            @O1.a
            public Builder t1(int v) {
                super.U(v);
                return this;
            }

            @O1.a
            public Builder u1(int v) {
                super.V(v);
                return this;
            }

            @O1.a
            public Builder v1(int v, int v1) {
                super.W(v, v1);
                return this;
            }

            @O1.a
            public Builder w1() {
                super.X();
                return this;
            }

            @O1.a
            public Builder x1(int v) {
                super.Y(v);
                return this;
            }

            @O1.a
            public Builder y1(int v) {
                super.Z(v);
                return this;
            }

            @O1.a
            public Builder z1(int v, int v1) {
                super.a0(v, v1);
                return this;
            }
        }

        private final SparseBooleanArray A0;
        public static final Parameters B0;
        @Deprecated
        public static final Parameters C0;
        private static final String D0;
        private static final String E0;
        private static final String F0;
        private static final String G0;
        private static final String H0;
        private static final String I0;
        private static final String J0;
        private static final String K0;
        private static final String L0;
        private static final String M0;
        private static final String N0;
        private static final String O0;
        private static final String P0;
        private static final String Q0;
        private static final String R0;
        private static final String S0;
        private static final String T0;
        private static final String U0;
        private static final String V0;
        public final boolean k0;
        public final boolean l0;
        public final boolean m0;
        public final boolean n0;
        public final boolean o0;
        public final boolean p0;
        public final boolean q0;
        public final boolean r0;
        public final boolean s0;
        public final boolean t0;
        public final boolean u0;
        public final boolean v0;
        public final boolean w0;
        public final boolean x0;
        public final boolean y0;
        private final SparseArray z0;

        static {
            Parameters defaultTrackSelector$Parameters0 = new Builder().L0();
            Parameters.B0 = defaultTrackSelector$Parameters0;
            Parameters.C0 = defaultTrackSelector$Parameters0;
            Parameters.D0 = "rs";
            Parameters.E0 = "rt";
            Parameters.F0 = "ru";
            Parameters.G0 = "rv";
            Parameters.H0 = "rw";
            Parameters.I0 = "rx";
            Parameters.J0 = "ry";
            Parameters.K0 = "rz";
            Parameters.L0 = "s0";
            Parameters.M0 = "s1";
            Parameters.N0 = "s2";
            Parameters.O0 = "s3";
            Parameters.P0 = "s4";
            Parameters.Q0 = "s5";
            Parameters.R0 = "s6";
            Parameters.S0 = "s7";
            Parameters.T0 = "s8";
            Parameters.U0 = "s9";
            Parameters.V0 = "sa";
        }

        private Parameters(Builder defaultTrackSelector$Parameters$Builder0) {
            super(defaultTrackSelector$Parameters$Builder0);
            this.k0 = defaultTrackSelector$Parameters$Builder0.C;
            this.l0 = defaultTrackSelector$Parameters$Builder0.D;
            this.m0 = defaultTrackSelector$Parameters$Builder0.E;
            this.n0 = defaultTrackSelector$Parameters$Builder0.F;
            this.o0 = defaultTrackSelector$Parameters$Builder0.G;
            this.p0 = defaultTrackSelector$Parameters$Builder0.H;
            this.q0 = defaultTrackSelector$Parameters$Builder0.I;
            this.r0 = defaultTrackSelector$Parameters$Builder0.J;
            this.s0 = defaultTrackSelector$Parameters$Builder0.K;
            this.t0 = defaultTrackSelector$Parameters$Builder0.L;
            this.u0 = defaultTrackSelector$Parameters$Builder0.M;
            this.v0 = defaultTrackSelector$Parameters$Builder0.N;
            this.w0 = defaultTrackSelector$Parameters$Builder0.O;
            this.x0 = defaultTrackSelector$Parameters$Builder0.P;
            this.y0 = defaultTrackSelector$Parameters$Builder0.Q;
            this.z0 = defaultTrackSelector$Parameters$Builder0.R;
            this.A0 = defaultTrackSelector$Parameters$Builder0.S;
        }

        Parameters(Builder defaultTrackSelector$Parameters$Builder0, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.1 defaultTrackSelector$10) {
            this(defaultTrackSelector$Parameters$Builder0);
        }

        @Override  // androidx.media3.common.TrackSelectionParameters
        public androidx.media3.common.TrackSelectionParameters.Builder F() {
            return this.O();
        }

        @Override  // androidx.media3.common.TrackSelectionParameters
        public Bundle I() {
            Bundle bundle0 = super.I();
            bundle0.putBoolean(Parameters.D0, this.k0);
            bundle0.putBoolean(Parameters.E0, this.l0);
            bundle0.putBoolean(Parameters.F0, this.m0);
            bundle0.putBoolean(Parameters.R0, this.n0);
            bundle0.putBoolean(Parameters.G0, this.o0);
            bundle0.putBoolean(Parameters.H0, this.p0);
            bundle0.putBoolean(Parameters.I0, this.q0);
            bundle0.putBoolean(Parameters.J0, this.r0);
            bundle0.putBoolean(Parameters.S0, this.s0);
            bundle0.putBoolean(Parameters.V0, this.t0);
            bundle0.putBoolean(Parameters.T0, this.u0);
            bundle0.putBoolean(Parameters.K0, this.v0);
            bundle0.putBoolean(Parameters.L0, this.w0);
            bundle0.putBoolean(Parameters.M0, this.x0);
            bundle0.putBoolean(Parameters.U0, this.y0);
            Parameters.V(bundle0, this.z0);
            int[] arr_v = Parameters.R(this.A0);
            bundle0.putIntArray(Parameters.Q0, arr_v);
            return bundle0;
        }

        private static boolean L(SparseBooleanArray sparseBooleanArray0, SparseBooleanArray sparseBooleanArray1) {
            int v = sparseBooleanArray0.size();
            if(sparseBooleanArray1.size() != v) {
                return false;
            }
            for(int v1 = 0; v1 < v; ++v1) {
                if(sparseBooleanArray1.indexOfKey(sparseBooleanArray0.keyAt(v1)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean M(SparseArray sparseArray0, SparseArray sparseArray1) {
            int v = sparseArray0.size();
            if(sparseArray1.size() != v) {
                return false;
            }
            int v1 = 0;
            while(v1 < v) {
                int v2 = sparseArray1.indexOfKey(sparseArray0.keyAt(v1));
                if(v2 >= 0 && Parameters.N(((Map)sparseArray0.valueAt(v1)), ((Map)sparseArray1.valueAt(v2)))) {
                    ++v1;
                    continue;
                }
                return false;
            }
            return true;
        }

        private static boolean N(Map map0, Map map1) {
            if(map1.size() != map0.size()) {
                return false;
            }
            for(Object object0: map0.entrySet()) {
                TrackGroupArray trackGroupArray0 = (TrackGroupArray)((Map.Entry)object0).getKey();
                if(!map1.containsKey(trackGroupArray0) || !Util.g(((Map.Entry)object0).getValue(), map1.get(trackGroupArray0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        public Builder O() {
            return new Builder(this, null);
        }

        public static Parameters P(Bundle bundle0) {
            return new Builder(bundle0, null).L0();
        }

        public static Parameters Q(Context context0) {
            return new Builder(context0).L0();
        }

        private static int[] R(SparseBooleanArray sparseBooleanArray0) {
            int[] arr_v = new int[sparseBooleanArray0.size()];
            for(int v = 0; v < sparseBooleanArray0.size(); ++v) {
                arr_v[v] = sparseBooleanArray0.keyAt(v);
            }
            return arr_v;
        }

        public boolean S(int v) {
            return this.A0.get(v);
        }

        @Nullable
        @Deprecated
        public SelectionOverride T(int v, TrackGroupArray trackGroupArray0) {
            Map map0 = (Map)this.z0.get(v);
            return map0 == null ? null : ((SelectionOverride)map0.get(trackGroupArray0));
        }

        @Deprecated
        public boolean U(int v, TrackGroupArray trackGroupArray0) {
            Map map0 = (Map)this.z0.get(v);
            return map0 != null && map0.containsKey(trackGroupArray0);
        }

        private static void V(Bundle bundle0, SparseArray sparseArray0) {
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            SparseArray sparseArray1 = new SparseArray();
            for(int v = 0; v < sparseArray0.size(); ++v) {
                int v1 = sparseArray0.keyAt(v);
                for(Object object0: ((Map)sparseArray0.valueAt(v)).entrySet()) {
                    SelectionOverride defaultTrackSelector$SelectionOverride0 = (SelectionOverride)((Map.Entry)object0).getValue();
                    if(defaultTrackSelector$SelectionOverride0 != null) {
                        sparseArray1.put(arrayList1.size(), defaultTrackSelector$SelectionOverride0);
                    }
                    arrayList1.add(((TrackGroupArray)((Map.Entry)object0).getKey()));
                    arrayList0.add(v1);
                }
                int[] arr_v = l.D(arrayList0);
                bundle0.putIntArray(Parameters.N0, arr_v);
                ArrayList arrayList2 = BundleCollectionUtil.i(arrayList1, new androidx.media3.exoplayer.trackselection.l());
                bundle0.putParcelableArrayList(Parameters.O0, arrayList2);
                SparseArray sparseArray2 = BundleCollectionUtil.k(sparseArray1, new m());
                bundle0.putSparseParcelableArray(Parameters.P0, sparseArray2);
            }
        }

        @Override  // androidx.media3.common.TrackSelectionParameters
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return Parameters.class == class0 && (super.equals(((Parameters)object0)) && this.k0 == ((Parameters)object0).k0 && this.l0 == ((Parameters)object0).l0 && this.m0 == ((Parameters)object0).m0 && this.n0 == ((Parameters)object0).n0 && this.o0 == ((Parameters)object0).o0 && this.p0 == ((Parameters)object0).p0 && this.q0 == ((Parameters)object0).q0 && this.r0 == ((Parameters)object0).r0 && this.s0 == ((Parameters)object0).s0 && this.t0 == ((Parameters)object0).t0 && this.u0 == ((Parameters)object0).u0 && this.v0 == ((Parameters)object0).v0 && this.w0 == ((Parameters)object0).w0 && this.x0 == ((Parameters)object0).x0 && this.y0 == ((Parameters)object0).y0 && Parameters.L(this.A0, ((Parameters)object0).A0) && Parameters.M(this.z0, ((Parameters)object0).z0));
            }
            return false;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters
        public int hashCode() {
            return (((((((((((((((super.hashCode() + 0x1F) * 0x1F + this.k0) * 0x1F + this.l0) * 0x1F + this.m0) * 0x1F + this.n0) * 0x1F + this.o0) * 0x1F + this.p0) * 0x1F + this.q0) * 0x1F + this.r0) * 0x1F + this.s0) * 0x1F + this.t0) * 0x1F + this.u0) * 0x1F + this.v0) * 0x1F + this.w0) * 0x1F + this.x0) * 0x1F + this.y0;
        }
    }

    @Deprecated
    public static final class ParametersBuilder extends androidx.media3.common.TrackSelectionParameters.Builder {
        private final Builder C;

        @Deprecated
        public ParametersBuilder() {
            this.C = new Builder();
        }

        public ParametersBuilder(Context context0) {
            this.C = new Builder(context0);
        }

        @O1.a
        @Deprecated
        public ParametersBuilder A0(int v) {
            this.C.R0(v);
            return this;
        }

        @O1.a
        public ParametersBuilder B0() {
            this.C.S0();
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder C(TrackSelectionOverride trackSelectionOverride0) {
            return this.t0(trackSelectionOverride0);
        }

        @O1.a
        public ParametersBuilder C0() {
            this.C.T0();
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        public TrackSelectionParameters D() {
            return this.u0();
        }

        @O1.a
        protected ParametersBuilder D0(TrackSelectionParameters trackSelectionParameters0) {
            this.C.X0(trackSelectionParameters0);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder E(TrackGroup trackGroup0) {
            return this.v0(trackGroup0);
        }

        @O1.a
        public ParametersBuilder E0(boolean z) {
            this.C.Y0(z);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder F() {
            return this.w0();
        }

        @O1.a
        public ParametersBuilder F0(boolean z) {
            this.C.Z0(z);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder G(int v) {
            return this.x0(v);
        }

        @O1.a
        public ParametersBuilder G0(boolean z) {
            this.C.a1(z);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder H() {
            return this.B0();
        }

        @O1.a
        public ParametersBuilder H0(boolean z) {
            this.C.b1(z);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder I() {
            return this.C0();
        }

        @O1.a
        public ParametersBuilder I0(boolean z) {
            this.C.e1(z);
            return this;
        }

        @O1.a
        public ParametersBuilder J0(boolean z) {
            this.C.f1(z);
            return this;
        }

        @O1.a
        public ParametersBuilder K0(boolean z) {
            this.C.g1(z);
            return this;
        }

        @O1.a
        public ParametersBuilder L0(boolean z) {
            this.C.h1(z);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        protected androidx.media3.common.TrackSelectionParameters.Builder M(TrackSelectionParameters trackSelectionParameters0) {
            return this.D0(trackSelectionParameters0);
        }

        @O1.a
        public ParametersBuilder M0(AudioOffloadPreferences trackSelectionParameters$AudioOffloadPreferences0) {
            this.C.N(trackSelectionParameters$AudioOffloadPreferences0);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder N(AudioOffloadPreferences trackSelectionParameters$AudioOffloadPreferences0) {
            return this.M0(trackSelectionParameters$AudioOffloadPreferences0);
        }

        @O1.a
        @Deprecated
        public ParametersBuilder N0(int v) {
            this.C.j1(v);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        @Deprecated
        public androidx.media3.common.TrackSelectionParameters.Builder O(Set set0) {
            return this.O0(set0);
        }

        @O1.a
        @Deprecated
        public ParametersBuilder O0(Set set0) {
            this.C.k1(set0);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder P(boolean z) {
            return this.S0(z);
        }

        @O1.a
        public ParametersBuilder P0(boolean z) {
            this.C.l1(z);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder Q(boolean z) {
            return this.T0(z);
        }

        @O1.a
        public ParametersBuilder Q0(boolean z) {
            this.C.m1(z);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder R(int v) {
            return this.U0(v);
        }

        @O1.a
        public ParametersBuilder R0(boolean z) {
            this.C.n1(z);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder S(int v) {
            return this.V0(v);
        }

        @O1.a
        public ParametersBuilder S0(boolean z) {
            this.C.o1(z);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder T(int v) {
            return this.W0(v);
        }

        @O1.a
        public ParametersBuilder T0(boolean z) {
            this.C.p1(z);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder U(int v) {
            return this.X0(v);
        }

        @O1.a
        public ParametersBuilder U0(int v) {
            this.C.q1(v);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder V(int v) {
            return this.Y0(v);
        }

        @O1.a
        public ParametersBuilder V0(int v) {
            this.C.r1(v);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder W(int v, int v1) {
            return this.Z0(v, v1);
        }

        @O1.a
        public ParametersBuilder W0(int v) {
            this.C.s1(v);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder X() {
            return this.a1();
        }

        @O1.a
        public ParametersBuilder X0(int v) {
            this.C.t1(v);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder Y(int v) {
            return this.b1(v);
        }

        @O1.a
        public ParametersBuilder Y0(int v) {
            this.C.u1(v);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder Z(int v) {
            return this.c1(v);
        }

        @O1.a
        public ParametersBuilder Z0(int v, int v1) {
            this.C.v1(v, v1);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder a0(int v, int v1) {
            return this.d1(v, v1);
        }

        @O1.a
        public ParametersBuilder a1() {
            this.C.w1();
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder b0(TrackSelectionOverride trackSelectionOverride0) {
            return this.e1(trackSelectionOverride0);
        }

        @O1.a
        public ParametersBuilder b1(int v) {
            this.C.x1(v);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder c0(@Nullable String s) {
            return this.f1(s);
        }

        @O1.a
        public ParametersBuilder c1(int v) {
            this.C.y1(v);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder d0(String[] arr_s) {
            return this.g1(arr_s);
        }

        @O1.a
        public ParametersBuilder d1(int v, int v1) {
            this.C.z1(v, v1);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder e0(@Nullable String s) {
            return this.h1(s);
        }

        @O1.a
        public ParametersBuilder e1(TrackSelectionOverride trackSelectionOverride0) {
            this.C.A1(trackSelectionOverride0);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder f0(String[] arr_s) {
            return this.i1(arr_s);
        }

        @O1.a
        public ParametersBuilder f1(@Nullable String s) {
            this.C.B1(s);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder g0(int v) {
            return this.j1(v);
        }

        @O1.a
        public ParametersBuilder g1(String[] arr_s) {
            this.C.C1(arr_s);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder h0(@Nullable String s) {
            return this.k1(s);
        }

        @O1.a
        public ParametersBuilder h1(@Nullable String s) {
            this.C.D1(s);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder i0(Context context0) {
            return this.l1(context0);
        }

        @O1.a
        public ParametersBuilder i1(String[] arr_s) {
            this.C.E1(arr_s);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder j0(String[] arr_s) {
            return this.m1(arr_s);
        }

        @O1.a
        public ParametersBuilder j1(int v) {
            this.C.F1(v);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder k0(int v) {
            return this.n1(v);
        }

        @O1.a
        public ParametersBuilder k1(@Nullable String s) {
            this.C.G1(s);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder l0(@Nullable String s) {
            return this.o1(s);
        }

        @O1.a
        public ParametersBuilder l1(Context context0) {
            this.C.H1(context0);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder m0(String[] arr_s) {
            return this.p1(arr_s);
        }

        @O1.a
        public ParametersBuilder m1(String[] arr_s) {
            this.C.I1(arr_s);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder n0(int v) {
            return this.q1(v);
        }

        @O1.a
        public ParametersBuilder n1(int v) {
            this.C.J1(v);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder o0(boolean z) {
            return this.r1(z);
        }

        @O1.a
        public ParametersBuilder o1(@Nullable String s) {
            this.C.K1(s);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder p0(boolean z) {
            return this.t1(z);
        }

        @O1.a
        public ParametersBuilder p1(String[] arr_s) {
            this.C.L1(arr_s);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder q0(int v, boolean z) {
            return this.v1(v, z);
        }

        @O1.a
        public ParametersBuilder q1(int v) {
            this.C.M1(v);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder r0(int v, int v1, boolean z) {
            return this.x1(v, v1, z);
        }

        @O1.a
        public ParametersBuilder r1(boolean z) {
            this.C.o0(z);
            return this;
        }

        @Override  // androidx.media3.common.TrackSelectionParameters$Builder
        @O1.a
        public androidx.media3.common.TrackSelectionParameters.Builder s0(Context context0, boolean z) {
            return this.y1(context0, z);
        }

        @O1.a
        public ParametersBuilder s1(int v, boolean z) {
            this.C.N1(v, z);
            return this;
        }

        @O1.a
        public ParametersBuilder t0(TrackSelectionOverride trackSelectionOverride0) {
            this.C.K0(trackSelectionOverride0);
            return this;
        }

        @O1.a
        public ParametersBuilder t1(boolean z) {
            this.C.O1(z);
            return this;
        }

        public Parameters u0() {
            return this.C.L0();
        }

        @O1.a
        @Deprecated
        public ParametersBuilder u1(int v, TrackGroupArray trackGroupArray0, @Nullable SelectionOverride defaultTrackSelector$SelectionOverride0) {
            this.C.P1(v, trackGroupArray0, defaultTrackSelector$SelectionOverride0);
            return this;
        }

        @O1.a
        public ParametersBuilder v0(TrackGroup trackGroup0) {
            this.C.M0(trackGroup0);
            return this;
        }

        @O1.a
        public ParametersBuilder v1(int v, boolean z) {
            this.C.R1(v, z);
            return this;
        }

        @O1.a
        public ParametersBuilder w0() {
            this.C.N0();
            return this;
        }

        @O1.a
        public ParametersBuilder w1(boolean z) {
            this.C.S1(z);
            return this;
        }

        @O1.a
        public ParametersBuilder x0(int v) {
            this.C.O0(v);
            return this;
        }

        @O1.a
        public ParametersBuilder x1(int v, int v1, boolean z) {
            this.C.T1(v, v1, z);
            return this;
        }

        @O1.a
        @Deprecated
        public ParametersBuilder y0(int v, TrackGroupArray trackGroupArray0) {
            this.C.P0(v, trackGroupArray0);
            return this;
        }

        @O1.a
        public ParametersBuilder y1(Context context0, boolean z) {
            this.C.U1(context0, z);
            return this;
        }

        @O1.a
        @Deprecated
        public ParametersBuilder z0() {
            this.C.Q0();
            return this;
        }
    }

    public static final class SelectionOverride {
        public final int a;
        public final int[] b;
        public final int c;
        public final int d;
        private static final String e;
        private static final String f;
        private static final String g;

        static {
            SelectionOverride.e = "0";
            SelectionOverride.f = "1";
            SelectionOverride.g = "2";
        }

        public SelectionOverride(int v, int[] arr_v) {
            this(v, arr_v, 0);
        }

        @UnstableApi
        public SelectionOverride(int v, int[] arr_v, int v1) {
            this.a = v;
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
            this.b = arr_v1;
            this.c = arr_v.length;
            this.d = v1;
            Arrays.sort(arr_v1);
        }

        public boolean a(int v) {
            int[] arr_v = this.b;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                if(arr_v[v1] == v) {
                    return true;
                }
            }
            return false;
        }

        @UnstableApi
        public static SelectionOverride b(Bundle bundle0) {
            int v = bundle0.getInt("0", -1);
            int[] arr_v = bundle0.getIntArray("1");
            int v1 = bundle0.getInt("2", -1);
            Assertions.a(v >= 0 && v1 >= 0);
            Assertions.g(arr_v);
            return new SelectionOverride(v, arr_v, v1);
        }

        @UnstableApi
        public Bundle c() {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("0", this.a);
            bundle0.putIntArray("1", this.b);
            bundle0.putInt("2", this.d);
            return bundle0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return SelectionOverride.class == class0 && (this.a == ((SelectionOverride)object0).a && Arrays.equals(this.b, ((SelectionOverride)object0).b) && this.d == ((SelectionOverride)object0).d);
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = Arrays.hashCode(this.b);
            return (this.a * 0x1F + v) * 0x1F + this.d;
        }
    }

    @RequiresApi(0x20)
    static class SpatializerWrapperV32 {
        private final Spatializer a;
        private final boolean b;
        @Nullable
        private Handler c;
        @Nullable
        private Spatializer.OnSpatializerStateChangedListener d;

        private SpatializerWrapperV32(Spatializer spatializer0) {
            this.a = spatializer0;
            this.b = spatializer0.getImmersiveAudioLevel() != 0;
        }

        public boolean a(AudioAttributes audioAttributes0, Format format0) {
            int v = Util.a0((!"audio/eac3-joc".equals(format0.n) || format0.B != 16 ? format0.B : 12));
            if(v == 0) {
                return false;
            }
            AudioFormat.Builder audioFormat$Builder0 = new AudioFormat.Builder().setEncoding(2).setChannelMask(v);
            int v1 = format0.C;
            if(v1 != -1) {
                audioFormat$Builder0.setSampleRate(v1);
            }
            AudioAttributesV21 audioAttributes$AudioAttributesV210 = audioAttributes0.b();
            AudioFormat audioFormat0 = audioFormat$Builder0.build();
            return this.a.canBeSpatialized(audioAttributes$AudioAttributesV210.a, audioFormat0);
        }

        public void b(DefaultTrackSelector defaultTrackSelector0, Looper looper0) {
            if(this.d == null && this.c == null) {
                this.d = new Spatializer.OnSpatializerStateChangedListener() {
                    final SpatializerWrapperV32 b;

                    @Override  // android.media.Spatializer$OnSpatializerStateChangedListener
                    public void onSpatializerAvailableChanged(Spatializer spatializer0, boolean z) {
                        defaultTrackSelector0.Y();
                    }

                    @Override  // android.media.Spatializer$OnSpatializerStateChangedListener
                    public void onSpatializerEnabledChanged(Spatializer spatializer0, boolean z) {
                        defaultTrackSelector0.Y();
                    }
                };
                Handler handler0 = new Handler(looper0);
                this.c = handler0;
                Objects.requireNonNull(handler0);
                androidx.emoji2.text.a a0 = new androidx.emoji2.text.a(handler0);
                this.a.addOnSpatializerStateChangedListener(a0, this.d);
            }
        }

        public boolean c() {
            return this.a.isAvailable();
        }

        public boolean d() {
            return this.a.isEnabled();
        }

        public boolean e() {
            return this.b;
        }

        public void f() {
            Spatializer.OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener0 = this.d;
            if(spatializer$OnSpatializerStateChangedListener0 != null && this.c != null) {
                this.a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener0);
                this.c.removeCallbacksAndMessages(null);
                this.c = null;
                this.d = null;
            }
        }

        @Nullable
        public static SpatializerWrapperV32 g(Context context0) {
            AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
            return audioManager0 == null ? null : new SpatializerWrapperV32(audioManager0.getSpatializer());
        }
    }

    static final class TextTrackInfo extends TrackInfo implements Comparable {
        private final int e;
        private final boolean f;
        private final boolean g;
        private final boolean h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final boolean m;

        public TextTrackInfo(int v, TrackGroup trackGroup0, int v1, Parameters defaultTrackSelector$Parameters0, int v2, @Nullable String s) {
            super(v, trackGroup0, v1);
            int v7;
            int v3 = 0;
            this.f = Y0.n(v2, false);
            int v4 = this.d.e & ~defaultTrackSelector$Parameters0.v;
            this.g = (v4 & 1) != 0;
            this.h = (v4 & 2) != 0;
            O2 o20 = defaultTrackSelector$Parameters0.t.isEmpty() ? O2.B("") : defaultTrackSelector$Parameters0.t;
            int v5;
            for(v5 = 0; true; ++v5) {
                if(v5 >= o20.size()) {
                    v5 = 0x7FFFFFFF;
                    v7 = 0;
                    break;
                }
                String s1 = (String)o20.get(v5);
                int v6 = DefaultTrackSelector.I(this.d, s1, defaultTrackSelector$Parameters0.w);
                if(v6 > 0) {
                    v7 = v6;
                    break;
                }
            }
            this.i = v5;
            this.j = v7;
            int v8 = DefaultTrackSelector.M(this.d.f, defaultTrackSelector$Parameters0.u);
            this.k = v8;
            this.m = (this.d.f & 0x440) != 0;
            boolean z = DefaultTrackSelector.a0(s) == null;
            int v9 = DefaultTrackSelector.I(this.d, s, z);
            this.l = v9;
            if(Y0.n(v2, defaultTrackSelector$Parameters0.v0) && (v7 > 0 || defaultTrackSelector$Parameters0.t.isEmpty() && v8 > 0 || this.g || this.h && v9 > 0)) {
                v3 = 1;
            }
            this.e = v3;
        }

        @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo
        public int a() {
            return this.e;
        }

        @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo
        public boolean b(TrackInfo defaultTrackSelector$TrackInfo0) {
            return this.f(((TextTrackInfo)defaultTrackSelector$TrackInfo0));
        }

        public static int c(List list0, List list1) {
            return ((TextTrackInfo)list0.get(0)).d(((TextTrackInfo)list1.get(0)));
        }

        @Override
        public int compareTo(Object object0) {
            return this.d(((TextTrackInfo)object0));
        }

        public int d(TextTrackInfo defaultTrackSelector$TextTrackInfo0) {
            p1 p10 = p1.n().k(this.f, defaultTrackSelector$TextTrackInfo0.f);
            c4 c40 = c4.K().P();
            p1 p11 = p10.j(this.i, defaultTrackSelector$TextTrackInfo0.i, c40).f(this.j, defaultTrackSelector$TextTrackInfo0.j).f(this.k, defaultTrackSelector$TextTrackInfo0.k).k(this.g, defaultTrackSelector$TextTrackInfo0.g).j(Boolean.valueOf(this.h), Boolean.valueOf(defaultTrackSelector$TextTrackInfo0.h), (this.j == 0 ? c4.K() : c4.K().P())).f(this.l, defaultTrackSelector$TextTrackInfo0.l);
            if(this.k == 0) {
                p11 = p11.l(this.m, defaultTrackSelector$TextTrackInfo0.m);
            }
            return p11.m();
        }

        public static O2 e(int v, TrackGroup trackGroup0, Parameters defaultTrackSelector$Parameters0, int[] arr_v, @Nullable String s) {
            a o2$a0 = O2.n();
            for(int v1 = 0; v1 < trackGroup0.a; ++v1) {
                o2$a0.j(new TextTrackInfo(v, trackGroup0, v1, defaultTrackSelector$Parameters0, arr_v[v1], s));
            }
            return o2$a0.n();
        }

        public boolean f(TextTrackInfo defaultTrackSelector$TextTrackInfo0) {
            return false;
        }
    }

    static abstract class TrackInfo {
        public interface Factory {
            List a(int arg1, TrackGroup arg2, int[] arg3);
        }

        public final int a;
        public final TrackGroup b;
        public final int c;
        public final Format d;

        public TrackInfo(int v, TrackGroup trackGroup0, int v1) {
            this.a = v;
            this.b = trackGroup0;
            this.c = v1;
            this.d = trackGroup0.c(v1);
        }

        public abstract int a();

        public abstract boolean b(TrackInfo arg1);
    }

    static final class VideoTrackInfo extends TrackInfo {
        private final boolean e;
        private final Parameters f;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;
        private final boolean n;
        private final boolean o;
        private final int p;
        private final boolean q;
        private final boolean r;
        private final int s;
        private static final float t = 10.0f;

        public VideoTrackInfo(int v, TrackGroup trackGroup0, int v1, Parameters defaultTrackSelector$Parameters0, int v2, int v3, boolean z) {
            super(v, trackGroup0, v1);
            this.f = defaultTrackSelector$Parameters0;
            int v4 = defaultTrackSelector$Parameters0.m0 ? 24 : 16;
            boolean z1 = false;
            this.o = defaultTrackSelector$Parameters0.l0 && (v3 & v4) != 0;
            this.e = z && ((this.d.t == -1 || this.d.t <= defaultTrackSelector$Parameters0.a) && (this.d.u == -1 || this.d.u <= defaultTrackSelector$Parameters0.b) && (this.d.v == -1.0f || this.d.v <= ((float)defaultTrackSelector$Parameters0.c)) && (this.d.i == -1 || this.d.i <= defaultTrackSelector$Parameters0.d));
            this.g = z && ((this.d.t == -1 || this.d.t >= defaultTrackSelector$Parameters0.e) && (this.d.u == -1 || this.d.u >= defaultTrackSelector$Parameters0.f) && (this.d.v == -1.0f || this.d.v >= ((float)defaultTrackSelector$Parameters0.g)) && (this.d.i == -1 || this.d.i >= defaultTrackSelector$Parameters0.h));
            this.h = Y0.n(v2, false);
            this.i = this.d.v != -1.0f && this.d.v >= 10.0f;
            this.j = this.d.i;
            this.k = this.d.f();
            this.m = DefaultTrackSelector.M(this.d.f, defaultTrackSelector$Parameters0.m);
            int v5 = this.d.f;
            this.n = v5 == 0 || (v5 & 1) != 0;
            int v6;
            for(v6 = 0; true; ++v6) {
                if(v6 >= defaultTrackSelector$Parameters0.l.size()) {
                    v6 = 0x7FFFFFFF;
                    break;
                }
                String s = this.d.n;
                if(s != null && s.equals(defaultTrackSelector$Parameters0.l.get(v6))) {
                    break;
                }
            }
            this.l = v6;
            this.q = (v2 & 0x180) == 0x80;
            if((v2 & 0x40) == 0x40) {
                z1 = true;
            }
            this.r = z1;
            this.s = DefaultTrackSelector.N(this.d.n);
            this.p = this.i(v2, v4);
        }

        @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo
        public int a() {
            return this.p;
        }

        @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo
        public boolean b(TrackInfo defaultTrackSelector$TrackInfo0) {
            return this.j(((VideoTrackInfo)defaultTrackSelector$TrackInfo0));
        }

        // 检测为 Lambda 实现
        private static int e(VideoTrackInfo defaultTrackSelector$VideoTrackInfo0, VideoTrackInfo defaultTrackSelector$VideoTrackInfo1) [...]

        // 检测为 Lambda 实现
        private static int f(VideoTrackInfo defaultTrackSelector$VideoTrackInfo0, VideoTrackInfo defaultTrackSelector$VideoTrackInfo1) [...]

        public static int g(List list0, List list1) {
            return p1.n().j(((VideoTrackInfo)Collections.max(list0, (VideoTrackInfo defaultTrackSelector$VideoTrackInfo0, VideoTrackInfo defaultTrackSelector$VideoTrackInfo1) -> {
                p1 p10 = p1.n().k(defaultTrackSelector$VideoTrackInfo0.h, defaultTrackSelector$VideoTrackInfo1.h).f(defaultTrackSelector$VideoTrackInfo0.m, defaultTrackSelector$VideoTrackInfo1.m).k(defaultTrackSelector$VideoTrackInfo0.n, defaultTrackSelector$VideoTrackInfo1.n).k(defaultTrackSelector$VideoTrackInfo0.i, defaultTrackSelector$VideoTrackInfo1.i).k(defaultTrackSelector$VideoTrackInfo0.e, defaultTrackSelector$VideoTrackInfo1.e).k(defaultTrackSelector$VideoTrackInfo0.g, defaultTrackSelector$VideoTrackInfo1.g);
                c4 c40 = c4.K().P();
                p1 p11 = p10.j(defaultTrackSelector$VideoTrackInfo0.l, defaultTrackSelector$VideoTrackInfo1.l, c40).k(defaultTrackSelector$VideoTrackInfo0.q, defaultTrackSelector$VideoTrackInfo1.q).k(defaultTrackSelector$VideoTrackInfo0.r, defaultTrackSelector$VideoTrackInfo1.r);
                if(defaultTrackSelector$VideoTrackInfo0.q && defaultTrackSelector$VideoTrackInfo0.r) {
                    p11 = p11.f(defaultTrackSelector$VideoTrackInfo0.s, defaultTrackSelector$VideoTrackInfo1.s);
                }
                return p11.m();
            })), ((VideoTrackInfo)Collections.max(list1, (VideoTrackInfo defaultTrackSelector$VideoTrackInfo0, VideoTrackInfo defaultTrackSelector$VideoTrackInfo1) -> {
                p1 p10 = p1.n().k(defaultTrackSelector$VideoTrackInfo0.h, defaultTrackSelector$VideoTrackInfo1.h).f(defaultTrackSelector$VideoTrackInfo0.m, defaultTrackSelector$VideoTrackInfo1.m).k(defaultTrackSelector$VideoTrackInfo0.n, defaultTrackSelector$VideoTrackInfo1.n).k(defaultTrackSelector$VideoTrackInfo0.i, defaultTrackSelector$VideoTrackInfo1.i).k(defaultTrackSelector$VideoTrackInfo0.e, defaultTrackSelector$VideoTrackInfo1.e).k(defaultTrackSelector$VideoTrackInfo0.g, defaultTrackSelector$VideoTrackInfo1.g);
                c4 c40 = c4.K().P();
                p1 p11 = p10.j(defaultTrackSelector$VideoTrackInfo0.l, defaultTrackSelector$VideoTrackInfo1.l, c40).k(defaultTrackSelector$VideoTrackInfo0.q, defaultTrackSelector$VideoTrackInfo1.q).k(defaultTrackSelector$VideoTrackInfo0.r, defaultTrackSelector$VideoTrackInfo1.r);
                if(defaultTrackSelector$VideoTrackInfo0.q && defaultTrackSelector$VideoTrackInfo0.r) {
                    p11 = p11.f(defaultTrackSelector$VideoTrackInfo0.s, defaultTrackSelector$VideoTrackInfo1.s);
                }
                return p11.m();
            })), (VideoTrackInfo defaultTrackSelector$VideoTrackInfo0, VideoTrackInfo defaultTrackSelector$VideoTrackInfo1) -> {
                p1 p10 = p1.n().k(defaultTrackSelector$VideoTrackInfo0.h, defaultTrackSelector$VideoTrackInfo1.h).f(defaultTrackSelector$VideoTrackInfo0.m, defaultTrackSelector$VideoTrackInfo1.m).k(defaultTrackSelector$VideoTrackInfo0.n, defaultTrackSelector$VideoTrackInfo1.n).k(defaultTrackSelector$VideoTrackInfo0.i, defaultTrackSelector$VideoTrackInfo1.i).k(defaultTrackSelector$VideoTrackInfo0.e, defaultTrackSelector$VideoTrackInfo1.e).k(defaultTrackSelector$VideoTrackInfo0.g, defaultTrackSelector$VideoTrackInfo1.g);
                c4 c40 = c4.K().P();
                p1 p11 = p10.j(defaultTrackSelector$VideoTrackInfo0.l, defaultTrackSelector$VideoTrackInfo1.l, c40).k(defaultTrackSelector$VideoTrackInfo0.q, defaultTrackSelector$VideoTrackInfo1.q).k(defaultTrackSelector$VideoTrackInfo0.r, defaultTrackSelector$VideoTrackInfo1.r);
                if(defaultTrackSelector$VideoTrackInfo0.q && defaultTrackSelector$VideoTrackInfo0.r) {
                    p11 = p11.f(defaultTrackSelector$VideoTrackInfo0.s, defaultTrackSelector$VideoTrackInfo1.s);
                }
                return p11.m();
            }).f(list0.size(), list1.size()).j(((VideoTrackInfo)Collections.max(list0, (VideoTrackInfo defaultTrackSelector$VideoTrackInfo0, VideoTrackInfo defaultTrackSelector$VideoTrackInfo1) -> {
                c4 c40 = !defaultTrackSelector$VideoTrackInfo0.e || !defaultTrackSelector$VideoTrackInfo0.h ? DefaultTrackSelector.q.P() : DefaultTrackSelector.q;
                p1 p10 = p1.n();
                if(defaultTrackSelector$VideoTrackInfo0.f.y) {
                    c4 c41 = DefaultTrackSelector.q.P();
                    p10 = p10.j(defaultTrackSelector$VideoTrackInfo0.j, defaultTrackSelector$VideoTrackInfo1.j, c41);
                }
                return p10.j(defaultTrackSelector$VideoTrackInfo0.k, defaultTrackSelector$VideoTrackInfo1.k, c40).j(defaultTrackSelector$VideoTrackInfo0.j, defaultTrackSelector$VideoTrackInfo1.j, c40).m();
            })), ((VideoTrackInfo)Collections.max(list1, (VideoTrackInfo defaultTrackSelector$VideoTrackInfo0, VideoTrackInfo defaultTrackSelector$VideoTrackInfo1) -> {
                c4 c40 = !defaultTrackSelector$VideoTrackInfo0.e || !defaultTrackSelector$VideoTrackInfo0.h ? DefaultTrackSelector.q.P() : DefaultTrackSelector.q;
                p1 p10 = p1.n();
                if(defaultTrackSelector$VideoTrackInfo0.f.y) {
                    c4 c41 = DefaultTrackSelector.q.P();
                    p10 = p10.j(defaultTrackSelector$VideoTrackInfo0.j, defaultTrackSelector$VideoTrackInfo1.j, c41);
                }
                return p10.j(defaultTrackSelector$VideoTrackInfo0.k, defaultTrackSelector$VideoTrackInfo1.k, c40).j(defaultTrackSelector$VideoTrackInfo0.j, defaultTrackSelector$VideoTrackInfo1.j, c40).m();
            })), (VideoTrackInfo defaultTrackSelector$VideoTrackInfo0, VideoTrackInfo defaultTrackSelector$VideoTrackInfo1) -> {
                c4 c40 = !defaultTrackSelector$VideoTrackInfo0.e || !defaultTrackSelector$VideoTrackInfo0.h ? DefaultTrackSelector.q.P() : DefaultTrackSelector.q;
                p1 p10 = p1.n();
                if(defaultTrackSelector$VideoTrackInfo0.f.y) {
                    c4 c41 = DefaultTrackSelector.q.P();
                    p10 = p10.j(defaultTrackSelector$VideoTrackInfo0.j, defaultTrackSelector$VideoTrackInfo1.j, c41);
                }
                return p10.j(defaultTrackSelector$VideoTrackInfo0.k, defaultTrackSelector$VideoTrackInfo1.k, c40).j(defaultTrackSelector$VideoTrackInfo0.j, defaultTrackSelector$VideoTrackInfo1.j, c40).m();
            }).m();
        }

        public static O2 h(int v, TrackGroup trackGroup0, Parameters defaultTrackSelector$Parameters0, int[] arr_v, int v1) {
            int v2 = DefaultTrackSelector.J(trackGroup0, defaultTrackSelector$Parameters0.i, defaultTrackSelector$Parameters0.j, defaultTrackSelector$Parameters0.k);
            a o2$a0 = O2.n();
            for(int v3 = 0; v3 < trackGroup0.a; ++v3) {
                int v4 = trackGroup0.c(v3).f();
                o2$a0.j(new VideoTrackInfo(v, trackGroup0, v3, defaultTrackSelector$Parameters0, arr_v[v3], v1, v2 == 0x7FFFFFFF || v4 != -1 && v4 <= v2));
            }
            return o2$a0.n();
        }

        private int i(int v, int v1) {
            if((this.d.f & 0x4000) != 0) {
                return 0;
            }
            if(!Y0.n(v, this.f.v0)) {
                return 0;
            }
            if(!this.e && !this.f.k0) {
                return 0;
            }
            return !Y0.n(v, false) || !this.g || !this.e || this.d.i == -1 || (this.f.z || this.f.y || (v & v1) == 0) ? 1 : 2;
        }

        // 去混淆评级： 低(40)
        public boolean j(VideoTrackInfo defaultTrackSelector$VideoTrackInfo0) {
            return (this.o || Util.g(this.d.n, defaultTrackSelector$VideoTrackInfo0.d.n)) && (this.f.n0 || this.q == defaultTrackSelector$VideoTrackInfo0.q && this.r == defaultTrackSelector$VideoTrackInfo0.r);
        }
    }

    private final Object d;
    @Nullable
    public final Context e;
    private final androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory f;
    private final boolean g;
    @GuardedBy("lock")
    private Parameters h;
    @GuardedBy("lock")
    @Nullable
    private SpatializerWrapperV32 i;
    @GuardedBy("lock")
    private AudioAttributes j;
    private static final String k = "DefaultTrackSelector";
    private static final String l = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    protected static final int m = 0;
    protected static final int n = 1;
    protected static final int o = 2;
    private static final float p = 0.98f;
    private static final c4 q;

    static {
        DefaultTrackSelector.q = c4.q((Integer integer0, Integer integer1) -> {
            if(((int)integer0) == -1) {
                return ((int)integer1) == -1 ? 0 : -1;
            }
            return ((int)integer1) == -1 ? 1 : ((int)integer0) - ((int)integer1);
        });
    }

    public DefaultTrackSelector(Context context0) {
        this(context0, new androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.Factory());
    }

    public DefaultTrackSelector(Context context0, TrackSelectionParameters trackSelectionParameters0) {
        this(context0, trackSelectionParameters0, new androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.Factory());
    }

    public DefaultTrackSelector(Context context0, TrackSelectionParameters trackSelectionParameters0, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory exoTrackSelection$Factory0) {
        this(trackSelectionParameters0, exoTrackSelection$Factory0, context0);
    }

    public DefaultTrackSelector(Context context0, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory exoTrackSelection$Factory0) {
        this(context0, Parameters.Q(context0), exoTrackSelection$Factory0);
    }

    @Deprecated
    public DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters0, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory exoTrackSelection$Factory0) {
        this(trackSelectionParameters0, exoTrackSelection$Factory0, null);
    }

    private DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters0, androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory exoTrackSelection$Factory0, @Nullable Context context0) {
        this.d = new Object();
        this.e = context0 == null ? null : context0.getApplicationContext();
        this.f = exoTrackSelection$Factory0;
        this.h = trackSelectionParameters0 instanceof Parameters ? ((Parameters)trackSelectionParameters0) : (context0 == null ? Parameters.B0 : Parameters.Q(context0)).O().X0(trackSelectionParameters0).L0();
        this.j = AudioAttributes.g;
        boolean z = context0 != null && Util.n1(context0);
        this.g = z;
        if(!z && context0 != null && Util.a >= 0x20) {
            this.i = SpatializerWrapperV32.g(context0);
        }
        if(this.h.u0 && context0 == null) {
            Log.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static void E(MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, Parameters defaultTrackSelector$Parameters0, Definition[] arr_exoTrackSelection$Definition) {
        int v = mappingTrackSelector$MappedTrackInfo0.d();
        for(int v1 = 0; v1 < v; ++v1) {
            TrackGroupArray trackGroupArray0 = mappingTrackSelector$MappedTrackInfo0.h(v1);
            if(defaultTrackSelector$Parameters0.U(v1, trackGroupArray0)) {
                SelectionOverride defaultTrackSelector$SelectionOverride0 = defaultTrackSelector$Parameters0.T(v1, trackGroupArray0);
                arr_exoTrackSelection$Definition[v1] = defaultTrackSelector$SelectionOverride0 == null || defaultTrackSelector$SelectionOverride0.b.length == 0 ? null : new Definition(trackGroupArray0.c(defaultTrackSelector$SelectionOverride0.a), defaultTrackSelector$SelectionOverride0.b, defaultTrackSelector$SelectionOverride0.d);
            }
        }
    }

    private static void F(MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, TrackSelectionParameters trackSelectionParameters0, Definition[] arr_exoTrackSelection$Definition) {
        Definition exoTrackSelection$Definition0;
        int v = mappingTrackSelector$MappedTrackInfo0.d();
        HashMap hashMap0 = new HashMap();
        for(int v2 = 0; v2 < v; ++v2) {
            DefaultTrackSelector.H(mappingTrackSelector$MappedTrackInfo0.h(v2), trackSelectionParameters0, hashMap0);
        }
        DefaultTrackSelector.H(mappingTrackSelector$MappedTrackInfo0.k(), trackSelectionParameters0, hashMap0);
        for(int v1 = 0; v1 < v; ++v1) {
            TrackSelectionOverride trackSelectionOverride0 = (TrackSelectionOverride)hashMap0.get(mappingTrackSelector$MappedTrackInfo0.g(v1));
            if(trackSelectionOverride0 != null) {
                if(trackSelectionOverride0.b.isEmpty() || mappingTrackSelector$MappedTrackInfo0.h(v1).e(trackSelectionOverride0.a) == -1) {
                    exoTrackSelection$Definition0 = null;
                }
                else {
                    int[] arr_v = l.D(trackSelectionOverride0.b);
                    exoTrackSelection$Definition0 = new Definition(trackSelectionOverride0.a, arr_v);
                }
                arr_exoTrackSelection$Definition[v1] = exoTrackSelection$Definition0;
            }
        }
    }

    public Builder G() {
        return this.L().O();
    }

    private static void H(TrackGroupArray trackGroupArray0, TrackSelectionParameters trackSelectionParameters0, Map map0) {
        for(int v = 0; v < trackGroupArray0.a; ++v) {
            TrackGroup trackGroup0 = trackGroupArray0.c(v);
            TrackSelectionOverride trackSelectionOverride0 = (TrackSelectionOverride)trackSelectionParameters0.A.get(trackGroup0);
            if(trackSelectionOverride0 != null) {
                TrackSelectionOverride trackSelectionOverride1 = (TrackSelectionOverride)map0.get(trackSelectionOverride0.b());
                if(trackSelectionOverride1 == null || trackSelectionOverride1.b.isEmpty() && !trackSelectionOverride0.b.isEmpty()) {
                    map0.put(trackSelectionOverride0.b(), trackSelectionOverride0);
                }
            }
        }
    }

    protected static int I(Format format0, @Nullable String s, boolean z) {
        if(!TextUtils.isEmpty(s) && s.equals(format0.d)) {
            return 4;
        }
        String s1 = DefaultTrackSelector.a0(s);
        String s2 = DefaultTrackSelector.a0(format0.d);
        if(s2 != null && s1 != null) {
            if(!s2.startsWith(s1) && !s1.startsWith(s2)) {
                return Util.n2(s2, "-")[0].equals(Util.n2(s1, "-")[0]) ? 2 : 0;
            }
            return 3;
        }
        return !z || s2 != null ? 0 : 1;
    }

    private static int J(TrackGroup trackGroup0, int v, int v1, boolean z) {
        int v2 = 0x7FFFFFFF;
        if(v != 0x7FFFFFFF && v1 != 0x7FFFFFFF) {
            for(int v3 = 0; v3 < trackGroup0.a; ++v3) {
                Format format0 = trackGroup0.c(v3);
                int v4 = format0.t;
                if(v4 > 0) {
                    int v5 = format0.u;
                    if(v5 > 0) {
                        Point point0 = DefaultTrackSelector.K(z, v, v1, v4, v5);
                        int v6 = format0.t * format0.u;
                        if(format0.t >= ((int)(((float)point0.x) * 0.98f)) && format0.u >= ((int)(((float)point0.y) * 0.98f)) && v6 < v2) {
                            v2 = v6;
                        }
                    }
                }
            }
        }
        return v2;
    }

    private static Point K(boolean z, int v, int v1, int v2, int v3) {
        int v4 = 0;
        if(z) {
            if(v > v1) {
                v4 = 1;
            }
            if((v2 <= v3 ? 0 : 1) == v4) {
                goto label_5;
            }
        }
        else {
        label_5:
            int v5 = v1;
            v1 = v;
            v = v5;
        }
        int v6 = v2 * v;
        int v7 = v3 * v1;
        return v6 < v7 ? new Point((v6 + v3 - 1) / v3, v) : new Point(v1, (v7 + v2 - 1) / v2);
    }

    public Parameters L() {
        synchronized(this.d) {
        }
        return this.h;
    }

    private static int M(int v, int v1) {
        return v == 0 || v != v1 ? Integer.bitCount(v & v1) : 0x7FFFFFFF;
    }

    private static int N(@Nullable String s) {
        if(s == null) {
            return 0;
        }
        switch(s) {
            case "video/av01": {
                return 4;
            }
            case "video/avc": {
                return 1;
            }
            case "video/dolby-vision": {
                return 5;
            }
            case "video/hevc": {
                return 3;
            }
            case "video/x-vnd.on2.vp9": {
                return 2;
            }
            default: {
                return 0;
            }
        }
    }

    // 检测为 Lambda 实现
    private boolean O(Format format0) [...]

    private static boolean P(Format format0) {
        String s = format0.n;
        if(s == null) {
            return false;
        }
        s.hashCode();
        switch(s) {
            case "audio/ac3": {
                return true;
            }
            case "audio/ac4": {
                return true;
            }
            case "audio/eac3": {
                return true;
            }
            case "audio/eac3-joc": {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Deprecated
    protected static boolean Q(int v, boolean z) {
        return Y0.n(v, z);
    }

    // 检测为 Lambda 实现
    private List R(Parameters defaultTrackSelector$Parameters0, boolean z, int[] arr_v, int v, TrackGroup trackGroup0, int[] arr_v1) [...]

    // 检测为 Lambda 实现
    private static List S(Parameters defaultTrackSelector$Parameters0, int v, TrackGroup trackGroup0, int[] arr_v) [...]

    // 检测为 Lambda 实现
    private static List T(Parameters defaultTrackSelector$Parameters0, String s, int v, TrackGroup trackGroup0, int[] arr_v) [...]

    // 检测为 Lambda 实现
    private static List U(Parameters defaultTrackSelector$Parameters0, int[] arr_v, int v, TrackGroup trackGroup0, int[] arr_v1) [...]

    // 检测为 Lambda 实现
    private static int V(Integer integer0, Integer integer1) [...]

    private static void W(Parameters defaultTrackSelector$Parameters0, MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, int[][][] arr3_v, RendererConfiguration[] arr_rendererConfiguration, ExoTrackSelection[] arr_exoTrackSelection) {
        int v = -1;
        boolean z = false;
        int v2 = 0;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= mappingTrackSelector$MappedTrackInfo0.d()) {
                if(v2 != 1) {
                    break;
                }
                int v4 = defaultTrackSelector$Parameters0.s.b ? 1 : 2;
                RendererConfiguration rendererConfiguration0 = arr_rendererConfiguration[v];
                if(rendererConfiguration0 != null && rendererConfiguration0.b) {
                    z = true;
                }
                arr_rendererConfiguration[v] = new RendererConfiguration(v4, z);
                break;
            }
            int v3 = mappingTrackSelector$MappedTrackInfo0.g(v1);
            ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v1];
            if(v3 != 1 && exoTrackSelection0 != null) {
                break;
            }
            if(v3 == 1 && exoTrackSelection0 != null && exoTrackSelection0.length() == 1) {
                int[] arr_v = arr3_v[v1][mappingTrackSelector$MappedTrackInfo0.h(v1).e(exoTrackSelection0.i())];
                if(DefaultTrackSelector.b0(defaultTrackSelector$Parameters0, arr_v[exoTrackSelection0.e(0)], exoTrackSelection0.n())) {
                    ++v2;
                    v = v1;
                }
            }
        }
    }

    private static void X(MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, int[][][] arr3_v, RendererConfiguration[] arr_rendererConfiguration, ExoTrackSelection[] arr_exoTrackSelection) {
        int v1 = -1;
        int v2 = -1;
        for(int v = 0; true; ++v) {
            int v3 = 1;
            if(v >= mappingTrackSelector$MappedTrackInfo0.d()) {
                break;
            }
            int v4 = mappingTrackSelector$MappedTrackInfo0.g(v);
            ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v];
            if((v4 == 1 || v4 == 2) && exoTrackSelection0 != null && DefaultTrackSelector.c0(arr3_v[v], mappingTrackSelector$MappedTrackInfo0.h(v), exoTrackSelection0)) {
                if(v4 != 1) {
                    if(v1 == -1) {
                        v1 = v;
                        continue;
                    }
                }
                else if(v2 == -1) {
                    v2 = v;
                    continue;
                }
                v3 = 0;
                break;
            }
        }
        if((v3 & (v2 == -1 || v1 == -1 ? 0 : 1)) != 0) {
            RendererConfiguration rendererConfiguration0 = new RendererConfiguration(0, true);
            arr_rendererConfiguration[v2] = rendererConfiguration0;
            arr_rendererConfiguration[v1] = rendererConfiguration0;
        }
    }

    private void Y() {
        synchronized(this.d) {
            boolean z = this.h.u0 && !this.g && Util.a >= 0x20 && (this.i != null && this.i.e());
        }
        if(z) {
            this.f();
        }
    }

    private void Z(Renderer renderer0) {
        synchronized(this.d) {
        }
        if(this.h.y0) {
            this.g(renderer0);
        }
    }

    @Override  // androidx.media3.exoplayer.RendererCapabilities$Listener
    public void a(Renderer renderer0) {
        this.Z(renderer0);
    }

    // 去混淆评级： 低(20)
    @Nullable
    protected static String a0(@Nullable String s) {
        return !TextUtils.isEmpty(s) && !TextUtils.equals(s, "und") ? s : null;
    }

    private static boolean b0(Parameters defaultTrackSelector$Parameters0, int v, Format format0) {
        if((v & 0xE00) == 0) {
            return false;
        }
        if(defaultTrackSelector$Parameters0.s.c && (v & 0x800) == 0) {
            return false;
        }
        return defaultTrackSelector$Parameters0.s.b ? format0.E == 0 && format0.F == 0 || (v & 0x400) != 0 : true;
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelector
    public TrackSelectionParameters c() {
        return this.L();
    }

    private static boolean c0(int[][] arr2_v, TrackGroupArray trackGroupArray0, ExoTrackSelection exoTrackSelection0) {
        if(exoTrackSelection0 == null) {
            return false;
        }
        int v = trackGroupArray0.e(exoTrackSelection0.i());
        for(int v1 = 0; v1 < exoTrackSelection0.length(); ++v1) {
            int[] arr_v = arr2_v[v];
            if(Y0.m(arr_v[exoTrackSelection0.e(v1)]) != 0x20) {
                return false;
            }
        }
        return true;
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelector
    @Nullable
    public Listener d() {
        return this;
    }

    protected Definition[] d0(MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, int[][][] arr3_v, int[] arr_v, Parameters defaultTrackSelector$Parameters0) throws ExoPlaybackException {
        int v = mappingTrackSelector$MappedTrackInfo0.d();
        Definition[] arr_exoTrackSelection$Definition = new Definition[v];
        Pair pair0 = this.j0(mappingTrackSelector$MappedTrackInfo0, arr3_v, arr_v, defaultTrackSelector$Parameters0);
        String s = null;
        Pair pair1 = defaultTrackSelector$Parameters0.x || pair0 == null ? this.f0(mappingTrackSelector$MappedTrackInfo0, arr3_v, defaultTrackSelector$Parameters0) : null;
        if(pair1 != null) {
            arr_exoTrackSelection$Definition[((int)(((Integer)pair1.second)))] = (Definition)pair1.first;
        }
        else if(pair0 != null) {
            arr_exoTrackSelection$Definition[((int)(((Integer)pair0.second)))] = (Definition)pair0.first;
        }
        Pair pair2 = this.e0(mappingTrackSelector$MappedTrackInfo0, arr3_v, arr_v, defaultTrackSelector$Parameters0);
        if(pair2 != null) {
            arr_exoTrackSelection$Definition[((int)(((Integer)pair2.second)))] = (Definition)pair2.first;
        }
        if(pair2 != null) {
            s = ((Definition)pair2.first).a.c(((Definition)pair2.first).b[0]).d;
        }
        Pair pair3 = this.h0(mappingTrackSelector$MappedTrackInfo0, arr3_v, defaultTrackSelector$Parameters0, s);
        if(pair3 != null) {
            arr_exoTrackSelection$Definition[((int)(((Integer)pair3.second)))] = (Definition)pair3.first;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = mappingTrackSelector$MappedTrackInfo0.g(v1);
            if(v2 != 1 && v2 != 2 && v2 != 3 && v2 != 4) {
                arr_exoTrackSelection$Definition[v1] = this.g0(v2, mappingTrackSelector$MappedTrackInfo0.h(v1), arr3_v[v1], defaultTrackSelector$Parameters0);
            }
        }
        return arr_exoTrackSelection$Definition;
    }

    @Nullable
    protected Pair e0(MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, int[][][] arr3_v, int[] arr_v, Parameters defaultTrackSelector$Parameters0) throws ExoPlaybackException {
        for(int v = 0; v < mappingTrackSelector$MappedTrackInfo0.d(); ++v) {
            if(2 == mappingTrackSelector$MappedTrackInfo0.g(v) && mappingTrackSelector$MappedTrackInfo0.h(v).a > 0) {
                return this.i0(1, mappingTrackSelector$MappedTrackInfo0, arr3_v, (int v, TrackGroup trackGroup0, int[] arr_v1) -> AudioTrackInfo.e(v, trackGroup0, defaultTrackSelector$Parameters0, arr_v1, true, (Format format0) -> synchronized(this.d) {
                    return !this.h.u0 || this.g || format0.B <= 2 || DefaultTrackSelector.P(format0) && (Util.a < 0x20 || (this.i == null || !this.i.e())) || Util.a >= 0x20 && (this.i != null && this.i.e() && this.i.c() && this.i.d() && this.i.a(this.j, format0));
                }, arr_v[v]), new g());
            }
        }
        return this.i0(1, mappingTrackSelector$MappedTrackInfo0, arr3_v, (int v, TrackGroup trackGroup0, int[] arr_v1) -> AudioTrackInfo.e(v, trackGroup0, defaultTrackSelector$Parameters0, arr_v1, false, (Format format0) -> synchronized(this.d) {
            return !this.h.u0 || this.g || format0.B <= 2 || DefaultTrackSelector.P(format0) && (Util.a < 0x20 || (this.i == null || !this.i.e())) || Util.a >= 0x20 && (this.i != null && this.i.e() && this.i.c() && this.i.d() && this.i.a(this.j, format0));
        }, arr_v[v]), new g());
    }

    @Nullable
    protected Pair f0(MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, int[][][] arr3_v, Parameters defaultTrackSelector$Parameters0) throws ExoPlaybackException {
        return defaultTrackSelector$Parameters0.s.a == 2 ? null : this.i0(4, mappingTrackSelector$MappedTrackInfo0, arr3_v, (int v, TrackGroup trackGroup0, int[] arr_v) -> ImageTrackInfo.e(v, trackGroup0, defaultTrackSelector$Parameters0, arr_v), new e());
    }

    @Nullable
    protected Definition g0(int v, TrackGroupArray trackGroupArray0, int[][] arr2_v, Parameters defaultTrackSelector$Parameters0) throws ExoPlaybackException {
        if(defaultTrackSelector$Parameters0.s.a == 2) {
            return null;
        }
        TrackGroup trackGroup0 = null;
        OtherTrackScore defaultTrackSelector$OtherTrackScore0 = null;
        int v2 = 0;
        for(int v1 = 0; v1 < trackGroupArray0.a; ++v1) {
            TrackGroup trackGroup1 = trackGroupArray0.c(v1);
            int[] arr_v = arr2_v[v1];
            for(int v3 = 0; v3 < trackGroup1.a; ++v3) {
                if(Y0.n(arr_v[v3], defaultTrackSelector$Parameters0.v0)) {
                    OtherTrackScore defaultTrackSelector$OtherTrackScore1 = new OtherTrackScore(trackGroup1.c(v3), arr_v[v3]);
                    if(defaultTrackSelector$OtherTrackScore0 == null || defaultTrackSelector$OtherTrackScore1.a(defaultTrackSelector$OtherTrackScore0) > 0) {
                        trackGroup0 = trackGroup1;
                        v2 = v3;
                        defaultTrackSelector$OtherTrackScore0 = defaultTrackSelector$OtherTrackScore1;
                    }
                }
            }
        }
        return trackGroup0 == null ? null : new Definition(trackGroup0, new int[]{v2});
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelector
    public boolean h() {
        return true;
    }

    @Nullable
    protected Pair h0(MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, int[][][] arr3_v, Parameters defaultTrackSelector$Parameters0, @Nullable String s) throws ExoPlaybackException {
        return defaultTrackSelector$Parameters0.s.a == 2 ? null : this.i0(3, mappingTrackSelector$MappedTrackInfo0, arr3_v, (int v, TrackGroup trackGroup0, int[] arr_v) -> TextTrackInfo.e(v, trackGroup0, defaultTrackSelector$Parameters0, arr_v, s), new k());
    }

    @Nullable
    private Pair i0(int v, MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, int[][][] arr3_v, Factory defaultTrackSelector$TrackInfo$Factory0, Comparator comparator0) {
        O2 o20;
        ArrayList arrayList0 = new ArrayList();
        int v1 = mappingTrackSelector$MappedTrackInfo0.d();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v == mappingTrackSelector$MappedTrackInfo0.g(v2)) {
                TrackGroupArray trackGroupArray0 = mappingTrackSelector$MappedTrackInfo0.h(v2);
                for(int v3 = 0; v3 < trackGroupArray0.a; ++v3) {
                    TrackGroup trackGroup0 = trackGroupArray0.c(v3);
                    List list0 = defaultTrackSelector$TrackInfo$Factory0.a(v2, trackGroup0, arr3_v[v2][v3]);
                    boolean[] arr_z = new boolean[trackGroup0.a];
                    for(int v4 = 0; v4 < trackGroup0.a; ++v4) {
                        TrackInfo defaultTrackSelector$TrackInfo0 = (TrackInfo)list0.get(v4);
                        int v5 = defaultTrackSelector$TrackInfo0.a();
                        if(!arr_z[v4] && v5 != 0) {
                            if(v5 == 1) {
                                o20 = O2.B(defaultTrackSelector$TrackInfo0);
                            }
                            else {
                                ArrayList arrayList1 = new ArrayList();
                                arrayList1.add(defaultTrackSelector$TrackInfo0);
                                for(int v6 = v4 + 1; v6 < trackGroup0.a; ++v6) {
                                    TrackInfo defaultTrackSelector$TrackInfo1 = (TrackInfo)list0.get(v6);
                                    if(defaultTrackSelector$TrackInfo1.a() == 2 && defaultTrackSelector$TrackInfo0.b(defaultTrackSelector$TrackInfo1)) {
                                        arrayList1.add(defaultTrackSelector$TrackInfo1);
                                        arr_z[v6] = true;
                                    }
                                }
                                o20 = arrayList1;
                            }
                            arrayList0.add(o20);
                        }
                    }
                }
            }
        }
        if(arrayList0.isEmpty()) {
            return null;
        }
        List list1 = (List)Collections.max(arrayList0, comparator0);
        int[] arr_v = new int[list1.size()];
        for(int v7 = 0; v7 < list1.size(); ++v7) {
            arr_v[v7] = ((TrackInfo)list1.get(v7)).c;
        }
        TrackInfo defaultTrackSelector$TrackInfo2 = (TrackInfo)list1.get(0);
        return Pair.create(new Definition(defaultTrackSelector$TrackInfo2.b, arr_v), defaultTrackSelector$TrackInfo2.a);
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelector
    public void j() {
        synchronized(this.d) {
            if(Util.a >= 0x20) {
                SpatializerWrapperV32 defaultTrackSelector$SpatializerWrapperV320 = this.i;
                if(defaultTrackSelector$SpatializerWrapperV320 != null) {
                    defaultTrackSelector$SpatializerWrapperV320.f();
                }
            }
        }
        super.j();
    }

    @Nullable
    protected Pair j0(MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, int[][][] arr3_v, int[] arr_v, Parameters defaultTrackSelector$Parameters0) throws ExoPlaybackException {
        return defaultTrackSelector$Parameters0.s.a == 2 ? null : this.i0(2, mappingTrackSelector$MappedTrackInfo0, arr3_v, (int v, TrackGroup trackGroup0, int[] arr_v1) -> VideoTrackInfo.h(v, trackGroup0, defaultTrackSelector$Parameters0, arr_v1, arr_v[v]), new i());
    }

    public void k0(Builder defaultTrackSelector$Parameters$Builder0) {
        this.m0(defaultTrackSelector$Parameters$Builder0.L0());
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelector
    public void l(AudioAttributes audioAttributes0) {
        synchronized(this.d) {
            boolean z = this.j.equals(audioAttributes0);
            this.j = audioAttributes0;
        }
        if(!z) {
            this.Y();
        }
    }

    @Deprecated
    public void l0(ParametersBuilder defaultTrackSelector$ParametersBuilder0) {
        this.m0(defaultTrackSelector$ParametersBuilder0.u0());
    }

    @Override  // androidx.media3.exoplayer.trackselection.TrackSelector
    public void m(TrackSelectionParameters trackSelectionParameters0) {
        if(trackSelectionParameters0 instanceof Parameters) {
            this.m0(((Parameters)trackSelectionParameters0));
        }
        this.m0(new Builder(this.L(), null).X0(trackSelectionParameters0).L0());
    }

    private void m0(Parameters defaultTrackSelector$Parameters0) {
        Assertions.g(defaultTrackSelector$Parameters0);
        synchronized(this.d) {
            boolean z = this.h.equals(defaultTrackSelector$Parameters0);
            this.h = defaultTrackSelector$Parameters0;
        }
        if(!z) {
            if(defaultTrackSelector$Parameters0.u0 && this.e == null) {
                Log.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            this.f();
        }
    }

    @Override  // androidx.media3.exoplayer.trackselection.MappingTrackSelector
    protected final Pair r(MappedTrackInfo mappingTrackSelector$MappedTrackInfo0, int[][][] arr3_v, int[] arr_v, MediaPeriodId mediaSource$MediaPeriodId0, Timeline timeline0) throws ExoPlaybackException {
        Parameters defaultTrackSelector$Parameters0;
        synchronized(this.d) {
            defaultTrackSelector$Parameters0 = this.h;
            if(defaultTrackSelector$Parameters0.u0 && Util.a >= 0x20) {
                SpatializerWrapperV32 defaultTrackSelector$SpatializerWrapperV320 = this.i;
                if(defaultTrackSelector$SpatializerWrapperV320 != null) {
                    defaultTrackSelector$SpatializerWrapperV320.b(this, ((Looper)Assertions.k(Looper.myLooper())));
                }
            }
        }
        int v1 = mappingTrackSelector$MappedTrackInfo0.d();
        Definition[] arr_exoTrackSelection$Definition = this.d0(mappingTrackSelector$MappedTrackInfo0, arr3_v, arr_v, defaultTrackSelector$Parameters0);
        DefaultTrackSelector.F(mappingTrackSelector$MappedTrackInfo0, defaultTrackSelector$Parameters0, arr_exoTrackSelection$Definition);
        DefaultTrackSelector.E(mappingTrackSelector$MappedTrackInfo0, defaultTrackSelector$Parameters0, arr_exoTrackSelection$Definition);
        for(int v3 = 0; v3 < v1; ++v3) {
            int v4 = mappingTrackSelector$MappedTrackInfo0.g(v3);
            if(defaultTrackSelector$Parameters0.S(v3) || defaultTrackSelector$Parameters0.B.contains(v4)) {
                arr_exoTrackSelection$Definition[v3] = null;
            }
        }
        BandwidthMeter bandwidthMeter0 = this.b();
        ExoTrackSelection[] arr_exoTrackSelection = this.f.a(arr_exoTrackSelection$Definition, bandwidthMeter0, mediaSource$MediaPeriodId0, timeline0);
        RendererConfiguration[] arr_rendererConfiguration = new RendererConfiguration[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            int v5 = mappingTrackSelector$MappedTrackInfo0.g(v2);
            arr_rendererConfiguration[v2] = defaultTrackSelector$Parameters0.S(v2) || defaultTrackSelector$Parameters0.B.contains(v5) || mappingTrackSelector$MappedTrackInfo0.g(v2) != -2 && arr_exoTrackSelection[v2] == null ? null : RendererConfiguration.c;
        }
        if(defaultTrackSelector$Parameters0.w0) {
            DefaultTrackSelector.X(mappingTrackSelector$MappedTrackInfo0, arr3_v, arr_rendererConfiguration, arr_exoTrackSelection);
        }
        if(defaultTrackSelector$Parameters0.s.a != 0) {
            DefaultTrackSelector.W(defaultTrackSelector$Parameters0, mappingTrackSelector$MappedTrackInfo0, arr3_v, arr_rendererConfiguration, arr_exoTrackSelection);
        }
        return Pair.create(arr_rendererConfiguration, arr_exoTrackSelection);
    }

    class androidx.media3.exoplayer.trackselection.DefaultTrackSelector.1 {
    }

}

