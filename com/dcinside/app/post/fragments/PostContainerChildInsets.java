package com.dcinside.app.post.fragments;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class PostContainerChildInsets implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public PostContainerChildInsets a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new PostContainerChildInsets(parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt());
        }

        @l
        public PostContainerChildInsets[] b(int v) {
            return new PostContainerChildInsets[v];
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

        @l
        public final PostContainerChildInsets a() {
            return PostContainerChildInsets.g;
        }
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    @l
    public static final b f;
    @l
    private static final PostContainerChildInsets g;

    static {
        PostContainerChildInsets.f = new b(null);
        PostContainerChildInsets.g = new PostContainerChildInsets(0, 0, 0, 0, 0, 30, null);
        PostContainerChildInsets.CREATOR = new a();
    }

    public PostContainerChildInsets(int v, int v1, int v2, int v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    public PostContainerChildInsets(int v, int v1, int v2, int v3, int v4, int v5, w w0) {
        this(v, ((v5 & 2) == 0 ? v1 : 0), ((v5 & 4) == 0 ? v2 : 0), ((v5 & 8) == 0 ? v3 : 0), ((v5 & 16) == 0 ? v4 : 0));
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.c;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(PostContainerChildInsets.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.dcinside.app.post.fragments.PostContainerChildInsets");
        if(this.a != ((PostContainerChildInsets)object0).a) {
            return false;
        }
        if(this.b != ((PostContainerChildInsets)object0).b) {
            return false;
        }
        if(this.c != ((PostContainerChildInsets)object0).c) {
            return false;
        }
        return this.d == ((PostContainerChildInsets)object0).d ? this.e == ((PostContainerChildInsets)object0).e : false;
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        return this.e;
    }

    @l
    public final PostContainerChildInsets h(int v, int v1, int v2, int v3, int v4) {
        return new PostContainerChildInsets(v, v1, v2, v3, v4);
    }

    @Override
    public int hashCode() {
        return (((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e;
    }

    public static PostContainerChildInsets i(PostContainerChildInsets postContainerChildInsets0, int v, int v1, int v2, int v3, int v4, int v5, Object object0) {
        if((v5 & 1) != 0) {
            v = postContainerChildInsets0.a;
        }
        if((v5 & 2) != 0) {
            v1 = postContainerChildInsets0.b;
        }
        if((v5 & 4) != 0) {
            v2 = postContainerChildInsets0.c;
        }
        if((v5 & 8) != 0) {
            v3 = postContainerChildInsets0.d;
        }
        if((v5 & 16) != 0) {
            v4 = postContainerChildInsets0.e;
        }
        return postContainerChildInsets0.h(v, v1, v2, v3, v4);
    }

    public final int l() {
        return this.e;
    }

    public final int m() {
        return this.b;
    }

    public final int o() {
        return this.d;
    }

    public final int q() {
        return this.c;
    }

    public final int r() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "PostContainerChildInsets(type=" + this.a + ", left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "out");
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
    }
}

