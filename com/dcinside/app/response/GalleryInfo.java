package com.dcinside.app.response;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.dcinside.app.model.ProfileInfo;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class GalleryInfo implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public GalleryInfo a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new GalleryInfo(parcel0);
        }

        @l
        public GalleryInfo[] b(int v) {
            return new GalleryInfo[v];
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

        public final boolean a(@m GalleryInfo galleryInfo0, @m String s) {
            return (galleryInfo0 == null ? null : galleryInfo0.A()) != null && L.g(galleryInfo0.A(), s);
        }
    }

    @c("gall_hide")
    private boolean A;
    @c("profile_img")
    @m
    private String B;
    @c("member_grant")
    private int C;
    @l
    @f
    public static final Parcelable.Creator CREATOR;
    @c("use_auto_delete")
    @m
    private String D;
    @c("use_secret")
    @m
    private String E;
    @c("anonymous")
    @m
    private String F;
    @c("use_relation_no")
    @m
    private String G;
    @c("use_list_fix")
    @m
    private String H;
    @c("is_mini")
    private boolean I;
    @c("auto_refresh_enable")
    private boolean J;
    @c("use_ai_write")
    private boolean K;
    @c("gall_nickname")
    @m
    private String L;
    @c("allowWordFlag")
    private boolean M;
    @com.dcinside.app.util.Ik.a
    @m
    private String M8;
    @c("must_read")
    @m
    private MustRead N;
    @com.dcinside.app.util.Ik.a
    @m
    private String N8;
    @c("is_person")
    private final boolean O;
    @com.dcinside.app.util.Ik.a
    @m
    private String O8;
    @c("is_prgall_certified")
    private final boolean P;
    @com.dcinside.app.util.Ik.a
    @l
    private com.dcinside.app.type.m P8;
    @c("prgall_profile")
    @m
    private final List Q;
    @l
    public static final b Q8;
    @c("prgall_img")
    @m
    private final String X;
    @c("realname_gall")
    private final boolean Y;
    @com.dcinside.app.util.Ik.a
    @m
    private List Z;
    @c("category")
    private int a;
    @c("gall_title")
    @m
    private String b;
    @c("file_cnt")
    private int c;
    @c("file_size")
    private long d;
    @c("is_minor")
    private boolean e;
    @c("ser_total_page")
    private int f;
    @c("ser_pos")
    @m
    private String g;
    @c("no_write")
    private boolean h;
    @c("captcha")
    private boolean i;
    @c("code_count")
    private int j;
    @c("is_adult")
    private boolean k;
    @c("is_lady")
    private int l;
    @c("relation_gall")
    @m
    private Map m;
    @c("notify_recent")
    @m
    private String n;
    @c("head_text")
    @m
    private List o;
    @c("placeholder")
    @m
    private List p;
    @c("managerskill")
    private boolean q;
    @c("manager_alarm")
    @m
    private String r;
    @c("manager_situation")
    @m
    private String s;
    @c("minor_danger")
    @m
    private String t;
    @c("gall_state_grant")
    @m
    private String u;
    @c("membership")
    private boolean v;
    @c("total_member")
    private int w;
    @c("member_state")
    private int x;
    @c("member_join")
    private boolean y;
    @c("member_limit")
    private int z;

    static {
        GalleryInfo.Q8 = new b(null);
        GalleryInfo.CREATOR = new a();
    }

    public GalleryInfo() {
        this(0, null, 0, 0L, false, 0, null, false, false, 0, false, 0, null, null, null, null, false, null, null, null, null, false, 0, 0, false, 0, false, null, 0, null, null, null, null, null, false, false, false, null, false, null, false, false, null, null, false, null, null, null, null, null, -1, 0x3FFFF, null);
    }

    public GalleryInfo(int v, @m String s, int v1, long v2, boolean z, int v3, @m String s1, boolean z1, boolean z2, int v4, boolean z3, int v5, @m Map map0, @m String s2, @m List list0, @m List list1, boolean z4, @m String s3, @m String s4, @m String s5, @m String s6, boolean z5, int v6, int v7, boolean z6, int v8, boolean z7, @m String s7, int v9, @m String s8, @m String s9, @m String s10, @m String s11, @m String s12, boolean z8, boolean z9, boolean z10, @m String s13, boolean z11, @m MustRead mustRead0, boolean z12, boolean z13, @m List list2, @m String s14, boolean z14, @m List list3, @m String s15, @m String s16, @m String s17, @l com.dcinside.app.type.m m0) {
        L.p(m0, "galleryGrade");
        super();
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = z;
        this.f = v3;
        this.g = s1;
        this.h = z1;
        this.i = z2;
        this.j = v4;
        this.k = z3;
        this.l = v5;
        this.m = map0;
        this.n = s2;
        this.o = list0;
        this.p = list1;
        this.q = z4;
        this.r = s3;
        this.s = s4;
        this.t = s5;
        this.u = s6;
        this.v = z5;
        this.w = v6;
        this.x = v7;
        this.y = z6;
        this.z = v8;
        this.A = z7;
        this.B = s7;
        this.C = v9;
        this.D = s8;
        this.E = s9;
        this.F = s10;
        this.G = s11;
        this.H = s12;
        this.I = z8;
        this.J = z9;
        this.K = z10;
        this.L = s13;
        this.M = z11;
        this.N = mustRead0;
        this.O = z12;
        this.P = z13;
        this.Q = list2;
        this.X = s14;
        this.Y = z14;
        this.Z = list3;
        this.M8 = s15;
        this.N8 = s16;
        this.O8 = s17;
        this.P8 = m0;
    }

    public GalleryInfo(int v, String s, int v1, long v2, boolean z, int v3, String s1, boolean z1, boolean z2, int v4, boolean z3, int v5, Map map0, String s2, List list0, List list1, boolean z4, String s3, String s4, String s5, String s6, boolean z5, int v6, int v7, boolean z6, int v8, boolean z7, String s7, int v9, String s8, String s9, String s10, String s11, String s12, boolean z8, boolean z9, boolean z10, String s13, boolean z11, MustRead mustRead0, boolean z12, boolean z13, List list2, String s14, boolean z14, List list3, String s15, String s16, String s17, com.dcinside.app.type.m m0, int v10, int v11, w w0) {
        this(((v10 & 1) == 0 ? v : 0), ((v10 & 2) == 0 ? s : null), ((v10 & 4) == 0 ? v1 : 0), ((v10 & 8) == 0 ? v2 : 0L), ((v10 & 16) == 0 ? z : false), ((v10 & 0x20) == 0 ? v3 : 0), ((v10 & 0x40) == 0 ? s1 : null), ((v10 & 0x80) == 0 ? z1 : false), ((v10 & 0x100) == 0 ? z2 : false), ((v10 & 0x200) == 0 ? v4 : 0), ((v10 & 0x400) == 0 ? z3 : false), ((v10 & 0x800) == 0 ? v5 : 0), ((v10 & 0x1000) == 0 ? map0 : null), ((v10 & 0x2000) == 0 ? s2 : null), ((v10 & 0x4000) == 0 ? list0 : null), ((v10 & 0x8000) == 0 ? list1 : null), ((v10 & 0x10000) == 0 ? z4 : false), ((v10 & 0x20000) == 0 ? s3 : null), ((v10 & 0x40000) == 0 ? s4 : null), ((v10 & 0x80000) == 0 ? s5 : null), ((v10 & 0x100000) == 0 ? s6 : null), ((v10 & 0x200000) == 0 ? z5 : false), ((v10 & 0x400000) == 0 ? v6 : 0), ((v10 & 0x800000) == 0 ? v7 : -1), ((v10 & 0x1000000) == 0 ? z6 : false), ((v10 & 0x2000000) == 0 ? v8 : 0), ((v10 & 0x4000000) == 0 ? z7 : false), ((v10 & 0x8000000) == 0 ? s7 : null), ((v10 & 0x10000000) == 0 ? v9 : -9), ((v10 & 0x20000000) == 0 ? s8 : null), ((v10 & 0x40000000) == 0 ? s9 : null), ((v10 & 0x80000000) == 0 ? s10 : null), ((v11 & 1) == 0 ? s11 : null), ((v11 & 2) == 0 ? s12 : null), ((v11 & 4) == 0 ? z8 : false), ((v11 & 8) == 0 ? z9 : false), ((v11 & 16) == 0 ? z10 : false), ((v11 & 0x20) == 0 ? s13 : null), ((v11 & 0x40) == 0 ? z11 : false), ((v11 & 0x80) == 0 ? mustRead0 : null), ((v11 & 0x100) == 0 ? z12 : false), ((v11 & 0x200) == 0 ? z13 : false), ((v11 & 0x400) == 0 ? list2 : null), ((v11 & 0x800) == 0 ? s14 : null), ((v11 & 0x1000) == 0 ? z14 : false), ((v11 & 0x2000) == 0 ? list3 : null), ((v11 & 0x4000) == 0 ? s15 : null), ((v11 & 0x8000) == 0 ? s16 : null), ((v11 & 0x10000) == 0 ? s17 : null), ((v11 & 0x20000) == 0 ? m0 : com.dcinside.app.type.m.g));
    }

    public GalleryInfo(@l Parcel parcel0) {
        L.p(parcel0, "source");
        int v = parcel0.readInt();
        String s = parcel0.readString();
        int v1 = parcel0.readInt();
        long v2 = parcel0.readLong();
        boolean z = 1 == parcel0.readInt();
        int v3 = parcel0.readInt();
        String s1 = parcel0.readString();
        boolean z1 = 1 == parcel0.readInt();
        boolean z2 = 1 == parcel0.readInt();
        int v4 = parcel0.readInt();
        boolean z3 = 1 == parcel0.readInt();
        int v5 = parcel0.readInt();
        HashMap hashMap0 = new HashMap();
        int v6 = parcel0.readInt();
        for(int v7 = 0; v7 < v6; ++v7) {
            String s2 = parcel0.readString();
            String s3 = parcel0.readString();
            if(s2 != null && s3 != null) {
                hashMap0.put(s2, s3);
            }
        }
        String s4 = parcel0.readString();
        ArrayList arrayList0 = parcel0.createTypedArrayList(PostHead.CREATOR);
        ArrayList arrayList1 = parcel0.createTypedArrayList(PostHeadPlaceHolder.CREATOR);
        boolean z4 = 1 == parcel0.readInt();
        String s5 = parcel0.readString();
        String s6 = parcel0.readString();
        String s7 = parcel0.readString();
        String s8 = parcel0.readString();
        boolean z5 = 1 == parcel0.readInt();
        int v8 = parcel0.readInt();
        int v9 = parcel0.readInt();
        boolean z6 = 1 == parcel0.readInt();
        int v10 = parcel0.readInt();
        boolean z7 = 1 == parcel0.readInt();
        String s9 = parcel0.readString();
        int v11 = parcel0.readInt();
        String s10 = parcel0.readString();
        String s11 = parcel0.readString();
        String s12 = parcel0.readString();
        String s13 = parcel0.readString();
        String s14 = parcel0.readString();
        boolean z8 = 1 == parcel0.readInt();
        boolean z9 = 1 == parcel0.readInt();
        boolean z10 = 1 == parcel0.readInt();
        String s15 = parcel0.readString();
        boolean z11 = 1 == parcel0.readInt();
        MustRead mustRead0 = Build.VERSION.SDK_INT < 33 ? ((MustRead)parcel0.readParcelable(MustRead.class.getClassLoader())) : ((MustRead)parcel0.readParcelable(MustRead.class.getClassLoader(), MustRead.class));
        boolean z12 = 1 == parcel0.readInt();
        boolean z13 = 1 == parcel0.readInt();
        ArrayList arrayList2 = parcel0.createTypedArrayList(ProfileInfo.CREATOR);
        String s16 = parcel0.readString();
        boolean z14 = 1 == parcel0.readInt();
        ArrayList arrayList3 = parcel0.createTypedArrayList(ProfileInfo.CREATOR);
        String s17 = parcel0.readString();
        String s18 = parcel0.readString();
        String s19 = parcel0.readString();
        int v12 = parcel0.readInt();
        this(v, s, v1, v2, z, v3, s1, z1, z2, v4, z3, v5, hashMap0, s4, arrayList0, arrayList1, z4, s5, s6, s7, s8, z5, v8, v9, z6, v10, z7, s9, v11, s10, s11, s12, s13, s14, z8, z9, z10, s15, z11, mustRead0, z12, z13, arrayList2, s16, z14, arrayList3, s17, s18, s19, com.dcinside.app.type.m.d.a(v12));
    }

    @m
    public final String A() {
        return this.N8;
    }

    public final void A0(boolean z) {
        this.M = z;
    }

    @m
    public final String B() {
        return this.s;
    }

    public final void B0(@m List list0) {
        this.p = list0;
    }

    public final int C() {
        return this.c;
    }

    public final void C0(@m List list0) {
        this.o = list0;
    }

    public final long D() {
        return this.d;
    }

    public final void D0(boolean z) {
        this.y = z;
    }

    public final int E() {
        return this.w;
    }

    public final int F() {
        return this.x;
    }

    public final void F0(int v) {
        this.l = v;
    }

    public final int G() {
        return this.C;
    }

    public final void G0(int v) {
        this.z = v;
    }

    @m
    public final String H() {
        return this.t;
    }

    public final void H0(boolean z) {
        this.q = z;
    }

    @m
    public final MustRead I() {
        return this.N;
    }

    public final void I0(@m String s) {
        this.r = s;
    }

    public final boolean J() {
        return this.v;
    }

    public final void J0(@m String s) {
        this.N8 = s;
    }

    @m
    public final String K() {
        return this.n;
    }

    public final void K0(@m String s) {
        this.s = s;
    }

    @m
    public final String L() {
        return this.X;
    }

    public final void L0(int v) {
        this.c = v;
    }

    @m
    public final List M() {
        return this.Z;
    }

    public final void M0(long v) {
        this.d = v;
    }

    @m
    public final List N() {
        return this.Q;
    }

    public final void N0(int v) {
        this.w = v;
    }

    @m
    public final Map O() {
        return this.m;
    }

    public final void O0(int v) {
        this.x = v;
    }

    @m
    public final String P() {
        return this.g;
    }

    public final void P0(boolean z) {
        this.I = z;
    }

    public final void Q0(int v) {
        this.C = v;
    }

    public final void R0(boolean z) {
        this.e = z;
    }

    public final int S() {
        return this.f;
    }

    public final void S0(@m String s) {
        this.t = s;
    }

    public final void T0(@m MustRead mustRead0) {
        this.N = mustRead0;
    }

    public final boolean U() {
        return this.Y;
    }

    public final void U0(boolean z) {
        this.v = z;
    }

    public final boolean V() {
        return this.J;
    }

    public final void V0(@m String s) {
        this.n = s;
    }

    public final boolean W() {
        return this.P;
    }

    public final void W0(boolean z) {
        this.A = z;
    }

    @m
    public final String X() {
        return this.G;
    }

    public final void X0(@m List list0) {
        this.Z = list0;
    }

    @m
    public final String Y() {
        return this.D;
    }

    public final void Y0(@m Map map0) {
        this.m = map0;
    }

    @m
    public final String Z() {
        return this.E;
    }

    public final void Z0(@m String s) {
        this.g = s;
    }

    public final boolean a() {
        return this.k;
    }

    public final boolean a0() {
        return this.y;
    }

    public final boolean b0() {
        return this.q;
    }

    public final void b1(int v) {
        this.f = v;
    }

    @m
    public final String c() {
        return this.F;
    }

    public final boolean c0() {
        return this.I;
    }

    public final boolean d() {
        return this.h;
    }

    public final boolean d0() {
        return this.e;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @m
    public final String e() {
        return this.H;
    }

    public final boolean e0() {
        return this.O;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(GalleryInfo.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.dcinside.app.response.GalleryInfo");
        GalleryInfo galleryInfo0 = (GalleryInfo)object0;
        if(this.a != galleryInfo0.a) {
            return false;
        }
        if(!L.g(this.b, galleryInfo0.b)) {
            return false;
        }
        if(this.c != galleryInfo0.c) {
            return false;
        }
        if(this.d != galleryInfo0.d) {
            return false;
        }
        if(this.e != galleryInfo0.e) {
            return false;
        }
        if(this.f != galleryInfo0.f) {
            return false;
        }
        if(!L.g(this.g, galleryInfo0.g)) {
            return false;
        }
        if(this.h != galleryInfo0.h) {
            return false;
        }
        if(this.i != galleryInfo0.i) {
            return false;
        }
        if(this.j != galleryInfo0.j) {
            return false;
        }
        if(this.k != galleryInfo0.k) {
            return false;
        }
        if(this.l != galleryInfo0.l) {
            return false;
        }
        if(!L.g(this.m, galleryInfo0.m)) {
            return false;
        }
        if(galleryInfo0.n != null && !L.g(this.n, galleryInfo0.n)) {
            return false;
        }
        if(!L.g(this.o, galleryInfo0.o)) {
            return false;
        }
        if(!L.g(this.p, galleryInfo0.p)) {
            return false;
        }
        if(this.q != galleryInfo0.q) {
            return false;
        }
        if(!L.g(this.r, galleryInfo0.r)) {
            return false;
        }
        if(!L.g(this.s, galleryInfo0.s)) {
            return false;
        }
        if(!L.g(this.t, galleryInfo0.t)) {
            return false;
        }
        if(!L.g(this.u, galleryInfo0.u)) {
            return false;
        }
        if(this.v != galleryInfo0.v) {
            return false;
        }
        if(this.w != galleryInfo0.w) {
            return false;
        }
        if(this.x != galleryInfo0.x) {
            return false;
        }
        if(this.y != galleryInfo0.y) {
            return false;
        }
        if(this.z != galleryInfo0.z) {
            return false;
        }
        if(this.A != galleryInfo0.A) {
            return false;
        }
        if(!L.g(this.B, galleryInfo0.B)) {
            return false;
        }
        if(this.C != galleryInfo0.C) {
            return false;
        }
        if(!L.g(this.D, galleryInfo0.D)) {
            return false;
        }
        if(!L.g(this.E, galleryInfo0.E)) {
            return false;
        }
        if(!L.g(this.F, galleryInfo0.F)) {
            return false;
        }
        if(!L.g(this.G, galleryInfo0.G)) {
            return false;
        }
        if(!L.g(this.H, galleryInfo0.H)) {
            return false;
        }
        if(this.I != galleryInfo0.I) {
            return false;
        }
        if(this.J != galleryInfo0.J) {
            return false;
        }
        if(this.K != galleryInfo0.K) {
            return false;
        }
        if(!L.g(this.L, galleryInfo0.L)) {
            return false;
        }
        if(!L.g(this.N, galleryInfo0.N)) {
            return false;
        }
        if(this.O != galleryInfo0.O) {
            return false;
        }
        if(this.P != galleryInfo0.P) {
            return false;
        }
        if(!L.g(this.Q, galleryInfo0.Q)) {
            return false;
        }
        if(!L.g(this.X, galleryInfo0.X)) {
            return false;
        }
        if(this.Y != galleryInfo0.Y) {
            return false;
        }
        if(!L.g(this.Z, galleryInfo0.Z)) {
            return false;
        }
        if(!L.g(this.M8, galleryInfo0.M8)) {
            return false;
        }
        if(!L.g(this.N8, galleryInfo0.N8)) {
            return false;
        }
        return L.g(this.O8, galleryInfo0.O8) ? this.P8 == galleryInfo0.P8 : false;
    }

    public final boolean f() {
        return this.K;
    }

    public final boolean f0() {
        return this.A;
    }

    public final boolean g() {
        return this.i;
    }

    public final void g0(boolean z) {
        this.k = z;
    }

    public final int h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((((((((((((((((((((((((((((this.a * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + androidx.compose.foundation.c.a(this.e)) * 0x1F + this.f) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + androidx.compose.foundation.c.a(this.h)) * 0x1F + androidx.compose.foundation.c.a(this.i)) * 0x1F + this.j) * 0x1F + androidx.compose.foundation.c.a(this.k)) * 0x1F + this.l) * 0x1F + (this.m == null ? 0 : this.m.hashCode())) * 0x1F + (this.n == null ? 0 : this.n.hashCode())) * 0x1F + (this.o == null ? 0 : this.o.hashCode())) * 0x1F + (this.p == null ? 0 : this.p.hashCode())) * 0x1F + androidx.compose.foundation.c.a(this.q)) * 0x1F + (this.r == null ? 0 : this.r.hashCode())) * 0x1F + (this.s == null ? 0 : this.s.hashCode())) * 0x1F + (this.t == null ? 0 : this.t.hashCode())) * 0x1F + (this.u == null ? 0 : this.u.hashCode())) * 0x1F + androidx.compose.foundation.c.a(this.v)) * 0x1F + this.w) * 0x1F + this.x) * 0x1F + androidx.compose.foundation.c.a(this.y)) * 0x1F + this.z) * 0x1F + androidx.compose.foundation.c.a(this.A)) * 0x1F + (this.B == null ? 0 : this.B.hashCode())) * 0x1F + this.C) * 0x1F;
        int v2 = this.D == null ? 0 : this.D.hashCode();
        int v3 = this.E == null ? 0 : this.E.hashCode();
        int v4 = this.F == null ? 0 : this.F.hashCode();
        int v5 = this.G == null ? 0 : this.G.hashCode();
        int v6 = this.H == null ? 0 : this.H.hashCode();
        int v7 = androidx.compose.foundation.c.a(this.I);
        int v8 = androidx.compose.foundation.c.a(this.J);
        int v9 = androidx.compose.foundation.c.a(this.K);
        int v10 = this.L == null ? 0 : this.L.hashCode();
        int v11 = this.N == null ? 0 : this.N.hashCode();
        int v12 = androidx.compose.foundation.c.a(this.O);
        int v13 = androidx.compose.foundation.c.a(this.P);
        int v14 = this.Q == null ? 0 : this.Q.hashCode();
        int v15 = this.X == null ? 0 : this.X.hashCode();
        int v16 = androidx.compose.foundation.c.a(this.Y);
        int v17 = this.Z == null ? 0 : this.Z.hashCode();
        int v18 = this.M8 == null ? 0 : this.M8.hashCode();
        int v19 = this.N8 == null ? 0 : this.N8.hashCode();
        String s = this.O8;
        if(s != null) {
            v = s.hashCode();
        }
        return (((((((((((((((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v18) * 0x1F + v19) * 0x1F + v) * 0x1F + this.P8.c();
    }

    @m
    public final String i() {
        return this.O8;
    }

    public final void i0(@m String s) {
        this.F = s;
    }

    public final void j0(boolean z) {
        this.J = z;
    }

    public final void k0(boolean z) {
        this.h = z;
    }

    public final int l() {
        return this.j;
    }

    public final void l0(@m String s) {
        this.H = s;
    }

    @m
    public final String m() {
        return this.B;
    }

    public final void m0(boolean z) {
        this.K = z;
    }

    public final void n0(boolean z) {
        this.i = z;
    }

    @m
    public final String o() {
        return this.u;
    }

    public final void o0(int v) {
        this.a = v;
    }

    public final void p0(@m String s) {
        this.O8 = s;
    }

    @l
    public final com.dcinside.app.type.m q() {
        return this.P8;
    }

    public final void q0(int v) {
        this.j = v;
    }

    @m
    public final String r() {
        return this.M8;
    }

    public final void r0(@m String s) {
        this.B = s;
    }

    @m
    public final String s() {
        return this.b;
    }

    public final void s0(@m String s) {
        this.G = s;
    }

    @m
    public final String t() {
        return this.L;
    }

    public final void t0(@m String s) {
        this.D = s;
    }

    public final boolean u() {
        return this.M;
    }

    public final void u0(@m String s) {
        this.E = s;
    }

    @m
    public final List v() {
        return this.p;
    }

    public final void v0(@m String s) {
        this.u = s;
    }

    @m
    public final List w() {
        return this.o;
    }

    public final void w0(@l com.dcinside.app.type.m m0) {
        L.p(m0, "<set-?>");
        this.P8 = m0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeInt(this.a);
        parcel0.writeString(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeLong(this.d);
        parcel0.writeInt(((int)this.e));
        parcel0.writeInt(this.f);
        parcel0.writeString(this.g);
        parcel0.writeInt(((int)this.h));
        parcel0.writeInt(((int)this.i));
        parcel0.writeInt(this.j);
        parcel0.writeInt(((int)this.k));
        parcel0.writeInt(this.l);
        Set set0 = this.m == null ? null : this.m.entrySet();
        parcel0.writeInt((set0 == null ? 0 : set0.size()));
        if(set0 != null) {
            for(Object object0: set0) {
                parcel0.writeString(((String)((Map.Entry)object0).getKey()));
                parcel0.writeString(((String)((Map.Entry)object0).getValue()));
            }
        }
        parcel0.writeString(this.n);
        parcel0.writeTypedList(this.o);
        parcel0.writeTypedList(this.p);
        parcel0.writeInt(((int)this.q));
        parcel0.writeString(this.r);
        parcel0.writeString(this.s);
        parcel0.writeString(this.t);
        parcel0.writeString(this.u);
        parcel0.writeInt(((int)this.v));
        parcel0.writeInt(this.w);
        parcel0.writeInt(this.x);
        parcel0.writeInt(((int)this.y));
        parcel0.writeInt(this.z);
        parcel0.writeInt(((int)this.A));
        parcel0.writeString(this.B);
        parcel0.writeInt(this.C);
        parcel0.writeString(this.D);
        parcel0.writeString(this.E);
        parcel0.writeString(this.F);
        parcel0.writeString(this.G);
        parcel0.writeString(this.H);
        parcel0.writeInt(((int)this.I));
        parcel0.writeInt(((int)this.J));
        parcel0.writeInt(((int)this.K));
        parcel0.writeString(this.L);
        parcel0.writeInt(((int)this.M));
        parcel0.writeParcelable(this.N, 0);
        parcel0.writeInt(((int)this.O));
        parcel0.writeInt(((int)this.P));
        parcel0.writeTypedList(this.Q);
        parcel0.writeString(this.X);
        parcel0.writeInt(((int)this.Y));
        parcel0.writeTypedList(this.Z);
        parcel0.writeString(this.M8);
        parcel0.writeString(this.N8);
        parcel0.writeString(this.O8);
        parcel0.writeInt(this.P8.c());
    }

    public final int x() {
        return this.l;
    }

    public final void x0(@m String s) {
        this.M8 = s;
    }

    public final int y() {
        return this.z;
    }

    public final void y0(@m String s) {
        this.b = s;
    }

    @m
    public final String z() {
        return this.r;
    }

    public final void z0(@m String s) {
        this.L = s;
    }
}

