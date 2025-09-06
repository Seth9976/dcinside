package com.google.android.datatransport.runtime.scheduling.persistence;

final class a extends e {
    static class com.google.android.datatransport.runtime.scheduling.persistence.a.a {
    }

    static final class b extends com.google.android.datatransport.runtime.scheduling.persistence.e.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;

        @Override  // com.google.android.datatransport.runtime.scheduling.persistence.e$a
        e a() {
            String s = this.a == null ? " maxStorageSizeInBytes" : "";
            if(this.b == null) {
                s = s + " loadBatchSize";
            }
            if(this.c == null) {
                s = s + " criticalSectionEnterTimeoutMs";
            }
            if(this.d == null) {
                s = s + " eventCleanUpAge";
            }
            if(this.e == null) {
                s = s + " maxBlobByteSizePerRow";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new a(((long)this.a), ((int)this.b), ((int)this.c), ((long)this.d), ((int)this.e), null);
        }

        @Override  // com.google.android.datatransport.runtime.scheduling.persistence.e$a
        com.google.android.datatransport.runtime.scheduling.persistence.e.a b(int v) {
            this.c = v;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.scheduling.persistence.e$a
        com.google.android.datatransport.runtime.scheduling.persistence.e.a c(long v) {
            this.d = v;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.scheduling.persistence.e$a
        com.google.android.datatransport.runtime.scheduling.persistence.e.a d(int v) {
            this.b = v;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.scheduling.persistence.e$a
        com.google.android.datatransport.runtime.scheduling.persistence.e.a e(int v) {
            this.e = v;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.scheduling.persistence.e$a
        com.google.android.datatransport.runtime.scheduling.persistence.e.a f(long v) {
            this.a = v;
            return this;
        }
    }

    private final long g;
    private final int h;
    private final int i;
    private final long j;
    private final int k;

    private a(long v, int v1, int v2, long v3, int v4) {
        this.g = v;
        this.h = v1;
        this.i = v2;
        this.j = v3;
        this.k = v4;
    }

    a(long v, int v1, int v2, long v3, int v4, com.google.android.datatransport.runtime.scheduling.persistence.a.a a$a0) {
        this(v, v1, v2, v3, v4);
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.e
    int b() {
        return this.i;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.e
    long c() {
        return this.j;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.e
    int d() {
        return this.h;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.e
    int e() {
        return this.k;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof e) {
            long v = ((e)object0).f();
            if(this.g == v) {
                int v1 = ((e)object0).d();
                if(this.h == v1) {
                    int v2 = ((e)object0).b();
                    if(this.i == v2) {
                        long v3 = ((e)object0).c();
                        if(this.j == v3) {
                            int v4 = ((e)object0).e();
                            return this.k == v4;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.e
    long f() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return this.k ^ ((((((int)(this.g ^ this.g >>> 0x20)) ^ 1000003) * 1000003 ^ this.h) * 1000003 ^ this.i) * 1000003 ^ ((int)(this.j >>> 0x20 ^ this.j))) * 1000003;
    }

    @Override
    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.g + ", loadBatchSize=" + this.h + ", criticalSectionEnterTimeoutMs=" + this.i + ", eventCleanUpAge=" + this.j + ", maxBlobByteSizePerRow=" + this.k + "}";
    }
}

