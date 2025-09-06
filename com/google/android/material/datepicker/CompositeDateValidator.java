package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class CompositeDateValidator implements DateValidator {
    class a implements d {
        a() {
            super();
        }

        @Override  // com.google.android.material.datepicker.CompositeDateValidator$d
        public boolean a(@NonNull List list0, long v) {
            for(Object object0: list0) {
                if(((DateValidator)object0) != null && ((DateValidator)object0).k(v)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }

        @Override  // com.google.android.material.datepicker.CompositeDateValidator$d
        public int getId() {
            return 1;
        }
    }

    class b implements d {
        b() {
            super();
        }

        @Override  // com.google.android.material.datepicker.CompositeDateValidator$d
        public boolean a(@NonNull List list0, long v) {
            for(Object object0: list0) {
                if(((DateValidator)object0) != null && !((DateValidator)object0).k(v)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override  // com.google.android.material.datepicker.CompositeDateValidator$d
        public int getId() {
            return 2;
        }
    }

    class c implements Parcelable.Creator {
        c() {
            super();
        }

        @NonNull
        public CompositeDateValidator a(@NonNull Parcel parcel0) {
            ArrayList arrayList0 = parcel0.readArrayList(DateValidator.class.getClassLoader());
            int v = parcel0.readInt();
            if(v == 2) {
                return new CompositeDateValidator(((List)Preconditions.l(arrayList0)), CompositeDateValidator.f, null);
            }
            return v == 1 ? new CompositeDateValidator(((List)Preconditions.l(arrayList0)), CompositeDateValidator.e, null) : new CompositeDateValidator(((List)Preconditions.l(arrayList0)), CompositeDateValidator.f, null);
        }

        @NonNull
        public CompositeDateValidator[] b(int v) {
            return new CompositeDateValidator[v];
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

    interface d {
        boolean a(@NonNull List arg1, long arg2);

        int getId();
    }

    public static final Parcelable.Creator CREATOR = null;
    @NonNull
    private final d a;
    @NonNull
    private final List b;
    private static final int c = 1;
    private static final int d = 2;
    private static final d e;
    private static final d f;

    static {
        CompositeDateValidator.e = new a();
        CompositeDateValidator.f = new b();
        CompositeDateValidator.CREATOR = new c();
    }

    private CompositeDateValidator(@NonNull List list0, d compositeDateValidator$d0) {
        this.b = list0;
        this.a = compositeDateValidator$d0;
    }

    CompositeDateValidator(List list0, d compositeDateValidator$d0, a compositeDateValidator$a0) {
        this(list0, compositeDateValidator$d0);
    }

    @NonNull
    public static DateValidator d(@NonNull List list0) {
        return new CompositeDateValidator(list0, CompositeDateValidator.f);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public static DateValidator e(@NonNull List list0) {
        return new CompositeDateValidator(list0, CompositeDateValidator.e);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof CompositeDateValidator ? this.b.equals(((CompositeDateValidator)object0).b) && this.a.getId() == ((CompositeDateValidator)object0).a.getId() : false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override  // com.google.android.material.datepicker.CalendarConstraints$DateValidator
    public boolean k(long v) {
        return this.a.a(this.b, v);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeList(this.b);
        parcel0.writeInt(this.a.getId());
    }
}

