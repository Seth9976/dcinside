package com.dcinside.app.write.menu;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.f;

public final class MenuVisible implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public MenuVisible a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new MenuVisible(parcel0);
        }

        @l
        public MenuVisible[] b(int v) {
            return new MenuVisible[v];
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
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    @l
    public static final b g;

    static {
        MenuVisible.g = new b(null);
        MenuVisible.CREATOR = new a();
    }

    public MenuVisible() {
        this(false, false, false, false, false, false, 0x3F, null);
    }

    public MenuVisible(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(1 == parcel0.readInt(), 1 == parcel0.readInt(), 1 == parcel0.readInt(), 1 == parcel0.readInt(), 1 == parcel0.readInt(), 1 == parcel0.readInt());
    }

    public MenuVisible(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public MenuVisible(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, int v, w w0) {
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? z1 : false), ((v & 4) == 0 ? z2 : false), ((v & 8) == 0 ? z3 : false), ((v & 16) == 0 ? z4 : false), ((v & 0x20) == 0 ? z5 : false));
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean d() {
        return this.d;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.a;
    }

    public final boolean f() {
        return this.b;
    }

    public final boolean g() {
        return this.f;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeInt(((int)this.a));
        parcel0.writeInt(((int)this.b));
        parcel0.writeInt(((int)this.c));
        parcel0.writeInt(((int)this.d));
        parcel0.writeInt(((int)this.e));
        parcel0.writeInt(((int)this.f));
    }
}

