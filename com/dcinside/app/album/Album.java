package com.dcinside.app.album;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class Album implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public Album a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new Album(parcel0);
        }

        @l
        public Album[] b(int v) {
            return new Album[v];
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
    private long a;
    private long b;
    @m
    private String c;
    @m
    private String d;
    @m
    private String e;
    private int f;
    private int g;
    private int h;
    @l
    public static final b i;

    static {
        Album.i = new b(null);
        Album.CREATOR = new a();
    }

    public Album() {
        this(0L, 0L, null, null, null, 0, 0, 0, 0xFF, null);
    }

    public Album(long v, long v1, @m String s, @m String s1, @m String s2, int v2, int v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = v2;
        this.g = v3;
        this.h = v4;
    }

    public Album(long v, long v1, String s, String s1, String s2, int v2, int v3, int v4, int v5, w w0) {
        this(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0L), ((v5 & 4) == 0 ? s : null), ((v5 & 8) == 0 ? s1 : null), ((v5 & 16) == 0 ? s2 : null), ((v5 & 0x20) == 0 ? v2 : 0), ((v5 & 0x40) == 0 ? v3 : 0), ((v5 & 0x80) == 0 ? v4 : 0));
    }

    public Album(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readLong(), parcel0.readLong(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt());
    }

    public final long a() {
        return this.b;
    }

    @m
    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @m
    public final String e() {
        return this.d;
    }

    public final int f() {
        return this.g;
    }

    public final int g() {
        return this.f;
    }

    @m
    public final String h() {
        return this.e;
    }

    public final int i() {
        return this.h;
    }

    public final void l(long v) {
        this.b = v;
    }

    public final void m(@m String s) {
        this.c = s;
    }

    public final void o(long v) {
        this.a = v;
    }

    public final void q(@m String s) {
        this.d = s;
    }

    public final void r(int v) {
        this.g = v;
    }

    public final void s(int v) {
        this.f = v;
    }

    public final void t(@m String s) {
        this.e = s;
    }

    public final void u(int v) {
        this.h = v;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeLong(this.a);
        parcel0.writeLong(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeString(this.e);
        parcel0.writeInt(this.f);
        parcel0.writeInt(this.g);
        parcel0.writeInt(this.h);
    }
}

