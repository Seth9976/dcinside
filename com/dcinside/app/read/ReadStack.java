package com.dcinside.app.read;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class ReadStack implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public ReadStack a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new ReadStack(parcel0);
        }

        @l
        public ReadStack[] b(int v) {
            return new ReadStack[v];
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
    @l
    private final String a;
    private final int b;
    private final boolean c;
    @m
    private String d;
    @l
    public static final b e;

    static {
        ReadStack.e = new b(null);
        ReadStack.CREATOR = new a();
    }

    public ReadStack(@l Parcel parcel0) {
        L.p(parcel0, "source");
        String s = parcel0.readString();
        String s1 = "";
        if(s == null) {
            s = "";
        }
        int v = parcel0.readInt();
        boolean z = 1 == parcel0.readInt();
        String s2 = parcel0.readString();
        if(s2 != null) {
            s1 = s2;
        }
        this(s, v, z, s1);
    }

    public ReadStack(@l String s, int v, boolean z, @m String s1) {
        L.p(s, "galleryId");
        super();
        this.a = s;
        this.b = v;
        this.c = z;
        this.d = s1;
    }

    @l
    public final String a() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    @m
    public final String d() {
        return this.d;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.c;
    }

    public final void f(@m String s) {
        this.d = s;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeString(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeInt(((int)this.c));
        parcel0.writeString(this.d);
    }
}

