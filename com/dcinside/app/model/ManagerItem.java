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

public final class ManagerItem implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public ManagerItem a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new ManagerItem(parcel0);
        }

        @l
        public ManagerItem[] b(int v) {
            return new ManagerItem[v];
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
    @c(alternate = {"user_id"}, value = "id")
    @m
    private final String a;
    @c("name")
    @m
    private final String b;
    @c("situation")
    @m
    private final String c;
    @com.dcinside.app.util.Ik.a
    private final int d;
    @l
    public static final b e;

    static {
        ManagerItem.e = new b(null);
        ManagerItem.CREATOR = new a();
    }

    public ManagerItem() {
        this(null, null, null, 0, 15, null);
    }

    public ManagerItem(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readString(), parcel0.readString(), parcel0.readString(), 0, 8, null);
    }

    public ManagerItem(@m String s, @m String s1, @m String s2, int v) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = v;
    }

    public ManagerItem(String s, String s1, String s2, int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            s = null;
        }
        if((v1 & 2) != 0) {
            s1 = null;
        }
        if((v1 & 4) != 0) {
            s2 = null;
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        this(s, s1, s2, v);
    }

    @m
    public final String a() {
        return this.a;
    }

    @m
    public final String c() {
        return this.b;
    }

    @m
    public final String d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ManagerItem)) {
            return false;
        }
        if(!L.g(this.a, ((ManagerItem)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((ManagerItem)object0).b)) {
            return false;
        }
        return L.g(this.c, ((ManagerItem)object0).c) ? this.d == ((ManagerItem)object0).d : false;
    }

    @l
    public final ManagerItem f(@m String s, @m String s1, @m String s2, int v) {
        return new ManagerItem(s, s1, s2, v);
    }

    public static ManagerItem g(ManagerItem managerItem0, String s, String s1, String s2, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = managerItem0.a;
        }
        if((v1 & 2) != 0) {
            s1 = managerItem0.b;
        }
        if((v1 & 4) != 0) {
            s2 = managerItem0.c;
        }
        if((v1 & 8) != 0) {
            v = managerItem0.d;
        }
        return managerItem0.f(s, s1, s2, v);
    }

    public final int h() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v) * 0x1F + this.d;
    }

    @m
    public final String i() {
        return this.a;
    }

    @m
    public final String l() {
        return this.b;
    }

    @m
    public final String m() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "ManagerItem(id=" + this.a + ", name=" + this.b + ", situation=" + this.c + ", days=" + this.d + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
    }
}

