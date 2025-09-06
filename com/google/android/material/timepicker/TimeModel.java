package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.R.string;
import java.util.Arrays;

class TimeModel implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public TimeModel a(Parcel parcel0) {
            return new TimeModel(parcel0);
        }

        public TimeModel[] b(int v) {
            return new TimeModel[v];
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

    public static final Parcelable.Creator CREATOR = null;
    private final f a;
    private final f b;
    final int c;
    int d;
    int e;
    int f;
    int g;
    public static final String h = "%02d";
    public static final String i = "%d";

    static {
        TimeModel.CREATOR = new a();
    }

    public TimeModel() {
        this(0);
    }

    public TimeModel(int v) {
        this(0, 0, 10, v);
    }

    public TimeModel(int v, int v1, int v2, int v3) {
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.c = v3;
        this.g = TimeModel.h(v);
        this.a = new f(59);
        this.b = new f((v3 == 1 ? 23 : 12));
    }

    protected TimeModel(Parcel parcel0) {
        this(parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt());
    }

    @Nullable
    public static String a(Resources resources0, CharSequence charSequence0) {
        return TimeModel.c(resources0, charSequence0, "%02d");
    }

    @Nullable
    public static String c(Resources resources0, CharSequence charSequence0, String s) {
        try {
            return String.format(resources0.getConfiguration().locale, s, Integer.parseInt(String.valueOf(charSequence0)));
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    @StringRes
    public int d() {
        return this.c == 1 ? string.material_hour_24h_suffix : string.material_hour_suffix;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        if(this.c == 1) {
            return this.d % 24;
        }
        int v = this.d;
        if(v % 12 == 0) {
            return 12;
        }
        return this.g == 1 ? v - 12 : v;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TimeModel ? this.d == ((TimeModel)object0).d && this.e == ((TimeModel)object0).e && this.c == ((TimeModel)object0).c && this.f == ((TimeModel)object0).f : false;
    }

    public f f() {
        return this.b;
    }

    public f g() {
        return this.a;
    }

    private static int h(int v) {
        return v < 12 ? 0 : 1;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.e, this.f});
    }

    public void i(int v) {
        int v1 = 12;
        if(this.c == 1) {
            this.d = v;
            return;
        }
        if(this.g != 1) {
            v1 = 0;
        }
        this.d = v % 12 + v1;
    }

    public void l(int v) {
        this.g = TimeModel.h(v);
        this.d = v;
    }

    public void m(@IntRange(from = 0L, to = 59L) int v) {
        this.e = v % 60;
    }

    public void o(int v) {
        if(v != this.g) {
            this.g = v;
            int v1 = this.d;
            if(v1 < 12 && v == 1) {
                this.d = v1 + 12;
                return;
            }
            if(v1 >= 12 && v == 0) {
                this.d = v1 - 12;
            }
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeInt(this.f);
        parcel0.writeInt(this.c);
    }
}

