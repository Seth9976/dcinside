package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class n implements Comparable {
    public int a(n n0) {
        return this.c() >= n0.c() ? 1 : -1;
    }

    public static n b(String s, long v) {
        return new b(s, v);
    }

    public abstract long c();

    @Override
    public int compareTo(Object object0) {
        return this.a(((n)object0));
    }

    public abstract String d();
}

