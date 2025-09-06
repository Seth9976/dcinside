package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import j..util.Objects;
import java.util.Arrays;

public final class CalendarConstraints implements Parcelable {
    public interface DateValidator extends Parcelable {
        boolean k(long arg1);
    }

    class a implements Parcelable.Creator {
        a() {
            super();
        }

        @NonNull
        public CalendarConstraints a(@NonNull Parcel parcel0) {
            Parcelable parcelable0 = parcel0.readParcelable(Month.class.getClassLoader());
            Parcelable parcelable1 = parcel0.readParcelable(Month.class.getClassLoader());
            Parcelable parcelable2 = parcel0.readParcelable(Month.class.getClassLoader());
            return new CalendarConstraints(((Month)parcelable0), ((Month)parcelable1), ((DateValidator)parcel0.readParcelable(DateValidator.class.getClassLoader())), ((Month)parcelable2), parcel0.readInt(), null);
        }

        @NonNull
        public CalendarConstraints[] b(int v) {
            return new CalendarConstraints[v];
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

    public static final class b {
        private long a;
        private long b;
        private Long c;
        private int d;
        private DateValidator e;
        static final long f = 0L;
        static final long g = 0L;
        private static final String h = "DEEP_COPY_VALIDATOR_KEY";

        static {
            b.f = C.a(Month.c(1900, 0).f);
            b.g = C.a(Month.c(2100, 11).f);
        }

        public b() {
            this.a = b.f;
            this.b = b.g;
            this.e = DateValidatorPointForward.a(0x8000000000000000L);
        }

        b(@NonNull CalendarConstraints calendarConstraints0) {
            this.a = b.f;
            this.b = b.g;
            this.e = DateValidatorPointForward.a(0x8000000000000000L);
            this.a = calendarConstraints0.a.f;
            this.b = calendarConstraints0.b.f;
            this.c = calendarConstraints0.d.f;
            this.d = calendarConstraints0.e;
            this.e = calendarConstraints0.c;
        }

        @NonNull
        public CalendarConstraints a() {
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
            Month month0 = Month.d(this.a);
            Month month1 = Month.d(this.b);
            Parcelable parcelable0 = bundle0.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            return this.c == null ? new CalendarConstraints(month0, month1, ((DateValidator)parcelable0), null, this.d, null) : new CalendarConstraints(month0, month1, ((DateValidator)parcelable0), Month.d(((long)this.c)), this.d, null);
        }

        @O1.a
        @NonNull
        public b b(long v) {
            this.b = v;
            return this;
        }

        @O1.a
        @NonNull
        public b c(int v) {
            this.d = v;
            return this;
        }

        @O1.a
        @NonNull
        public b d(long v) {
            this.c = v;
            return this;
        }

        @O1.a
        @NonNull
        public b e(long v) {
            this.a = v;
            return this;
        }

        @O1.a
        @NonNull
        public b f(@NonNull DateValidator calendarConstraints$DateValidator0) {
            Objects.requireNonNull(calendarConstraints$DateValidator0, "validator cannot be null");
            this.e = calendarConstraints$DateValidator0;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    @NonNull
    private final Month a;
    @NonNull
    private final Month b;
    @NonNull
    private final DateValidator c;
    @Nullable
    private Month d;
    private final int e;
    private final int f;
    private final int g;

    static {
        CalendarConstraints.CREATOR = new a();
    }

    private CalendarConstraints(@NonNull Month month0, @NonNull Month month1, @NonNull DateValidator calendarConstraints$DateValidator0, @Nullable Month month2, int v) {
        Objects.requireNonNull(month0, "start cannot be null");
        Objects.requireNonNull(month1, "end cannot be null");
        Objects.requireNonNull(calendarConstraints$DateValidator0, "validator cannot be null");
        this.a = month0;
        this.b = month1;
        this.d = month2;
        this.e = v;
        this.c = calendarConstraints$DateValidator0;
        if(month2 != null && month0.a(month2) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if(month2 != null && month2.a(month1) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if(v < 0 || v > C.x().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.g = month0.r(month1) + 1;
        this.f = month1.c - month0.c + 1;
    }

    CalendarConstraints(Month month0, Month month1, DateValidator calendarConstraints$DateValidator0, Month month2, int v, a calendarConstraints$a0) {
        this(month0, month1, calendarConstraints$DateValidator0, month2, v);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof CalendarConstraints ? this.a.equals(((CalendarConstraints)object0).a) && this.b.equals(((CalendarConstraints)object0).b) && ObjectsCompat.a(this.d, ((CalendarConstraints)object0).d) && this.e == ((CalendarConstraints)object0).e && this.c.equals(((CalendarConstraints)object0).c) : false;
    }

    Month g(Month month0) {
        if(month0.a(this.a) < 0) {
            return this.a;
        }
        return month0.a(this.b) <= 0 ? month0 : this.b;
    }

    public DateValidator h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, this.e, this.c});
    }

    @NonNull
    Month i() {
        return this.b;
    }

    public long l() {
        return this.b.f;
    }

    int m() {
        return this.e;
    }

    int o() {
        return this.g;
    }

    @Nullable
    Month q() {
        return this.d;
    }

    @Nullable
    public Long r() {
        return this.d == null ? null : this.d.f;
    }

    @NonNull
    Month s() {
        return this.a;
    }

    public long t() {
        return this.a.f;
    }

    int u() {
        return this.f;
    }

    boolean v(long v) {
        return this.a.g(1) <= v && v <= this.b.g(this.b.e);
    }

    void w(@Nullable Month month0) {
        this.d = month0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.a, 0);
        parcel0.writeParcelable(this.b, 0);
        parcel0.writeParcelable(this.d, 0);
        parcel0.writeParcelable(this.c, 0);
        parcel0.writeInt(this.e);
    }
}

