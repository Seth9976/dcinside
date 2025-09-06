package com.google.firebase;

final class a extends u {
    private final long a;
    private final long b;
    private final long c;

    a(long v, long v1, long v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override  // com.google.firebase.u
    public long b() {
        return this.b;
    }

    @Override  // com.google.firebase.u
    public long c() {
        return this.a;
    }

    @Override  // com.google.firebase.u
    public long d() {
        return this.c;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof u) {
            long v = ((u)object0).c();
            if(this.a == v) {
                long v1 = ((u)object0).b();
                if(this.b == v1) {
                    long v2 = ((u)object0).d();
                    return this.c == v2;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((int)(this.c >>> 0x20 ^ this.c)) ^ ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003;
    }

    @Override
    public String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + "}";
    }
}

