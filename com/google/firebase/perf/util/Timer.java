package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.TimeUnit;

public class Timer implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public Timer a(Parcel parcel0) {
            return new Timer(parcel0, null);
        }

        public Timer[] b(int v) {
            return new Timer[v];
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
    private long a;
    private long b;

    static {
        Timer.CREATOR = new a();
    }

    public Timer() {
        this(Timer.i(), Timer.a());
    }

    @VisibleForTesting
    public Timer(long v) {
        this(v, v);
    }

    @VisibleForTesting
    Timer(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    private Timer(Parcel parcel0) {
        this(parcel0.readLong(), parcel0.readLong());
    }

    Timer(Parcel parcel0, a timer$a0) {
        this(parcel0);
    }

    private static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public long c() {
        return this.a + this.d();
    }

    public long d() {
        return this.e(new Timer());
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e(@NonNull Timer timer0) {
        return timer0.b - this.b;
    }

    public long f() {
        return this.a;
    }

    public static Timer g(long v) {
        long v1 = TimeUnit.MILLISECONDS.toMicros(v);
        return new Timer(Timer.i() + (v1 - Timer.a()), v1);
    }

    public void h() {
        this.a = Timer.i();
        this.b = Timer.a();
    }

    private static long i() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.a);
        parcel0.writeLong(this.b);
    }
}

