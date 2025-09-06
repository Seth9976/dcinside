package com.dcinside.app.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.dcinside.app.response.PostHead;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class PostModify extends f0 implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public PostModify a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new PostModify(parcel0);
        }

        @l
        public PostModify[] b(int v) {
            return new PostModify[v];
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

        public final boolean c(@m PostModify postModify0, @m String s) {
            return (postModify0 == null ? null : postModify0.O()) != null && L.g(postModify0.O(), s);
        }

        private final List d(Parcel parcel0) {
            int v = parcel0.readInt();
            List list0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = parcel0.readInt();
                HashMap hashMap0 = new HashMap(v2);
                for(int v3 = 0; v3 < v2; ++v3) {
                    String s = parcel0.readString();
                    if(s != null) {
                        String s1 = parcel0.readString();
                        if(s1 != null) {
                            hashMap0.put(s, s1);
                        }
                    }
                }
                ((ArrayList)list0).add(hashMap0);
            }
            return list0;
        }

        private final void e(Parcel parcel0, List list0) {
            if(list0 == null) {
                parcel0.writeInt(0);
                return;
            }
            parcel0.writeInt(list0.size());
            for(Object object0: list0) {
                Map map0 = (Map)object0;
                if(map0 == null) {
                    parcel0.writeInt(0);
                }
                else {
                    parcel0.writeInt(map0.size());
                    for(Object object1: map0.entrySet()) {
                        String s = (String)((Map.Entry)object1).getKey();
                        String s1 = (String)((Map.Entry)object1).getValue();
                        parcel0.writeString(s);
                        parcel0.writeString(s1);
                    }
                }
            }
        }
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    @c("gall_id")
    @m
    private String e;
    @c("gall_no")
    private int f;
    @c("subject")
    @m
    private String g;
    @c("memo")
    @m
    private List h;
    @c("file")
    @m
    private List i;
    @c("file_cnt")
    private int j;
    @c("file_size")
    private long k;
    @c("head_text")
    @m
    private List l;
    @c("poll")
    @m
    private List m;
    @c("movie")
    @m
    private List n;
    @c("aiImg")
    @m
    private List o;
    @c("fix")
    private boolean p;
    @c("secret")
    private boolean q;
    @c("auto_del_time")
    @m
    private String r;
    @c("use_ai_write")
    private boolean s;
    @c("is_manager_headtext")
    private boolean t;
    @c("headid")
    @m
    private final Integer u;
    @com.dcinside.app.util.Ik.a
    @m
    private String v;
    @com.dcinside.app.util.Ik.a
    @l
    private com.dcinside.app.type.m w;
    @l
    public static final b x;

    static {
        PostModify.x = new b(null);
        PostModify.CREATOR = new a();
    }

    public PostModify() {
        this(null, 0, null, null, null, 0, 0L, null, null, null, null, false, false, null, false, false, null, null, null, 0x7FFFF, null);
    }

    public PostModify(@l Parcel parcel0) {
        L.p(parcel0, "source");
        String s = parcel0.readString();
        int v = parcel0.readInt();
        String s1 = parcel0.readString();
        List list0 = PostModify.x.d(parcel0);
        List list1 = PostModify.x.d(parcel0);
        int v1 = parcel0.readInt();
        long v2 = parcel0.readLong();
        ArrayList arrayList0 = parcel0.createTypedArrayList(PostHead.CREATOR);
        List list2 = PostModify.x.d(parcel0);
        List list3 = PostModify.x.d(parcel0);
        List list4 = PostModify.x.d(parcel0);
        boolean z = 1 == parcel0.readInt();
        boolean z1 = 1 == parcel0.readInt();
        String s2 = parcel0.readString();
        boolean z2 = 1 == parcel0.readInt();
        boolean z3 = 1 == parcel0.readInt();
        Integer integer0 = parcel0.readInt();
        String s3 = parcel0.readString();
        int v3 = parcel0.readInt();
        this(s, v, s1, list0, list1, v1, v2, arrayList0, list2, list3, list4, z, z1, s2, z2, z3, integer0, s3, com.dcinside.app.type.m.d.a(v3));
    }

    public PostModify(@m String s, int v, @m String s1, @m List list0, @m List list1, int v1, long v2, @m List list2, @m List list3, @m List list4, @m List list5, boolean z, boolean z1, @m String s2, boolean z2, boolean z3, @m Integer integer0, @m String s3, @l com.dcinside.app.type.m m0) {
        L.p(m0, "galleryGrade");
        super();
        this.e = s;
        this.f = v;
        this.g = s1;
        this.h = list0;
        this.i = list1;
        this.j = v1;
        this.k = v2;
        this.l = list2;
        this.m = list3;
        this.n = list4;
        this.o = list5;
        this.p = z;
        this.q = z1;
        this.r = s2;
        this.s = z2;
        this.t = z3;
        this.u = integer0;
        this.v = s3;
        this.w = m0;
    }

    public PostModify(String s, int v, String s1, List list0, List list1, int v1, long v2, List list2, List list3, List list4, List list5, boolean z, boolean z1, String s2, boolean z2, boolean z3, Integer integer0, String s3, com.dcinside.app.type.m m0, int v3, w w0) {
        this(((v3 & 1) == 0 ? s : null), ((v3 & 2) == 0 ? v : 0), ((v3 & 4) == 0 ? s1 : null), ((v3 & 8) == 0 ? list0 : null), ((v3 & 16) == 0 ? list1 : null), ((v3 & 0x20) == 0 ? v1 : 0), ((v3 & 0x40) == 0 ? v2 : 0L), ((v3 & 0x80) == 0 ? list2 : null), ((v3 & 0x100) == 0 ? list3 : null), ((v3 & 0x200) == 0 ? list4 : null), ((v3 & 0x400) == 0 ? list5 : null), ((v3 & 0x800) == 0 ? z : false), ((v3 & 0x1000) == 0 ? z1 : false), ((v3 & 0x2000) == 0 ? s2 : null), ((v3 & 0x4000) == 0 ? z2 : false), ((v3 & 0x8000) == 0 ? z3 : false), ((v3 & 0x10000) == 0 ? integer0 : null), ((v3 & 0x20000) == 0 ? s3 : null), ((v3 & 0x40000) == 0 ? m0 : com.dcinside.app.type.m.g));
    }

    public final long A() {
        return this.k;
    }

    @m
    public final List B() {
        return this.l;
    }

    @m
    public final List C() {
        return this.m;
    }

    @l
    public final PostModify D(@m String s, int v, @m String s1, @m List list0, @m List list1, int v1, long v2, @m List list2, @m List list3, @m List list4, @m List list5, boolean z, boolean z1, @m String s2, boolean z2, boolean z3, @m Integer integer0, @m String s3, @l com.dcinside.app.type.m m0) {
        L.p(m0, "galleryGrade");
        return new PostModify(s, v, s1, list0, list1, v1, v2, list2, list3, list4, list5, z, z1, s2, z2, z3, integer0, s3, m0);
    }

    public static PostModify E(PostModify postModify0, String s, int v, String s1, List list0, List list1, int v1, long v2, List list2, List list3, List list4, List list5, boolean z, boolean z1, String s2, boolean z2, boolean z3, Integer integer0, String s3, com.dcinside.app.type.m m0, int v3, Object object0) {
        String s4 = (v3 & 1) == 0 ? s : postModify0.e;
        int v4 = (v3 & 2) == 0 ? v : postModify0.f;
        String s5 = (v3 & 4) == 0 ? s1 : postModify0.g;
        List list6 = (v3 & 8) == 0 ? list0 : postModify0.h;
        List list7 = (v3 & 16) == 0 ? list1 : postModify0.i;
        int v5 = (v3 & 0x20) == 0 ? v1 : postModify0.j;
        long v6 = (v3 & 0x40) == 0 ? v2 : postModify0.k;
        List list8 = (v3 & 0x80) == 0 ? list2 : postModify0.l;
        List list9 = (v3 & 0x100) == 0 ? list3 : postModify0.m;
        List list10 = (v3 & 0x200) == 0 ? list4 : postModify0.n;
        List list11 = (v3 & 0x400) == 0 ? list5 : postModify0.o;
        boolean z4 = (v3 & 0x800) == 0 ? z : postModify0.p;
        boolean z5 = (v3 & 0x1000) == 0 ? z1 : postModify0.q;
        String s6 = (v3 & 0x2000) == 0 ? s2 : postModify0.r;
        boolean z6 = (v3 & 0x4000) == 0 ? z2 : postModify0.s;
        boolean z7 = (v3 & 0x8000) == 0 ? z3 : postModify0.t;
        Integer integer1 = (v3 & 0x10000) == 0 ? integer0 : postModify0.u;
        String s7 = (v3 & 0x20000) == 0 ? s3 : postModify0.v;
        return (v3 & 0x40000) == 0 ? postModify0.D(s4, v4, s5, list6, list7, v5, v6, list8, list9, list10, list11, z4, z5, s6, z6, z7, integer1, s7, m0) : postModify0.D(s4, v4, s5, list6, list7, v5, v6, list8, list9, list10, list11, z4, z5, s6, z6, z7, integer1, s7, postModify0.w);
    }

    @m
    public final List F() {
        return this.o;
    }

    @m
    public final String G() {
        return this.r;
    }

    public final boolean H() {
        return this.s;
    }

    @l
    public final com.dcinside.app.type.m I() {
        return this.w;
    }

    @m
    public final String J() {
        return this.e;
    }

    public final boolean K() {
        return this.t;
    }

    @m
    public final Integer L() {
        return this.u;
    }

    @m
    public final List M() {
        return this.l;
    }

    @m
    public final List N() {
        return this.i;
    }

    @m
    public final String O() {
        return this.v;
    }

    public final int P() {
        return this.j;
    }

    public final long S() {
        return this.k;
    }

    @m
    public final List U() {
        return this.h;
    }

    public final int V() {
        return this.f;
    }

    @m
    public final List W() {
        return this.m;
    }

    @m
    public final String X() {
        return this.g;
    }

    @m
    public final List Y() {
        return this.n;
    }

    public final boolean Z() {
        return this.p;
    }

    public final boolean a0() {
        return this.q;
    }

    public final void b0(@m List list0) {
        this.o = list0;
    }

    public final void c0(@m String s) {
        this.r = s;
    }

    public final void d0(boolean z) {
        this.s = z;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e0(boolean z) {
        this.p = z;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PostModify)) {
            return false;
        }
        if(!L.g(this.e, ((PostModify)object0).e)) {
            return false;
        }
        if(this.f != ((PostModify)object0).f) {
            return false;
        }
        if(!L.g(this.g, ((PostModify)object0).g)) {
            return false;
        }
        if(!L.g(this.h, ((PostModify)object0).h)) {
            return false;
        }
        if(!L.g(this.i, ((PostModify)object0).i)) {
            return false;
        }
        if(this.j != ((PostModify)object0).j) {
            return false;
        }
        if(this.k != ((PostModify)object0).k) {
            return false;
        }
        if(!L.g(this.l, ((PostModify)object0).l)) {
            return false;
        }
        if(!L.g(this.m, ((PostModify)object0).m)) {
            return false;
        }
        if(!L.g(this.n, ((PostModify)object0).n)) {
            return false;
        }
        if(!L.g(this.o, ((PostModify)object0).o)) {
            return false;
        }
        if(this.p != ((PostModify)object0).p) {
            return false;
        }
        if(this.q != ((PostModify)object0).q) {
            return false;
        }
        if(!L.g(this.r, ((PostModify)object0).r)) {
            return false;
        }
        if(this.s != ((PostModify)object0).s) {
            return false;
        }
        if(this.t != ((PostModify)object0).t) {
            return false;
        }
        if(!L.g(this.u, ((PostModify)object0).u)) {
            return false;
        }
        return L.g(this.v, ((PostModify)object0).v) ? this.w == ((PostModify)object0).w : false;
    }

    // 去混淆评级： 低(20)
    @Override  // com.dcinside.app.model.f0
    public boolean f() {
        return m0.a.a.h(this.d()) && m0.a.a.h(this.a());
    }

    public final void f0(@l com.dcinside.app.type.m m0) {
        L.p(m0, "<set-?>");
        this.w = m0;
    }

    @m
    public final String g() {
        return this.e;
    }

    public final void g0(@m String s) {
        this.e = s;
    }

    @m
    public final List h() {
        return this.n;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = (((((((this.e == null ? 0 : this.e.hashCode()) * 0x1F + this.f) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F + (this.i == null ? 0 : this.i.hashCode())) * 0x1F + this.j) * 0x1F + ((int)(this.k ^ this.k >>> 0x20))) * 0x1F;
        int v2 = this.l == null ? 0 : this.l.hashCode();
        int v3 = this.m == null ? 0 : this.m.hashCode();
        int v4 = this.n == null ? 0 : this.n.hashCode();
        int v5 = this.o == null ? 0 : this.o.hashCode();
        int v6 = androidx.compose.foundation.c.a(this.p);
        int v7 = androidx.compose.foundation.c.a(this.q);
        int v8 = this.r == null ? 0 : this.r.hashCode();
        int v9 = androidx.compose.foundation.c.a(this.s);
        int v10 = androidx.compose.foundation.c.a(this.t);
        int v11 = this.u == null ? 0 : this.u.hashCode();
        String s = this.v;
        if(s != null) {
            v = s.hashCode();
        }
        return (((((((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v) * 0x1F + this.w.hashCode();
    }

    @m
    public final List i() {
        return this.o;
    }

    public final void i0(boolean z) {
        this.t = z;
    }

    public final void j0(@m List list0) {
        this.l = list0;
    }

    public final void k0(@m List list0) {
        this.i = list0;
    }

    public final boolean l() {
        return this.p;
    }

    public final void l0(@m String s) {
        this.v = s;
    }

    public final boolean m() {
        return this.q;
    }

    public final void m0(int v) {
        this.j = v;
    }

    public final void n0(long v) {
        this.k = v;
    }

    @m
    public final String o() {
        return this.r;
    }

    public final void o0(@m List list0) {
        this.h = list0;
    }

    public final void p0(int v) {
        this.f = v;
    }

    public final boolean q() {
        return this.s;
    }

    public final void q0(@m List list0) {
        this.m = list0;
    }

    public final boolean r() {
        return this.t;
    }

    public final void r0(@m String s) {
        this.g = s;
    }

    @m
    public final Integer s() {
        return this.u;
    }

    public final void s0(boolean z) {
        this.q = z;
    }

    @m
    public final String t() {
        return this.v;
    }

    public final void t0(@m List list0) {
        this.n = list0;
    }

    @Override
    @l
    public String toString() {
        return "PostModify(galleryId=" + this.e + ", modifyNumber=" + this.f + ", postSubject=" + this.g + ", memoList=" + this.h + ", imageList=" + this.i + ", maxUploadCount=" + this.j + ", maxUploadSize=" + this.k + ", heads=" + this.l + ", pollItems=" + this.m + ", videoItems=" + this.n + ", aiItems=" + this.o + ", isFixPost=" + this.p + ", isSecretPost=" + this.q + ", autoDelTime=" + this.r + ", canWriteAiImage=" + this.s + ", headManagerOnly=" + this.t + ", headSelectedId=" + this.u + ", managerConfirmId=" + this.v + ", galleryGrade=" + this.w + ")";
    }

    @l
    public final com.dcinside.app.type.m u() {
        return this.w;
    }

    public final int v() {
        return this.f;
    }

    @m
    public final String w() {
        return this.g;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeString(this.e);
        parcel0.writeInt(this.f);
        parcel0.writeString(this.g);
        PostModify.x.e(parcel0, this.h);
        PostModify.x.e(parcel0, this.i);
        parcel0.writeInt(this.j);
        parcel0.writeLong(this.k);
        parcel0.writeTypedList(this.l);
        PostModify.x.e(parcel0, this.m);
        PostModify.x.e(parcel0, this.n);
        PostModify.x.e(parcel0, this.o);
        parcel0.writeInt(((int)this.p));
        parcel0.writeInt(((int)this.q));
        parcel0.writeString(this.r);
        parcel0.writeInt(((int)this.s));
        parcel0.writeInt(((int)this.t));
        parcel0.writeInt((this.u == null ? -1 : ((int)this.u)));
        parcel0.writeString(this.v);
        parcel0.writeInt(this.w.c());
    }

    @m
    public final List x() {
        return this.h;
    }

    @m
    public final List y() {
        return this.i;
    }

    public final int z() {
        return this.j;
    }
}

