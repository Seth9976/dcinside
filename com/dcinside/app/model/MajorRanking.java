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

public final class MajorRanking implements Parcelable, Y {
    public static final class a implements Parcelable.Creator {
        @l
        public MajorRanking a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new MajorRanking(parcel0);
        }

        @l
        public MajorRanking[] b(int v) {
            return new MajorRanking[v];
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
    @c("category")
    @m
    private final String a;
    @c("link")
    @m
    private final String b;
    @c("id")
    @m
    private final String c;
    @c("rank_type")
    @m
    private final String d;
    @c("rank")
    private final int e;
    @c("num")
    private final int f;
    @c("gall_state")
    @m
    private final String g;
    @l
    public static final b h;

    static {
        MajorRanking.h = new b(null);
        MajorRanking.CREATOR = new a();
    }

    public MajorRanking() {
        this(null, null, null, null, 0, 0, null, 0x7F, null);
    }

    public MajorRanking(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readInt(), parcel0.readInt(), parcel0.readString());
    }

    public MajorRanking(@m String s, @m String s1, @m String s2, @m String s3, int v, int v1, @m String s4) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = v;
        this.f = v1;
        this.g = s4;
    }

    public MajorRanking(String s, String s1, String s2, String s3, int v, int v1, String s4, int v2, w w0) {
        this(((v2 & 1) == 0 ? s : null), ((v2 & 2) == 0 ? s1 : null), ((v2 & 4) == 0 ? s2 : null), ((v2 & 8) == 0 ? s3 : null), ((v2 & 16) == 0 ? v : 0), ((v2 & 0x20) == 0 ? v1 : 0), ((v2 & 0x40) == 0 ? s4 : null));
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
        return false;
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
        return "";
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(MajorRanking.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.dcinside.app.model.MajorRanking");
        if(!L.g(this.a, ((MajorRanking)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((MajorRanking)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((MajorRanking)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((MajorRanking)object0).d)) {
            return false;
        }
        if(this.e != ((MajorRanking)object0).e) {
            return false;
        }
        return this.f == ((MajorRanking)object0).f ? L.g(this.g, ((MajorRanking)object0).g) : false;
    }

    @Override  // com.dcinside.app.model.Y
    @l
    public String f() {
        return "";
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
        return "MajorRanking(rankName=" + this.a + ", rankLink=" + this.b + ", rankGalleryId=" + this.c + ", rankTypeText=" + this.d + ", rankChangeValue=" + this.e + ", rankIndex=" + this.f + ", galleryState=" + this.g + ")";
    }

    private final int u() {
        return this.f;
    }

    private final String v() {
        return this.g;
    }

    @l
    public final MajorRanking w(@m String s, @m String s1, @m String s2, @m String s3, int v, int v1, @m String s4) {
        return new MajorRanking(s, s1, s2, s3, v, v1, s4);
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

    public static MajorRanking x(MajorRanking majorRanking0, String s, String s1, String s2, String s3, int v, int v1, String s4, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = majorRanking0.a;
        }
        if((v2 & 2) != 0) {
            s1 = majorRanking0.b;
        }
        if((v2 & 4) != 0) {
            s2 = majorRanking0.c;
        }
        if((v2 & 8) != 0) {
            s3 = majorRanking0.d;
        }
        if((v2 & 16) != 0) {
            v = majorRanking0.e;
        }
        if((v2 & 0x20) != 0) {
            v1 = majorRanking0.f;
        }
        if((v2 & 0x40) != 0) {
            s4 = majorRanking0.g;
        }
        return majorRanking0.w(s, s1, s2, s3, v, v1, s4);
    }
}

