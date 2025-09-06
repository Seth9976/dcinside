package com.dcinside.app.read.reply.more;

import O3.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.foundation.c;
import com.dcinside.app.model.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@d
public final class ReplyPostInfo implements Parcelable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final ReplyPostInfo a(@l Q q0, boolean z) {
            L.p(q0, "postInfo");
            String s = q0.H0();
            String s1 = q0.k1();
            String s2 = q0.X0();
            return new ReplyPostInfo(q0.G0(), (s == null ? "" : s), q0.c1(), (s1 == null ? "" : s1), (s2 == null ? "" : s2), (q0.D0() == null ? "" : q0.D0()), z);
        }
    }

    public static final class b implements Parcelable.Creator {
        @l
        public final ReplyPostInfo a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            int v = parcel0.readInt();
            String s2 = parcel0.readString();
            String s3 = parcel0.readString();
            String s4 = parcel0.readString();
            return parcel0.readInt() == 0 ? new ReplyPostInfo(s, s1, v, s2, s3, s4, false) : new ReplyPostInfo(s, s1, v, s2, s3, s4, true);
        }

        @l
        public final ReplyPostInfo[] b(int v) {
            return new ReplyPostInfo[v];
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
    @l
    private final String a;
    @l
    private final String b;
    private final int c;
    @l
    private final String d;
    @l
    private final String e;
    @l
    private final String f;
    private final boolean g;
    @l
    public static final a h;

    static {
        ReplyPostInfo.h = new a(null);
        ReplyPostInfo.CREATOR = new b();
    }

    public ReplyPostInfo() {
        this(null, null, 0, null, null, null, false, 0x7F, null);
    }

    public ReplyPostInfo(@l String s, @l String s1, int v, @l String s2, @l String s3, @l String s4, boolean z) {
        L.p(s, "galleryId");
        L.p(s1, "galleryName");
        L.p(s2, "subject");
        L.p(s3, "writeUserName");
        L.p(s4, "dateTime");
        super();
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = z;
    }

    public ReplyPostInfo(String s, String s1, int v, String s2, String s3, String s4, boolean z, int v1, w w0) {
        this(((v1 & 1) == 0 ? s : ""), ((v1 & 2) == 0 ? s1 : ""), ((v1 & 4) == 0 ? v : 0), ((v1 & 8) == 0 ? s2 : ""), ((v1 & 16) == 0 ? s3 : ""), ((v1 & 0x20) == 0 ? s4 : ""), ((v1 & 0x40) == 0 ? z : false));
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ReplyPostInfo)) {
            return false;
        }
        if(!L.g(this.a, ((ReplyPostInfo)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((ReplyPostInfo)object0).b)) {
            return false;
        }
        if(this.c != ((ReplyPostInfo)object0).c) {
            return false;
        }
        if(!L.g(this.d, ((ReplyPostInfo)object0).d)) {
            return false;
        }
        if(!L.g(this.e, ((ReplyPostInfo)object0).e)) {
            return false;
        }
        return L.g(this.f, ((ReplyPostInfo)object0).f) ? this.g == ((ReplyPostInfo)object0).g : false;
    }

    @l
    public final String f() {
        return this.e;
    }

    @l
    public final String g() {
        return this.f;
    }

    public final boolean h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return (((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + c.a(this.g);
    }

    @l
    public final ReplyPostInfo i(@l String s, @l String s1, int v, @l String s2, @l String s3, @l String s4, boolean z) {
        L.p(s, "galleryId");
        L.p(s1, "galleryName");
        L.p(s2, "subject");
        L.p(s3, "writeUserName");
        L.p(s4, "dateTime");
        return new ReplyPostInfo(s, s1, v, s2, s3, s4, z);
    }

    public static ReplyPostInfo l(ReplyPostInfo replyPostInfo0, String s, String s1, int v, String s2, String s3, String s4, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = replyPostInfo0.a;
        }
        if((v1 & 2) != 0) {
            s1 = replyPostInfo0.b;
        }
        if((v1 & 4) != 0) {
            v = replyPostInfo0.c;
        }
        if((v1 & 8) != 0) {
            s2 = replyPostInfo0.d;
        }
        if((v1 & 16) != 0) {
            s3 = replyPostInfo0.e;
        }
        if((v1 & 0x20) != 0) {
            s4 = replyPostInfo0.f;
        }
        if((v1 & 0x40) != 0) {
            z = replyPostInfo0.g;
        }
        return replyPostInfo0.i(s, s1, v, s2, s3, s4, z);
    }

    public final boolean m() {
        return this.g;
    }

    @l
    public final String o() [...] // 潜在的解密器

    @l
    public final String q() [...] // 潜在的解密器

    @l
    public final String r() [...] // 潜在的解密器

    public final int s() {
        return this.c;
    }

    @l
    public final String t() [...] // 潜在的解密器

    @Override
    @l
    public String toString() {
        return "ReplyPostInfo(galleryId=" + this.a + ", galleryName=" + this.b + ", no=" + this.c + ", subject=" + this.d + ", writeUserName=" + this.e + ", dateTime=" + this.f + ", canManagerBlock=" + this.g + ")";
    }

    @l
    public final String u() [...] // 潜在的解密器

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "out");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeString(this.d);
        parcel0.writeString(this.e);
        parcel0.writeString(this.f);
        parcel0.writeInt(((int)this.g));
    }
}

