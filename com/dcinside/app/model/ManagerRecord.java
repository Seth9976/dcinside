package com.dcinside.app.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class ManagerRecord implements Parcelable {
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public ManagerRecord a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new ManagerRecord(parcel0);
        }

        @l
        public ManagerRecord[] b(int v) {
            return new ManagerRecord[v];
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
    @c("history")
    @m
    private final List a;

    static {
        ManagerRecord.CREATOR = new a(null);
    }

    public ManagerRecord() {
        this(null, 1, null);
    }

    public ManagerRecord(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        this(parcel0.createTypedArrayList(ManagerRecordData.CREATOR));
    }

    public ManagerRecord(@m List list0) {
        this.a = list0;
    }

    public ManagerRecord(List list0, int v, w w0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        this(list0);
    }

    @m
    public final List a() {
        return this.a;
    }

    @l
    public final ManagerRecord c(@m List list0) {
        return new ManagerRecord(list0);
    }

    public static ManagerRecord d(ManagerRecord managerRecord0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = managerRecord0.a;
        }
        return managerRecord0.c(list0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @m
    public final List e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ManagerRecord ? L.g(this.a, ((ManagerRecord)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "ManagerRecord(record=" + this.a + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeTypedList(this.a);
    }
}

