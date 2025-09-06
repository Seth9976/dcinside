package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import c2.a.a;
import java.util.List;

final class d extends n {
    private final List a;

    d(List list0) {
        if(list0 == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.a = list0;
    }

    @Override  // com.google.android.datatransport.cct.internal.n
    @NonNull
    @a(name = "logRequest")
    public List c() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof n) {
            List list0 = ((n)object0).c();
            return this.a.equals(list0);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}

