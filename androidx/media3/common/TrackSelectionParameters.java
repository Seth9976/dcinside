package androidx.media3.common;

import O1.a;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.z;
import com.google.common.collect.O2;
import com.google.common.collect.Q2;
import com.google.common.collect.a3;
import com.google.common.primitives.l;
import h4.d;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class TrackSelectionParameters {
    @UnstableApi
    public static final class AudioOffloadPreferences {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.TYPE_USE})
        public @interface AudioOffloadMode {
        }

        public static final class Builder {
            private int a;
            private boolean b;
            private boolean c;

            public Builder() {
                this.a = 0;
                this.b = false;
                this.c = false;
            }

            public AudioOffloadPreferences d() {
                return new AudioOffloadPreferences(this, null);
            }

            @a
            public Builder e(int v) {
                this.a = v;
                return this;
            }

            @a
            public Builder f(boolean z) {
                this.b = z;
                return this;
            }

            @a
            public Builder g(boolean z) {
                this.c = z;
                return this;
            }
        }

        public final int a;
        public final boolean b;
        public final boolean c;
        public static final int d = 2;
        public static final int e = 1;
        public static final int f;
        public static final AudioOffloadPreferences g;
        private static final String h;
        private static final String i;
        private static final String j;

        static {
            AudioOffloadPreferences.g = new Builder().d();
            AudioOffloadPreferences.h = "1";
            AudioOffloadPreferences.i = "2";
            AudioOffloadPreferences.j = "3";
        }

        private AudioOffloadPreferences(Builder trackSelectionParameters$AudioOffloadPreferences$Builder0) {
            this.a = trackSelectionParameters$AudioOffloadPreferences$Builder0.a;
            this.b = trackSelectionParameters$AudioOffloadPreferences$Builder0.b;
            this.c = trackSelectionParameters$AudioOffloadPreferences$Builder0.c;
        }

        AudioOffloadPreferences(Builder trackSelectionParameters$AudioOffloadPreferences$Builder0, androidx.media3.common.TrackSelectionParameters.1 trackSelectionParameters$10) {
            this(trackSelectionParameters$AudioOffloadPreferences$Builder0);
        }

        public Builder a() {
            return new Builder().e(this.a).f(this.b).g(this.c);
        }

        public static AudioOffloadPreferences b(Bundle bundle0) {
            return new Builder().e(bundle0.getInt(AudioOffloadPreferences.h, AudioOffloadPreferences.g.a)).f(bundle0.getBoolean(AudioOffloadPreferences.i, AudioOffloadPreferences.g.b)).g(bundle0.getBoolean(AudioOffloadPreferences.j, AudioOffloadPreferences.g.c)).d();
        }

        public Bundle c() {
            Bundle bundle0 = new Bundle();
            bundle0.putInt(AudioOffloadPreferences.h, this.a);
            bundle0.putBoolean(AudioOffloadPreferences.i, this.b);
            bundle0.putBoolean(AudioOffloadPreferences.j, this.c);
            return bundle0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return AudioOffloadPreferences.class == class0 && (this.a == ((AudioOffloadPreferences)object0).a && this.b == ((AudioOffloadPreferences)object0).b && this.c == ((AudioOffloadPreferences)object0).c);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return ((this.a + 0x1F) * 0x1F + this.b) * 0x1F + this.c;
        }
    }

    public static class androidx.media3.common.TrackSelectionParameters.Builder {
        private HashMap A;
        private HashSet B;
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private O2 l;
        private int m;
        private O2 n;
        private int o;
        private int p;
        private int q;
        private O2 r;
        private AudioOffloadPreferences s;
        private O2 t;
        private int u;
        private int v;
        private boolean w;
        private boolean x;
        private boolean y;
        private boolean z;

        @UnstableApi
        @Deprecated
        public androidx.media3.common.TrackSelectionParameters.Builder() {
            this.a = 0x7FFFFFFF;
            this.b = 0x7FFFFFFF;
            this.c = 0x7FFFFFFF;
            this.d = 0x7FFFFFFF;
            this.i = 0x7FFFFFFF;
            this.j = 0x7FFFFFFF;
            this.k = true;
            this.l = O2.A();
            this.m = 0;
            this.n = O2.A();
            this.o = 0;
            this.p = 0x7FFFFFFF;
            this.q = 0x7FFFFFFF;
            this.r = O2.A();
            this.s = AudioOffloadPreferences.g;
            this.t = O2.A();
            this.u = 0;
            this.v = 0;
            this.w = false;
            this.x = false;
            this.y = false;
            this.z = false;
            this.A = new HashMap();
            this.B = new HashSet();
        }

        public androidx.media3.common.TrackSelectionParameters.Builder(Context context0) {
            this.i0(context0);
            this.s0(context0, true);
        }

        @UnstableApi
        protected androidx.media3.common.TrackSelectionParameters.Builder(Bundle bundle0) {
            TrackSelectionParameters trackSelectionParameters0 = TrackSelectionParameters.C;
            this.a = bundle0.getInt(TrackSelectionParameters.J, trackSelectionParameters0.a);
            this.b = bundle0.getInt(TrackSelectionParameters.K, trackSelectionParameters0.b);
            this.c = bundle0.getInt(TrackSelectionParameters.L, trackSelectionParameters0.c);
            this.d = bundle0.getInt(TrackSelectionParameters.M, trackSelectionParameters0.d);
            this.e = bundle0.getInt(TrackSelectionParameters.N, trackSelectionParameters0.e);
            this.f = bundle0.getInt(TrackSelectionParameters.O, trackSelectionParameters0.f);
            this.g = bundle0.getInt(TrackSelectionParameters.P, trackSelectionParameters0.g);
            this.h = bundle0.getInt(TrackSelectionParameters.Q, trackSelectionParameters0.h);
            this.i = bundle0.getInt(TrackSelectionParameters.R, trackSelectionParameters0.i);
            this.j = bundle0.getInt(TrackSelectionParameters.S, trackSelectionParameters0.j);
            this.k = bundle0.getBoolean(TrackSelectionParameters.T, trackSelectionParameters0.k);
            this.l = O2.x(((String[])z.a(bundle0.getStringArray(TrackSelectionParameters.U), new String[0])));
            this.m = bundle0.getInt(TrackSelectionParameters.c0, trackSelectionParameters0.m);
            this.n = androidx.media3.common.TrackSelectionParameters.Builder.L(((String[])z.a(bundle0.getStringArray(TrackSelectionParameters.E), new String[0])));
            this.o = bundle0.getInt(TrackSelectionParameters.F, trackSelectionParameters0.o);
            this.p = bundle0.getInt(TrackSelectionParameters.V, trackSelectionParameters0.p);
            this.q = bundle0.getInt(TrackSelectionParameters.W, trackSelectionParameters0.q);
            this.r = O2.x(((String[])z.a(bundle0.getStringArray(TrackSelectionParameters.X), new String[0])));
            this.s = androidx.media3.common.TrackSelectionParameters.Builder.J(bundle0);
            this.t = androidx.media3.common.TrackSelectionParameters.Builder.L(((String[])z.a(bundle0.getStringArray(TrackSelectionParameters.G), new String[0])));
            this.u = bundle0.getInt(TrackSelectionParameters.H, trackSelectionParameters0.u);
            this.v = bundle0.getInt(TrackSelectionParameters.d0, trackSelectionParameters0.v);
            this.w = bundle0.getBoolean(TrackSelectionParameters.I, trackSelectionParameters0.w);
            this.x = bundle0.getBoolean(TrackSelectionParameters.i0, trackSelectionParameters0.x);
            this.y = bundle0.getBoolean(TrackSelectionParameters.Y, trackSelectionParameters0.y);
            this.z = bundle0.getBoolean(TrackSelectionParameters.Z, trackSelectionParameters0.z);
            ArrayList arrayList0 = bundle0.getParcelableArrayList(TrackSelectionParameters.a0);
            O2 o20 = arrayList0 == null ? O2.A() : BundleCollectionUtil.d(new L0(), arrayList0);
            this.A = new HashMap();
            for(int v1 = 0; v1 < o20.size(); ++v1) {
                TrackSelectionOverride trackSelectionOverride0 = (TrackSelectionOverride)o20.get(v1);
                this.A.put(trackSelectionOverride0.a, trackSelectionOverride0);
            }
            int[] arr_v = (int[])z.a(bundle0.getIntArray(TrackSelectionParameters.b0), new int[0]);
            this.B = new HashSet();
            for(int v = 0; v < arr_v.length; ++v) {
                this.B.add(((int)arr_v[v]));
            }
        }

        @UnstableApi
        protected androidx.media3.common.TrackSelectionParameters.Builder(TrackSelectionParameters trackSelectionParameters0) {
            this.K(trackSelectionParameters0);
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder C(TrackSelectionOverride trackSelectionOverride0) {
            this.A.put(trackSelectionOverride0.a, trackSelectionOverride0);
            return this;
        }

        public TrackSelectionParameters D() {
            return new TrackSelectionParameters(this);
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder E(TrackGroup trackGroup0) {
            this.A.remove(trackGroup0);
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder F() {
            this.A.clear();
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder G(int v) {
            Iterator iterator0 = this.A.values().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(((TrackSelectionOverride)object0).b() == v) {
                    iterator0.remove();
                }
            }
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder H() {
            return this.W(0x7FFFFFFF, 0x7FFFFFFF);
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder I() {
            return this.r0(0x7FFFFFFF, 0x7FFFFFFF, true);
        }

        private static AudioOffloadPreferences J(Bundle bundle0) {
            Bundle bundle1 = bundle0.getBundle(TrackSelectionParameters.h0);
            return bundle1 == null ? new Builder().e(bundle0.getInt(TrackSelectionParameters.e0, AudioOffloadPreferences.g.a)).f(bundle0.getBoolean(TrackSelectionParameters.f0, AudioOffloadPreferences.g.b)).g(bundle0.getBoolean(TrackSelectionParameters.g0, AudioOffloadPreferences.g.c)).d() : AudioOffloadPreferences.b(bundle1);
        }

        @d({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        private void K(TrackSelectionParameters trackSelectionParameters0) {
            this.a = trackSelectionParameters0.a;
            this.b = trackSelectionParameters0.b;
            this.c = trackSelectionParameters0.c;
            this.d = trackSelectionParameters0.d;
            this.e = trackSelectionParameters0.e;
            this.f = trackSelectionParameters0.f;
            this.g = trackSelectionParameters0.g;
            this.h = trackSelectionParameters0.h;
            this.i = trackSelectionParameters0.i;
            this.j = trackSelectionParameters0.j;
            this.k = trackSelectionParameters0.k;
            this.l = trackSelectionParameters0.l;
            this.m = trackSelectionParameters0.m;
            this.n = trackSelectionParameters0.n;
            this.o = trackSelectionParameters0.o;
            this.p = trackSelectionParameters0.p;
            this.q = trackSelectionParameters0.q;
            this.r = trackSelectionParameters0.r;
            this.s = trackSelectionParameters0.s;
            this.t = trackSelectionParameters0.t;
            this.u = trackSelectionParameters0.u;
            this.v = trackSelectionParameters0.v;
            this.w = trackSelectionParameters0.w;
            this.x = trackSelectionParameters0.x;
            this.y = trackSelectionParameters0.y;
            this.z = trackSelectionParameters0.z;
            this.B = new HashSet(trackSelectionParameters0.B);
            this.A = new HashMap(trackSelectionParameters0.A);
        }

        private static O2 L(String[] arr_s) {
            com.google.common.collect.O2.a o2$a0 = O2.n();
            String[] arr_s1 = (String[])Assertions.g(arr_s);
            for(int v = 0; v < arr_s1.length; ++v) {
                o2$a0.j(Util.I1(((String)Assertions.g(arr_s1[v]))));
            }
            return o2$a0.n();
        }

        @a
        @UnstableApi
        protected androidx.media3.common.TrackSelectionParameters.Builder M(TrackSelectionParameters trackSelectionParameters0) {
            this.K(trackSelectionParameters0);
            return this;
        }

        @a
        @UnstableApi
        public androidx.media3.common.TrackSelectionParameters.Builder N(AudioOffloadPreferences trackSelectionParameters$AudioOffloadPreferences0) {
            this.s = trackSelectionParameters$AudioOffloadPreferences0;
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.TrackSelectionParameters.Builder O(Set set0) {
            this.B.clear();
            this.B.addAll(set0);
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder P(boolean z) {
            this.z = z;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder Q(boolean z) {
            this.y = z;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder R(int v) {
            this.v = v;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder S(int v) {
            this.q = v;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder T(int v) {
            this.p = v;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder U(int v) {
            this.d = v;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder V(int v) {
            this.c = v;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder W(int v, int v1) {
            this.a = v;
            this.b = v1;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder X() {
            return this.W(0x4FF, 0x2CF);
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder Y(int v) {
            this.h = v;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder Z(int v) {
            this.g = v;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder a0(int v, int v1) {
            this.e = v;
            this.f = v1;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder b0(TrackSelectionOverride trackSelectionOverride0) {
            this.G(trackSelectionOverride0.b());
            this.A.put(trackSelectionOverride0.a, trackSelectionOverride0);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder c0(@Nullable String s) {
            return s == null ? this.d0(new String[0]) : this.d0(new String[]{s});
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder d0(String[] arr_s) {
            this.n = androidx.media3.common.TrackSelectionParameters.Builder.L(arr_s);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder e0(@Nullable String s) {
            return s == null ? this.f0(new String[0]) : this.f0(new String[]{s});
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder f0(String[] arr_s) {
            this.r = O2.x(arr_s);
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder g0(int v) {
            this.o = v;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder h0(@Nullable String s) {
            return s == null ? this.j0(new String[0]) : this.j0(new String[]{s});
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder i0(Context context0) {
            if(Util.a < 23 && Looper.myLooper() == null) {
                return this;
            }
            CaptioningManager captioningManager0 = (CaptioningManager)context0.getSystemService("captioning");
            if(captioningManager0 != null && captioningManager0.isEnabled()) {
                this.u = 0x440;
                Locale locale0 = captioningManager0.getLocale();
                if(locale0 != null) {
                    this.t = O2.B(Util.u0(locale0));
                }
            }
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder j0(String[] arr_s) {
            this.t = androidx.media3.common.TrackSelectionParameters.Builder.L(arr_s);
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder k0(int v) {
            this.u = v;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder l0(@Nullable String s) {
            return s == null ? this.m0(new String[0]) : this.m0(new String[]{s});
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder m0(String[] arr_s) {
            this.l = O2.x(arr_s);
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder n0(int v) {
            this.m = v;
            return this;
        }

        @a
        @UnstableApi
        public androidx.media3.common.TrackSelectionParameters.Builder o0(boolean z) {
            this.x = z;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder p0(boolean z) {
            this.w = z;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder q0(int v, boolean z) {
            if(z) {
                this.B.add(v);
                return this;
            }
            this.B.remove(v);
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder r0(int v, int v1, boolean z) {
            this.i = v;
            this.j = v1;
            this.k = z;
            return this;
        }

        @a
        public androidx.media3.common.TrackSelectionParameters.Builder s0(Context context0, boolean z) {
            Point point0 = Util.i0(context0);
            return this.r0(point0.x, point0.y, z);
        }
    }

    public final Q2 A;
    public final a3 B;
    @UnstableApi
    public static final TrackSelectionParameters C = null;
    @UnstableApi
    @Deprecated
    public static final TrackSelectionParameters D = null;
    private static final String E = null;
    private static final String F = null;
    private static final String G = null;
    private static final String H = null;
    private static final String I = null;
    private static final String J = null;
    private static final String K = null;
    private static final String L = null;
    private static final String M = null;
    private static final String N = null;
    private static final String O = null;
    private static final String P = null;
    private static final String Q = null;
    private static final String R = null;
    private static final String S = null;
    private static final String T = null;
    private static final String U = null;
    private static final String V = null;
    private static final String W = null;
    private static final String X = null;
    private static final String Y = null;
    private static final String Z = null;
    public final int a;
    private static final String a0 = null;
    public final int b;
    private static final String b0 = null;
    public final int c;
    private static final String c0 = null;
    public final int d;
    private static final String d0 = null;
    public final int e;
    private static final String e0 = null;
    public final int f;
    private static final String f0 = null;
    public final int g;
    private static final String g0 = null;
    public final int h;
    private static final String h0 = null;
    public final int i;
    private static final String i0 = null;
    public final int j;
    @UnstableApi
    protected static final int j0 = 1000;
    public final boolean k;
    public final O2 l;
    public final int m;
    public final O2 n;
    public final int o;
    public final int p;
    public final int q;
    public final O2 r;
    @UnstableApi
    public final AudioOffloadPreferences s;
    public final O2 t;
    public final int u;
    public final int v;
    public final boolean w;
    @UnstableApi
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        TrackSelectionParameters trackSelectionParameters0 = new androidx.media3.common.TrackSelectionParameters.Builder().D();
        TrackSelectionParameters.C = trackSelectionParameters0;
        TrackSelectionParameters.D = trackSelectionParameters0;
        TrackSelectionParameters.E = "1";
        TrackSelectionParameters.F = "2";
        TrackSelectionParameters.G = "3";
        TrackSelectionParameters.H = "4";
        TrackSelectionParameters.I = "5";
        TrackSelectionParameters.J = "6";
        TrackSelectionParameters.K = "7";
        TrackSelectionParameters.L = "8";
        TrackSelectionParameters.M = "9";
        TrackSelectionParameters.N = "a";
        TrackSelectionParameters.O = "b";
        TrackSelectionParameters.P = "c";
        TrackSelectionParameters.Q = "d";
        TrackSelectionParameters.R = "e";
        TrackSelectionParameters.S = "f";
        TrackSelectionParameters.T = "g";
        TrackSelectionParameters.U = "h";
        TrackSelectionParameters.V = "i";
        TrackSelectionParameters.W = "j";
        TrackSelectionParameters.X = "k";
        TrackSelectionParameters.Y = "l";
        TrackSelectionParameters.Z = "m";
        TrackSelectionParameters.a0 = "n";
        TrackSelectionParameters.b0 = "o";
        TrackSelectionParameters.c0 = "p";
        TrackSelectionParameters.d0 = "q";
        TrackSelectionParameters.e0 = "r";
        TrackSelectionParameters.f0 = "s";
        TrackSelectionParameters.g0 = "t";
        TrackSelectionParameters.h0 = "u";
        TrackSelectionParameters.i0 = "v";
    }

    @UnstableApi
    protected TrackSelectionParameters(androidx.media3.common.TrackSelectionParameters.Builder trackSelectionParameters$Builder0) {
        this.a = trackSelectionParameters$Builder0.a;
        this.b = trackSelectionParameters$Builder0.b;
        this.c = trackSelectionParameters$Builder0.c;
        this.d = trackSelectionParameters$Builder0.d;
        this.e = trackSelectionParameters$Builder0.e;
        this.f = trackSelectionParameters$Builder0.f;
        this.g = trackSelectionParameters$Builder0.g;
        this.h = trackSelectionParameters$Builder0.h;
        this.i = trackSelectionParameters$Builder0.i;
        this.j = trackSelectionParameters$Builder0.j;
        this.k = trackSelectionParameters$Builder0.k;
        this.l = trackSelectionParameters$Builder0.l;
        this.m = trackSelectionParameters$Builder0.m;
        this.n = trackSelectionParameters$Builder0.n;
        this.o = trackSelectionParameters$Builder0.o;
        this.p = trackSelectionParameters$Builder0.p;
        this.q = trackSelectionParameters$Builder0.q;
        this.r = trackSelectionParameters$Builder0.r;
        this.s = trackSelectionParameters$Builder0.s;
        this.t = trackSelectionParameters$Builder0.t;
        this.u = trackSelectionParameters$Builder0.u;
        this.v = trackSelectionParameters$Builder0.v;
        this.w = trackSelectionParameters$Builder0.w;
        this.x = trackSelectionParameters$Builder0.x;
        this.y = trackSelectionParameters$Builder0.y;
        this.z = trackSelectionParameters$Builder0.z;
        this.A = Q2.g(trackSelectionParameters$Builder0.A);
        this.B = a3.u(trackSelectionParameters$Builder0.B);
    }

    public androidx.media3.common.TrackSelectionParameters.Builder F() {
        return new androidx.media3.common.TrackSelectionParameters.Builder(this);
    }

    public static TrackSelectionParameters G(Bundle bundle0) {
        return new androidx.media3.common.TrackSelectionParameters.Builder(bundle0).D();
    }

    public static TrackSelectionParameters H(Context context0) {
        return new androidx.media3.common.TrackSelectionParameters.Builder(context0).D();
    }

    @CallSuper
    public Bundle I() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt(TrackSelectionParameters.J, this.a);
        bundle0.putInt(TrackSelectionParameters.K, this.b);
        bundle0.putInt(TrackSelectionParameters.L, this.c);
        bundle0.putInt(TrackSelectionParameters.M, this.d);
        bundle0.putInt(TrackSelectionParameters.N, this.e);
        bundle0.putInt(TrackSelectionParameters.O, this.f);
        bundle0.putInt(TrackSelectionParameters.P, this.g);
        bundle0.putInt(TrackSelectionParameters.Q, this.h);
        bundle0.putInt(TrackSelectionParameters.R, this.i);
        bundle0.putInt(TrackSelectionParameters.S, this.j);
        bundle0.putBoolean(TrackSelectionParameters.T, this.k);
        String[] arr_s = (String[])this.l.toArray(new String[0]);
        bundle0.putStringArray(TrackSelectionParameters.U, arr_s);
        bundle0.putInt(TrackSelectionParameters.c0, this.m);
        String[] arr_s1 = (String[])this.n.toArray(new String[0]);
        bundle0.putStringArray(TrackSelectionParameters.E, arr_s1);
        bundle0.putInt(TrackSelectionParameters.F, this.o);
        bundle0.putInt(TrackSelectionParameters.V, this.p);
        bundle0.putInt(TrackSelectionParameters.W, this.q);
        String[] arr_s2 = (String[])this.r.toArray(new String[0]);
        bundle0.putStringArray(TrackSelectionParameters.X, arr_s2);
        String[] arr_s3 = (String[])this.t.toArray(new String[0]);
        bundle0.putStringArray(TrackSelectionParameters.G, arr_s3);
        bundle0.putInt(TrackSelectionParameters.H, this.u);
        bundle0.putInt(TrackSelectionParameters.d0, this.v);
        bundle0.putBoolean(TrackSelectionParameters.I, this.w);
        bundle0.putInt(TrackSelectionParameters.e0, this.s.a);
        bundle0.putBoolean(TrackSelectionParameters.f0, this.s.b);
        bundle0.putBoolean(TrackSelectionParameters.g0, this.s.c);
        Bundle bundle1 = this.s.c();
        bundle0.putBundle(TrackSelectionParameters.h0, bundle1);
        bundle0.putBoolean(TrackSelectionParameters.i0, this.x);
        bundle0.putBoolean(TrackSelectionParameters.Y, this.y);
        bundle0.putBoolean(TrackSelectionParameters.Z, this.z);
        ArrayList arrayList0 = BundleCollectionUtil.i(this.A.K(), new K0());
        bundle0.putParcelableArrayList(TrackSelectionParameters.a0, arrayList0);
        int[] arr_v = l.D(this.B);
        bundle0.putIntArray(TrackSelectionParameters.b0, arr_v);
        return bundle0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            TrackSelectionParameters trackSelectionParameters0 = (TrackSelectionParameters)object0;
            return this.a == trackSelectionParameters0.a && this.b == trackSelectionParameters0.b && this.c == trackSelectionParameters0.c && this.d == trackSelectionParameters0.d && this.e == trackSelectionParameters0.e && this.f == trackSelectionParameters0.f && this.g == trackSelectionParameters0.g && this.h == trackSelectionParameters0.h && this.k == trackSelectionParameters0.k && this.i == trackSelectionParameters0.i && this.j == trackSelectionParameters0.j && this.l.equals(trackSelectionParameters0.l) && this.m == trackSelectionParameters0.m && this.n.equals(trackSelectionParameters0.n) && this.o == trackSelectionParameters0.o && this.p == trackSelectionParameters0.p && this.q == trackSelectionParameters0.q && this.r.equals(trackSelectionParameters0.r) && this.s.equals(trackSelectionParameters0.s) && this.t.equals(trackSelectionParameters0.t) && this.u == trackSelectionParameters0.u && this.v == trackSelectionParameters0.v && this.w == trackSelectionParameters0.w && this.x == trackSelectionParameters0.x && this.y == trackSelectionParameters0.y && this.z == trackSelectionParameters0.z && this.A.equals(trackSelectionParameters0.A) && this.B.equals(trackSelectionParameters0.B);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (((((((((((((((((((((((((((this.a + 0x1F) * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h) * 0x1F + this.k) * 0x1F + this.i) * 0x1F + this.j) * 0x1F + this.l.hashCode()) * 0x1F + this.m) * 0x1F + this.n.hashCode()) * 0x1F + this.o) * 0x1F + this.p) * 0x1F + this.q) * 0x1F + this.r.hashCode()) * 0x1F + this.s.hashCode()) * 0x1F + this.t.hashCode()) * 0x1F + this.u) * 0x1F + this.v) * 0x1F + this.w) * 0x1F + this.x) * 0x1F + this.y) * 0x1F + this.z) * 0x1F + this.A.hashCode()) * 0x1F + this.B.hashCode();
    }

    class androidx.media3.common.TrackSelectionParameters.1 {
    }

}

