package com.dcinside.app.settings.image;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class DefaultImageInfo implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public DefaultImageInfo a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new DefaultImageInfo(parcel0);
        }

        @l
        public DefaultImageInfo[] b(int v) {
            return new DefaultImageInfo[v];
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
    @m
    private final String a;
    @m
    private final String b;
    @l
    public static final b c;

    static {
        DefaultImageInfo.c = new b(null);
        DefaultImageInfo.CREATOR = new a();
    }

    public DefaultImageInfo(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        this(parcel0.readString(), parcel0.readString());
    }

    public DefaultImageInfo(@m String s, @m String s1) {
        this.a = s;
        this.b = s1;
    }

    @m
    public final String a() {
        return this.a;
    }

    @m
    public final String c() {
        return this.b;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
    }
}

