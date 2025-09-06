package com.dcinside.app.read.reply.more;

import O3.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.foundation.c;
import com.dcinside.app.model.Mention;
import com.dcinside.app.read.Q0;
import java.io.Serializable;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@d
public final class ReplyMoreItem implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public final ReplyMoreItem a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            int v = parcel0.readInt();
            int v1 = parcel0.readInt();
            Object object0 = ReplyPostInfo.CREATOR.createFromParcel(parcel0);
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            String s2 = parcel0.readString();
            boolean z = parcel0.readInt() != 0;
            String s3 = parcel0.readString();
            int v2 = parcel0.readInt();
            String s4 = parcel0.readString();
            String s5 = parcel0.readString();
            Serializable serializable0 = parcel0.readSerializable();
            Serializable serializable1 = parcel0.readSerializable();
            String s6 = parcel0.readString();
            boolean z1 = parcel0.readInt() != 0;
            int v3 = parcel0.readInt();
            String s7 = parcel0.readString();
            Object object1 = null;
            Object object2 = parcel0.readInt() == 0 ? null : Mention.CREATOR.createFromParcel(parcel0);
            if(parcel0.readInt() != 0) {
                object1 = Mention.CREATOR.createFromParcel(parcel0);
            }
            return new ReplyMoreItem(v, v1, ((ReplyPostInfo)object0), s, s1, s2, z, s3, v2, s4, s5, ((V)serializable0), ((V)serializable1), s6, z1, v3, s7, ((Mention)object2), ((Mention)object1), Q0.valueOf(parcel0.readString()));
        }

        @l
        public final ReplyMoreItem[] b(int v) {
            return new ReplyMoreItem[v];
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

    @l
    public static final Parcelable.Creator CREATOR;
    private final int a;
    private final int b;
    @l
    private final ReplyPostInfo c;
    @l
    private final String d;
    @l
    private final String e;
    @l
    private final String f;
    private final boolean g;
    @l
    private final String h;
    private final int i;
    @l
    private final String j;
    @l
    private final String k;
    @l
    private final V l;
    @l
    private final V m;
    @l
    private final String n;
    private final boolean o;
    private final int p;
    @l
    private final String q;
    @m
    private final Mention r;
    @m
    private final Mention s;
    @l
    private final Q0 t;

    static {
        ReplyMoreItem.CREATOR = new a();
    }

    public ReplyMoreItem() {
        this(0, 0, null, null, null, null, false, null, 0, null, null, null, null, null, false, 0, null, null, null, null, 0xFFFFF, null);
    }

    public ReplyMoreItem(int v, int v1, @l ReplyPostInfo replyPostInfo0, @l String s, @l String s1, @l String s2, boolean z, @l String s3, int v2, @l String s4, @l String s5, @l V v3, @l V v4, @l String s6, boolean z1, int v5, @l String s7, @m Mention mention0, @m Mention mention1, @l Q0 q00) {
        L.p(replyPostInfo0, "postInfo");
        L.p(s, "userName");
        L.p(s1, "userIp");
        L.p(s2, "userId");
        L.p(s3, "level");
        L.p(s4, "memberIconUrl");
        L.p(s5, "memo");
        L.p(v3, "leftDcconInfo");
        L.p(v4, "rightDcconInfo");
        L.p(s6, "voiceSource");
        L.p(s7, "guestKey");
        L.p(q00, "replyMode");
        super();
        this.a = v;
        this.b = v1;
        this.c = replyPostInfo0;
        this.d = s;
        this.e = s1;
        this.f = s2;
        this.g = z;
        this.h = s3;
        this.i = v2;
        this.j = s4;
        this.k = s5;
        this.l = v3;
        this.m = v4;
        this.n = s6;
        this.o = z1;
        this.p = v5;
        this.q = s7;
        this.r = mention0;
        this.s = mention1;
        this.t = q00;
    }

    public ReplyMoreItem(int v, int v1, ReplyPostInfo replyPostInfo0, String s, String s1, String s2, boolean z, String s3, int v2, String s4, String s5, V v3, V v4, String s6, boolean z1, int v5, String s7, Mention mention0, Mention mention1, Q0 q00, int v6, w w0) {
        this(((v6 & 1) == 0 ? v : -1), ((v6 & 2) == 0 ? v1 : 0), ((v6 & 4) == 0 ? replyPostInfo0 : new ReplyPostInfo(null, null, 0, null, null, null, false, 0x7F, null)), ((v6 & 8) == 0 ? s : ""), ((v6 & 16) == 0 ? s1 : ""), ((v6 & 0x20) == 0 ? s2 : ""), ((v6 & 0x40) == 0 ? z : false), ((v6 & 0x80) == 0 ? s3 : ""), ((v6 & 0x100) == 0 ? v2 : 0), ((v6 & 0x200) == 0 ? s4 : ""), ((v6 & 0x400) == 0 ? s5 : ""), ((v6 & 0x800) == 0 ? v3 : new V("", 0L)), ((v6 & 0x1000) == 0 ? v4 : new V("", 0L)), ((v6 & 0x2000) == 0 ? s6 : ""), ((v6 & 0x4000) == 0 ? z1 : false), ((v6 & 0x8000) == 0 ? v5 : -1), ((v6 & 0x10000) == 0 ? s7 : ""), ((v6 & 0x20000) == 0 ? mention0 : null), ((v6 & 0x40000) == 0 ? mention1 : null), ((v6 & 0x80000) == 0 ? q00 : Q0.b));
    }

    public static ReplyMoreItem A(ReplyMoreItem replyMoreItem0, int v, int v1, ReplyPostInfo replyPostInfo0, String s, String s1, String s2, boolean z, String s3, int v2, String s4, String s5, V v3, V v4, String s6, boolean z1, int v5, String s7, Mention mention0, Mention mention1, Q0 q00, int v6, Object object0) {
        int v7 = (v6 & 1) == 0 ? v : replyMoreItem0.a;
        int v8 = (v6 & 2) == 0 ? v1 : replyMoreItem0.b;
        ReplyPostInfo replyPostInfo1 = (v6 & 4) == 0 ? replyPostInfo0 : replyMoreItem0.c;
        String s8 = (v6 & 8) == 0 ? s : replyMoreItem0.d;
        String s9 = (v6 & 16) == 0 ? s1 : replyMoreItem0.e;
        String s10 = (v6 & 0x20) == 0 ? s2 : replyMoreItem0.f;
        boolean z2 = (v6 & 0x40) == 0 ? z : replyMoreItem0.g;
        String s11 = (v6 & 0x80) == 0 ? s3 : replyMoreItem0.h;
        int v9 = (v6 & 0x100) == 0 ? v2 : replyMoreItem0.i;
        String s12 = (v6 & 0x200) == 0 ? s4 : replyMoreItem0.j;
        String s13 = (v6 & 0x400) == 0 ? s5 : replyMoreItem0.k;
        V v10 = (v6 & 0x800) == 0 ? v3 : replyMoreItem0.l;
        V v11 = (v6 & 0x1000) == 0 ? v4 : replyMoreItem0.m;
        String s14 = (v6 & 0x2000) == 0 ? s6 : replyMoreItem0.n;
        boolean z3 = (v6 & 0x4000) == 0 ? z1 : replyMoreItem0.o;
        int v12 = (v6 & 0x8000) == 0 ? v5 : replyMoreItem0.p;
        String s15 = (v6 & 0x10000) == 0 ? s7 : replyMoreItem0.q;
        Mention mention2 = (v6 & 0x20000) == 0 ? mention0 : replyMoreItem0.r;
        Mention mention3 = (v6 & 0x40000) == 0 ? mention1 : replyMoreItem0.s;
        return (v6 & 0x80000) == 0 ? replyMoreItem0.z(v7, v8, replyPostInfo1, s8, s9, s10, z2, s11, v9, s12, s13, v10, v11, s14, z3, v12, s15, mention2, mention3, q00) : replyMoreItem0.z(v7, v8, replyPostInfo1, s8, s9, s10, z2, s11, v9, s12, s13, v10, v11, s14, z3, v12, s15, mention2, mention3, replyMoreItem0.t);
    }

    public final boolean B() {
        return this.o;
    }

    @l
    public final String C() [...] // 潜在的解密器

    @l
    public final V D() {
        return this.l;
    }

    @l
    public final String E() [...] // 潜在的解密器

    @l
    public final String F() [...] // 潜在的解密器

    public final int G() {
        return this.i;
    }

    @l
    public final String H() [...] // 潜在的解密器

    @m
    public final Mention I() {
        return this.r;
    }

    @m
    public final Mention J() {
        return this.s;
    }

    public final int K() {
        return this.a;
    }

    @l
    public final ReplyPostInfo L() {
        return this.c;
    }

    @l
    public final Q0 M() {
        return this.t;
    }

    @l
    public final V N() {
        return this.m;
    }

    public final int O() {
        return this.b;
    }

    public final int P() {
        return this.p;
    }

    @l
    public final String S() [...] // 潜在的解密器

    @l
    public final String U() [...] // 潜在的解密器

    @l
    public final String V() [...] // 潜在的解密器

    @l
    public final String W() [...] // 潜在的解密器

    public final boolean X() {
        return this.g;
    }

    public final int a() {
        return this.a;
    }

    @l
    public final String c() {
        return this.j;
    }

    @l
    public final String d() {
        return this.k;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final V e() {
        return this.l;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ReplyMoreItem)) {
            return false;
        }
        ReplyMoreItem replyMoreItem0 = (ReplyMoreItem)object0;
        if(this.a != replyMoreItem0.a) {
            return false;
        }
        if(this.b != replyMoreItem0.b) {
            return false;
        }
        if(!L.g(this.c, replyMoreItem0.c)) {
            return false;
        }
        if(!L.g(this.d, replyMoreItem0.d)) {
            return false;
        }
        if(!L.g(this.e, replyMoreItem0.e)) {
            return false;
        }
        if(!L.g(this.f, replyMoreItem0.f)) {
            return false;
        }
        if(this.g != replyMoreItem0.g) {
            return false;
        }
        if(!L.g(this.h, replyMoreItem0.h)) {
            return false;
        }
        if(this.i != replyMoreItem0.i) {
            return false;
        }
        if(!L.g(this.j, replyMoreItem0.j)) {
            return false;
        }
        if(!L.g(this.k, replyMoreItem0.k)) {
            return false;
        }
        if(!L.g(this.l, replyMoreItem0.l)) {
            return false;
        }
        if(!L.g(this.m, replyMoreItem0.m)) {
            return false;
        }
        if(!L.g(this.n, replyMoreItem0.n)) {
            return false;
        }
        if(this.o != replyMoreItem0.o) {
            return false;
        }
        if(this.p != replyMoreItem0.p) {
            return false;
        }
        if(!L.g(this.q, replyMoreItem0.q)) {
            return false;
        }
        if(!L.g(this.r, replyMoreItem0.r)) {
            return false;
        }
        return L.g(this.s, replyMoreItem0.s) ? this.t == replyMoreItem0.t : false;
    }

    @l
    public final V f() {
        return this.m;
    }

    @l
    public final String g() {
        return this.n;
    }

    public final boolean h() {
        return this.o;
    }

    @Override
    public int hashCode() {
        int v = ((((((((((((((((this.a * 0x1F + this.b) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + c.a(this.g)) * 0x1F + this.h.hashCode()) * 0x1F + this.i) * 0x1F + this.j.hashCode()) * 0x1F + this.k.hashCode()) * 0x1F + this.l.hashCode()) * 0x1F + this.m.hashCode()) * 0x1F + this.n.hashCode()) * 0x1F + c.a(this.o)) * 0x1F + this.p) * 0x1F + this.q.hashCode()) * 0x1F;
        int v1 = 0;
        int v2 = this.r == null ? 0 : this.r.hashCode();
        Mention mention0 = this.s;
        if(mention0 != null) {
            v1 = mention0.hashCode();
        }
        return ((v + v2) * 0x1F + v1) * 0x1F + this.t.hashCode();
    }

    public final int i() {
        return this.p;
    }

    @l
    public final String l() {
        return this.q;
    }

    @m
    public final Mention m() {
        return this.r;
    }

    @m
    public final Mention o() {
        return this.s;
    }

    public final int q() {
        return this.b;
    }

    @l
    public final Q0 r() {
        return this.t;
    }

    @l
    public final ReplyPostInfo s() {
        return this.c;
    }

    @l
    public final String t() {
        return this.d;
    }

    @Override
    @l
    public String toString() {
        return "ReplyMoreItem(position=" + this.a + ", type=" + this.b + ", postInfo=" + this.c + ", userName=" + this.d + ", userIp=" + this.e + ", userId=" + this.f + ", isUnder=" + this.g + ", level=" + this.h + ", memberType=" + this.i + ", memberIconUrl=" + this.j + ", memo=" + this.k + ", leftDcconInfo=" + this.l + ", rightDcconInfo=" + this.m + ", voiceSource=" + this.n + ", canDelete=" + this.o + ", unique=" + this.p + ", guestKey=" + this.q + ", mention=" + this.r + ", mode=" + this.s + ", replyMode=" + this.t + ")";
    }

    @l
    public final String u() {
        return this.e;
    }

    @l
    public final String v() {
        return this.f;
    }

    public final boolean w() {
        return this.g;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "out");
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
        this.c.writeToParcel(parcel0, v);
        parcel0.writeString(this.d);
        parcel0.writeString(this.e);
        parcel0.writeString(this.f);
        parcel0.writeInt(((int)this.g));
        parcel0.writeString(this.h);
        parcel0.writeInt(this.i);
        parcel0.writeString(this.j);
        parcel0.writeString(this.k);
        parcel0.writeSerializable(this.l);
        parcel0.writeSerializable(this.m);
        parcel0.writeString(this.n);
        parcel0.writeInt(((int)this.o));
        parcel0.writeInt(this.p);
        parcel0.writeString(this.q);
        Mention mention0 = this.r;
        if(mention0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            mention0.writeToParcel(parcel0, v);
        }
        Mention mention1 = this.s;
        if(mention1 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            mention1.writeToParcel(parcel0, v);
        }
        parcel0.writeString(this.t.name());
    }

    @l
    public final String x() {
        return this.h;
    }

    public final int y() {
        return this.i;
    }

    @l
    public final ReplyMoreItem z(int v, int v1, @l ReplyPostInfo replyPostInfo0, @l String s, @l String s1, @l String s2, boolean z, @l String s3, int v2, @l String s4, @l String s5, @l V v3, @l V v4, @l String s6, boolean z1, int v5, @l String s7, @m Mention mention0, @m Mention mention1, @l Q0 q00) {
        L.p(replyPostInfo0, "postInfo");
        L.p(s, "userName");
        L.p(s1, "userIp");
        L.p(s2, "userId");
        L.p(s3, "level");
        L.p(s4, "memberIconUrl");
        L.p(s5, "memo");
        L.p(v3, "leftDcconInfo");
        L.p(v4, "rightDcconInfo");
        L.p(s6, "voiceSource");
        L.p(s7, "guestKey");
        L.p(q00, "replyMode");
        return new ReplyMoreItem(v, v1, replyPostInfo0, s, s1, s2, z, s3, v2, s4, s5, v3, v4, s6, z1, v5, s7, mention0, mention1, q00);
    }
}

