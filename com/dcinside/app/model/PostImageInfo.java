package com.dcinside.app.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class PostImageInfo implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public PostImageInfo a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new PostImageInfo(parcel0);
        }

        @l
        public PostImageInfo[] b(int v) {
            return new PostImageInfo[v];
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

        public final boolean a(@m PostImageInfo postImageInfo0) {
            if(postImageInfo0 != null) {
                String s = postImageInfo0.a();
                if(s != null && s.length() > 0) {
                    String s1 = postImageInfo0.c();
                    return s1 != null && s1.length() > 0;
                }
            }
            return false;
        }
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    @m
    private final String a;
    @m
    private final String b;
    @m
    private final String c;
    private final boolean d;
    private final boolean e;
    private boolean f;
    @l
    public static final b g;

    static {
        PostImageInfo.g = new b(null);
        PostImageInfo.CREATOR = new a();
    }

    public PostImageInfo() {
        this(null, null, null, false, false, false, 0x3F, null);
    }

    public PostImageInfo(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readString(), parcel0.readString(), parcel0.readString(), 1 == parcel0.readInt(), 1 == parcel0.readInt(), 1 == parcel0.readInt());
    }

    public PostImageInfo(@m String s, @m String s1, @m String s2, boolean z, boolean z1, boolean z2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = z;
        this.e = z1;
        this.f = z2;
    }

    public PostImageInfo(String s, String s1, String s2, boolean z, boolean z1, boolean z2, int v, w w0) {
        this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? z : false), ((v & 16) == 0 ? z1 : false), ((v & 0x20) == 0 ? z2 : false));
    }

    @m
    public final String a() {
        return this.b;
    }

    @m
    public final String c() {
        return this.c;
    }

    @m
    public final String d() {
        return this.a;
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
        if(!L.g(PostImageInfo.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.dcinside.app.model.PostImageInfo");
        return L.g(this.a, ((PostImageInfo)object0).a);
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.f;
    }

    public final void h(boolean z) {
        this.f = z;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v) * 0x1F + c.a(this.d)) * 0x1F + c.a(this.e)) * 0x1F + c.a(this.f);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeInt(((int)this.d));
        parcel0.writeInt(((int)this.e));
        parcel0.writeInt(((int)this.f));
    }
}

