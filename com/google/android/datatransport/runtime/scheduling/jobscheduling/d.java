package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;

final class d extends b {
    static class a {
    }

    static final class com.google.android.datatransport.runtime.scheduling.jobscheduling.d.b extends com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a {
        private Long a;
        private Long b;
        private Set c;

        @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b$a
        public b a() {
            String s = this.a == null ? " delta" : "";
            if(this.b == null) {
                s = s + " maxAllowedDelay";
            }
            if(this.c == null) {
                s = s + " flags";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new d(((long)this.a), ((long)this.b), this.c, null);
        }

        @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b$a
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a b(long v) {
            this.a = v;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b$a
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a c(Set set0) {
            if(set0 == null) {
                throw new NullPointerException("Null flags");
            }
            this.c = set0;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b$a
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a d(long v) {
            this.b = v;
            return this;
        }
    }

    private final long a;
    private final long b;
    private final Set c;

    private d(long v, long v1, Set set0) {
        this.a = v;
        this.b = v1;
        this.c = set0;
    }

    d(long v, long v1, Set set0, a d$a0) {
        this(v, v1, set0);
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b
    long b() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b
    Set c() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b
    long d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof b) {
            long v = ((b)object0).b();
            if(this.a == v) {
                long v1 = ((b)object0).d();
                if(this.b == v1) {
                    Set set0 = ((b)object0).c();
                    return this.c.equals(set0);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() ^ ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003;
    }

    @Override
    public String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}

