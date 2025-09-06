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

public final class PostHeadPlaceHolder implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public PostHeadPlaceHolder a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new PostHeadPlaceHolder(parcel0);
        }

        @l
        public PostHeadPlaceHolder[] b(int v) {
            return new PostHeadPlaceHolder[v];
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
    private int a;
    @c("msg")
    @m
    private String b;
    @l
    public static final b c;

    static {
        PostHeadPlaceHolder.c = new b(null);
        PostHeadPlaceHolder.CREATOR = new a();
    }

    public PostHeadPlaceHolder() {
        this(0, null, 3, null);
    }

    public PostHeadPlaceHolder(int v, @m String s) {
        this.a = v;
        this.b = s;
    }

    public PostHeadPlaceHolder(int v, String s, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            s = null;
        }
        this(v, s);
    }

    public PostHeadPlaceHolder(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        this(parcel0.readInt(), parcel0.readString());
    }

    public final int a() {
        return this.a;
    }

    @m
    public final String c() {
        return this.b;
    }

    @l
    public final PostHeadPlaceHolder d(int v, @m String s) {
        return new PostHeadPlaceHolder(v, s);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static PostHeadPlaceHolder e(PostHeadPlaceHolder postHeadPlaceHolder0, int v, String s, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = postHeadPlaceHolder0.a;
        }
        if((v1 & 2) != 0) {
            s = postHeadPlaceHolder0.b;
        }
        return postHeadPlaceHolder0.d(v, s);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PostHeadPlaceHolder)) {
            return false;
        }
        return this.a == ((PostHeadPlaceHolder)object0).a ? L.g(this.b, ((PostHeadPlaceHolder)object0).b) : false;
    }

    public final int f() {
        return this.a;
    }

    @m
    public final String g() {
        return this.b;
    }

    public final void h(int v) {
        this.a = v;
    }

    @Override
    public int hashCode() {
        int v = this.a * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    public final void i(@m String s) {
        this.b = s;
    }

    @Override
    @l
    public String toString() {
        return "PostHeadPlaceHolder(id=" + this.a + ", placeholder=" + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeInt(this.a);
        parcel0.writeString(this.b);
    }
}

