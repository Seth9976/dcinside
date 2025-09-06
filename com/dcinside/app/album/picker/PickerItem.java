package com.dcinside.app.album.picker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class PickerItem implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public PickerItem a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new PickerItem(parcel0);
        }

        @l
        public PickerItem[] b(int v) {
            return new PickerItem[v];
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
    @l
    private final String b;
    private final boolean c;
    private final long d;
    private final long e;
    @l
    public static final b f;

    static {
        PickerItem.f = new b(null);
        PickerItem.CREATOR = new a();
    }

    public PickerItem(@l Parcel parcel0) {
        L.p(parcel0, "source");
        String s = parcel0.readString();
        String s1 = parcel0.readString();
        this((s == null ? "" : s), (s1 == null ? "" : s1), 1 == parcel0.readInt(), parcel0.readLong(), parcel0.readLong());
    }

    public PickerItem(@l String s, @l String s1, boolean z, long v, long v1) {
        L.p(s, "path");
        L.p(s1, "ext");
        super();
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = v;
        this.e = v1;
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PickerItem)) {
            return false;
        }
        if(!L.g(this.a, ((PickerItem)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((PickerItem)object0).b)) {
            return false;
        }
        if(this.c != ((PickerItem)object0).c) {
            return false;
        }
        return this.d == ((PickerItem)object0).d ? this.e == ((PickerItem)object0).e : false;
    }

    public final long f() {
        return this.e;
    }

    @l
    public final PickerItem g(@l String s, @l String s1, boolean z, long v, long v1) {
        L.p(s, "path");
        L.p(s1, "ext");
        return new PickerItem(s, s1, z, v, v1);
    }

    public static PickerItem h(PickerItem pickerItem0, String s, String s1, boolean z, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = pickerItem0.a;
        }
        if((v2 & 2) != 0) {
            s1 = pickerItem0.b;
        }
        if((v2 & 4) != 0) {
            z = pickerItem0.c;
        }
        if((v2 & 8) != 0) {
            v = pickerItem0.d;
        }
        if((v2 & 16) != 0) {
            v1 = pickerItem0.e;
        }
        return pickerItem0.g(s, s1, z, v, v1);
    }

    @Override
    public int hashCode() {
        return (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + c.a(this.c)) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + ((int)(this.e ^ this.e >>> 0x20));
    }

    public final long i() {
        return this.e;
    }

    @l
    public final String l() {
        return this.b;
    }

    @l
    public final String m() {
        return this.a;
    }

    public final long o() {
        return this.d;
    }

    public final boolean q() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "PickerItem(path=" + this.a + ", ext=" + this.b + ", isVideo=" + this.c + ", size=" + this.d + ", duration=" + this.e + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeInt(((int)this.c));
        parcel0.writeLong(this.d);
        parcel0.writeLong(this.e);
    }
}

