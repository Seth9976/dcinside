package com.google.firebase;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class u {
    @NonNull
    public static u a(long v, long v1, long v2) {
        return new a(v, v1, v2);
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();

    @NonNull
    public static u e() {
        return u.a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }
}

