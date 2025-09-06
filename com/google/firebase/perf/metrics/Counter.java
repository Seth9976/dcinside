package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicLong;

public class Counter implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public Counter a(Parcel parcel0) {
            return new Counter(parcel0, null);
        }

        public Counter[] b(int v) {
            return new Counter[v];
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

    public static final Parcelable.Creator CREATOR;
    private final String a;
    private final AtomicLong b;

    static {
        Counter.CREATOR = new a();
    }

    private Counter(Parcel parcel0) {
        this.a = parcel0.readString();
        this.b = new AtomicLong(parcel0.readLong());
    }

    Counter(Parcel parcel0, a counter$a0) {
        this(parcel0);
    }

    public Counter(@NonNull String s) {
        this.a = s;
        this.b = new AtomicLong(0L);
    }

    long a() {
        return this.b.get();
    }

    @NonNull
    String c() {
        return this.a;
    }

    public void d(long v) {
        this.b.addAndGet(v);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    void e(long v) {
        this.b.set(v);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeLong(this.b.get());
    }
}

