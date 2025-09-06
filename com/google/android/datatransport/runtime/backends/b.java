package com.google.android.datatransport.runtime.backends;

final class b extends h {
    private final a a;
    private final long b;

    b(a h$a0, long v) {
        if(h$a0 == null) {
            throw new NullPointerException("Null status");
        }
        this.a = h$a0;
        this.b = v;
    }

    @Override  // com.google.android.datatransport.runtime.backends.h
    public long b() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.runtime.backends.h
    public a c() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof h) {
            a h$a0 = ((h)object0).c();
            if(this.a.equals(h$a0)) {
                long v = ((h)object0).b();
                return this.b == v;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20));
    }

    @Override
    public String toString() {
        return "BackendResponse{status=" + this.a + ", nextRequestWaitMillis=" + this.b + "}";
    }
}

