package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import java.util.Arrays;

public class DateValidatorPointBackward implements DateValidator {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        @NonNull
        public DateValidatorPointBackward a(@NonNull Parcel parcel0) {
            return new DateValidatorPointBackward(parcel0.readLong(), null);
        }

        @NonNull
        public DateValidatorPointBackward[] b(int v) {
            return new DateValidatorPointBackward[v];
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
    private final long a;

    static {
        DateValidatorPointBackward.CREATOR = new a();
    }

    private DateValidatorPointBackward(long v) {
        this.a = v;
    }

    DateValidatorPointBackward(long v, a dateValidatorPointBackward$a0) {
        this(v);
    }

    @NonNull
    public static DateValidatorPointBackward a(long v) {
        return new DateValidatorPointBackward(v);
    }

    @NonNull
    public static DateValidatorPointBackward c() {
        return DateValidatorPointBackward.a(C.v().getTimeInMillis());
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
        return object0 instanceof DateValidatorPointBackward ? this.a == ((DateValidatorPointBackward)object0).a : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // com.google.android.material.datepicker.CalendarConstraints$DateValidator
    public boolean k(long v) {
        return v <= this.a;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeLong(this.a);
    }
}

