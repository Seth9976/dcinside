package com.dcinside.app.util.otp;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.common.base.B;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class PinInfo implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @m
        public PinInfo a(@l Parcel parcel0) {
            L.p(parcel0, "in");
            return new PinInfo(parcel0);
        }

        @l
        public PinInfo[] b(int v) {
            return new PinInfo[v];
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

        public final void a(@l PinInfo[] arr_pinInfo, int v, int v1) {
            L.p(arr_pinInfo, "pinInfoArray");
            PinInfo pinInfo0 = arr_pinInfo[v];
            arr_pinInfo[v] = arr_pinInfo[v1];
            arr_pinInfo[v1] = pinInfo0;
        }
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    @m
    private String a;
    @m
    private final d b;
    private final boolean c;
    private boolean d;
    @l
    public static final b e;

    static {
        PinInfo.e = new b(null);
        PinInfo.CREATOR = new a();
    }

    public PinInfo(@l Parcel parcel0) {
        L.p(parcel0, "pc");
        super();
        this.a = (String)parcel0.readValue(PinInfo.class.getClassLoader());
        this.b = (d)parcel0.readSerializable();
        boolean[] arr_z = new boolean[2];
        parcel0.readBooleanArray(arr_z);
        this.c = arr_z[0];
        this.d = arr_z[1];
    }

    public PinInfo(@m d b$d0) {
        this(b$d0, false);
    }

    public PinInfo(@m d b$d0, boolean z) {
        L.m(b$d0);
        this.b = b$d0;
        this.c = z;
    }

    @m
    public final d a() {
        return this.b;
    }

    @m
    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof PinInfo ? B.a(((PinInfo)object0).b, this.b) && B.a(Boolean.valueOf(((PinInfo)object0).c), Boolean.valueOf(this.c)) && B.a(((PinInfo)object0).a, this.a) && B.a(Boolean.valueOf(((PinInfo)object0).d), Boolean.valueOf(this.d)) : false;
    }

    @l
    public final PinInfo f(boolean z) {
        this.d = z;
        return this;
    }

    @l
    public final PinInfo g(@m String s) {
        this.a = s;
        return this;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override
    @l
    public String toString() {
        String s = String.format("PinInfo {mPin=%s, mIndex=%s, mIsHotp=%s, mHotpCodeGenerationAllowed=%s}", this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d));
        L.o(s, "format(...)");
        return s;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "pc");
        parcel0.writeValue(this.a);
        parcel0.writeSerializable(this.b);
        parcel0.writeBooleanArray(new boolean[]{this.c, this.d});
    }
}

