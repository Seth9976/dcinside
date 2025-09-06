package androidx.media3.common;

import O1.a;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.B;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

public final class MediaMetadata {
    public static final class Builder {
        @Nullable
        private CharSequence A;
        @Nullable
        private Integer B;
        @Nullable
        private Integer C;
        @Nullable
        private CharSequence D;
        @Nullable
        private CharSequence E;
        @Nullable
        private CharSequence F;
        @Nullable
        private Integer G;
        @Nullable
        private Bundle H;
        @Nullable
        private CharSequence a;
        @Nullable
        private CharSequence b;
        @Nullable
        private CharSequence c;
        @Nullable
        private CharSequence d;
        @Nullable
        private CharSequence e;
        @Nullable
        private CharSequence f;
        @Nullable
        private CharSequence g;
        @Nullable
        private Long h;
        @Nullable
        private Rating i;
        @Nullable
        private Rating j;
        @Nullable
        private byte[] k;
        @Nullable
        private Integer l;
        @Nullable
        private Uri m;
        @Nullable
        private Integer n;
        @Nullable
        private Integer o;
        @Nullable
        private Integer p;
        @Nullable
        private Boolean q;
        @Nullable
        private Boolean r;
        @Nullable
        private Integer s;
        @Nullable
        private Integer t;
        @Nullable
        private Integer u;
        @Nullable
        private Integer v;
        @Nullable
        private Integer w;
        @Nullable
        private Integer x;
        @Nullable
        private CharSequence y;
        @Nullable
        private CharSequence z;

        public Builder() {
        }

        private Builder(MediaMetadata mediaMetadata0) {
            this.a = mediaMetadata0.a;
            this.b = mediaMetadata0.b;
            this.c = mediaMetadata0.c;
            this.d = mediaMetadata0.d;
            this.e = mediaMetadata0.e;
            this.f = mediaMetadata0.f;
            this.g = mediaMetadata0.g;
            this.h = mediaMetadata0.h;
            this.i = mediaMetadata0.i;
            this.j = mediaMetadata0.j;
            this.k = mediaMetadata0.k;
            this.l = mediaMetadata0.l;
            this.m = mediaMetadata0.m;
            this.n = mediaMetadata0.n;
            this.o = mediaMetadata0.o;
            this.p = mediaMetadata0.p;
            this.q = mediaMetadata0.q;
            this.r = mediaMetadata0.r;
            this.s = mediaMetadata0.t;
            this.t = mediaMetadata0.u;
            this.u = mediaMetadata0.v;
            this.v = mediaMetadata0.w;
            this.w = mediaMetadata0.x;
            this.x = mediaMetadata0.y;
            this.y = mediaMetadata0.z;
            this.z = mediaMetadata0.A;
            this.A = mediaMetadata0.B;
            this.B = mediaMetadata0.C;
            this.C = mediaMetadata0.D;
            this.D = mediaMetadata0.E;
            this.E = mediaMetadata0.F;
            this.F = mediaMetadata0.G;
            this.G = mediaMetadata0.H;
            this.H = mediaMetadata0.I;
        }

        Builder(MediaMetadata mediaMetadata0, androidx.media3.common.MediaMetadata.1 mediaMetadata$10) {
            this(mediaMetadata0);
        }

        public MediaMetadata I() {
            return new MediaMetadata(this, null);
        }

        @a
        public Builder J(byte[] arr_b, int v) {
            if(this.k == null || Util.g(v, 3) || !Util.g(this.l, 3)) {
                this.k = (byte[])arr_b.clone();
                this.l = v;
            }
            return this;
        }

        @a
        @UnstableApi
        public Builder K(@Nullable MediaMetadata mediaMetadata0) {
            if(mediaMetadata0 == null) {
                return this;
            }
            CharSequence charSequence0 = mediaMetadata0.a;
            if(charSequence0 != null) {
                this.p0(charSequence0);
            }
            CharSequence charSequence1 = mediaMetadata0.b;
            if(charSequence1 != null) {
                this.P(charSequence1);
            }
            CharSequence charSequence2 = mediaMetadata0.c;
            if(charSequence2 != null) {
                this.O(charSequence2);
            }
            CharSequence charSequence3 = mediaMetadata0.d;
            if(charSequence3 != null) {
                this.N(charSequence3);
            }
            CharSequence charSequence4 = mediaMetadata0.e;
            if(charSequence4 != null) {
                this.Y(charSequence4);
            }
            CharSequence charSequence5 = mediaMetadata0.f;
            if(charSequence5 != null) {
                this.o0(charSequence5);
            }
            CharSequence charSequence6 = mediaMetadata0.g;
            if(charSequence6 != null) {
                this.W(charSequence6);
            }
            Long long0 = mediaMetadata0.h;
            if(long0 != null) {
                this.Z(long0);
            }
            Rating rating0 = mediaMetadata0.i;
            if(rating0 != null) {
                this.t0(rating0);
            }
            Rating rating1 = mediaMetadata0.j;
            if(rating1 != null) {
                this.g0(rating1);
            }
            Uri uri0 = mediaMetadata0.m;
            if(uri0 != null || mediaMetadata0.k != null) {
                this.S(uri0);
                this.R(mediaMetadata0.k, mediaMetadata0.l);
            }
            Integer integer0 = mediaMetadata0.n;
            if(integer0 != null) {
                this.s0(integer0);
            }
            Integer integer1 = mediaMetadata0.o;
            if(integer1 != null) {
                this.r0(integer1);
            }
            Integer integer2 = mediaMetadata0.p;
            if(integer2 != null) {
                this.b0(integer2);
            }
            Boolean boolean0 = mediaMetadata0.q;
            if(boolean0 != null) {
                this.d0(boolean0);
            }
            Boolean boolean1 = mediaMetadata0.r;
            if(boolean1 != null) {
                this.e0(boolean1);
            }
            Integer integer3 = mediaMetadata0.s;
            if(integer3 != null) {
                this.j0(integer3);
            }
            Integer integer4 = mediaMetadata0.t;
            if(integer4 != null) {
                this.j0(integer4);
            }
            Integer integer5 = mediaMetadata0.u;
            if(integer5 != null) {
                this.i0(integer5);
            }
            Integer integer6 = mediaMetadata0.v;
            if(integer6 != null) {
                this.h0(integer6);
            }
            Integer integer7 = mediaMetadata0.w;
            if(integer7 != null) {
                this.m0(integer7);
            }
            Integer integer8 = mediaMetadata0.x;
            if(integer8 != null) {
                this.l0(integer8);
            }
            Integer integer9 = mediaMetadata0.y;
            if(integer9 != null) {
                this.k0(integer9);
            }
            CharSequence charSequence7 = mediaMetadata0.z;
            if(charSequence7 != null) {
                this.u0(charSequence7);
            }
            CharSequence charSequence8 = mediaMetadata0.A;
            if(charSequence8 != null) {
                this.U(charSequence8);
            }
            CharSequence charSequence9 = mediaMetadata0.B;
            if(charSequence9 != null) {
                this.V(charSequence9);
            }
            Integer integer10 = mediaMetadata0.C;
            if(integer10 != null) {
                this.X(integer10);
            }
            Integer integer11 = mediaMetadata0.D;
            if(integer11 != null) {
                this.q0(integer11);
            }
            CharSequence charSequence10 = mediaMetadata0.E;
            if(charSequence10 != null) {
                this.c0(charSequence10);
            }
            CharSequence charSequence11 = mediaMetadata0.F;
            if(charSequence11 != null) {
                this.T(charSequence11);
            }
            CharSequence charSequence12 = mediaMetadata0.G;
            if(charSequence12 != null) {
                this.n0(charSequence12);
            }
            Integer integer12 = mediaMetadata0.H;
            if(integer12 != null) {
                this.f0(integer12);
            }
            Bundle bundle0 = mediaMetadata0.I;
            if(bundle0 != null) {
                this.a0(bundle0);
            }
            return this;
        }

        @a
        @UnstableApi
        public Builder L(Metadata metadata0) {
            for(int v = 0; v < metadata0.f(); ++v) {
                metadata0.e(v).r3(this);
            }
            return this;
        }

        @a
        @UnstableApi
        public Builder M(List list0) {
            for(int v = 0; v < list0.size(); ++v) {
                Metadata metadata0 = (Metadata)list0.get(v);
                for(int v1 = 0; v1 < metadata0.f(); ++v1) {
                    metadata0.e(v1).r3(this);
                }
            }
            return this;
        }

        @a
        public Builder N(@Nullable CharSequence charSequence0) {
            this.d = charSequence0;
            return this;
        }

        @a
        public Builder O(@Nullable CharSequence charSequence0) {
            this.c = charSequence0;
            return this;
        }

        @a
        public Builder P(@Nullable CharSequence charSequence0) {
            this.b = charSequence0;
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public Builder Q(@Nullable byte[] arr_b) {
            return this.R(arr_b, null);
        }

        @a
        public Builder R(@Nullable byte[] arr_b, @Nullable Integer integer0) {
            this.k = arr_b == null ? null : ((byte[])arr_b.clone());
            this.l = integer0;
            return this;
        }

        @a
        public Builder S(@Nullable Uri uri0) {
            this.m = uri0;
            return this;
        }

        @a
        public Builder T(@Nullable CharSequence charSequence0) {
            this.E = charSequence0;
            return this;
        }

        @a
        public Builder U(@Nullable CharSequence charSequence0) {
            this.z = charSequence0;
            return this;
        }

        @a
        public Builder V(@Nullable CharSequence charSequence0) {
            this.A = charSequence0;
            return this;
        }

        @a
        public Builder W(@Nullable CharSequence charSequence0) {
            this.g = charSequence0;
            return this;
        }

        @a
        public Builder X(@Nullable Integer integer0) {
            this.B = integer0;
            return this;
        }

        @a
        public Builder Y(@Nullable CharSequence charSequence0) {
            this.e = charSequence0;
            return this;
        }

        @a
        @UnstableApi
        public Builder Z(@Nullable Long long0) {
            Assertions.a(long0 == null || ((long)long0) >= 0L);
            this.h = long0;
            return this;
        }

        @a
        public Builder a0(@Nullable Bundle bundle0) {
            this.H = bundle0;
            return this;
        }

        @a
        @Deprecated
        public Builder b0(@Nullable Integer integer0) {
            this.p = integer0;
            return this;
        }

        @a
        public Builder c0(@Nullable CharSequence charSequence0) {
            this.D = charSequence0;
            return this;
        }

        @a
        public Builder d0(@Nullable Boolean boolean0) {
            this.q = boolean0;
            return this;
        }

        @a
        public Builder e0(@Nullable Boolean boolean0) {
            this.r = boolean0;
            return this;
        }

        @a
        public Builder f0(@Nullable Integer integer0) {
            this.G = integer0;
            return this;
        }

        @a
        public Builder g0(@Nullable Rating rating0) {
            this.j = rating0;
            return this;
        }

        @a
        public Builder h0(@IntRange(from = 1L, to = 0x1FL) @Nullable Integer integer0) {
            this.u = integer0;
            return this;
        }

        @a
        public Builder i0(@IntRange(from = 1L, to = 12L) @Nullable Integer integer0) {
            this.t = integer0;
            return this;
        }

        @a
        public Builder j0(@Nullable Integer integer0) {
            this.s = integer0;
            return this;
        }

        @a
        public Builder k0(@IntRange(from = 1L, to = 0x1FL) @Nullable Integer integer0) {
            this.x = integer0;
            return this;
        }

        @a
        public Builder l0(@IntRange(from = 1L, to = 12L) @Nullable Integer integer0) {
            this.w = integer0;
            return this;
        }

        @a
        public Builder m0(@Nullable Integer integer0) {
            this.v = integer0;
            return this;
        }

        @a
        public Builder n0(@Nullable CharSequence charSequence0) {
            this.F = charSequence0;
            return this;
        }

        @a
        public Builder o0(@Nullable CharSequence charSequence0) {
            this.f = charSequence0;
            return this;
        }

        @a
        public Builder p0(@Nullable CharSequence charSequence0) {
            this.a = charSequence0;
            return this;
        }

        @a
        public Builder q0(@Nullable Integer integer0) {
            this.C = integer0;
            return this;
        }

        @a
        public Builder r0(@Nullable Integer integer0) {
            this.o = integer0;
            return this;
        }

        @a
        public Builder s0(@Nullable Integer integer0) {
            this.n = integer0;
            return this;
        }

        @a
        public Builder t0(@Nullable Rating rating0) {
            this.i = rating0;
            return this;
        }

        @a
        public Builder u0(@Nullable CharSequence charSequence0) {
            this.y = charSequence0;
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public Builder v0(@Nullable Integer integer0) {
            return this.j0(integer0);
        }
    }

    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface FolderType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface MediaType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface PictureType {
    }

    @Nullable
    public final CharSequence A;
    @Deprecated
    public static final int A0 = 6;
    private static final String A1 = null;
    @Nullable
    public final CharSequence B;
    public static final int B0 = 0;
    private static final String B1 = null;
    @Nullable
    public final Integer C;
    public static final int C0 = 1;
    private static final String C1 = null;
    @Nullable
    public final Integer D;
    public static final int D0 = 2;
    private static final String D1 = null;
    @Nullable
    public final CharSequence E;
    public static final int E0 = 3;
    private static final String E1 = null;
    @Nullable
    public final CharSequence F;
    public static final int F0 = 4;
    @Nullable
    public final CharSequence G;
    public static final int G0 = 5;
    @Nullable
    public final Integer H;
    public static final int H0 = 6;
    @Nullable
    public final Bundle I;
    public static final int I0 = 7;
    public static final int J = 0;
    public static final int J0 = 8;
    public static final int K = 1;
    public static final int K0 = 9;
    public static final int L = 2;
    public static final int L0 = 10;
    public static final int M = 3;
    public static final int M0 = 11;
    public static final int N = 4;
    public static final int N0 = 12;
    public static final int O = 5;
    public static final int O0 = 13;
    public static final int P = 6;
    public static final int P0 = 14;
    public static final int Q = 7;
    public static final int Q0 = 15;
    public static final int R = 8;
    public static final int R0 = 16;
    public static final int S = 9;
    public static final int S0 = 17;
    public static final int T = 10;
    public static final int T0 = 18;
    public static final int U = 11;
    public static final int U0 = 19;
    public static final int V = 12;
    public static final int V0 = 20;
    public static final int W = 13;
    public static final MediaMetadata W0 = null;
    public static final int X = 14;
    private static final String X0 = null;
    public static final int Y = 15;
    private static final String Y0 = null;
    public static final int Z = 16;
    private static final String Z0 = null;
    @Nullable
    public final CharSequence a;
    public static final int a0 = 17;
    private static final String a1 = null;
    @Nullable
    public final CharSequence b;
    public static final int b0 = 18;
    private static final String b1 = null;
    @Nullable
    public final CharSequence c;
    public static final int c0 = 19;
    private static final String c1 = null;
    @Nullable
    public final CharSequence d;
    public static final int d0 = 20;
    private static final String d1 = null;
    @Nullable
    public final CharSequence e;
    public static final int e0 = 21;
    private static final String e1 = null;
    @Nullable
    public final CharSequence f;
    public static final int f0 = 22;
    private static final String f1 = null;
    @Nullable
    public final CharSequence g;
    public static final int g0 = 23;
    private static final String g1 = null;
    @Nullable
    @UnstableApi
    public final Long h;
    public static final int h0 = 24;
    private static final String h1 = null;
    @Nullable
    public final Rating i;
    public static final int i0 = 25;
    private static final String i1 = null;
    @Nullable
    public final Rating j;
    public static final int j0 = 26;
    private static final String j1 = null;
    @Nullable
    public final byte[] k;
    public static final int k0 = 27;
    private static final String k1 = null;
    @Nullable
    public final Integer l;
    public static final int l0 = 28;
    private static final String l1 = null;
    @Nullable
    public final Uri m;
    public static final int m0 = 29;
    private static final String m1 = null;
    @Nullable
    public final Integer n;
    public static final int n0 = 30;
    private static final String n1 = null;
    @Nullable
    public final Integer o;
    public static final int o0 = 0x1F;
    private static final String o1 = null;
    @Nullable
    @Deprecated
    public final Integer p;
    public static final int p0 = 0x20;
    private static final String p1 = null;
    @Nullable
    public final Boolean q;
    public static final int q0 = 33;
    private static final String q1 = null;
    @Nullable
    public final Boolean r;
    public static final int r0 = 34;
    private static final String r1 = null;
    @Nullable
    @UnstableApi
    @Deprecated
    public final Integer s;
    public static final int s0 = 35;
    private static final String s1 = null;
    @Nullable
    public final Integer t;
    @Deprecated
    public static final int t0 = -1;
    private static final String t1 = null;
    @Nullable
    public final Integer u;
    @Deprecated
    public static final int u0 = 0;
    private static final String u1 = null;
    @Nullable
    public final Integer v;
    @Deprecated
    public static final int v0 = 1;
    private static final String v1 = null;
    @Nullable
    public final Integer w;
    @Deprecated
    public static final int w0 = 2;
    private static final String w1 = null;
    @Nullable
    public final Integer x;
    @Deprecated
    public static final int x0 = 3;
    private static final String x1 = null;
    @Nullable
    public final Integer y;
    @Deprecated
    public static final int y0 = 4;
    private static final String y1 = null;
    @Nullable
    public final CharSequence z;
    @Deprecated
    public static final int z0 = 5;
    private static final String z1;

    static {
        MediaMetadata.W0 = new Builder().I();
        MediaMetadata.X0 = "0";
        MediaMetadata.Y0 = "1";
        MediaMetadata.Z0 = "2";
        MediaMetadata.a1 = "3";
        MediaMetadata.b1 = "4";
        MediaMetadata.c1 = "5";
        MediaMetadata.d1 = "6";
        MediaMetadata.e1 = "8";
        MediaMetadata.f1 = "9";
        MediaMetadata.g1 = "a";
        MediaMetadata.h1 = "b";
        MediaMetadata.i1 = "c";
        MediaMetadata.j1 = "d";
        MediaMetadata.k1 = "e";
        MediaMetadata.l1 = "f";
        MediaMetadata.m1 = "g";
        MediaMetadata.n1 = "h";
        MediaMetadata.o1 = "i";
        MediaMetadata.p1 = "j";
        MediaMetadata.q1 = "k";
        MediaMetadata.r1 = "l";
        MediaMetadata.s1 = "m";
        MediaMetadata.t1 = "n";
        MediaMetadata.u1 = "o";
        MediaMetadata.v1 = "p";
        MediaMetadata.w1 = "q";
        MediaMetadata.x1 = "r";
        MediaMetadata.y1 = "s";
        MediaMetadata.z1 = "t";
        MediaMetadata.A1 = "u";
        MediaMetadata.B1 = "v";
        MediaMetadata.C1 = "w";
        MediaMetadata.D1 = "x";
        MediaMetadata.E1 = "rs";
    }

    private MediaMetadata(Builder mediaMetadata$Builder0) {
        Boolean boolean0 = mediaMetadata$Builder0.q;
        Integer integer0 = mediaMetadata$Builder0.p;
        Integer integer1 = mediaMetadata$Builder0.G;
        boolean z = false;
        if(boolean0 == null) {
            if(integer0 != null) {
                if(((int)integer0) != -1) {
                    z = true;
                }
                boolean0 = Boolean.valueOf(z);
                if(z && integer1 == null) {
                    integer1 = MediaMetadata.d(((int)integer0));
                }
            }
        }
        else if(!boolean0.booleanValue()) {
            integer0 = -1;
        }
        else if(integer0 == null || ((int)integer0) == -1) {
            if(integer1 != null) {
                z = MediaMetadata.c(((int)integer1));
            }
            integer0 = (int)z;
        }
        this.a = mediaMetadata$Builder0.a;
        this.b = mediaMetadata$Builder0.b;
        this.c = mediaMetadata$Builder0.c;
        this.d = mediaMetadata$Builder0.d;
        this.e = mediaMetadata$Builder0.e;
        this.f = mediaMetadata$Builder0.f;
        this.g = mediaMetadata$Builder0.g;
        this.h = mediaMetadata$Builder0.h;
        this.i = mediaMetadata$Builder0.i;
        this.j = mediaMetadata$Builder0.j;
        this.k = mediaMetadata$Builder0.k;
        this.l = mediaMetadata$Builder0.l;
        this.m = mediaMetadata$Builder0.m;
        this.n = mediaMetadata$Builder0.n;
        this.o = mediaMetadata$Builder0.o;
        this.p = integer0;
        this.q = boolean0;
        this.r = mediaMetadata$Builder0.r;
        this.s = mediaMetadata$Builder0.s;
        this.t = mediaMetadata$Builder0.s;
        this.u = mediaMetadata$Builder0.t;
        this.v = mediaMetadata$Builder0.u;
        this.w = mediaMetadata$Builder0.v;
        this.x = mediaMetadata$Builder0.w;
        this.y = mediaMetadata$Builder0.x;
        this.z = mediaMetadata$Builder0.y;
        this.A = mediaMetadata$Builder0.z;
        this.B = mediaMetadata$Builder0.A;
        this.C = mediaMetadata$Builder0.B;
        this.D = mediaMetadata$Builder0.C;
        this.E = mediaMetadata$Builder0.D;
        this.F = mediaMetadata$Builder0.E;
        this.G = mediaMetadata$Builder0.F;
        this.H = integer1;
        this.I = mediaMetadata$Builder0.H;
    }

    MediaMetadata(Builder mediaMetadata$Builder0, androidx.media3.common.MediaMetadata.1 mediaMetadata$10) {
        this(mediaMetadata$Builder0);
    }

    public Builder a() {
        return new Builder(this, null);
    }

    // 去混淆评级： 低(30)
    @UnstableApi
    public static MediaMetadata b(Bundle bundle0) {
        Builder mediaMetadata$Builder0 = new Builder();
        mediaMetadata$Builder0.p0(bundle0.getCharSequence("0")).P(bundle0.getCharSequence("1")).O(bundle0.getCharSequence("2")).N(bundle0.getCharSequence("3")).Y(bundle0.getCharSequence("4")).o0(bundle0.getCharSequence("5")).W(bundle0.getCharSequence("6")).R(bundle0.getByteArray("a"), (bundle0.containsKey("t") ? bundle0.getInt("t") : null)).S(((Uri)bundle0.getParcelable("b"))).u0(bundle0.getCharSequence("m")).U(bundle0.getCharSequence("n")).V(bundle0.getCharSequence("o")).c0(bundle0.getCharSequence("r")).T(bundle0.getCharSequence("s")).n0(bundle0.getCharSequence("u")).a0(bundle0.getBundle("rs"));
        if(bundle0.containsKey("8")) {
            Bundle bundle1 = bundle0.getBundle("8");
            if(bundle1 != null) {
                mediaMetadata$Builder0.t0(Rating.a(bundle1));
            }
        }
        if(bundle0.containsKey("9")) {
            Bundle bundle2 = bundle0.getBundle("9");
            if(bundle2 != null) {
                mediaMetadata$Builder0.g0(Rating.a(bundle2));
            }
        }
        if(bundle0.containsKey("x")) {
            mediaMetadata$Builder0.Z(bundle0.getLong("x"));
        }
        if(bundle0.containsKey("c")) {
            mediaMetadata$Builder0.s0(bundle0.getInt("c"));
        }
        if(bundle0.containsKey("d")) {
            mediaMetadata$Builder0.r0(bundle0.getInt("d"));
        }
        if(bundle0.containsKey("e")) {
            mediaMetadata$Builder0.b0(bundle0.getInt("e"));
        }
        if(bundle0.containsKey("w")) {
            mediaMetadata$Builder0.d0(Boolean.valueOf(bundle0.getBoolean("w")));
        }
        if(bundle0.containsKey("f")) {
            mediaMetadata$Builder0.e0(Boolean.valueOf(bundle0.getBoolean("f")));
        }
        if(bundle0.containsKey("g")) {
            mediaMetadata$Builder0.j0(bundle0.getInt("g"));
        }
        if(bundle0.containsKey("h")) {
            mediaMetadata$Builder0.i0(bundle0.getInt("h"));
        }
        if(bundle0.containsKey("i")) {
            mediaMetadata$Builder0.h0(bundle0.getInt("i"));
        }
        if(bundle0.containsKey("j")) {
            mediaMetadata$Builder0.m0(bundle0.getInt("j"));
        }
        if(bundle0.containsKey("k")) {
            mediaMetadata$Builder0.l0(bundle0.getInt("k"));
        }
        if(bundle0.containsKey("l")) {
            mediaMetadata$Builder0.k0(bundle0.getInt("l"));
        }
        if(bundle0.containsKey("p")) {
            mediaMetadata$Builder0.X(bundle0.getInt("p"));
        }
        if(bundle0.containsKey("q")) {
            mediaMetadata$Builder0.q0(bundle0.getInt("q"));
        }
        if(bundle0.containsKey("v")) {
            mediaMetadata$Builder0.f0(bundle0.getInt("v"));
        }
        return mediaMetadata$Builder0.I();
    }

    private static int c(int v) {
        switch(v) {
            case 21: {
                return 2;
            }
            case 22: {
                return 3;
            }
            case 23: {
                return 4;
            }
            case 24: {
                return 5;
            }
            case 25: {
                return 6;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    private static int d(int v) {
        switch(v) {
            case 1: {
                return 0;
            }
            case 2: {
                return 21;
            }
            case 3: {
                return 22;
            }
            case 4: {
                return 23;
            }
            case 5: {
                return 24;
            }
            case 6: {
                return 25;
            }
            default: {
                return 20;
            }
        }
    }

    @UnstableApi
    public Bundle e() {
        Bundle bundle0 = new Bundle();
        CharSequence charSequence0 = this.a;
        if(charSequence0 != null) {
            bundle0.putCharSequence(MediaMetadata.X0, charSequence0);
        }
        CharSequence charSequence1 = this.b;
        if(charSequence1 != null) {
            bundle0.putCharSequence(MediaMetadata.Y0, charSequence1);
        }
        CharSequence charSequence2 = this.c;
        if(charSequence2 != null) {
            bundle0.putCharSequence(MediaMetadata.Z0, charSequence2);
        }
        CharSequence charSequence3 = this.d;
        if(charSequence3 != null) {
            bundle0.putCharSequence(MediaMetadata.a1, charSequence3);
        }
        CharSequence charSequence4 = this.e;
        if(charSequence4 != null) {
            bundle0.putCharSequence(MediaMetadata.b1, charSequence4);
        }
        CharSequence charSequence5 = this.f;
        if(charSequence5 != null) {
            bundle0.putCharSequence(MediaMetadata.c1, charSequence5);
        }
        CharSequence charSequence6 = this.g;
        if(charSequence6 != null) {
            bundle0.putCharSequence(MediaMetadata.d1, charSequence6);
        }
        Long long0 = this.h;
        if(long0 != null) {
            bundle0.putLong(MediaMetadata.D1, ((long)long0));
        }
        byte[] arr_b = this.k;
        if(arr_b != null) {
            bundle0.putByteArray(MediaMetadata.g1, arr_b);
        }
        Uri uri0 = this.m;
        if(uri0 != null) {
            bundle0.putParcelable(MediaMetadata.h1, uri0);
        }
        CharSequence charSequence7 = this.z;
        if(charSequence7 != null) {
            bundle0.putCharSequence(MediaMetadata.s1, charSequence7);
        }
        CharSequence charSequence8 = this.A;
        if(charSequence8 != null) {
            bundle0.putCharSequence(MediaMetadata.t1, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if(charSequence9 != null) {
            bundle0.putCharSequence(MediaMetadata.u1, charSequence9);
        }
        CharSequence charSequence10 = this.E;
        if(charSequence10 != null) {
            bundle0.putCharSequence(MediaMetadata.x1, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if(charSequence11 != null) {
            bundle0.putCharSequence(MediaMetadata.y1, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if(charSequence12 != null) {
            bundle0.putCharSequence(MediaMetadata.A1, charSequence12);
        }
        Rating rating0 = this.i;
        if(rating0 != null) {
            Bundle bundle1 = rating0.c();
            bundle0.putBundle(MediaMetadata.e1, bundle1);
        }
        Rating rating1 = this.j;
        if(rating1 != null) {
            Bundle bundle2 = rating1.c();
            bundle0.putBundle(MediaMetadata.f1, bundle2);
        }
        Integer integer0 = this.n;
        if(integer0 != null) {
            bundle0.putInt(MediaMetadata.i1, ((int)integer0));
        }
        Integer integer1 = this.o;
        if(integer1 != null) {
            bundle0.putInt(MediaMetadata.j1, ((int)integer1));
        }
        Integer integer2 = this.p;
        if(integer2 != null) {
            bundle0.putInt(MediaMetadata.k1, ((int)integer2));
        }
        Boolean boolean0 = this.q;
        if(boolean0 != null) {
            bundle0.putBoolean(MediaMetadata.C1, boolean0.booleanValue());
        }
        Boolean boolean1 = this.r;
        if(boolean1 != null) {
            bundle0.putBoolean(MediaMetadata.l1, boolean1.booleanValue());
        }
        Integer integer3 = this.t;
        if(integer3 != null) {
            bundle0.putInt(MediaMetadata.m1, ((int)integer3));
        }
        Integer integer4 = this.u;
        if(integer4 != null) {
            bundle0.putInt(MediaMetadata.n1, ((int)integer4));
        }
        Integer integer5 = this.v;
        if(integer5 != null) {
            bundle0.putInt(MediaMetadata.o1, ((int)integer5));
        }
        Integer integer6 = this.w;
        if(integer6 != null) {
            bundle0.putInt(MediaMetadata.p1, ((int)integer6));
        }
        Integer integer7 = this.x;
        if(integer7 != null) {
            bundle0.putInt(MediaMetadata.q1, ((int)integer7));
        }
        Integer integer8 = this.y;
        if(integer8 != null) {
            bundle0.putInt(MediaMetadata.r1, ((int)integer8));
        }
        Integer integer9 = this.C;
        if(integer9 != null) {
            bundle0.putInt(MediaMetadata.v1, ((int)integer9));
        }
        Integer integer10 = this.D;
        if(integer10 != null) {
            bundle0.putInt(MediaMetadata.w1, ((int)integer10));
        }
        Integer integer11 = this.l;
        if(integer11 != null) {
            bundle0.putInt(MediaMetadata.z1, ((int)integer11));
        }
        Integer integer12 = this.H;
        if(integer12 != null) {
            bundle0.putInt(MediaMetadata.B1, ((int)integer12));
        }
        Bundle bundle3 = this.I;
        if(bundle3 != null) {
            bundle0.putBundle(MediaMetadata.E1, bundle3);
        }
        return bundle0;
    }

    // 去混淆评级： 低(43)
    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(MediaMetadata.class == class0) {
                MediaMetadata mediaMetadata0 = (MediaMetadata)object0;
                return !Util.g(this.a, mediaMetadata0.a) || !Util.g(this.b, mediaMetadata0.b) || !Util.g(this.c, mediaMetadata0.c) || !Util.g(this.d, mediaMetadata0.d) || !Util.g(this.e, mediaMetadata0.e) || !Util.g(this.f, mediaMetadata0.f) || !Util.g(this.g, mediaMetadata0.g) || !Util.g(this.h, mediaMetadata0.h) || !Util.g(this.i, mediaMetadata0.i) || !Util.g(this.j, mediaMetadata0.j) || !Arrays.equals(this.k, mediaMetadata0.k) || !Util.g(this.l, mediaMetadata0.l) || !Util.g(this.m, mediaMetadata0.m) || !Util.g(this.n, mediaMetadata0.n) || !Util.g(this.o, mediaMetadata0.o) || !Util.g(this.p, mediaMetadata0.p) || !Util.g(this.q, mediaMetadata0.q) || !Util.g(this.r, mediaMetadata0.r) || !Util.g(this.t, mediaMetadata0.t) || !Util.g(this.u, mediaMetadata0.u) || !Util.g(this.v, mediaMetadata0.v) || !Util.g(this.w, mediaMetadata0.w) || !Util.g(this.x, mediaMetadata0.x) || !Util.g(this.y, mediaMetadata0.y) || !Util.g(this.z, mediaMetadata0.z) || !Util.g(this.A, mediaMetadata0.A) || !Util.g(this.B, mediaMetadata0.B) || !Util.g(this.C, mediaMetadata0.C) || !Util.g(this.D, mediaMetadata0.D) || !Util.g(this.E, mediaMetadata0.E) || !Util.g(this.F, mediaMetadata0.F) || !Util.g(this.G, mediaMetadata0.G) || !Util.g(this.H, mediaMetadata0.H) ? false : (this.I == null ? 1 : 0) == (mediaMetadata0.I == null ? 1 : 0);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        Integer integer0 = Arrays.hashCode(this.k);
        return this.I == null ? B.b(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, integer0, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.TRUE}) : B.b(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, integer0, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.FALSE});
    }

    class androidx.media3.common.MediaMetadata.1 {
    }

}

