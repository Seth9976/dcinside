package com.dcinside.app.model;

import O3.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@d
public final class Mention implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public final Mention a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new Mention(parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readInt());
        }

        @l
        public final Mention[] b(int v) {
            return new Mention[v];
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
    @c("name")
    @l
    private final String a;
    @c("target_no")
    @l
    private final String b;
    @c("number")
    @l
    private final String c;
    @c("ip")
    @l
    private final String d;
    @c("is_user")
    private final int e;

    static {
        Mention.CREATOR = new a();
    }

    public Mention() {
        this(null, null, null, null, 0, 0x1F, null);
    }

    public Mention(@l String s, @l String s1, @l String s2, @l String s3, int v) {
        L.p(s, "name");
        L.p(s1, "targetNo");
        L.p(s2, "guestKey");
        L.p(s3, "ip");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = v;
    }

    public Mention(String s, String s1, String s2, String s3, int v, int v1, w w0) {
        this(((v1 & 1) == 0 ? s : ""), ((v1 & 2) == 0 ? s1 : ""), ((v1 & 4) == 0 ? s2 : ""), ((v1 & 8) == 0 ? s3 : ""), ((v1 & 16) == 0 ? v : 0));
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final String c() {
        return this.b;
    }

    @l
    public final String d() {
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
        if(!(object0 instanceof Mention)) {
            return false;
        }
        if(!L.g(this.a, ((Mention)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((Mention)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((Mention)object0).c)) {
            return false;
        }
        return L.g(this.d, ((Mention)object0).d) ? this.e == ((Mention)object0).e : false;
    }

    public final int f() {
        return this.e;
    }

    @l
    public final Mention g(@l String s, @l String s1, @l String s2, @l String s3, int v) {
        L.p(s, "name");
        L.p(s1, "targetNo");
        L.p(s2, "guestKey");
        L.p(s3, "ip");
        return new Mention(s, s1, s2, s3, v);
    }

    public static Mention h(Mention mention0, String s, String s1, String s2, String s3, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = mention0.a;
        }
        if((v1 & 2) != 0) {
            s1 = mention0.b;
        }
        if((v1 & 4) != 0) {
            s2 = mention0.c;
        }
        if((v1 & 8) != 0) {
            s3 = mention0.d;
        }
        if((v1 & 16) != 0) {
            v = mention0.e;
        }
        return mention0.g(s, s1, s2, s3, v);
    }

    @Override
    public int hashCode() {
        return (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e;
    }

    @l
    public final String i() [...] // 潜在的解密器

    @l
    public final String l() [...] // 潜在的解密器

    @l
    public final String m() [...] // 潜在的解密器

    @l
    public final String o() [...] // 潜在的解密器

    public final int q() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        return "Mention(name=" + this.a + ", targetNo=" + this.b + ", guestKey=" + this.c + ", ip=" + this.d + ", user=" + this.e + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "out");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeInt(this.e);
    }
}

