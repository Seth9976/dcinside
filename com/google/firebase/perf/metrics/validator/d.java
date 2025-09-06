package com.google.firebase.perf.metrics.validator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.v1.x;
import java.util.Map.Entry;
import java.util.Map;

final class d extends e {
    private final x a;
    private static final a b;

    static {
        d.b = a.e();
    }

    d(@NonNull x x0) {
        this.a = x0;
    }

    @Override  // com.google.firebase.perf.metrics.validator.e
    public boolean c() {
        if(!this.o(this.a, 0)) {
            d.b.l("Invalid Trace:");
            return false;
        }
        if(this.j(this.a) && !this.h(this.a)) {
            d.b.l("Invalid Counters for Trace:");
            return false;
        }
        return true;
    }

    private boolean g(Map map0) {
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            try {
                e.d(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue()));
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                d.b.l(illegalArgumentException0.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean h(@NonNull x x0) {
        return this.i(x0, 0);
    }

    private boolean i(@Nullable x x0, int v) {
        if(x0 == null) {
            return false;
        }
        if(v > 1) {
            d.b.l("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for(Object object0: x0.X1().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!this.l(((String)map$Entry0.getKey()))) {
                d.b.l("invalid CounterId:" + ((String)map$Entry0.getKey()));
                return false;
            }
            if(!this.m(((Long)map$Entry0.getValue()))) {
                d.b.l("invalid CounterValue:" + map$Entry0.getValue());
                return false;
            }
            if(false) {
                break;
            }
        }
        for(Object object1: x0.Q5()) {
            if(!this.i(((x)object1), v + 1)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private boolean j(@NonNull x x0) {
        if(x0.U4() > 0) {
            return true;
        }
        for(Object object0: x0.Q5()) {
            if(((x)object0).U4() > 0) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private boolean k(@NonNull x x0) {
        return x0.getName().startsWith("_st_");
    }

    private boolean l(@Nullable String s) {
        if(s == null) {
            return false;
        }
        String s1 = s.trim();
        if(s1.isEmpty()) {
            d.b.l("counterId is empty");
            return false;
        }
        if(s1.length() > 100) {
            d.b.l("counterId exceeded max length 100");
            return false;
        }
        return true;
    }

    private boolean m(@Nullable Long long0) {
        return long0 != null;
    }

    private boolean n(@NonNull x x0) {
        Long long0 = (Long)x0.X1().get("_fr_tot");
        return long0 != null && long0.compareTo(0L) > 0;
    }

    // 去混淆评级： 低(25)
    private boolean o(@Nullable x x0, int v) {
        if(x0 == null) {
            d.b.l("TraceMetric is null");
            return false;
        }
        if(v > 1) {
            d.b.l("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        d.b.l("invalid TraceId:");
        return false;
    }

    private boolean p(@Nullable x x0) {
        return x0 != null && x0.c1() > 0L;
    }

    private boolean q(@Nullable String s) [...] // 潜在的解密器
}

