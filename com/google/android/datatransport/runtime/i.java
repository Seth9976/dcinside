package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import com.google.android.datatransport.e;
import java.util.Arrays;

public final class i {
    private final e a;
    private final byte[] b;

    public i(@NonNull e e0, @NonNull byte[] arr_b) {
        if(e0 == null) {
            throw new NullPointerException("encoding is null");
        }
        if(arr_b == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = e0;
        this.b = arr_b;
    }

    public byte[] a() {
        return this.b;
    }

    public e b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        return this.a.equals(((i)object0).a) ? Arrays.equals(this.b, ((i)object0).b) : false;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.b);
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}

