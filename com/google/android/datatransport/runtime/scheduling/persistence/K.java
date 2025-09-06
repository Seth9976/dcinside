package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.r;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class k {
    public static k a(long v, r r0, j j0) {
        return new b(v, r0, j0);
    }

    public abstract j b();

    public abstract long c();

    public abstract r d();
}

