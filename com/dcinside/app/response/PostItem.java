package com.dcinside.app.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public final class PostItem implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public PostItem a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new PostItem(parcel0);
        }

        @l
        public PostItem[] b(int v) {
            return new PostItem[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @n
        public final boolean a(@m PostItem postItem0) {
            return postItem0 != null && L.g("Y", postItem0.D());
        }

        @n
        public final boolean b(@m PostItem postItem0) {
            return postItem0 != null && L.g("Y", postItem0.a());
        }

        @n
        public final boolean c(@m PostItem postItem0) {
            return postItem0 != null && L.g("Y", postItem0.r());
        }

        @n
        public final boolean d(@m PostItem postItem0) {
            return postItem0 != null && L.g("Y", postItem0.s());
        }

        @n
        public final boolean e(@m PostItem postItem0) {
            return postItem0 != null && L.g("Y", postItem0.b0());
        }

        @n
        public final boolean f(@m PostItem postItem0) {
            return postItem0 != null && L.g("Y", postItem0.e0());
        }

        @n
        public final boolean g(@m PostItem postItem0) {
            return postItem0 != null && L.g("Y", postItem0.O());
        }

        @n
        public final boolean h(@m PostItem postItem0) {
            return postItem0 != null && L.g("Y", postItem0.P());
        }
    }

    @c("poll_icon")
    private final boolean A;
    @c("fixtop")
    private final boolean B;
    @c("secret")
    private final boolean C;
    @l
    @f
    public static final Parcelable.Creator CREATOR;
    @c("del_plan")
    private final boolean D;
    @c("movie_icon")
    @m
    private final String E;
    @c("realtime_chk")
    @m
    private final String F;
    @c("realtime_l_chk")
    @m
    private final String G;
    @c("realtime_color_icon")
    private final boolean H;
    @c("adult_icon")
    private final boolean I;
    @c("comment_memo")
    @m
    private String J;
    @c("comment_no")
    private final int K;
    @c("img_no")
    @m
    private final String L;
    @c("gall_name")
    @m
    private final String M;
    @l
    public static final b M8;
    @c("ai_icon")
    private final boolean N;
    @c("spoiler")
    @m
    private String O;
    @c("is_spoiler_headtext")
    private final boolean P;
    @c("headnum")
    @m
    private String Q;
    @com.dcinside.app.util.Ik.a
    private boolean X;
    @com.dcinside.app.util.Ik.a
    private int Y;
    @com.dcinside.app.util.Ik.a
    private int Z;
    @c("result")
    @m
    private final String a;
    @c("cause")
    @m
    private final String b;
    @c("subject")
    @m
    private String c;
    @c("name")
    @m
    private String d;
    @c("img_icon")
    @m
    private final String e;
    @c("recommend")
    private final int f;
    @c("voice_icon")
    @m
    private final String g;
    @c("winnerta_icon")
    @m
    private final String h;
    @c("recommend_icon")
    @m
    private final String i;
    @c("hit_chk")
    @m
    private final String j;
    @c("best_chk")
    @m
    private final String k;
    @c("hit")
    private final int l;
    @c("user_id")
    @m
    private final String m;
    @c("member_icon")
    private final int n;
    @c("gallercon")
    @m
    private final String o;
    @c("total_comment")
    private final int p;
    @c("total_voice")
    private final int q;
    @c("no")
    private final int r;
    @c("date_time")
    @m
    private final String s;
    @c("ip")
    @m
    private final String t;
    @c("level")
    @m
    private final String u;
    @c("notify_link")
    @m
    private final String v;
    @c("headtext")
    @m
    private final String w;
    @c("memo")
    @m
    private final String x;
    @c("thumbnail")
    @m
    private final String y;
    @c("auto_del")
    private final boolean z;

    static {
        PostItem.M8 = new b(null);
        PostItem.CREATOR = new a();
    }

    public PostItem() {
        this(null, null, null, null, null, 0, null, null, null, null, null, 0, null, 0, null, 0, 0, 0, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, false, false, null, 0, null, null, false, null, false, null, false, 0, 0, -1, 0x3FFF, null);
    }

    public PostItem(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readInt(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readInt(), parcel0.readString(), parcel0.readInt(), parcel0.readString(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), 1 == parcel0.readInt(), 1 == parcel0.readInt(), 1 == parcel0.readInt(), 1 == parcel0.readInt(), 1 == parcel0.readInt(), parcel0.readString(), parcel0.readString(), parcel0.readString(), 1 == parcel0.readInt(), 1 == parcel0.readInt(), parcel0.readString(), parcel0.readInt(), parcel0.readString(), parcel0.readString(), 1 == parcel0.readInt(), parcel0.readString(), 1 == parcel0.readInt(), parcel0.readString(), 1 == parcel0.readInt(), parcel0.readInt(), parcel0.readInt());
    }

    public PostItem(@m String s, @m String s1, @m String s2, @m String s3, @m String s4, int v, @m String s5, @m String s6, @m String s7, @m String s8, @m String s9, int v1, @m String s10, int v2, @m String s11, int v3, int v4, int v5, @m String s12, @m String s13, @m String s14, @m String s15, @m String s16, @m String s17, @m String s18, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, @m String s19, @m String s20, @m String s21, boolean z5, boolean z6, @m String s22, int v6, @m String s23, @m String s24, boolean z7, @m String s25, boolean z8, @m String s26, boolean z9, int v7, int v8) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = v;
        this.g = s5;
        this.h = s6;
        this.i = s7;
        this.j = s8;
        this.k = s9;
        this.l = v1;
        this.m = s10;
        this.n = v2;
        this.o = s11;
        this.p = v3;
        this.q = v4;
        this.r = v5;
        this.s = s12;
        this.t = s13;
        this.u = s14;
        this.v = s15;
        this.w = s16;
        this.x = s17;
        this.y = s18;
        this.z = z;
        this.A = z1;
        this.B = z2;
        this.C = z3;
        this.D = z4;
        this.E = s19;
        this.F = s20;
        this.G = s21;
        this.H = z5;
        this.I = z6;
        this.J = s22;
        this.K = v6;
        this.L = s23;
        this.M = s24;
        this.N = z7;
        this.O = s25;
        this.P = z8;
        this.Q = s26;
        this.X = z9;
        this.Y = v7;
        this.Z = v8;
    }

    public PostItem(String s, String s1, String s2, String s3, String s4, int v, String s5, String s6, String s7, String s8, String s9, int v1, String s10, int v2, String s11, int v3, int v4, int v5, String s12, String s13, String s14, String s15, String s16, String s17, String s18, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, String s19, String s20, String s21, boolean z5, boolean z6, String s22, int v6, String s23, String s24, boolean z7, String s25, boolean z8, String s26, boolean z9, int v7, int v8, int v9, int v10, w w0) {
        this(((v9 & 1) == 0 ? s : null), ((v9 & 2) == 0 ? s1 : null), ((v9 & 4) == 0 ? s2 : null), ((v9 & 8) == 0 ? s3 : null), ((v9 & 16) == 0 ? s4 : null), ((v9 & 0x20) == 0 ? v : 0), ((v9 & 0x40) == 0 ? s5 : null), ((v9 & 0x80) == 0 ? s6 : null), ((v9 & 0x100) == 0 ? s7 : null), ((v9 & 0x200) == 0 ? s8 : null), ((v9 & 0x400) == 0 ? s9 : null), ((v9 & 0x800) == 0 ? v1 : 0), ((v9 & 0x1000) == 0 ? s10 : null), ((v9 & 0x2000) == 0 ? v2 : 0), ((v9 & 0x4000) == 0 ? s11 : null), ((v9 & 0x8000) == 0 ? v3 : 0), ((v9 & 0x10000) == 0 ? v4 : 0), ((v9 & 0x20000) == 0 ? v5 : 0), ((v9 & 0x40000) == 0 ? s12 : null), ((v9 & 0x80000) == 0 ? s13 : null), ((v9 & 0x100000) == 0 ? s14 : null), ((v9 & 0x200000) == 0 ? s15 : null), ((v9 & 0x400000) == 0 ? s16 : null), ((v9 & 0x800000) == 0 ? s17 : null), ((v9 & 0x1000000) == 0 ? s18 : null), ((v9 & 0x2000000) == 0 ? z : false), ((v9 & 0x4000000) == 0 ? z1 : false), ((v9 & 0x8000000) == 0 ? z2 : false), ((v9 & 0x10000000) == 0 ? z3 : false), ((v9 & 0x20000000) == 0 ? z4 : false), ((v9 & 0x40000000) == 0 ? s19 : null), ((v9 & 0x80000000) == 0 ? s20 : null), ((v10 & 1) == 0 ? s21 : null), ((v10 & 2) == 0 ? z5 : false), ((v10 & 4) == 0 ? z6 : false), ((v10 & 8) == 0 ? s22 : null), ((v10 & 16) == 0 ? v6 : 0), ((v10 & 0x20) == 0 ? s23 : null), ((v10 & 0x40) == 0 ? s24 : null), ((v10 & 0x80) == 0 ? z7 : false), ((v10 & 0x100) == 0 ? s25 : null), ((v10 & 0x200) == 0 ? z8 : false), ((v10 & 0x400) == 0 ? s26 : null), ((v10 & 0x800) == 0 ? z9 : false), ((v10 & 0x1000) == 0 ? v7 : 0), ((v10 & 0x2000) == 0 ? v8 : 0));
    }

    @m
    public final String A() {
        return this.v;
    }

    public final int B() {
        return this.Z;
    }

    public final int C() {
        return this.r;
    }

    @m
    public final String D() {
        return this.i;
    }

    @n
    public static final boolean E(@m PostItem postItem0) {
        return PostItem.M8.a(postItem0);
    }

    public final int F() {
        return this.f;
    }

    public final int G() {
        return this.p;
    }

    public final int H() {
        return this.q;
    }

    @m
    public final String I() {
        return this.a;
    }

    @m
    public final String J() {
        return this.O;
    }

    @m
    public final String K() {
        return this.c;
    }

    @m
    public final String L() {
        return this.y;
    }

    public final int M() {
        return this.Y;
    }

    @m
    public final String N() {
        return this.m;
    }

    @m
    public final String O() {
        return this.E;
    }

    @m
    public final String P() {
        return this.g;
    }

    @m
    public final String S() {
        return this.h;
    }

    public final boolean U() {
        return this.I;
    }

    public final boolean V() {
        return this.N;
    }

    public final boolean W() {
        return this.z;
    }

    @n
    public static final boolean X(@m PostItem postItem0) {
        return PostItem.M8.b(postItem0);
    }

    public final boolean Y() {
        return this.B;
    }

    @n
    public static final boolean Z(@m PostItem postItem0) {
        return PostItem.M8.c(postItem0);
    }

    @m
    public final String a() {
        return this.k;
    }

    @n
    public static final boolean a0(@m PostItem postItem0) {
        return PostItem.M8.d(postItem0);
    }

    @m
    public final String b0() {
        return this.F;
    }

    public final boolean c() {
        return this.X;
    }

    @n
    public static final boolean c0(@m PostItem postItem0) {
        return PostItem.M8.e(postItem0);
    }

    @m
    public final String d() {
        return this.b;
    }

    public final boolean d0() {
        return this.H;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @m
    public final String e() {
        return this.J;
    }

    @m
    public final String e0() {
        return this.G;
    }

    public final int f() {
        return this.K;
    }

    @n
    public static final boolean f0(@m PostItem postItem0) {
        return PostItem.M8.f(postItem0);
    }

    @m
    public final String g() {
        return this.s;
    }

    public final boolean g0() {
        return this.C;
    }

    public final boolean h() {
        return this.D;
    }

    @m
    public final String i() {
        return this.M;
    }

    public final boolean i0() {
        return this.P;
    }

    @n
    public static final boolean j0(@m PostItem postItem0) {
        return PostItem.M8.g(postItem0);
    }

    @n
    public static final boolean k0(@m PostItem postItem0) {
        return PostItem.M8.h(postItem0);
    }

    public final boolean l() {
        return this.A;
    }

    public final void l0(boolean z) {
        this.X = z;
    }

    @m
    public final String m() {
        return this.w;
    }

    public final void m0(@m String s) {
        this.J = s;
    }

    public final void n0(@m String s) {
        this.Q = s;
    }

    @m
    public final String o() {
        return this.Q;
    }

    public final void o0(@m String s) {
        this.d = s;
    }

    public final void p0(int v) {
        this.Z = v;
    }

    public final int q() {
        return this.l;
    }

    public final void q0(@m String s) {
        this.O = s;
    }

    @m
    public final String r() {
        return this.j;
    }

    public final void r0(@m String s) {
        this.c = s;
    }

    @m
    public final String s() {
        return this.e;
    }

    public final void s0(int v) {
        this.Y = v;
    }

    @m
    public final String t() {
        return this.L;
    }

    @m
    public final String u() {
        return this.t;
    }

    @m
    public final String v() {
        return this.u;
    }

    @m
    public final String w() {
        return this.o;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeString(this.e);
        parcel0.writeInt(this.f);
        parcel0.writeString(this.g);
        parcel0.writeString(this.h);
        parcel0.writeString(this.i);
        parcel0.writeString(this.j);
        parcel0.writeString(this.k);
        parcel0.writeInt(this.l);
        parcel0.writeString(this.m);
        parcel0.writeInt(this.n);
        parcel0.writeString(this.o);
        parcel0.writeInt(this.p);
        parcel0.writeInt(this.q);
        parcel0.writeInt(this.r);
        parcel0.writeString(this.s);
        parcel0.writeString(this.t);
        parcel0.writeString(this.u);
        parcel0.writeString(this.v);
        parcel0.writeString(this.w);
        parcel0.writeString(this.x);
        parcel0.writeString(this.y);
        parcel0.writeInt(((int)this.z));
        parcel0.writeInt(((int)this.A));
        parcel0.writeInt(((int)this.B));
        parcel0.writeInt(((int)this.C));
        parcel0.writeInt(((int)this.D));
        parcel0.writeString(this.E);
        parcel0.writeString(this.F);
        parcel0.writeString(this.G);
        parcel0.writeInt(((int)this.H));
        parcel0.writeInt(((int)this.I));
        parcel0.writeString(this.J);
        parcel0.writeInt(this.K);
        parcel0.writeString(this.L);
        parcel0.writeString(this.M);
        parcel0.writeInt(((int)this.N));
        parcel0.writeString(this.O);
        parcel0.writeInt(((int)this.P));
        parcel0.writeString(this.Q);
        parcel0.writeInt(((int)this.X));
        parcel0.writeInt(this.Y);
        parcel0.writeInt(this.Z);
    }

    public final int x() {
        return this.n;
    }

    @m
    public final String y() {
        return this.x;
    }

    @m
    public final String z() {
        return this.d;
    }
}

