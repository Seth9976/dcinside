package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.r;

final class b extends k {
    private final long a;
    private final r b;
    private final j c;

    b(long v, r r0, j j0) {
        this.a = v;
        if(r0 == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = r0;
        if(j0 == null) {
            throw new NullPointerException("Null event");
        }
        this.c = j0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.k
    public j b() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.k
    public long c() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.k
    public r d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof k) {
            long v = ((k)object0).c();
            if(this.a == v) {
                r r0 = ((k)object0).d();
                if(this.b.equals(r0)) {
                    j j0 = ((k)object0).b();
                    return this.c.equals(j0);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() ^ ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}

