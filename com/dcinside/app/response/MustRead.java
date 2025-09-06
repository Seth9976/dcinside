package com.dcinside.app.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class MustRead implements Parcelable {
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public MustRead a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new MustRead(parcel0);
        }

        @l
        public MustRead[] b(int v) {
            return new MustRead[v];
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
    public static final a CREATOR;
    @c("subject")
    @l
    private String a;
    @c("no")
    private final int b;

    static {
        MustRead.CREATOR = new a(null);
    }

    public MustRead() {
        this(null, 0, 3, null);
    }

    public MustRead(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        this(parcel0.readString(), parcel0.readInt());
    }

    public MustRead(@l String s, int v) {
        L.p(s, "subject");
        super();
        this.a = s;
        this.b = v;
    }

    public MustRead(String s, int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            s = "";
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        this(s, v);
    }

    @l
    public final String a() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    @l
    public final MustRead d(@l String s, int v) {
        L.p(s, "subject");
        return new MustRead(s, v);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static MustRead e(MustRead mustRead0, String s, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = mustRead0.a;
        }
        if((v1 & 2) != 0) {
            v = mustRead0.b;
        }
        return mustRead0.d(s, v);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MustRead)) {
            return false;
        }
        return L.g(this.a, ((MustRead)object0).a) ? this.b == ((MustRead)object0).b : false;
    }

    public final int f() {
        return this.b;
    }

    @l
    public final String g() [...] // 潜在的解密器

    public final void h(@l String s) {
        L.p(s, "<set-?>");
        this.a = s;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        return "MustRead(subject=" + this.a + ", postNumber=" + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeString(this.a);
        parcel0.writeInt(this.b);
    }
}

