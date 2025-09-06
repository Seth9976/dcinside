package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class e {
    private final String a;

    private e(@NonNull String s) {
        if(s == null) {
            throw new NullPointerException("name is null");
        }
        this.a = s;
    }

    public String a() {
        return this.a;
    }

    public static e b(@NonNull String s) {
        return new e(s);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e ? this.a.equals(((e)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.a + "\"}";
    }
}

