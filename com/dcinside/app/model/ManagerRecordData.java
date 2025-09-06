package com.dcinside.app.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class ManagerRecordData implements Parcelable {
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public ManagerRecordData a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new ManagerRecordData(parcel0);
        }

        @l
        public ManagerRecordData[] b(int v) {
            return new ManagerRecordData[v];
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

    @l
    public static final a CREATOR;
    @c("content")
    @m
    private final String a;
    @c("date")
    @m
    private final String b;
    @c("manager")
    @m
    private final String c;

    static {
        ManagerRecordData.CREATOR = new a(null);
    }

    public ManagerRecordData() {
        this(null, null, null, 7, null);
    }

    public ManagerRecordData(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        this(parcel0.readString(), parcel0.readString(), parcel0.readString());
    }

    public ManagerRecordData(@m String s, @m String s1, @m String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    public ManagerRecordData(String s, String s1, String s2, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        this(s, s1, s2);
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

    @l
    public final ManagerRecordData e(@m String s, @m String s1, @m String s2) {
        return new ManagerRecordData(s, s1, s2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ManagerRecordData)) {
            return false;
        }
        if(!L.g(this.a, ((ManagerRecordData)object0).a)) {
            return false;
        }
        return L.g(this.b, ((ManagerRecordData)object0).b) ? L.g(this.c, ((ManagerRecordData)object0).c) : false;
    }

    public static ManagerRecordData f(ManagerRecordData managerRecordData0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = managerRecordData0.a;
        }
        if((v & 2) != 0) {
            s1 = managerRecordData0.b;
        }
        if((v & 4) != 0) {
            s2 = managerRecordData0.c;
        }
        return managerRecordData0.e(s, s1, s2);
    }

    @m
    public final String g() {
        return this.a;
    }

    @m
    public final String h() {
        return this.b;
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
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @m
    public final String i() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "ManagerRecordData(content=" + this.a + ", date=" + this.b + ", manager=" + this.c + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
    }
}

