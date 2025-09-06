package androidx.media3.common;

import O1.a;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.y;
import com.google.common.collect.O2;
import j..util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

public final class Format {
    @UnstableApi
    public static final class Builder {
        private int A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;
        @UnstableApi
        private int G;
        private int H;
        private int I;
        private int J;
        @Nullable
        private String a;
        @Nullable
        private String b;
        private List c;
        @Nullable
        private String d;
        private int e;
        private int f;
        private int g;
        private int h;
        @Nullable
        private String i;
        @Nullable
        private Metadata j;
        @Nullable
        private Object k;
        @Nullable
        private String l;
        @Nullable
        private String m;
        private int n;
        private int o;
        @Nullable
        private List p;
        @Nullable
        private DrmInitData q;
        private long r;
        private int s;
        private int t;
        private float u;
        private int v;
        private float w;
        @Nullable
        private byte[] x;
        private int y;
        @Nullable
        private ColorInfo z;

        public Builder() {
            this.c = O2.A();
            this.g = -1;
            this.h = -1;
            this.n = -1;
            this.o = -1;
            this.r = 0x7FFFFFFFFFFFFFFFL;
            this.s = -1;
            this.t = -1;
            this.u = -1.0f;
            this.w = 1.0f;
            this.y = -1;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.F = -1;
            this.G = 1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
        }

        private Builder(Format format0) {
            this.a = format0.a;
            this.b = format0.b;
            this.c = format0.c;
            this.d = format0.d;
            this.e = format0.e;
            this.f = format0.f;
            this.g = format0.g;
            this.h = format0.h;
            this.i = format0.j;
            this.j = format0.k;
            this.k = format0.l;
            this.l = format0.m;
            this.m = format0.n;
            this.n = format0.o;
            this.o = format0.p;
            this.p = format0.q;
            this.q = format0.r;
            this.r = format0.s;
            this.s = format0.t;
            this.t = format0.u;
            this.u = format0.v;
            this.v = format0.w;
            this.w = format0.x;
            this.x = format0.y;
            this.y = format0.z;
            this.z = format0.A;
            this.A = format0.B;
            this.B = format0.C;
            this.C = format0.D;
            this.D = format0.E;
            this.E = format0.F;
            this.F = format0.G;
            this.G = format0.H;
            this.H = format0.I;
            this.I = format0.J;
            this.J = format0.K;
        }

        Builder(Format format0, androidx.media3.common.Format.1 format$10) {
            this(format0);
        }

        public Format K() {
            return new Format(this, null);
        }

        @a
        public Builder L(int v) {
            this.F = v;
            return this;
        }

        @a
        public Builder M(int v) {
            this.g = v;
            return this;
        }

        @a
        public Builder N(int v) {
            this.A = v;
            return this;
        }

        @a
        public Builder O(@Nullable String s) {
            this.i = s;
            return this;
        }

        @a
        public Builder P(@Nullable ColorInfo colorInfo0) {
            this.z = colorInfo0;
            return this;
        }

        @a
        public Builder Q(@Nullable String s) {
            this.l = MimeTypes.v(s);
            return this;
        }

        @a
        public Builder R(int v) {
            this.J = v;
            return this;
        }

        @a
        public Builder S(int v) {
            this.G = v;
            return this;
        }

        @a
        @UnstableApi
        public Builder T(@Nullable Object object0) {
            this.k = object0;
            return this;
        }

        @a
        public Builder U(@Nullable DrmInitData drmInitData0) {
            this.q = drmInitData0;
            return this;
        }

        @a
        public Builder V(int v) {
            this.D = v;
            return this;
        }

        @a
        public Builder W(int v) {
            this.E = v;
            return this;
        }

        @a
        public Builder X(float f) {
            this.u = f;
            return this;
        }

        @a
        public Builder Y(int v) {
            this.t = v;
            return this;
        }

        @a
        public Builder Z(int v) {
            this.a = Integer.toString(v);
            return this;
        }

        @a
        public Builder a0(@Nullable String s) {
            this.a = s;
            return this;
        }

        @a
        public Builder b0(@Nullable List list0) {
            this.p = list0;
            return this;
        }

        @a
        public Builder c0(@Nullable String s) {
            this.b = s;
            return this;
        }

        @a
        public Builder d0(List list0) {
            this.c = O2.r(list0);
            return this;
        }

        @a
        public Builder e0(@Nullable String s) {
            this.d = s;
            return this;
        }

        @a
        public Builder f0(int v) {
            this.n = v;
            return this;
        }

        @a
        public Builder g0(int v) {
            this.o = v;
            return this;
        }

        @a
        public Builder h0(@Nullable Metadata metadata0) {
            this.j = metadata0;
            return this;
        }

        @a
        public Builder i0(int v) {
            this.C = v;
            return this;
        }

        @a
        public Builder j0(int v) {
            this.h = v;
            return this;
        }

        @a
        public Builder k0(float f) {
            this.w = f;
            return this;
        }

        @a
        public Builder l0(@Nullable byte[] arr_b) {
            this.x = arr_b;
            return this;
        }

        @a
        public Builder m0(int v) {
            this.f = v;
            return this;
        }

        @a
        public Builder n0(int v) {
            this.v = v;
            return this;
        }

        @a
        public Builder o0(@Nullable String s) {
            this.m = MimeTypes.v(s);
            return this;
        }

        @a
        public Builder p0(int v) {
            this.B = v;
            return this;
        }

        @a
        public Builder q0(int v) {
            this.e = v;
            return this;
        }

        @a
        public Builder r0(int v) {
            this.y = v;
            return this;
        }

        @a
        public Builder s0(long v) {
            this.r = v;
            return this;
        }

        @a
        public Builder t0(int v) {
            this.H = v;
            return this;
        }

        @a
        public Builder u0(int v) {
            this.I = v;
            return this;
        }

        @a
        public Builder v0(int v) {
            this.s = v;
            return this;
        }
    }

    @UnstableApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface CueReplacementBehavior {
    }

    @Nullable
    @UnstableApi
    public final ColorInfo A;
    public final int B;
    public final int C;
    @UnstableApi
    public final int D;
    @UnstableApi
    public final int E;
    @UnstableApi
    public final int F;
    @UnstableApi
    public final int G;
    @UnstableApi
    public final int H;
    @UnstableApi
    public final int I;
    @UnstableApi
    public final int J;
    @UnstableApi
    public final int K;
    private int L;
    @UnstableApi
    public static final int M = 1;
    @UnstableApi
    public static final int N = 2;
    public static final int O = -1;
    @UnstableApi
    public static final long P = 0x7FFFFFFFFFFFFFFFL;
    private static final Format Q;
    private static final String R;
    private static final String S;
    private static final String T;
    private static final String U;
    private static final String V;
    private static final String W;
    private static final String X;
    private static final String Y;
    private static final String Z;
    @Nullable
    public final String a;
    private static final String a0;
    @Nullable
    public final String b;
    private static final String b0;
    @UnstableApi
    public final List c;
    private static final String c0;
    @Nullable
    public final String d;
    private static final String d0;
    public final int e;
    private static final String e0;
    public final int f;
    private static final String f0;
    @UnstableApi
    public final int g;
    private static final String g0;
    @UnstableApi
    public final int h;
    private static final String h0;
    @UnstableApi
    public final int i;
    private static final String i0;
    @Nullable
    public final String j;
    private static final String j0;
    @Nullable
    @UnstableApi
    public final Metadata k;
    private static final String k0;
    @Nullable
    @UnstableApi
    public final Object l;
    private static final String l0;
    @Nullable
    public final String m;
    private static final String m0;
    @Nullable
    public final String n;
    private static final String n0;
    @UnstableApi
    public final int o;
    private static final String o0;
    @UnstableApi
    public final int p;
    private static final String p0;
    @UnstableApi
    public final List q;
    private static final String q0;
    @Nullable
    @UnstableApi
    public final DrmInitData r;
    private static final String r0;
    @UnstableApi
    public final long s;
    private static final String s0;
    public final int t;
    private static final String t0;
    public final int u;
    private static final String u0;
    public final float v;
    private static final String v0;
    @UnstableApi
    public final int w;
    private static final String w0;
    public final float x;
    private static final String x0;
    @Nullable
    @UnstableApi
    public final byte[] y;
    @UnstableApi
    public final int z;

    static {
        Format.Q = new Builder().K();
        Format.R = "0";
        Format.S = "1";
        Format.T = "2";
        Format.U = "3";
        Format.V = "4";
        Format.W = "5";
        Format.X = "6";
        Format.Y = "7";
        Format.Z = "8";
        Format.a0 = "9";
        Format.b0 = "a";
        Format.c0 = "b";
        Format.d0 = "c";
        Format.e0 = "d";
        Format.f0 = "e";
        Format.g0 = "f";
        Format.h0 = "g";
        Format.i0 = "h";
        Format.j0 = "i";
        Format.k0 = "j";
        Format.l0 = "k";
        Format.m0 = "l";
        Format.n0 = "m";
        Format.o0 = "n";
        Format.p0 = "o";
        Format.q0 = "p";
        Format.r0 = "q";
        Format.s0 = "r";
        Format.t0 = "s";
        Format.u0 = "t";
        Format.v0 = "u";
        Format.w0 = "v";
        Format.x0 = "w";
    }

    private Format(Builder format$Builder0) {
        this.a = format$Builder0.a;
        String s = Util.I1(format$Builder0.d);
        this.d = s;
        if(format$Builder0.c.isEmpty() && format$Builder0.b != null) {
            this.c = O2.B(new Label(s, format$Builder0.b));
            this.b = format$Builder0.b;
        }
        else if(format$Builder0.c.isEmpty() || format$Builder0.b != null) {
            Assertions.i(Format.h(format$Builder0));
            this.c = format$Builder0.c;
            this.b = format$Builder0.b;
        }
        else {
            this.c = format$Builder0.c;
            this.b = Format.e(format$Builder0.c, s);
        }
        this.e = format$Builder0.e;
        this.f = format$Builder0.f;
        int v = format$Builder0.g;
        this.g = v;
        int v1 = format$Builder0.h;
        this.h = v1;
        if(v1 != -1) {
            v = v1;
        }
        this.i = v;
        this.j = format$Builder0.i;
        this.k = format$Builder0.j;
        this.l = format$Builder0.k;
        this.m = format$Builder0.l;
        this.n = format$Builder0.m;
        this.o = format$Builder0.n;
        this.p = format$Builder0.o;
        this.q = format$Builder0.p == null ? Collections.emptyList() : format$Builder0.p;
        DrmInitData drmInitData0 = format$Builder0.q;
        this.r = drmInitData0;
        this.s = format$Builder0.r;
        this.t = format$Builder0.s;
        this.u = format$Builder0.t;
        this.v = format$Builder0.u;
        int v2 = 0;
        this.w = format$Builder0.v == -1 ? 0 : format$Builder0.v;
        this.x = format$Builder0.w == -1.0f ? 1.0f : format$Builder0.w;
        this.y = format$Builder0.x;
        this.z = format$Builder0.y;
        this.A = format$Builder0.z;
        this.B = format$Builder0.A;
        this.C = format$Builder0.B;
        this.D = format$Builder0.C;
        this.E = format$Builder0.D == -1 ? 0 : format$Builder0.D;
        if(format$Builder0.E != -1) {
            v2 = format$Builder0.E;
        }
        this.F = v2;
        this.G = format$Builder0.F;
        this.H = format$Builder0.G;
        this.I = format$Builder0.H;
        this.J = format$Builder0.I;
        if(format$Builder0.J == 0 && drmInitData0 != null) {
            this.K = 1;
            return;
        }
        this.K = format$Builder0.J;
    }

    Format(Builder format$Builder0, androidx.media3.common.Format.1 format$10) {
        this(format$Builder0);
    }

    @UnstableApi
    public Builder a() {
        return new Builder(this, null);
    }

    @UnstableApi
    public Format b(int v) {
        return this.a().R(v).K();
    }

    @Nullable
    private static Object c(@Nullable Object object0, @Nullable Object object1) {
        return object0 == null ? object1 : object0;
    }

    @UnstableApi
    public static Format d(Bundle bundle0) {
        Builder format$Builder0 = new Builder();
        BundleCollectionUtil.c(bundle0);
        format$Builder0.a0(((String)Format.c(bundle0.getString(Format.R), Format.Q.a))).c0(((String)Format.c(bundle0.getString(Format.S), Format.Q.b)));
        ArrayList arrayList0 = bundle0.getParcelableArrayList(Format.x0);
        format$Builder0.d0((arrayList0 == null ? O2.A() : BundleCollectionUtil.d(new h(), arrayList0))).e0(((String)Format.c(bundle0.getString(Format.T), Format.Q.d))).q0(bundle0.getInt(Format.U, Format.Q.e)).m0(bundle0.getInt(Format.V, Format.Q.f)).M(bundle0.getInt(Format.W, Format.Q.g)).j0(bundle0.getInt(Format.X, Format.Q.h)).O(((String)Format.c(bundle0.getString(Format.Y), Format.Q.j))).h0(((Metadata)Format.c(((Metadata)bundle0.getParcelable(Format.Z)), Format.Q.k))).Q(((String)Format.c(bundle0.getString(Format.a0), Format.Q.m))).o0(((String)Format.c(bundle0.getString(Format.b0), Format.Q.n))).f0(bundle0.getInt(Format.c0, Format.Q.o));
        ArrayList arrayList1 = new ArrayList();
        byte[] arr_b;
        for(int v = 0; (arr_b = bundle0.getByteArray(Format.i(v))) != null; ++v) {
            arrayList1.add(arr_b);
        }
        Builder format$Builder1 = format$Builder0.b0(arrayList1).U(((DrmInitData)bundle0.getParcelable(Format.e0)));
        Format format0 = Format.Q;
        format$Builder1.s0(bundle0.getLong(Format.f0, format0.s)).v0(bundle0.getInt(Format.g0, format0.t)).Y(bundle0.getInt(Format.h0, format0.u)).X(bundle0.getFloat(Format.i0, format0.v)).n0(bundle0.getInt(Format.j0, format0.w)).k0(bundle0.getFloat(Format.k0, format0.x)).l0(bundle0.getByteArray(Format.l0)).r0(bundle0.getInt(Format.m0, format0.z));
        Bundle bundle1 = bundle0.getBundle(Format.n0);
        if(bundle1 != null) {
            format$Builder0.P(ColorInfo.f(bundle1));
        }
        format$Builder0.N(bundle0.getInt(Format.o0, format0.B)).p0(bundle0.getInt(Format.p0, format0.C)).i0(bundle0.getInt(Format.q0, format0.D)).V(bundle0.getInt(Format.r0, format0.E)).W(bundle0.getInt(Format.s0, format0.F)).L(bundle0.getInt(Format.t0, format0.G)).t0(bundle0.getInt(Format.v0, format0.I)).u0(bundle0.getInt(Format.w0, format0.J)).R(bundle0.getInt(Format.u0, format0.K));
        return format$Builder0.K();
    }

    private static String e(List list0, @Nullable String s) {
        for(Object object0: list0) {
            Label label0 = (Label)object0;
            if(TextUtils.equals(label0.a, s)) {
                return label0.b;
            }
            if(false) {
                break;
            }
        }
        return ((Label)list0.get(0)).b;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(Format.class == class0) {
                Format format0 = (Format)object0;
                return this.L == 0 || (format0.L == 0 || this.L == format0.L) ? this.e == format0.e && this.f == format0.f && this.g == format0.g && this.h == format0.h && this.o == format0.o && this.s == format0.s && this.t == format0.t && this.u == format0.u && this.w == format0.w && this.z == format0.z && this.B == format0.B && this.C == format0.C && this.D == format0.D && this.E == format0.E && this.F == format0.F && this.G == format0.G && this.I == format0.I && this.J == format0.J && this.K == format0.K && Float.compare(this.v, format0.v) == 0 && Float.compare(this.x, format0.x) == 0 && Objects.equals(this.a, format0.a) && Objects.equals(this.b, format0.b) && this.c.equals(format0.c) && Objects.equals(this.j, format0.j) && Objects.equals(this.m, format0.m) && Objects.equals(this.n, format0.n) && Objects.equals(this.d, format0.d) && Arrays.equals(this.y, format0.y) && Objects.equals(this.k, format0.k) && Objects.equals(this.A, format0.A) && Objects.equals(this.r, format0.r) && this.g(format0) && Objects.equals(this.l, format0.l) : false;
            }
        }
        return false;
    }

    @UnstableApi
    public int f() {
        int v = this.t;
        if(v != -1) {
            return this.u == -1 ? -1 : v * this.u;
        }
        return -1;
    }

    @UnstableApi
    public boolean g(Format format0) {
        if(this.q.size() != format0.q.size()) {
            return false;
        }
        for(int v = 0; v < this.q.size(); ++v) {
            if(!Arrays.equals(((byte[])this.q.get(v)), ((byte[])format0.q.get(v)))) {
                return false;
            }
        }
        return true;
    }

    private static boolean h(Builder format$Builder0) {
        if(format$Builder0.c.isEmpty() && format$Builder0.b == null) {
            return true;
        }
        for(int v = 0; v < format$Builder0.c.size(); ++v) {
            if(((Label)format$Builder0.c.get(v)).b.equals(format$Builder0.b)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        if(this.L == 0) {
            int v = 0;
            int v1 = (((((((((this.a == null ? 0 : this.a.hashCode()) + 0x20F) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c.hashCode()) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h) * 0x1F;
            int v2 = this.j == null ? 0 : this.j.hashCode();
            int v3 = this.k == null ? 0 : this.k.hashCode();
            int v4 = this.l == null ? 0 : this.l.hashCode();
            int v5 = this.m == null ? 0 : this.m.hashCode();
            String s = this.n;
            if(s != null) {
                v = s.hashCode();
            }
            this.L = (((((((((((((((((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v) * 0x1F + this.o) * 0x1F + ((int)this.s)) * 0x1F + this.t) * 0x1F + this.u) * 0x1F + Float.floatToIntBits(this.v)) * 0x1F + this.w) * 0x1F + Float.floatToIntBits(this.x)) * 0x1F + this.z) * 0x1F + this.B) * 0x1F + this.C) * 0x1F + this.D) * 0x1F + this.E) * 0x1F + this.F) * 0x1F + this.G) * 0x1F + this.I) * 0x1F + this.J) * 0x1F + this.K;
        }
        return this.L;
    }

    private static String i(int v) {
        return Format.d0 + "_" + Integer.toString(v, 36);
    }

    @UnstableApi
    @Deprecated
    public Bundle j() {
        return this.k(false);
    }

    @UnstableApi
    public Bundle k(boolean z) {
        Bundle bundle0 = new Bundle();
        bundle0.putString(Format.R, this.a);
        bundle0.putString(Format.S, this.b);
        i i0 = new i();
        ArrayList arrayList0 = BundleCollectionUtil.i(this.c, i0);
        bundle0.putParcelableArrayList(Format.x0, arrayList0);
        bundle0.putString(Format.T, this.d);
        bundle0.putInt(Format.U, this.e);
        bundle0.putInt(Format.V, this.f);
        bundle0.putInt(Format.W, this.g);
        bundle0.putInt(Format.X, this.h);
        bundle0.putString(Format.Y, this.j);
        if(!z) {
            bundle0.putParcelable(Format.Z, this.k);
        }
        bundle0.putString(Format.a0, this.m);
        bundle0.putString(Format.b0, this.n);
        bundle0.putInt(Format.c0, this.o);
        for(int v = 0; v < this.q.size(); ++v) {
            bundle0.putByteArray(Format.i(v), ((byte[])this.q.get(v)));
        }
        bundle0.putParcelable(Format.e0, this.r);
        bundle0.putLong(Format.f0, this.s);
        bundle0.putInt(Format.g0, this.t);
        bundle0.putInt(Format.h0, this.u);
        bundle0.putFloat(Format.i0, this.v);
        bundle0.putInt(Format.j0, this.w);
        bundle0.putFloat(Format.k0, this.x);
        bundle0.putByteArray(Format.l0, this.y);
        bundle0.putInt(Format.m0, this.z);
        ColorInfo colorInfo0 = this.A;
        if(colorInfo0 != null) {
            Bundle bundle1 = colorInfo0.o();
            bundle0.putBundle(Format.n0, bundle1);
        }
        bundle0.putInt(Format.o0, this.B);
        bundle0.putInt(Format.p0, this.C);
        bundle0.putInt(Format.q0, this.D);
        bundle0.putInt(Format.r0, this.E);
        bundle0.putInt(Format.s0, this.F);
        bundle0.putInt(Format.t0, this.G);
        bundle0.putInt(Format.v0, this.I);
        bundle0.putInt(Format.w0, this.J);
        bundle0.putInt(Format.u0, this.K);
        return bundle0;
    }

    @UnstableApi
    public static String l(@Nullable Format format0) {
        if(format0 == null) {
            return "null";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("id=");
        stringBuilder0.append(format0.a);
        stringBuilder0.append(", mimeType=");
        stringBuilder0.append(format0.n);
        if(format0.m != null) {
            stringBuilder0.append(", container=");
            stringBuilder0.append(format0.m);
        }
        if(format0.i != -1) {
            stringBuilder0.append(", bitrate=");
            stringBuilder0.append(format0.i);
        }
        if(format0.j != null) {
            stringBuilder0.append(", codecs=");
            stringBuilder0.append(format0.j);
        }
        if(format0.r != null) {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            for(int v = 0; true; ++v) {
                DrmInitData drmInitData0 = format0.r;
                if(v >= drmInitData0.d) {
                    break;
                }
                UUID uUID0 = drmInitData0.s(v).b;
                if(uUID0.equals(C.h2)) {
                    linkedHashSet0.add("cenc");
                }
                else if(uUID0.equals(C.i2)) {
                    linkedHashSet0.add("clearkey");
                }
                else if(uUID0.equals(C.k2)) {
                    linkedHashSet0.add("playready");
                }
                else if(uUID0.equals(C.j2)) {
                    linkedHashSet0.add("widevine");
                }
                else if(uUID0.equals(C.g2)) {
                    linkedHashSet0.add("universal");
                }
                else {
                    linkedHashSet0.add("unknown (" + uUID0 + ")");
                }
            }
            stringBuilder0.append(", drm=[");
            y.o(',').f(stringBuilder0, linkedHashSet0);
            stringBuilder0.append(']');
        }
        if(format0.t != -1 && format0.u != -1) {
            stringBuilder0.append(", res=");
            stringBuilder0.append(format0.t);
            stringBuilder0.append("x");
            stringBuilder0.append(format0.u);
        }
        if(format0.A != null && format0.A.k()) {
            stringBuilder0.append(", color=");
            stringBuilder0.append(format0.A.p());
        }
        if(format0.v != -1.0f) {
            stringBuilder0.append(", fps=");
            stringBuilder0.append(format0.v);
        }
        if(format0.B != -1) {
            stringBuilder0.append(", channels=");
            stringBuilder0.append(format0.B);
        }
        if(format0.C != -1) {
            stringBuilder0.append(", sample_rate=");
            stringBuilder0.append(format0.C);
        }
        if(format0.d != null) {
            stringBuilder0.append(", language=");
            stringBuilder0.append(format0.d);
        }
        if(!format0.c.isEmpty()) {
            stringBuilder0.append(", labels=[");
            y.o(',').f(stringBuilder0, format0.c);
            stringBuilder0.append("]");
        }
        if(format0.e != 0) {
            stringBuilder0.append(", selectionFlags=[");
            y.o(',').f(stringBuilder0, Util.F0(format0.e));
            stringBuilder0.append("]");
        }
        if(format0.f != 0) {
            stringBuilder0.append(", roleFlags=[");
            y.o(',').f(stringBuilder0, Util.E0(format0.f));
            stringBuilder0.append("]");
        }
        if(format0.l != null) {
            stringBuilder0.append(", customData=");
            stringBuilder0.append(format0.l);
        }
        return stringBuilder0.toString();
    }

    @UnstableApi
    public Format m(Format format0) {
        if(this == format0) {
            return this;
        }
        int v = MimeTypes.m(this.n);
        String s = format0.a;
        int v1 = format0.I;
        int v2 = format0.J;
        String s1 = format0.b == null ? this.b : format0.b;
        List list0 = format0.c.isEmpty() ? this.c : format0.c;
        String s2 = this.d;
        if(v == 1 || v == 3) {
            String s3 = format0.d;
            if(s3 != null) {
                s2 = s3;
            }
        }
        int v3 = this.g == -1 ? format0.g : this.g;
        int v4 = this.h == -1 ? format0.h : this.h;
        String s4 = this.j;
        if(s4 == null) {
            String s5 = Util.g0(format0.j, v);
            if(Util.o2(s5).length == 1) {
                s4 = s5;
            }
        }
        Metadata metadata0 = this.k == null ? format0.k : this.k.c(format0.k);
        DrmInitData drmInitData0 = DrmInitData.q(format0.r, this.r);
        return this.a().a0(s).c0(s1).d0(list0).e0(s2).q0(this.e | format0.e).m0(this.f | format0.f).M(v3).j0(v4).O(s4).h0(metadata0).U(drmInitData0).X((this.v != -1.0f || v != 2 ? this.v : format0.v)).t0(v1).u0(v2).K();
    }

    @Override
    public String toString() {
        return "Format(" + this.a + ", " + this.b + ", " + this.m + ", " + this.n + ", " + this.j + ", " + this.i + ", " + this.d + ", [" + this.t + ", " + this.u + ", " + this.v + ", " + this.A + "], [" + this.B + ", " + this.C + "])";
    }

    class androidx.media3.common.Format.1 {
    }

}

