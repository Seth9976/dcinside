package com.dcinside.app.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class MinorInfo extends f0 implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public MinorInfo a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new MinorInfo(parcel0);
        }

        @l
        public MinorInfo[] b(int v) {
            return new MinorInfo[v];
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
    @c("id")
    @m
    private final String e;
    @c("ko_name")
    @m
    private final String f;
    @c("img")
    @m
    private final String g;
    @c("mgallery_desc")
    @m
    private final String h;
    @c("master_id")
    @m
    private final String i;
    @c("master_name")
    @m
    private final String j;
    @c("submanager")
    @m
    private final List k;
    @c("create_dt")
    @m
    private final String l;
    @c("new")
    private final boolean m;
    @c("hot_state")
    @m
    private final String n;
    @c("total_count")
    @m
    private final String o;
    @c("cate_name")
    @m
    private final String p;
    @c("mini")
    @m
    private final MiniInfo q;
    @c("person")
    @m
    private final ManagerRecord r;
    @l
    public static final b s;

    static {
        MinorInfo.s = new b(null);
        MinorInfo.CREATOR = new a();
    }

    public MinorInfo() {
        this(null, null, null, null, null, null, null, null, false, null, null, null, null, null, 0x3FFF, null);
    }

    public MinorInfo(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.createTypedArrayList(ManagerItem.CREATOR), parcel0.readString(), 1 == parcel0.readInt(), parcel0.readString(), parcel0.readString(), parcel0.readString(), ((MiniInfo)parcel0.readParcelable(MiniInfo.class.getClassLoader())), ((ManagerRecord)parcel0.readParcelable(ManagerRecord.class.getClassLoader())));
    }

    public MinorInfo(@m String s, @m String s1, @m String s2, @m String s3, @m String s4, @m String s5, @m List list0, @m String s6, boolean z, @m String s7, @m String s8, @m String s9, @m MiniInfo miniInfo0, @m ManagerRecord managerRecord0) {
        this.e = s;
        this.f = s1;
        this.g = s2;
        this.h = s3;
        this.i = s4;
        this.j = s5;
        this.k = list0;
        this.l = s6;
        this.m = z;
        this.n = s7;
        this.o = s8;
        this.p = s9;
        this.q = miniInfo0;
        this.r = managerRecord0;
    }

    public MinorInfo(String s, String s1, String s2, String s3, String s4, String s5, List list0, String s6, boolean z, String s7, String s8, String s9, MiniInfo miniInfo0, ManagerRecord managerRecord0, int v, w w0) {
        this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), ((v & 16) == 0 ? s4 : null), ((v & 0x20) == 0 ? s5 : null), ((v & 0x40) == 0 ? list0 : null), ((v & 0x80) == 0 ? s6 : null), ((v & 0x100) == 0 ? z : false), ((v & 0x200) == 0 ? s7 : null), ((v & 0x400) == 0 ? s8 : null), ((v & 0x800) == 0 ? s9 : null), ((v & 0x1000) == 0 ? miniInfo0 : null), ((v & 0x2000) == 0 ? managerRecord0 : null));
    }

    @m
    public final String A() {
        return this.p;
    }

    @m
    public final String B() {
        return this.o;
    }

    @m
    public final String C() {
        return this.l;
    }

    @m
    public final String D() {
        return this.h;
    }

    @m
    public final String E() {
        return this.e;
    }

    @m
    public final String F() {
        return this.f;
    }

    @m
    public final String G() {
        return this.n;
    }

    @m
    public final String H() {
        return this.g;
    }

    @m
    public final String I() {
        return this.i;
    }

    @m
    public final String J() {
        return this.j;
    }

    @m
    public final ManagerRecord K() {
        return this.r;
    }

    @m
    public final MiniInfo L() {
        return this.q;
    }

    @m
    public final List M() {
        return this.k;
    }

    public final boolean N() {
        return this.m;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MinorInfo)) {
            return false;
        }
        if(!L.g(this.e, ((MinorInfo)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((MinorInfo)object0).f)) {
            return false;
        }
        if(!L.g(this.g, ((MinorInfo)object0).g)) {
            return false;
        }
        if(!L.g(this.h, ((MinorInfo)object0).h)) {
            return false;
        }
        if(!L.g(this.i, ((MinorInfo)object0).i)) {
            return false;
        }
        if(!L.g(this.j, ((MinorInfo)object0).j)) {
            return false;
        }
        if(!L.g(this.k, ((MinorInfo)object0).k)) {
            return false;
        }
        if(!L.g(this.l, ((MinorInfo)object0).l)) {
            return false;
        }
        if(this.m != ((MinorInfo)object0).m) {
            return false;
        }
        if(!L.g(this.n, ((MinorInfo)object0).n)) {
            return false;
        }
        if(!L.g(this.o, ((MinorInfo)object0).o)) {
            return false;
        }
        if(!L.g(this.p, ((MinorInfo)object0).p)) {
            return false;
        }
        return L.g(this.q, ((MinorInfo)object0).q) ? L.g(this.r, ((MinorInfo)object0).r) : false;
    }

    @m
    public final String g() {
        return this.e;
    }

    @m
    public final String h() {
        return this.n;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.e == null ? 0 : this.e.hashCode();
        int v2 = this.f == null ? 0 : this.f.hashCode();
        int v3 = this.g == null ? 0 : this.g.hashCode();
        int v4 = this.h == null ? 0 : this.h.hashCode();
        int v5 = this.i == null ? 0 : this.i.hashCode();
        int v6 = this.j == null ? 0 : this.j.hashCode();
        int v7 = this.k == null ? 0 : this.k.hashCode();
        int v8 = this.l == null ? 0 : this.l.hashCode();
        int v9 = androidx.compose.foundation.c.a(this.m);
        int v10 = this.n == null ? 0 : this.n.hashCode();
        int v11 = this.o == null ? 0 : this.o.hashCode();
        int v12 = this.p == null ? 0 : this.p.hashCode();
        int v13 = this.q == null ? 0 : this.q.hashCode();
        ManagerRecord managerRecord0 = this.r;
        if(managerRecord0 != null) {
            v = managerRecord0.hashCode();
        }
        return ((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v;
    }

    @m
    public final String i() {
        return this.o;
    }

    @m
    public final String l() {
        return this.p;
    }

    @m
    public final MiniInfo m() {
        return this.q;
    }

    @m
    public final ManagerRecord o() {
        return this.r;
    }

    @m
    public final String q() {
        return this.f;
    }

    @m
    public final String r() {
        return this.g;
    }

    @m
    public final String s() {
        return this.h;
    }

    @m
    public final String t() {
        return this.i;
    }

    @Override
    @l
    public String toString() {
        return "MinorInfo(galleryId=" + this.e + ", galleryName=" + this.f + ", img=" + this.g + ", desc=" + this.h + ", managerId=" + this.i + ", managerName=" + this.j + ", subManagerList=" + this.k + ", createDate=" + this.l + ", isNew=" + this.m + ", hotState=" + this.n + ", count=" + this.o + ", category=" + this.p + ", miniInfo=" + this.q + ", managerRecord=" + this.r + ")";
    }

    @m
    public final String u() {
        return this.j;
    }

    @m
    public final List v() {
        return this.k;
    }

    @m
    public final String w() {
        return this.l;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeString(this.e);
        parcel0.writeString(this.f);
        parcel0.writeString(this.g);
        parcel0.writeString(this.h);
        parcel0.writeString(this.i);
        parcel0.writeString(this.j);
        parcel0.writeTypedList(this.k);
        parcel0.writeString(this.l);
        parcel0.writeInt(((int)this.m));
        parcel0.writeString(this.n);
        parcel0.writeString(this.o);
        parcel0.writeString(this.p);
        parcel0.writeParcelable(this.q, 0);
        parcel0.writeParcelable(this.q, 0);
        parcel0.writeParcelable(this.r, 0);
    }

    public final boolean x() {
        return this.m;
    }

    @l
    public final MinorInfo y(@m String s, @m String s1, @m String s2, @m String s3, @m String s4, @m String s5, @m List list0, @m String s6, boolean z, @m String s7, @m String s8, @m String s9, @m MiniInfo miniInfo0, @m ManagerRecord managerRecord0) {
        return new MinorInfo(s, s1, s2, s3, s4, s5, list0, s6, z, s7, s8, s9, miniInfo0, managerRecord0);
    }

    public static MinorInfo z(MinorInfo minorInfo0, String s, String s1, String s2, String s3, String s4, String s5, List list0, String s6, boolean z, String s7, String s8, String s9, MiniInfo miniInfo0, ManagerRecord managerRecord0, int v, Object object0) {
        String s10 = (v & 1) == 0 ? s : minorInfo0.e;
        String s11 = (v & 2) == 0 ? s1 : minorInfo0.f;
        String s12 = (v & 4) == 0 ? s2 : minorInfo0.g;
        String s13 = (v & 8) == 0 ? s3 : minorInfo0.h;
        String s14 = (v & 16) == 0 ? s4 : minorInfo0.i;
        String s15 = (v & 0x20) == 0 ? s5 : minorInfo0.j;
        List list1 = (v & 0x40) == 0 ? list0 : minorInfo0.k;
        String s16 = (v & 0x80) == 0 ? s6 : minorInfo0.l;
        boolean z1 = (v & 0x100) == 0 ? z : minorInfo0.m;
        String s17 = (v & 0x200) == 0 ? s7 : minorInfo0.n;
        String s18 = (v & 0x400) == 0 ? s8 : minorInfo0.o;
        String s19 = (v & 0x800) == 0 ? s9 : minorInfo0.p;
        MiniInfo miniInfo1 = (v & 0x1000) == 0 ? miniInfo0 : minorInfo0.q;
        return (v & 0x2000) == 0 ? minorInfo0.y(s10, s11, s12, s13, s14, s15, list1, s16, z1, s17, s18, s19, miniInfo1, managerRecord0) : minorInfo0.y(s10, s11, s12, s13, s14, s15, list1, s16, z1, s17, s18, s19, miniInfo1, minorInfo0.r);
    }
}

