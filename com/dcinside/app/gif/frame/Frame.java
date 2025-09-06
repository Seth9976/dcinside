package com.dcinside.app.gif.frame;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.f;

public final class Frame implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public Frame a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new Frame(parcel0);
        }

        @l
        public Frame[] b(int v) {
            return new Frame[v];
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
    private final long a;
    @l
    private final String b;
    private int c;
    private int d;
    @l
    public static final b e;

    static {
        Frame.e = new b(null);
        Frame.CREATOR = new a();
    }

    public Frame(long v, @l String s, int v1, int v2) {
        L.p(s, "image");
        super();
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
    }

    public Frame(@l Parcel parcel0) {
        L.p(parcel0, "source");
        long v = parcel0.readLong();
        String s = parcel0.readString();
        if(s == null) {
            s = "";
        }
        this(v, s, parcel0.readInt(), parcel0.readInt());
    }

    public final int a() {
        return this.d;
    }

    @l
    public final String c() {
        return this.b;
    }

    public final long d() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.c;
    }

    public final void f(int v) {
        this.d = v;
    }

    public final void g(int v) {
        this.c = v;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeLong(this.a);
        parcel0.writeString(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.d);
    }
}

