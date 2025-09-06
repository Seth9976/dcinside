package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Parcelable, Comparable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        @NonNull
        public Month a(@NonNull Parcel parcel0) {
            return Month.c(parcel0.readInt(), parcel0.readInt());
        }

        @NonNull
        public Month[] b(int v) {
            return new Month[v];
        }

        @Override  // android.os.Parcelable$Creator
        @NonNull
        public Object createFromParcel(@NonNull Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        @NonNull
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static final Parcelable.Creator CREATOR;
    @NonNull
    private final Calendar a;
    final int b;
    final int c;
    final int d;
    final int e;
    final long f;
    @Nullable
    private String g;

    static {
        Month.CREATOR = new a();
    }

    private Month(@NonNull Calendar calendar0) {
        calendar0.set(5, 1);
        Calendar calendar1 = C.f(calendar0);
        this.a = calendar1;
        this.b = calendar1.get(2);
        this.c = calendar1.get(1);
        this.d = calendar1.getMaximum(7);
        this.e = calendar1.getActualMaximum(5);
        this.f = calendar1.getTimeInMillis();
    }

    public int a(@NonNull Month month0) {
        return this.a.compareTo(month0.a);
    }

    @NonNull
    static Month c(int v, int v1) {
        Calendar calendar0 = C.x();
        calendar0.set(1, v);
        calendar0.set(2, v1);
        return new Month(calendar0);
    }

    @Override
    public int compareTo(@NonNull Object object0) {
        return this.a(((Month)object0));
    }

    @NonNull
    static Month d(long v) {
        Calendar calendar0 = C.x();
        calendar0.setTimeInMillis(v);
        return new Month(calendar0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    static Month e() {
        return new Month(C.v());
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Month ? this.b == ((Month)object0).b && this.c == ((Month)object0).c : false;
    }

    int f(int v) {
        int v1 = this.a.get(7);
        if(v <= 0) {
            v = this.a.getFirstDayOfWeek();
        }
        int v2 = v1 - v;
        return v2 >= 0 ? v2 : v2 + this.d;
    }

    long g(int v) {
        Calendar calendar0 = C.f(this.a);
        calendar0.set(5, v);
        return calendar0.getTimeInMillis();
    }

    int h(long v) {
        Calendar calendar0 = C.f(this.a);
        calendar0.setTimeInMillis(v);
        return calendar0.get(5);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @NonNull
    String i() {
        if(this.g == null) {
            this.g = j.l(this.a.getTimeInMillis());
        }
        return this.g;
    }

    long l() {
        return this.a.getTimeInMillis();
    }

    @NonNull
    Month m(int v) {
        Calendar calendar0 = C.f(this.a);
        calendar0.add(2, v);
        return new Month(calendar0);
    }

    int r(@NonNull Month month0) {
        if(!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month0.c - this.c) * 12 + (month0.b - this.b);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.b);
    }
}

