package com.dcinside.app.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.dcinside.app.type.D;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class MinorRanking implements Parcelable, Y {
    public static final class a implements Parcelable.Creator {
        @l
        public MinorRanking a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new MinorRanking(parcel0);
        }

        @l
        public MinorRanking[] b(int v) {
            return new MinorRanking[v];
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
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    @c("ko_name")
    @m
    private final String a;
    @c("link")
    @m
    private final String b;
    @c("id")
    @m
    private String c;
    @c("rank_type")
    @m
    private final String d;
    @c("rank_updown")
    private final int e;
    @c("rank")
    private final int f;
    @c("gall_state")
    @m
    private final String g;
    @c("job")
    @l
    private final String h;
    @c("job_detail")
    @l
    private final String i;
    @l
    public static final b j;

    static {
        MinorRanking.j = new b(null);
        MinorRanking.CREATOR = new a();
    }

    public MinorRanking() {
        this(null, null, null, null, 0, 0, null, null, null, 0x1FF, null);
    }

    public MinorRanking(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readInt(), parcel0.readInt(), parcel0.readString(), null, null, 0x180, null);
    }

    public MinorRanking(@m String s, @m String s1, @m String s2, @m String s3, int v, int v1, @m String s4, @l String s5, @l String s6) {
        L.p(s5, "job");
        L.p(s6, "jobDetail");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = v;
        this.f = v1;
        this.g = s4;
        this.h = s5;
        this.i = s6;
    }

    public MinorRanking(String s, String s1, String s2, String s3, int v, int v1, String s4, String s5, String s6, int v2, w w0) {
        this(((v2 & 1) == 0 ? s : null), ((v2 & 2) == 0 ? s1 : null), ((v2 & 4) == 0 ? s2 : null), ((v2 & 8) == 0 ? s3 : null), ((v2 & 16) == 0 ? v : 0), ((v2 & 0x20) == 0 ? v1 : 0), ((v2 & 0x40) == 0 ? s4 : null), ((v2 & 0x80) == 0 ? s5 : ""), ((v2 & 0x100) == 0 ? s6 : ""));
    }

    public final void A() {
        com.dcinside.app.type.m.a m$a0 = com.dcinside.app.type.m.d;
        String s = this.c;
        if(s == null) {
            return;
        }
        this.c = m$a0.e(s);
    }

    public final void B() {
        com.dcinside.app.type.m.a m$a0 = com.dcinside.app.type.m.d;
        String s = this.c;
        if(s == null) {
            return;
        }
        this.c = m$a0.f(s);
    }

    @Override  // com.dcinside.app.model.Y
    @l
    public D a() {
        D[] arr_d = D.values();
        for(int v = 0; v < arr_d.length; ++v) {
            D d0 = arr_d[v];
            if(L.g(d0.c(), this.d)) {
                return d0;
            }
        }
        return D.e;
    }

    @Override  // com.dcinside.app.model.Y
    public boolean c() {
        return true;
    }

    @Override
    public int compare(Object object0, Object object1) {
        return this.g(((Y)object0), ((Y)object1));
    }

    @Override  // com.dcinside.app.model.Y
    @m
    public String d() {
        return this.b;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.dcinside.app.model.Y
    @l
    public String e() {
        return this.h;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(MinorRanking.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.dcinside.app.model.MinorRanking");
        if(!L.g(this.a, ((MinorRanking)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((MinorRanking)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((MinorRanking)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((MinorRanking)object0).d)) {
            return false;
        }
        if(this.e != ((MinorRanking)object0).e) {
            return false;
        }
        return this.f == ((MinorRanking)object0).f ? L.g(this.g, ((MinorRanking)object0).g) : false;
    }

    @Override  // com.dcinside.app.model.Y
    @l
    public String f() {
        return this.i;
    }

    public int g(@l Y y0, @l Y y1) {
        L.p(y0, "lhs");
        L.p(y1, "rhs");
        if(y0.c() != y1.c()) {
            return y0.c() ? 1 : -1;
        }
        int v = y0.m();
        int v1 = y1.m();
        if(v >= v1) {
            return v <= v1 ? 0 : 1;
        }
        return -1;
    }

    @Override  // com.dcinside.app.model.Y
    @m
    public String getState() {
        return this.g;
    }

    @Override  // com.dcinside.app.model.Y
    @m
    public String h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + this.e) * 0x1F + this.f) * 0x1F;
        String s = this.g;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    private final String i() {
        return this.a;
    }

    @Override  // com.dcinside.app.model.Y
    @m
    public String l() {
        return this.a;
    }

    @Override  // com.dcinside.app.model.Y
    public int m() {
        return this.f;
    }

    private final String o() {
        return this.b;
    }

    private final String q() {
        return this.c;
    }

    @Override  // com.dcinside.app.model.Y
    public int r() {
        return this.e;
    }

    private final String s() {
        return this.d;
    }

    private final int t() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        return "MinorRanking(rankName=" + this.a + ", rankLink=" + this.b + ", rankGalleryId=" + this.c + ", rankTypeText=" + this.d + ", rankChangeValue=" + this.e + ", rankIndex=" + this.f + ", galleryState=" + this.g + ", job=" + this.h + ", jobDetail=" + this.i + ")";
    }

    private final int u() {
        return this.f;
    }

    private final String v() {
        return this.g;
    }

    @l
    public final String w() {
        return this.h;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeInt(this.f);
        parcel0.writeString(this.g);
    }

    @l
    public final String x() {
        return this.i;
    }

    @l
    public final MinorRanking y(@m String s, @m String s1, @m String s2, @m String s3, int v, int v1, @m String s4, @l String s5, @l String s6) {
        L.p(s5, "job");
        L.p(s6, "jobDetail");
        return new MinorRanking(s, s1, s2, s3, v, v1, s4, s5, s6);
    }

    public static MinorRanking z(MinorRanking minorRanking0, String s, String s1, String s2, String s3, int v, int v1, String s4, String s5, String s6, int v2, Object object0) {
        String s7 = (v2 & 1) == 0 ? s : minorRanking0.a;
        String s8 = (v2 & 2) == 0 ? s1 : minorRanking0.b;
        String s9 = (v2 & 4) == 0 ? s2 : minorRanking0.c;
        String s10 = (v2 & 8) == 0 ? s3 : minorRanking0.d;
        int v3 = (v2 & 16) == 0 ? v : minorRanking0.e;
        int v4 = (v2 & 0x20) == 0 ? v1 : minorRanking0.f;
        String s11 = (v2 & 0x40) == 0 ? s4 : minorRanking0.g;
        String s12 = (v2 & 0x80) == 0 ? s5 : minorRanking0.h;
        return (v2 & 0x100) == 0 ? minorRanking0.y(s7, s8, s9, s10, v3, v4, s11, s12, s6) : minorRanking0.y(s7, s8, s9, s10, v3, v4, s11, s12, minorRanking0.i);
    }
}

