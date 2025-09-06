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

public final class PostHead implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public PostHead a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new PostHead(parcel0);
        }

        @l
        public PostHead[] b(int v) {
            return new PostHead[v];
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
    @c("no")
    private final int a;
    @c("name")
    @m
    private final String b;
    @c("level")
    private final int c;
    @c("selected")
    private final boolean d;
    @c("recomm_unused")
    private final boolean e;
    @l
    public static final b f;

    static {
        PostHead.f = new b(null);
        PostHead.CREATOR = new a();
    }

    public PostHead() {
        this(0, null, 0, false, false, 0x1F, null);
    }

    public PostHead(int v, @m String s, int v1, boolean z, boolean z1) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = z;
        this.e = z1;
    }

    public PostHead(int v, String s, int v1, boolean z, boolean z1, int v2, w w0) {
        if((v2 & 2) != 0) {
            s = null;
        }
        this(((v2 & 1) == 0 ? v : 0), s, ((v2 & 4) == 0 ? v1 : 0), ((v2 & 8) == 0 ? z : false), ((v2 & 16) == 0 ? z1 : false));
    }

    public PostHead(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readInt(), parcel0.readString(), parcel0.readInt(), 1 == parcel0.readInt(), 1 == parcel0.readInt());
    }

    public final int a() {
        return this.a;
    }

    @m
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

    public final boolean e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(PostHead.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.dcinside.app.response.PostHead");
        if(this.a != ((PostHead)object0).a) {
            return false;
        }
        if(!L.g(this.b, ((PostHead)object0).b)) {
            return false;
        }
        if(this.c != ((PostHead)object0).c) {
            return false;
        }
        return this.d == ((PostHead)object0).d ? this.e == ((PostHead)object0).e : false;
    }

    public final boolean f() {
        return this.e;
    }

    @l
    public final PostHead g(int v, @m String s, int v1, boolean z, boolean z1) {
        return new PostHead(v, s, v1, z, z1);
    }

    public static PostHead h(PostHead postHead0, int v, String s, int v1, boolean z, boolean z1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = postHead0.a;
        }
        if((v2 & 2) != 0) {
            s = postHead0.b;
        }
        if((v2 & 4) != 0) {
            v1 = postHead0.c;
        }
        if((v2 & 8) != 0) {
            z = postHead0.d;
        }
        if((v2 & 16) != 0) {
            z1 = postHead0.e;
        }
        return postHead0.g(v, s, v1, z, z1);
    }

    @Override
    public int hashCode() {
        int v = this.a * 0x1F;
        return this.b == null ? ((v * 0x1F + this.c) * 0x1F + androidx.compose.foundation.c.a(this.d)) * 0x1F + androidx.compose.foundation.c.a(this.e) : (((v + this.b.hashCode()) * 0x1F + this.c) * 0x1F + androidx.compose.foundation.c.a(this.d)) * 0x1F + androidx.compose.foundation.c.a(this.e);
    }

    public final int i() {
        return this.a;
    }

    public final int l() {
        return this.c;
    }

    @m
    public final String m() {
        return this.b;
    }

    public final boolean o() {
        return this.d;
    }

    public final boolean q() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        return "PostHead(id=" + this.a + ", name=" + this.b + ", level=" + this.c + ", selected=" + this.d + ", isShield=" + this.e + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeInt(this.a);
        parcel0.writeString(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeInt(((int)this.d));
        parcel0.writeInt(((int)this.e));
    }
}

