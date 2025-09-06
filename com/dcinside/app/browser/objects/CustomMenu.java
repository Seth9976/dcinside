package com.dcinside.app.browser.objects;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class CustomMenu implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public CustomMenu a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new CustomMenu(parcel0);
        }

        @l
        public CustomMenu[] b(int v) {
            return new CustomMenu[v];
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
    private final int a;
    @m
    private final String b;
    @l
    public static final b c;

    static {
        CustomMenu.c = new b(null);
        CustomMenu.CREATOR = new a();
    }

    public CustomMenu(@StringRes int v, @m String s) {
        this.a = v;
        this.b = s;
    }

    public CustomMenu(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readInt(), parcel0.readString());
    }

    @m
    public final String a() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeInt(this.a);
        parcel0.writeString(this.b);
    }
}

