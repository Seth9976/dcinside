package com.dcinside.app.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class SearchAdExtension implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public SearchAdExtension a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new SearchAdExtension(parcel0);
        }

        @l
        public SearchAdExtension[] b(int v) {
            return new SearchAdExtension[v];
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
    @c("clickUrl")
    @m
    private final String a;
    @c(alternate = {"name", "imageUrl"}, value = "headline")
    @m
    private final String b;
    @l
    public static final b c;

    static {
        SearchAdExtension.c = new b(null);
        SearchAdExtension.CREATOR = new a();
    }

    public SearchAdExtension() {
        this(null, null, 3, null);
    }

    public SearchAdExtension(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readString(), parcel0.readString());
    }

    public SearchAdExtension(@m String s, @m String s1) {
        this.a = s;
        this.b = s1;
    }

    public SearchAdExtension(String s, String s1, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        this(s, s1);
    }

    @m
    public final String a() {
        return this.b;
    }

    @m
    public final String c() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
    }
}

