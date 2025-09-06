package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.time.a;
import java.util.Map;

final class c extends g {
    private final a e;
    private final Map f;

    c(a a0, Map map0) {
        if(a0 == null) {
            throw new NullPointerException("Null clock");
        }
        this.e = a0;
        if(map0 == null) {
            throw new NullPointerException("Null values");
        }
        this.f = map0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    a e() {
        return this.e;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof g) {
            a a0 = ((g)object0).e();
            if(this.e.equals(a0)) {
                Map map0 = ((g)object0).i();
                return this.f.equals(map0);
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.e.hashCode() ^ 1000003) * 1000003 ^ this.f.hashCode();
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    Map i() {
        return this.f;
    }

    @Override
    public String toString() {
        return "SchedulerConfig{clock=" + this.e + ", values=" + this.f + "}";
    }
}

