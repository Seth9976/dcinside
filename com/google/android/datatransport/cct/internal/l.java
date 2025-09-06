package com.google.android.datatransport.cct.internal;

final class l extends v {
    private final long b;

    l(long v) {
        this.b = v;
    }

    @Override  // com.google.android.datatransport.cct.internal.v
    public long c() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof v) {
            long v = ((v)object0).c();
            return this.b == v;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1000003 ^ ((int)(this.b ^ this.b >>> 0x20));
    }

    @Override
    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.b + "}";
    }
}

